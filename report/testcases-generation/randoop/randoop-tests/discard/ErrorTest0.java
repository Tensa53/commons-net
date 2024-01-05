import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = discardUDPClient0.getSoTimeout();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress1 = discardUDPClient0.getLocalAddress();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(false, 10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoTimeout(32);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress2 = discardUDPClient0.getLocalAddress();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        boolean boolean5 = discardUDPClient0.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardUDPClient0.getLocalPort();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        boolean boolean5 = discardUDPClient0.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.time.Duration duration6 = discardUDPClient0.getSoTimeoutDuration();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(true, (int) (short) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(true, (int) (byte) 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.setSoTimeout(60000);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoTimeout((int) (byte) 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        int int9 = discardUDPClient3.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        java.nio.charset.Charset charset17 = discardUDPClient10.getCharset();
        discardUDPClient3.setCharset(charset17);
        discardTCPClient0.setCharset(charset17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.time.Duration duration3 = discardUDPClient0.getSoTimeoutDuration();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        boolean boolean3 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardUDPClient0.getSoTimeout();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.setSoTimeout((int) 'a');
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.setSoTimeout(9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setReceiveBufferSize(32);
        int int5 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        boolean boolean12 = discardUDPClient0.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = discardUDPClient0.getSoTimeout();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient20.setDefaultTimeout((int) (short) 1);
        discardUDPClient20.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.setDefaultTimeout(0);
        discardUDPClient25.setDefaultTimeout((int) (short) 1);
        java.lang.String str30 = discardUDPClient25.getCharsetName();
        discardUDPClient25.open();
        java.time.Duration duration32 = discardUDPClient25.getSoTimeoutDuration();
        discardUDPClient20.setDefaultTimeout(duration32);
        discardUDPClient12.setSoTimeout(duration32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.setSoTimeout(duration32);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.setReceiveBufferSize((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoTimeout((int) (byte) 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardUDPClient0.getLocalPort();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = discardTCPClient0.getLocalAddress();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoTimeout(100);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(9);
        int int4 = discardTCPClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(false, 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        java.nio.charset.Charset charset5 = discardUDPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        java.nio.charset.Charset charset13 = discardUDPClient6.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient14 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient14.setDefaultTimeout((int) (short) 1);
        discardUDPClient14.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.setDefaultTimeout(0);
        discardUDPClient19.setDefaultTimeout((int) (short) 1);
        java.lang.String str24 = discardUDPClient19.getCharsetName();
        discardUDPClient19.open();
        java.time.Duration duration26 = discardUDPClient19.getSoTimeoutDuration();
        discardUDPClient14.setDefaultTimeout(duration26);
        discardUDPClient6.setSoTimeout(duration26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.setSoTimeout(duration26);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(9);
        int int4 = discardTCPClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int8 = discardTCPClient7.getDefaultPort();
        discardTCPClient7.disconnect();
        java.io.OutputStream outputStream10 = discardTCPClient7.getOutputStream();
        java.lang.String str11 = discardTCPClient7.getCharsetName();
        java.nio.charset.Charset charset12 = discardTCPClient7.getCharset();
        discardTCPClient0.setCharset(charset12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress14 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = discardUDPClient0.getSoTimeout();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        boolean boolean9 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        boolean boolean4 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = discardUDPClient0.getSoTimeout();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        javax.net.ServerSocketFactory serverSocketFactory5 = discardTCPClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardUDPClient0.getSoTimeout();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int8 = discardTCPClient7.getDefaultPort();
        discardTCPClient7.disconnect();
        java.io.OutputStream outputStream10 = discardTCPClient7.getOutputStream();
        java.lang.String str11 = discardTCPClient7.getCharsetName();
        java.nio.charset.Charset charset12 = discardTCPClient7.getCharset();
        discardTCPClient0.setCharset(charset12);
        discardTCPClient0.setDefaultTimeout(46312);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        int int9 = discardUDPClient3.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        java.nio.charset.Charset charset17 = discardUDPClient10.getCharset();
        discardUDPClient3.setCharset(charset17);
        discardUDPClient3.setDefaultTimeout((int) (short) 1);
        java.nio.charset.Charset charset21 = discardUDPClient3.getCharset();
        discardTCPClient0.setCharset(charset21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setTcpNoDelay(true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress9 = discardTCPClient0.getLocalAddress();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(true, 56373);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int8 = discardTCPClient7.getDefaultPort();
        discardTCPClient7.disconnect();
        java.io.OutputStream outputStream10 = discardTCPClient7.getOutputStream();
        java.lang.String str11 = discardTCPClient7.getCharsetName();
        java.nio.charset.Charset charset12 = discardTCPClient7.getCharset();
        discardTCPClient0.setCharset(charset12);
        java.lang.String str14 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(false, 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoTimeout((int) (byte) 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.setReceiveBufferSize((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setReceiveBufferSize(32);
        int int5 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        boolean boolean3 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setDefaultPort(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(false, 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.setReceiveBufferSize((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress8 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        java.net.Proxy proxy7 = discardTCPClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int8 = discardTCPClient7.getDefaultPort();
        discardTCPClient7.disconnect();
        java.io.OutputStream outputStream10 = discardTCPClient7.getOutputStream();
        java.lang.String str11 = discardTCPClient7.getCharsetName();
        java.nio.charset.Charset charset12 = discardTCPClient7.getCharset();
        discardTCPClient0.setCharset(charset12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        int int5 = discardTCPClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient1 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient1.open();
        discardUDPClient1.setDefaultTimeout((-1));
        discardUDPClient1.setSoTimeout((int) ' ');
        int int7 = discardUDPClient1.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        int int14 = discardUDPClient8.getSoTimeout();
        java.nio.charset.Charset charset15 = discardUDPClient8.getCharset();
        discardUDPClient1.setCharset(charset15);
        java.nio.charset.Charset charset17 = discardUDPClient1.getCharset();
        discardUDPClient0.setCharset(charset17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = discardUDPClient0.getLocalPort();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient1 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient1.open();
        discardUDPClient1.setDefaultTimeout((-1));
        discardUDPClient1.setSoTimeout((int) ' ');
        int int7 = discardUDPClient1.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        int int14 = discardUDPClient8.getSoTimeout();
        java.nio.charset.Charset charset15 = discardUDPClient8.getCharset();
        discardUDPClient1.setCharset(charset15);
        java.nio.charset.Charset charset17 = discardUDPClient1.getCharset();
        discardUDPClient0.setCharset(charset17);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.open();
        java.net.InetAddress inetAddress30 = discardUDPClient27.getLocalAddress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.send(byteArray25, (int) (short) 0, inetAddress30);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        java.nio.charset.Charset charset5 = discardUDPClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardUDPClient0.getLocalPort();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        int int9 = discardUDPClient3.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        java.nio.charset.Charset charset17 = discardUDPClient10.getCharset();
        discardUDPClient3.setCharset(charset17);
        discardUDPClient3.setDefaultTimeout((int) (short) 1);
        java.nio.charset.Charset charset21 = discardUDPClient3.getCharset();
        discardTCPClient0.setCharset(charset21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int8 = discardTCPClient7.getDefaultPort();
        discardTCPClient7.disconnect();
        java.io.OutputStream outputStream10 = discardTCPClient7.getOutputStream();
        java.lang.String str11 = discardTCPClient7.getCharsetName();
        java.nio.charset.Charset charset12 = discardTCPClient7.getCharset();
        discardTCPClient0.setCharset(charset12);
        discardTCPClient0.setDefaultTimeout(46312);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress16 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        int int4 = discardTCPClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        boolean boolean4 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = discardTCPClient0.getLocalAddress();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str3 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        discardTCPClient0.setDefaultPort(0);
        discardTCPClient0.setReceiveBufferSize((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        int int5 = discardTCPClient0.getDefaultPort();
        java.io.OutputStream outputStream6 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy7 = discardTCPClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.open();
        java.net.InetAddress inetAddress8 = discardUDPClient5.getLocalAddress();
        java.nio.charset.Charset charset9 = discardUDPClient5.getCharset();
        java.time.Duration duration10 = discardUDPClient5.getSoTimeoutDuration();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardUDPClient0.setSoTimeout(duration10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean7 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.time.Duration duration5 = discardUDPClient0.getSoTimeoutDuration();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.close();
        java.lang.String str2 = discardUDPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.time.Duration duration3 = discardUDPClient0.getSoTimeoutDuration();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoTimeout((int) (short) 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = discardTCPClient0.getLocalAddress();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isConnected();
        discardTCPClient0.setSendBufferSize(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize((int) (short) -1);
        discardTCPClient0.setDefaultPort((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        discardTCPClient0.setDefaultPort(0);
        discardTCPClient0.setReceiveBufferSize((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(true, (int) (byte) -1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy6 = discardTCPClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        boolean boolean6 = discardTCPClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = discardTCPClient0.getRemotePort();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        discardTCPClient0.setConnectTimeout((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = discardUDPClient0.getLocalPort();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.open();
        discardUDPClient7.setDefaultTimeout((-1));
        discardUDPClient7.setSoTimeout((int) ' ');
        int int13 = discardUDPClient7.getSoTimeout();
        java.nio.charset.Charset charset14 = discardUDPClient7.getCharset();
        discardUDPClient0.setCharset(charset14);
        java.nio.charset.Charset charset16 = discardUDPClient0.getCharset();
        java.nio.charset.Charset charset17 = discardUDPClient0.getCharset();
        discardUDPClient0.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress19 = discardUDPClient0.getLocalAddress();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        discardTCPClient0.setDefaultPort(0);
        discardTCPClient0.setReceiveBufferSize((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = discardTCPClient0.getTcpNoDelay();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = discardTCPClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = discardTCPClient0.getLocalAddress();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) 'a');
        boolean boolean3 = discardUDPClient0.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardUDPClient0.getLocalPort();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = discardTCPClient0.getSoLinger();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = discardTCPClient0.getLocalAddress();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int8 = discardTCPClient7.getDefaultPort();
        discardTCPClient7.disconnect();
        java.io.OutputStream outputStream10 = discardTCPClient7.getOutputStream();
        java.lang.String str11 = discardTCPClient7.getCharsetName();
        java.nio.charset.Charset charset12 = discardTCPClient7.getCharset();
        discardTCPClient0.setCharset(charset12);
        java.lang.String str14 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress17 = discardTCPClient0.getRemoteAddress();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        int int4 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.setDefaultTimeout(0);
        discardUDPClient5.setDefaultTimeout((int) (short) 1);
        java.lang.String str10 = discardUDPClient5.getCharsetName();
        discardUDPClient5.open();
        discardUDPClient5.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient14 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient14.open();
        discardUDPClient14.open();
        java.net.InetAddress inetAddress17 = discardUDPClient14.getLocalAddress();
        discardUDPClient5.open(0, inetAddress17);
        java.nio.charset.Charset charset19 = discardUDPClient5.getCharset();
        discardTCPClient0.setCharset(charset19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        discardTCPClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = discardTCPClient0.getLocalPort();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        boolean boolean3 = discardTCPClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setSoLinger(false, 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.close();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient2 = new org.apache.commons.net.discard.DiscardUDPClient();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        int int9 = discardUDPClient3.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        java.nio.charset.Charset charset17 = discardUDPClient10.getCharset();
        discardUDPClient3.setCharset(charset17);
        java.nio.charset.Charset charset19 = discardUDPClient3.getCharset();
        discardUDPClient2.setCharset(charset19);
        java.nio.charset.Charset charset21 = discardUDPClient2.getCharset();
        discardUDPClient0.setCharset(charset21);
        java.nio.charset.Charset charset23 = discardUDPClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress24 = discardUDPClient0.getLocalAddress();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = discardTCPClient0.getSoTimeout();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.setDefaultPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = discardTCPClient0.getKeepAlive();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        discardTCPClient0.setKeepAlive(false);
    }
}

