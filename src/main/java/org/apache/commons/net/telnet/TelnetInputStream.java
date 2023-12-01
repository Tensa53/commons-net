/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

final class TelnetInputStream extends BufferedInputStream implements Runnable {
    /** End of file has been reached */
    private static final int EOF = -1;

    /** Read would block */
    private static final int WOULD_BLOCK = -2;

    // TODO should these be private enums?
    static final int STATE_DATA = 0, STATE_IAC = 1, STATE_WILL = 2, STATE_WONT = 3, STATE_DO = 4, STATE_DONT = 5, STATE_SB = 6, STATE_SE = 7, STATE_CR = 8,
            STATE_IAC_SB = 9;

    private boolean hasReachedEOF; // @GuardedBy("queue")
    private volatile boolean isClosed;
    private boolean readIsWaiting;
    private int receiveState, queueHead, queueTail, bytesAvailable;
    private final int[] queue;
    private final TelnetClient client;
    private final Thread thread;
    private IOException ioException;

    /* TERMINAL-TYPE option (start) */
    private final int suboption[];
    private int suboptionCount;
    /* TERMINAL-TYPE option (end) */

    private volatile boolean threaded;

    TelnetInputStream(final InputStream input, final TelnetClient client) {
        this(input, client, true);
    }

    TelnetInputStream(final InputStream input, final TelnetClient client, final boolean readerThread) {
        super(input);
        this.client = client;
        this.receiveState = STATE_DATA;
        this.isClosed = true;
        this.hasReachedEOF = false;
        // Make it 2049, because when full, one slot will go unused, and we
        // want a 2048 byte buffer just to have a round number (base 2 that is)
        this.queue = new int[2049];
        this.queueHead = 0;
        this.queueTail = 0;
        this.suboption = new int[client.maxSubnegotiationLength];
        this.bytesAvailable = 0;
        this.ioException = null;
        this.readIsWaiting = false;
        this.threaded = false;
        if (readerThread) {
            this.thread = new Thread(this);
        } else {
            this.thread = null;
        }
    }

    @Override
    public int available() throws IOException {
        // Critical section because run() may change bytesAvailable
        synchronized (queue) {
            if (threaded) { // Must not call super.available when running threaded: NET-466
                return bytesAvailable;
            }
            return bytesAvailable + super.available();
        }
    }

    // Cannot be synchronized. Will cause deadlock if run() is blocked
    // in read because BufferedInputStream read() is synchronized.
    @Override
    public void close() throws IOException {
        // Completely disregard the fact thread may still be running.
        // We can't afford to block on this close by waiting for
        // thread to terminate because few if any JVM's will actually
        // interrupt a system read() from the interrupt() method.
        super.close();

        synchronized (queue) {
            hasReachedEOF = true;
            isClosed = true;

            if (thread != null && thread.isAlive()) {
                thread.interrupt();
            }

            queue.notifyAll();
        }

    }

    /** Returns false. Mark is not supported. */
    @Override
    public boolean markSupported() {
        return false;
    }

    // synchronized(client) critical sections are to protect against
    // TelnetOutputStream writing through the telnet client at same time
    // as a processDo/Will/etc. command invoked from TelnetInputStream
    // tries to write. Returns true if buffer was previously empty.
    private boolean processChar(final int ch) throws InterruptedException {
        // Critical section because we're altering bytesAvailable,
        // queueTail, and the contents of _queue.
        final boolean bufferWasEmpty;
        synchronized (queue) {
            bufferWasEmpty = bytesAvailable == 0;
            while (bytesAvailable >= queue.length - 1) {
                // The queue is full. We need to wait before adding any more data to it. Hopefully the stream owner
                // will consume some data soon!
                if (!threaded) {
                    // We've been asked to add another character to the queue, but it is already full and there's
                    // no other thread to drain it. This should not have happened!
                    throw new IllegalStateException("Queue is full! Cannot process another character.");
                }
                queue.notify();
                try {
                    queue.wait();
                } catch (final InterruptedException e) {
                    throw e;
                }
            }

            // Need to do this in case we're not full, but block on a read
            if (readIsWaiting && threaded) {
                queue.notify();
            }

            queue[queueTail] = ch;
            ++bytesAvailable;

            if (++queueTail >= queue.length) {
                queueTail = 0;
            }
        }
        return bufferWasEmpty;
    }

