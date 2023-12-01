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

package org.apache.commons.net.nntp;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.net.util.NetConstants;

/**
 * This is a class that contains the basic state needed for message retrieval and threading. With thanks to Jamie Zawinski (jwz@jwz.org)
 */
public class Article implements Threadable {
    /**
     * Recursive method that traverses a pre-threaded graph (or tree) of connected Article objects and prints them out.
     *
     * @param article the root of the article 'tree'
     * @since 3.4
     */
    public static void printThread(final Article article) {
        printThread(article, 0, System.out);
    }

    /**
     * Recursive method that traverses a pre-threaded graph (or tree) of connected Article objects and prints them out.
     *
     * @param article the root of the article 'tree'
     * @param depth   the current tree depth
     */
    public static void printThread(final Article article, final int depth) {
        printThread(article, depth, System.out);
    }

    /**
     * Recursive method that traverses a pre-threaded graph (or tree) of connected Article objects and prints them out.
     *
     * @param article the root of the article 'tree'
     * @param depth   the current tree depth
     * @param ps      the PrintStream to use
     * @since 3.4
     */
    public static void printThread(final Article article, final int depth, final PrintStream ps) {
        for (int i = 0; i < depth; ++i) {
            ps.print("==>");
        }
        ps.println(article.getSubject() + "\t" + article.getFrom() + "\t" + article.getArticleId());
        if (article.kid != null) {
            printThread(article.kid, depth + 1);
        }
        if (article.next != null) {
            printThread(article.next, depth);
        }
    }

    /**
     * Recursive method that traverses a pre-threaded graph (or tree) of connected Article objects and prints them out.
     *
     * @param article the root of the article 'tree'
     * @param ps      the PrintStream to use
     * @since 3.4
     */
    public static void printThread(final Article article, final PrintStream ps) {
        printThread(article, 0, ps);
    }

    private long articleNumber;
    private String subject;
    private String date;
    private String articleId;

    private String simplifiedSubject;

    private String from;
    private ArrayList<String> references;

    private boolean isReply;

    public Article kid, next;

    public Article() {
        articleNumber = -1; // isDummy
    }

    @Deprecated

    public void addHeaderField(final String name, final String val) {
    }

    /**
     * Adds a message-id to the list of messages that this message references (i.e. replies to)
     *
     * @param msgId the message id to add
     */
    public void addReference(final String msgId) {
        if (msgId == null || msgId.isEmpty()) {
            return;
        }
        if (references == null) {
            references = new ArrayList<>();
        }
        isReply = true;
        Collections.addAll(references, msgId.split(" "));
    }

    private void flushSubjectCache() {
        simplifiedSubject = null;
    }

    public String getArticleId() {
        return articleId;
    }

    @Deprecated
    public int getArticleNumber() {
        return (int) articleNumber;
    }

    public long getArticleNumberLong() {
        return articleNumber;
    }

    public String getDate() {
        return date;
    }

    public String getFrom() {
        return from;
    }

    /**
     * Returns the MessageId references as an array of Strings
     *
     * @return an array of message-ids
     */
    public String[] getReferences() {
        if (references == null) {
            return NetConstants.EMPTY_STRING_ARRAY;
        }
        return references.toArray(NetConstants.EMPTY_STRING_ARRAY);
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public boolean isDummy() {
        return articleNumber == -1;
    }

    @Override
    public Threadable makeDummy() {
        return new Article();
    }

    @Override
    public String messageThreadId() {
        return articleId;
    }

    @Override
    public String[] messageThreadReferences() {
        return getReferences();
    }

    public void setArticleId(final String string) {
        articleId = string;
    }

    @Deprecated
    public void setArticleNumber(final int a) {
        articleNumber = a;
    }

    public void setArticleNumber(final long l) {
        articleNumber = l;
    }

    @Override
    public void setChild(final Threadable child) {
        this.kid = (Article) child;
        flushSubjectCache();
    }

    public void setDate(final String string) {
        date = string;
    }

    public void setFrom(final String string) {
        from = string;
    }

    @Override
    public void setNext(final Threadable next) {
        this.next = (Article) next;
        flushSubjectCache();
    }

    public void setSubject(final String string) {
        subject = string;
    }

    @Override
    public String simplifiedSubject() {
        if (simplifiedSubject == null) {
            simplifySubject();
        }
        return simplifiedSubject;
    }

    // DEPRECATED METHODS - for API compatibility only - DO NOT USE


    //Returns new position after the numbers
    private int skipNumbers(int i, int len)
    {
        while (i < len && subject.charAt(i) >= '0' && subject.charAt(i) <= '9') {
           i++;
        }
        return i;
    }

    //Must be checked after open parentheses, is either closed parentheses or semicolon.
    //Current position is i, NOT start.
    private boolean checkClose(int i, int len)
    {
        return(i < len - 1 && (subject.charAt(i) == ']' || subject.charAt(i) == ')') && subject.charAt(i + 1) == ':');
    }

    private boolean checkOpenParentheses(int start, int len)
    {
        return (start < len - 2 && (subject.charAt(start + 2) == '[' || subject.charAt(start + 2) == '('));
    }

    //Requires previous assignment of subject. Checks for case-insensitive re.
    private boolean checkRE(int start, int len)
    {
       return (start < len - 2 && (subject.charAt(start) == 'r' || subject.charAt(start) == 'R')
                && (subject.charAt(start + 1) == 'e' || subject.charAt(start + 1) == 'E'));
    }

    //Returns first character after whitespace
    // "Re: " breaks this

    private int skipStartWhitespace(int len)
    {
        int start = 0;
        while (start < len && subject.charAt(start) == ' ') {
            start++;
        }
        return start;
    }

    private int skipEndWhitespace(int start, int len)
    {
        int end = len;
        while (end > start && subject.charAt(end - 1) < ' ') {
            end--;
        }
        return end;
    }

    //if subject is (no subject), return appropriately empty subject for simplification.
    private String checkEmptySubject(String simplifiedSubject)
    {
        if ("(no subject)".equals(simplifiedSubject)) {
            simplifiedSubject = "";
        }
        return simplifiedSubject;
    }

    //Returns simplified subject if possible
    private String checkPossibileSimplification(String subject, int start, int end, int len)
    {
        String newSubject;
        if (start == 0 && end == len) {
            newSubject = subject;
        } else {
            newSubject = subject.substring(start, end);
        }
        return newSubject;
    }

    /**
     * Attempts to parse the subject line for some typical reply signatures, and strip them out
     *
     */
    private void simplifySubject() {
        final String subject = getSubject();
        final int len = subject.length();

        boolean done = false;

        while (!done) {
            done = true;

            int start = skipStartWhitespace(len);

            if(checkRE(start, len)){

                if (subject.charAt(start + 2) == ':') {
                    start += 3; // Skip "Re:"
                    done = false;
                } else if (checkOpenParentheses(start, len)) {

                    int i = skipNumbers(start + 3, len);

                    if (checkClose(start, len)) {
                        start = i + 2;
                        done = false;
                    }
                }
            }

            simplifiedSubject = checkEmptySubject(simplifiedSubject);

            int end = skipEndWhitespace(start, len);

            simplifiedSubject = checkPossibileSimplification(subject, start, end, len);
        }
    }

    @Override
    public boolean subjectIsReply() {
        return isReply;
    }

    @Override
    public String toString() { // Useful for Eclipse debugging
        return articleNumber + " " + articleId + " " + subject;
    }

}
