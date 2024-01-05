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
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream3 = fingerClient0.getInputStream(false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(true, (int) '4');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) (short) 10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress2 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = fingerClient0.query(true, "\r\n");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getLocalPort();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(false, (int) (byte) 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress2 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) 'a');
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(true, 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getSoLinger();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout(1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getLocalPort();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fingerClient0.getSoLinger();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout(0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = fingerClient0.query(false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        java.net.Proxy proxy9 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = fingerClient0.query(false, "\r\n");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fingerClient0.getLocalPort();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(true, 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = fingerClient0.getRemotePort();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = fingerClient0.query(true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream7 = fingerClient0.getInputStream(false, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        java.net.Proxy proxy9 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        fingerClient6.disconnect();
        fingerClient6.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset10 = fingerClient6.getCharset();
        fingerClient0.setCharset(charset10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = fingerClient0.getRemotePort();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fingerClient0.getSoTimeout();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(false, (int) ' ');
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fingerClient0.getLocalPort();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream7 = fingerClient0.getInputStream(true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = fingerClient0.getSoLinger();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = fingerClient0.query(false, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = fingerClient0.query(true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = fingerClient0.query(true, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getRemotePort();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        fingerClient6.disconnect();
        fingerClient6.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset10 = fingerClient6.getCharset();
        fingerClient0.setCharset(charset10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress12 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fingerClient0.getRemotePort();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream8 = fingerClient0.getInputStream(false, "\r\n");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream14 = fingerClient0.getInputStream(true, "\r\n");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = fingerClient0.query(true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream4 = fingerClient0.getInputStream(false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        int int4 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        int int4 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) ' ');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream5 = fingerClient0.getInputStream(false, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        java.net.Proxy proxy9 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream11 = fingerClient0.getInputStream(true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = fingerClient0.query(true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream7 = fingerClient0.getInputStream(true, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = fingerClient0.getLocalPort();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream18 = fingerClient0.getInputStream(false, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout(0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        int int7 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(true, (int) (byte) -1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(false, (int) '#');
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        fingerClient0.setReceiveBufferSize((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress16 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream5 = fingerClient0.getInputStream(true, "UTF-8");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fingerClient0.getRemotePort();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = fingerClient0.getSoTimeout();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setConnectTimeout((int) '4');
        java.net.Proxy proxy13 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream15 = fingerClient0.getInputStream(false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = fingerClient0.getLocalPort();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress7 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        java.net.Proxy proxy9 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = fingerClient0.getSoLinger();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setConnectTimeout((int) '4');
        java.net.Proxy proxy13 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream16 = fingerClient0.getInputStream(true, "\r\n");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = fingerClient0.query(false, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = fingerClient0.getLocalPort();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        fingerClient0.setConnectTimeout((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream11 = fingerClient0.getInputStream(true, "UTF-8");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = fingerClient0.query(true, "UTF-8");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = fingerClient0.query(true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = fingerClient0.getRemotePort();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = fingerClient0.query(false, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(true, (int) (byte) 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fingerClient0.getSoLinger();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getSoLinger();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        fingerClient2.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset6 = fingerClient2.getCharset();
        java.nio.charset.Charset charset7 = fingerClient2.getCharset();
        fingerClient0.setCharset(charset7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = fingerClient0.getRemotePort();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = fingerClient0.getLocalPort();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = fingerClient0.getSoLinger();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress9 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(false, (int) ' ');
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) (byte) 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        int int2 = fingerClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getSoLinger();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        boolean boolean4 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        fingerClient0.setReceiveBufferSize((int) 'a');
        java.lang.String str9 = fingerClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream13 = fingerClient0.getInputStream(false, "\r\n", "UTF-8");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress9 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream4 = fingerClient0.getInputStream(true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        int int9 = fingerClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = fingerClient0.getSoLinger();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = fingerClient0.query(true, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream8 = fingerClient0.getInputStream(true, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        int int7 = fingerClient0.getConnectTimeout();
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = fingerClient0.query(false, "UTF-8");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = fingerClient0.getLocalPort();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress7 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = fingerClient0.getSoTimeout();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        int int14 = fingerClient0.getConnectTimeout();
        int int15 = fingerClient0.getConnectTimeout();
        fingerClient0.setReceiveBufferSize((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fingerClient0.getRemotePort();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream9 = fingerClient0.getInputStream(true, "\r\n", "UTF-8");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fingerClient0.getLocalPort();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        java.lang.String str3 = fingerClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = fingerClient0.query(false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) (short) -1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(false, (int) (short) 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setConnectTimeout((int) '4');
        int int13 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        fingerClient0.setDefaultTimeout((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setConnectTimeout((int) '4');
        int int13 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = fingerClient0.getRemotePort();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        fingerClient2.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset6 = fingerClient2.getCharset();
        java.nio.charset.Charset charset7 = fingerClient2.getCharset();
        fingerClient0.setCharset(charset7);
        fingerClient0.setConnectTimeout((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) ' ');
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = fingerClient0.query(false, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        java.lang.String str3 = fingerClient0.getCharsetName();
        boolean boolean4 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream7 = fingerClient0.getInputStream(false, "\r\n");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        int int9 = fingerClient0.getDefaultTimeout();
        int int10 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = fingerClient0.getRemotePort();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy2 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getSoTimeout();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        fingerClient6.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        fingerClient8.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset12 = fingerClient8.getCharset();
        java.nio.charset.Charset charset13 = fingerClient8.getCharset();
        fingerClient6.setCharset(charset13);
        fingerClient0.setCharset(charset13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setTcpNoDelay(false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setDefaultPort((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = fingerClient0.getRemotePort();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        int int3 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) (short) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = fingerClient0.query(false, "\r\n");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setConnectTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (short) 100);
        int int13 = fingerClient0.getConnectTimeout();
        int int14 = fingerClient0.getConnectTimeout();
        int int15 = fingerClient0.getConnectTimeout();
        boolean boolean16 = fingerClient0.isConnected();
        int int17 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = fingerClient0.getLocalPort();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = fingerClient0.getSoTimeout();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = fingerClient0.query(true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        int int7 = fingerClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream10 = fingerClient0.getInputStream(false, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        java.lang.String str8 = fingerClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream10 = fingerClient0.getInputStream(false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setKeepAlive(false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        boolean boolean4 = fingerClient0.isConnected();
        java.net.Proxy proxy5 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = fingerClient0.getLocalAddress();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        boolean boolean4 = fingerClient0.isConnected();
        java.net.Proxy proxy5 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(true, 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        fingerClient6.disconnect();
        fingerClient6.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset10 = fingerClient6.getCharset();
        fingerClient0.setCharset(charset10);
        java.lang.String str12 = fingerClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoTimeout((int) '#');
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fingerClient0.getKeepAlive();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream5 = fingerClient0.getInputStream(true, "\r\n");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = fingerClient0.getSoLinger();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        fingerClient6.disconnect();
        fingerClient6.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset10 = fingerClient6.getCharset();
        fingerClient0.setCharset(charset10);
        java.net.Proxy proxy12 = fingerClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = fingerClient0.getTcpNoDelay();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        java.lang.String str2 = fingerClient0.getCharsetName();
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        fingerClient0.setSoLinger(false, 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = fingerClient0.getRemoteAddress();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream9 = fingerClient0.getInputStream(true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        boolean boolean4 = fingerClient0.isAvailable();
        boolean boolean5 = fingerClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fingerClient0.getTcpNoDelay();
    }
}