    //Used in function handleParse
    private boolean caseSB(int ch) {
        if (ch == TelnetCommand.IAC) {
            receiveState = STATE_IAC_SB;
            return false;
        }// store suboption char
        if (suboptionCount < suboption.length) {
            suboption[suboptionCount++] = ch;
        }
        return true;
    }

    //Used in function handleParse
    private boolean caseIACSB(int ch) throws IOException {
        switch (ch) {
            case TelnetCommand.SE:
                synchronized (client) {
                    client.processSuboption(suboption, suboptionCount);
                    client.flushOutputStream();
                }
                receiveState = STATE_DATA;
                return false;
            case TelnetCommand.IAC: // De-dup the duplicated IAC
                if (suboptionCount < suboption.length) {
                    suboption[suboptionCount++] = ch;
                }
                return true;
            default: // unexpected byte! ignore it
                return true;
        }
        /* TERMINAL-TYPE option (end) */
    }

    private boolean trytoProcessChar(int ch)
    {
        try {
            if (ch != WOULD_BLOCK) {
                processChar(ch);
            }
        } catch (final InterruptedException e) {
            if (isClosed) {
                return false;
            }
        }
        return true;
    }

    private boolean finishUpdatingQueue()
    {
        if (++queueHead >= queue.length) {
            queueHead = 0;
        }

        --bytesAvailable;

        // Need to explicitly notify() so available() works properly
        return (bytesAvailable == 0 && threaded);
    }

    private int unthreadedGetFromQueue() throws IOException {
        readIsWaiting = true;
        int ch;
        boolean mayBlock = true; // block on the first read only

        do {
            try {
                if ((ch = read(mayBlock)) < 0 && (ch != WOULD_BLOCK)) {
                    return ch;

                }
            } catch (final InterruptedIOException e) {
                synchronized (queue) {
                    ioException = e;
                    queue.notifyAll();
                    try {
                        queue.wait(100);
                    } catch (final InterruptedException interrupted) {
                        // Ignored
                    }
                }
                return EOF;
            }

            if(!trytoProcessChar(ch))
            {
                return EOF;
            }

            // Reads should not block on subsequent iterations. Potentially, this could happen if the
            // remaining buffered socket data consists entirely of Telnet command sequence and no "user" data.
            mayBlock = false;

        }
        // Continue reading as long as there is data available and the queue is not full.
        while (super.available() > 0 && bytesAvailable < queue.length - 1);

        readIsWaiting = false;
        return -999; //Marks that neither ch nor eof were returned
    }

    private void handleIOException() throws IOException {
        if (ioException != null) {
            final IOException e;
            e = ioException;
            ioException = null;
            throw e;
        }
    }

    private int readFromQueue() throws IOException {
        synchronized (queue) {
            // Return EOF if at end of file
            if (hasReachedEOF) {
                return EOF;
            }

            // Otherwise, we have to wait for queue to get something
            if (threaded) {
                queue.notifyAll();
                try {
                    readIsWaiting = true;
                    while(readIsWaiting) {
                        queue.wait();
                        readIsWaiting = false;
                    }
                } catch (final InterruptedException e) {
                    throw new InterruptedIOException("Fatal thread interruption during read.");
                }
            } else {
                int result = unthreadedGetFromQueue();
                if (result != -999) {
                    return result;
                }
            }
        }
        return -999;    //End read
    }

    @Override
    public synchronized int read() throws IOException {
        // Critical section because we're altering bytesAvailable,
        // queueHead, and the contents of _queue in addition to
        // testing value of hasReachedEOF.
            while (true) {
                handleIOException();

                if (bytesAvailable == 0) {

                    int result = readFromQueue();
                    if(result != -999) //End of read
                    {
                        return result;
                    }

                    continue;
                }
                final int ch;

                ch = queue[queueHead];

                if(finishUpdatingQueue())
                {
                    queue.notifyAll();
                }

                return ch;
            }
        }

