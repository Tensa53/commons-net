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
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "hi!", "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rExecClient0.rexec("", "\r\n", "\r\n", false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "", "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "hi!", "\r\n");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "", "\r\n");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress1 = rLoginClient0.getLocalAddress();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "", "\r\n", false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress1 = rExecClient0.getLocalAddress();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress7 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "\r\n", "UTF-8", true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("\r\n", "hi!", "UTF-8", 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("UTF-8", "\r\n", "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        java.lang.String str2 = rExecClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = rExecClient0.getKeepAlive();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("hi!", "\r\n", "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("UTF-8", "", "", 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "\r\n", "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = rExecClient0.getSoTimeout();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("\r\n", "", "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(false, (int) ' ');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress7 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        rCommandClient0.setSendBufferSize(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("\r\n", "", "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = rLoginClient0.getLocalPort();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        java.io.OutputStream outputStream6 = rCommandClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("\r\n", "\r\n", "\r\n");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("hi!", "UTF-8", "\r\n", (int) '#');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("hi!", "", "", (int) (short) 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = rExecClient0.getLocalPort();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("\r\n", "UTF-8", "UTF-8");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "hi!", "hi!", (int) (short) -1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "UTF-8", "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rExecClient0.getSoLinger();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("\r\n", "", "\r\n", false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        int int5 = rExecClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = rExecClient0.getTcpNoDelay();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient12.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory13);
        rCommandClient0.setReceiveBufferSize((int) (short) 1);
        boolean boolean17 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("UTF-8", "hi!", "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setRemoteVerificationEnabled(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        java.io.InputStream inputStream4 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        java.io.InputStream inputStream6 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "", "\r\n", true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("\r\n", "", "hi!", false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "\r\n", "UTF-8", false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(true, 513);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress8 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rcommand("", "\r\n", "\r\n", true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("UTF-8", "UTF-8", "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "\r\n", "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("", "UTF-8", "\r\n");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = rCommandClient0.getServerSocketFactory();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        rCommandClient2.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient7 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient7.disconnect();
        java.nio.charset.Charset charset9 = rLoginClient7.getCharset();
        rCommandClient2.setCharset(charset9);
        rCommandClient0.setCharset(charset9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(true, 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        java.net.Proxy proxy4 = rCommandClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "", "UTF-8", false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        boolean boolean5 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "", "UTF-8", true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        boolean boolean5 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        int int5 = rCommandClient2.getDefaultTimeout();
        int int6 = rCommandClient2.getConnectTimeout();
        boolean boolean7 = rCommandClient2.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory8 = rCommandClient2.getServerSocketFactory();
        rExecClient0.setServerSocketFactory(serverSocketFactory8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = rExecClient0.getSoTimeout();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultTimeout((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("UTF-8", "\r\n", "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        int int5 = rCommandClient2.getDefaultTimeout();
        int int6 = rCommandClient2.getConnectTimeout();
        boolean boolean7 = rCommandClient2.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory8 = rCommandClient2.getServerSocketFactory();
        rExecClient0.setServerSocketFactory(serverSocketFactory8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rExecClient0.rexec("\r\n", "hi!", "\r\n", true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = rLoginClient0.getKeepAlive();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("UTF-8", "hi!", "\r\n", 10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        rCommandClient0.setSendBufferSize(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        org.apache.commons.net.bsd.RCommandClient rCommandClient11 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory12 = rCommandClient11.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("\r\n", "UTF-8", "\r\n");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setReceiveBufferSize((int) (short) 100);
        java.io.InputStream inputStream12 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        int int5 = rExecClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = rExecClient0.getRemoteAddress();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("hi!", "UTF-8", "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setDefaultPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = rCommandClient0.getSoLinger();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("\r\n", "\r\n", "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rExecClient0.getSoTimeout();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "", "UTF-8");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(514);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "hi!", "hi!", true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        rCommandClient0.setSendBufferSize(10);
        int int15 = rCommandClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("\r\n", "", "\r\n");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        java.net.Proxy proxy7 = rCommandClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient12.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("hi!", "\r\n", "", false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        int int13 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient12.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory13);
        rCommandClient0.setReceiveBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean5 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("hi!", "UTF-8", "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = rLoginClient0.getSoTimeout();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        java.io.OutputStream outputStream6 = rCommandClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        java.io.InputStream inputStream13 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("hi!", "hi!", "", true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("UTF-8", "\r\n", "hi!", 514);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setDefaultPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("UTF-8", "", "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        java.io.InputStream inputStream8 = rCommandClient0.getInputStream();
        rCommandClient0.setReceiveBufferSize(1023);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = rCommandClient0.getServerSocketFactory();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        rCommandClient2.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient7 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient7.disconnect();
        java.nio.charset.Charset charset9 = rLoginClient7.getCharset();
        rCommandClient2.setCharset(charset9);
        rCommandClient0.setCharset(charset9);
        javax.net.ServerSocketFactory serverSocketFactory12 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient5 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient5.setConnectTimeout((int) (byte) -1);
        boolean boolean8 = rCommandClient5.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient9 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient9.disconnect();
        java.nio.charset.Charset charset11 = rLoginClient9.getCharset();
        rCommandClient5.setCharset(charset11);
        rCommandClient5.disconnect();
        rCommandClient5.setDefaultPort(100);
        org.apache.commons.net.bsd.RCommandClient rCommandClient16 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory17 = rCommandClient16.getServerSocketFactory();
        rCommandClient5.setServerSocketFactory(serverSocketFactory17);
        rLoginClient0.setServerSocketFactory(serverSocketFactory17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "\r\n", "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = rExecClient0.getTcpNoDelay();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        java.io.InputStream inputStream8 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress9 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        rCommandClient0.setDefaultTimeout((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("", "", "\r\n", false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout(512);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("UTF-8", "\r\n", "hi!", true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        boolean boolean6 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress7 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("UTF-8", "UTF-8", "hi!", (int) ' ');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(514);
        int int8 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = rExecClient0.getKeepAlive();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(false, 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rExecClient0.setSoTimeout(60000);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("\r\n", "\r\n", "UTF-8", false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        rCommandClient0.setSendBufferSize(10);
        rCommandClient0.setSendBufferSize((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(true, 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        boolean boolean5 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        org.apache.commons.net.bsd.RCommandClient rCommandClient13 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient13.setConnectTimeout((int) (byte) -1);
        int int16 = rCommandClient13.getDefaultTimeout();
        int int17 = rCommandClient13.getConnectTimeout();
        boolean boolean18 = rCommandClient13.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory19 = rCommandClient13.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress21 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "\r\n", "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        int int2 = rLoginClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "", "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        boolean boolean13 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress14 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("\r\n", "UTF-8", "", 514);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("UTF-8", "", "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.disconnect();
        int int14 = rCommandClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("hi!", "", "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setRemoteVerificationEnabled(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "", "\r\n", true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        int int2 = rLoginClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rexec("hi!", "", "UTF-8");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.bsd.RCommandClient rCommandClient7 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient7.setConnectTimeout((int) (byte) -1);
        boolean boolean10 = rCommandClient7.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory11 = rCommandClient7.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("", "\r\n", "\r\n");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "\r\n", "UTF-8", (int) (short) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("UTF-8", "", "hi!", true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "UTF-8", "", (int) (short) 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = rCommandClient0.getRemoteAddress();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        int int3 = rLoginClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = rLoginClient0.getRemoteAddress();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(false, (int) (short) 100);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout(512);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("\r\n", "UTF-8", "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "UTF-8", "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        java.io.InputStream inputStream4 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setKeepAlive(false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient12.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory13);
        rCommandClient0.setReceiveBufferSize((int) (short) 1);
        boolean boolean17 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean18 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        rCommandClient0.setReceiveBufferSize((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        boolean boolean6 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoLinger(false, 513);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        java.io.InputStream inputStream5 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        java.net.Proxy proxy4 = rLoginClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = rLoginClient0.getRemoteAddress();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setDefaultPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress12 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient5 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient5.setConnectTimeout((int) (byte) -1);
        boolean boolean8 = rCommandClient5.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient9 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient9.disconnect();
        java.nio.charset.Charset charset11 = rLoginClient9.getCharset();
        rCommandClient5.setCharset(charset11);
        rCommandClient5.disconnect();
        rCommandClient5.setDefaultPort(100);
        org.apache.commons.net.bsd.RCommandClient rCommandClient16 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory17 = rCommandClient16.getServerSocketFactory();
        rCommandClient5.setServerSocketFactory(serverSocketFactory17);
        rLoginClient0.setServerSocketFactory(serverSocketFactory17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("UTF-8", "hi!", "UTF-8");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient12.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory13);
        rCommandClient0.setReceiveBufferSize((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress17 = rCommandClient0.getLocalAddress();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        boolean boolean1 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = rCommandClient0.getRemotePort();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setDefaultPort((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = rCommandClient0.getTcpNoDelay();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("hi!", "hi!", "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = rCommandClient0.getLocalPort();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rcommand("", "hi!", "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        rLoginClient0.setRemoteVerificationEnabled(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("", "UTF-8", "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        int int7 = rCommandClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoTimeout((int) '4');
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory7 = rCommandClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoTimeout(60000);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = rCommandClient0.getServerSocketFactory();
        rCommandClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setTcpNoDelay(false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.rexec("", "hi!", "UTF-8", false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = rCommandClient0.getSoLinger();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultTimeout((int) (short) 1);
        org.apache.commons.net.bsd.RCommandClient rCommandClient13 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory14 = rCommandClient13.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = rCommandClient0.getSoTimeout();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultTimeout((int) (short) 1);
        boolean boolean13 = rCommandClient0.isRemoteVerificationEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = rCommandClient0.getKeepAlive();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rCommandClient0.setSoTimeout((int) 'a');
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient5 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient5.setConnectTimeout((int) (byte) -1);
        boolean boolean8 = rCommandClient5.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient9 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient9.disconnect();
        java.nio.charset.Charset charset11 = rLoginClient9.getCharset();
        rCommandClient5.setCharset(charset11);
        rCommandClient5.disconnect();
        rCommandClient5.setDefaultPort(100);
        org.apache.commons.net.bsd.RCommandClient rCommandClient16 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory17 = rCommandClient16.getServerSocketFactory();
        rCommandClient5.setServerSocketFactory(serverSocketFactory17);
        rLoginClient0.setServerSocketFactory(serverSocketFactory17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        rLoginClient0.rlogin("\r\n", "\r\n", "\r\n");
    }
}