    /*Process char ch according to receiveState.
    Return true if more chars should be read, false otherwise*/
    private boolean handleParse(int ch) throws IOException {
        switch (receiveState) {

            case STATE_CR:
                if (ch == '\0') {
                    // Strip null
                    return false;
                }
                // Handle as normal data by falling through to _STATE_DATA case

                //$FALL-THROUGH$
            case STATE_DATA:
                if (ch == TelnetCommand.IAC) {
                    receiveState = STATE_IAC;
                    return false;
                }

                if (ch == '\r') {
                    synchronized (client) {
                        if (client.requestedDont(TelnetOption.BINARY)) {
                            receiveState = STATE_CR;
                        } else {
                            receiveState = STATE_DATA;
                        }
                    }
                } else {
                    receiveState = STATE_DATA;
                }
                return true;

            case STATE_IAC:
                switch (ch) {
                    case TelnetCommand.WILL:
                        receiveState = STATE_WILL;
                        return false;
                    case TelnetCommand.WONT:
                        receiveState = STATE_WONT;
                        return false;
                    case TelnetCommand.DO:
                        receiveState = STATE_DO;
                        return false;
                    case TelnetCommand.DONT:
                        receiveState = STATE_DONT;
                        return false;
                        /* TERMINAL-TYPE option (start) */
                    case TelnetCommand.SB:
                        suboptionCount = 0;
                        receiveState = STATE_SB;
                        return false;
                        /* TERMINAL-TYPE option (end) */
                    case TelnetCommand.IAC:
                        receiveState = STATE_DATA;
                        return true; // exit to enclosing switch to return IAC from read
                    case TelnetCommand.SE: // unexpected byte! ignore it (don't send it as a command)
                        receiveState = STATE_DATA;
                        return false;
                    default:
                        receiveState = STATE_DATA;
                        client.processCommand(ch); // Notify the user
                        return false; // move on the next char
                }
            case STATE_WILL:
                synchronized (client) {
                    client.processWill(ch);
                    client.flushOutputStream();
                }
                receiveState = STATE_DATA;
                return false;
            case STATE_WONT:
                synchronized (client) {
                    client.processWont(ch);
                    client.flushOutputStream();
                }
                receiveState = STATE_DATA;
                return false;
            case STATE_DO:
                synchronized (client) {
                    client.processDo(ch);
                    client.flushOutputStream();
                }
                receiveState = STATE_DATA;
                return false;
            case STATE_DONT:
                synchronized (client) {
                    client.processDont(ch);
                    client.flushOutputStream();
                }
                receiveState = STATE_DATA;
                return false;
                /* TERMINAL-TYPE option (start) */
            case STATE_SB:
                return caseSB(ch);
            case STATE_IAC_SB: // IAC received during SB phase
               return caseIACSB(ch);
            default:
                throw new IllegalStateException("Unexpected value: " + receiveState);
        }
    }

    // synchronized(client) critical sections are to protect against
    // TelnetOutputStream writing through the telnet client at same time
    // as a processDo/Will/etc. command invoked from TelnetInputStream
    // tries to write.
    /**
     * Get the next byte of data. IAC commands are processed internally and do not return data.
     *
     * @param mayBlock true if method is allowed to block
     * @return the next byte of data, or -1 (EOF) if end of stread reached, or -2 (WOULD_BLOCK) if mayBlock is false and there is no data available
     */
    private int read(final boolean mayBlock) throws IOException {
        int ch = 0; //?
        boolean endRead = false;

        while (!endRead) {

            ch = super.read();

            // If there is no more data AND we were told not to block,
            // just return WOULD_BLOCK (-2). (More efficient than exception.)
            if (!mayBlock && super.available() == 0) {
                return WOULD_BLOCK;
            }

            // Otherwise, exit only when we reach end of stream.
            if(ch < 0) {
                return EOF;
            }

            ch = ch & 0xff;

            /* Code Section added for supporting AYT (start) */
            synchronized (client) {
                client.processAYTResponse();
            }
            /* Code Section added for supporting AYT (end) */

            /* Code Section added for supporting spystreams (start) */
            client.spyRead(ch);
            /* Code Section added for supporting spystreams (end) */

            endRead = handleParse(ch);
        }
        return ch;
    }

    /**
     * Reads the next number of bytes from the stream into an array and returns the number of bytes read. Returns -1 if the end of the stream has been reached.
     *
     * @param buffer The byte array in which to store the data.
     * @return The number of bytes read. Returns -1 if the end of the message has been reached.
     * @throws IOException If an error occurs in reading the underlying stream.
     */
    @Override
    public int read(final byte buffer[]) throws IOException {
        return read(buffer, 0, buffer.length);
    }

    /**
     * Reads the next number of bytes from the stream into an array and returns the number of bytes read. Returns -1 if the end of the message has been reached.
     * The characters are stored in the array starting from the given offset and up to the length specified.
     *
     * @param buffer The byte array in which to store the data.
     * @param offset The offset into the array at which to start storing data.
     * @param length The number of bytes to read.
     * @return The number of bytes read. Returns -1 if the end of the stream has been reached.
     * @throws IOException If an error occurs while reading the underlying stream.
     */
    @Override
    public int read(final byte buffer[], int offset, int length) throws IOException {
        int ch;
        final int off;

        if (length < 1) {
            return 0;
        }

        // Critical section because run() may change bytesAvailable
        synchronized (queue) {
            if (length > bytesAvailable) {
                length = bytesAvailable;
            }
        }

        if ((ch = read()) == EOF) {
            return EOF;
        }

        off = offset;

        do {
            buffer[offset++] = (byte) ch;
        } while (--length > 0 && (ch = read()) != EOF);

        // client._spyRead(buffer, off, offset - off);
        return offset - off;
    }

    //Does final operations on queue and releases it from synchronize.
    private void endSynchronize()
    {
        synchronized (queue) {
            isClosed = true; // Possibly redundant
            hasReachedEOF = true;
            queue.notifyAll();
        }

        threaded = false;
    }

    //Process char ch, notifying the input listener if bugger is now empty
    private void trytoNotify(int ch){
        boolean notify = false;
        try {
            notify = processChar(ch);
        } catch (InterruptedException e) {
            endSynchronize();
            Thread.currentThread().interrupt();
        }

        // Notify input listener if buffer was previously empty
        if (notify) {
            client.notifyInputListener();
        }
    }

    private void processchFromQueue() throws IOException {
        int ch = 0;
        while (!isClosed && ch >= 0) {
            try {
               ch = read(true);
            } catch (final InterruptedIOException e) {
                synchronized (queue) {
                    ioException = e;
                    queue.notifyAll();
                    try {
                        queue.wait(100);
                    } catch (final InterruptedException interrupted) {
                        throw new IOException();
                    }
                }
            } catch (final RuntimeException re) {
                // We treat any runtime exceptions as though the
                // stream has been closed. We close the
                // underlying stream just to be sure.
                super.close();
                // Breaking the loop has the effect of setting
                // the state to closed at the end of the method.
                break;
            }
            // Process new character
            trytoNotify(ch);
        }
    }

    @Override
    public void run() {
        try {
            processchFromQueue();
        } catch (final IOException ioe) {
            synchronized (queue) {
                ioException = ioe;
            }
            client.notifyInputListener();
        }

        endSynchronize();
    }

    void start() {
        if (thread == null) {
            return;
        }

        int priority;
        isClosed = false;
        // TODO remove this
        // Need to set a higher priority in case JVM does not use pre-emptive
        // threads. This should prevent scheduler induced deadlock (rather than
        // deadlock caused by a bug in this code).
        priority = Thread.currentThread().getPriority() + 1;
        if (priority > Thread.MAX_PRIORITY) {
            priority = Thread.MAX_PRIORITY;
        }
        thread.setPriority(priority);
        thread.setDaemon(true);
        thread.start();
        threaded = true; // tell _processChar that we are running threaded
    }
}
