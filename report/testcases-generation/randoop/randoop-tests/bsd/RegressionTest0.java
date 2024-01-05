import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = org.apache.commons.net.SocketClient.NETASCII_EOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = org.apache.commons.net.bsd.RCommandClient.MAX_CLIENT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1023 + "'", int0 == 1023);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 1023);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        java.lang.Class<?> wildcardClass1 = rExecClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, 1023, inetAddress6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, (int) (byte) 1, inetAddress6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5, 0, inetAddress7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) (byte) 1, inetAddress4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = org.apache.commons.net.bsd.RCommandClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 514 + "'", int0 == 514);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, (int) (byte) 1, inetAddress6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (byte) 10, inetAddress4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.addProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = rCommandClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??: Nome o servizio sconosciuto");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 514);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8: Nome o servizio sconosciuto");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress1, (int) (short) 0, inetAddress3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (short) 1, inetAddress3);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Nome o servizio sconosciuto");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory4 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) (short) 10, inetAddress7);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, 0, inetAddress6, 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) (short) 1, inetAddress7, 514);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) (short) 10, inetAddress10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rCommandClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        java.lang.String str2 = rExecClient0.getCharsetName();
        java.lang.Class<?> wildcardClass3 = rExecClient0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress8, (int) ' ', inetAddress10, 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("\r\n", "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(514);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", 10, inetAddress10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rcommand("hi!", "", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        java.lang.Class<?> wildcardClass15 = rCommandClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        java.net.InetAddress inetAddress1 = null;
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress1, (-1), inetAddress3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setReceiveBufferSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", 1023);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setReceiveBufferSize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.net.Socket socket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rCommandClient0.verifyRemote(socket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        boolean boolean6 = rCommandClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        java.io.InputStream inputStream5 = rCommandClient0.getErrorStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = rCommandClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int0 = org.apache.commons.net.bsd.RCommandClient.MIN_CLIENT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        rCommandClient0.setSendBufferSize(1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, 100, inetAddress11, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        java.io.OutputStream outputStream6 = rCommandClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
        org.junit.Assert.assertNull(outputStream6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        java.io.InputStream inputStream4 = rCommandClient0.getErrorStream();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.lang.Class<?> wildcardClass17 = rCommandClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        rCommandClient0.setSendBufferSize(1);
        java.lang.Class<?> wildcardClass10 = rCommandClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int int0 = org.apache.commons.net.bsd.RLoginClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 513 + "'", int0 == 513);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        rExecClient0.setDefaultTimeout((int) (short) 100);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.addProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) 1, inetAddress7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.InetAddress inetAddress13 = null;
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress13, 1023, inetAddress15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        java.net.Proxy proxy4 = rCommandClient0.getProxy();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5, (int) (byte) 100, inetAddress7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress6, 1, inetAddress8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoTimeout(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.net.InetAddress inetAddress11 = null;
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress11, (int) (byte) 1, inetAddress13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("", "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect("UTF-8", (int) (byte) -1, inetAddress7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress6, 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getConnectTimeout();
        java.net.InetAddress inetAddress7 = null;
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress7, (int) (byte) 1, inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) 'a', inetAddress12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int0 = org.apache.commons.net.bsd.RExecClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        int int12 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("", "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 60000);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) '4', inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress13 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        javax.net.SocketFactory socketFactory8 = null;
        rCommandClient0.setSocketFactory(socketFactory8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        int int1 = rExecClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.connect("\r\n", 1023);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        java.net.InetAddress inetAddress16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) '#', inetAddress16);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
        java.lang.Class<?> wildcardClass13 = serverSocketFactory11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Proxy proxy13 = null;
        rCommandClient0.setProxy(proxy13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        java.io.InputStream inputStream8 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, 1023, inetAddress11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", 1, inetAddress9, 513);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean5 = rCommandClient0.isConnected();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultPort((int) '4');
        rCommandClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        java.net.Proxy proxy12 = null;
        rCommandClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        int int9 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, (int) 'a', inetAddress11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory4 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        rCommandClient12.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient17 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient17.disconnect();
        java.nio.charset.Charset charset19 = rLoginClient17.getCharset();
        rCommandClient12.setCharset(charset19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory22 = rCommandClient21.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory22);
        org.apache.commons.net.bsd.RCommandClient rCommandClient24 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory25 = rCommandClient24.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory25);
        rCommandClient0.setServerSocketFactory(serverSocketFactory25);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
        org.junit.Assert.assertNotNull(serverSocketFactory25);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setDefaultPort((int) (short) -1);
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) (byte) -1, inetAddress14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setReceiveBufferSize((-1));
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("UTF-8", "", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        rCommandClient0.disconnect();
        boolean boolean15 = rCommandClient0.isAvailable();
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress8, 512, inetAddress10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rLoginClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        rCommandClient0.setDefaultTimeout((int) (short) -1);
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        java.nio.charset.Charset charset14 = rCommandClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress15 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(charset14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        boolean boolean2 = rCommandClient0.isConnected();
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout(1);
        int int12 = rCommandClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        boolean boolean7 = rCommandClient0.isRemoteVerificationEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        int int12 = rCommandClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        rCommandClient0.disconnect();
        boolean boolean15 = rCommandClient0.isAvailable();
        java.nio.charset.Charset charset16 = rCommandClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("", "", "UTF-8", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        rCommandClient0.setDefaultTimeout((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress14 = rCommandClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout(1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        java.io.InputStream inputStream9 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = inputStream9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = rCommandClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, (int) (byte) 100, inetAddress6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout(1);
        javax.net.SocketFactory socketFactory12 = null;
        rCommandClient0.setSocketFactory(socketFactory12);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        int int9 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress10 = null;
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress10, (int) 'a', inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout((int) ' ');
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        java.io.InputStream inputStream8 = rCommandClient0.getInputStream();
        rCommandClient0.setReceiveBufferSize(1023);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        rCommandClient0.setDefaultPort((int) (byte) 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("\r\n", "hi!", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.connect(inetAddress3, 0, inetAddress5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        java.io.OutputStream outputStream12 = rCommandClient0.getOutputStream();
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(outputStream12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = rCommandClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        java.net.Proxy proxy12 = null;
        rCommandClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) (byte) 10, inetAddress15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory1);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        int int5 = rExecClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) (byte) -1);
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.removeProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        java.net.Proxy proxy12 = null;
        rCommandClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress14 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress4, (int) (short) 10, inetAddress6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        rCommandClient0.setConnectTimeout(0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) 0, inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        rCommandClient0.setDefaultTimeout((int) ' ');
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (byte) 1, inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.disconnect();
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultPort((int) '4');
        java.net.Proxy proxy13 = null;
        rCommandClient0.setProxy(proxy13);
        org.apache.commons.net.bsd.RCommandClient rCommandClient15 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient15.setConnectTimeout((int) (byte) -1);
        boolean boolean18 = rCommandClient15.isRemoteVerificationEnabled();
        rCommandClient15.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset21 = rCommandClient15.getCharset();
        rCommandClient0.setCharset(charset21);
        java.net.InetAddress inetAddress23 = null;
        java.net.InetAddress inetAddress25 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress23, (int) '#', inetAddress25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charset21);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??: Nome o servizio sconosciuto");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory1);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        int int5 = rCommandClient2.getDefaultTimeout();
        int int6 = rCommandClient2.getConnectTimeout();
        boolean boolean7 = rCommandClient2.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory8 = rCommandClient2.getServerSocketFactory();
        rExecClient0.setServerSocketFactory(serverSocketFactory8);
        int int10 = rExecClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        java.nio.charset.Charset charset14 = rCommandClient0.getCharset();
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) (byte) 1, inetAddress17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(charset14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", 514);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.connect("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        java.lang.Class<?> wildcardClass6 = rCommandClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        rCommandClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        rCommandClient0.disconnect();
        boolean boolean15 = rCommandClient0.isAvailable();
        java.nio.charset.Charset charset16 = rCommandClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("\r\n", "UTF-8", "\r\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        java.io.InputStream inputStream8 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        java.net.Proxy proxy4 = null;
        rCommandClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = rCommandClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(514);
        int int8 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) 'a', inetAddress11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 514 + "'", int8 == 514);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        int int4 = rLoginClient0.getConnectTimeout();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress5, (int) (short) 0, inetAddress7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Proxy proxy13 = null;
        rCommandClient0.setProxy(proxy13);
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        boolean boolean11 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoLinger(false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        java.io.InputStream inputStream6 = rCommandClient0.getErrorStream();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.net.Socket socket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = rCommandClient0.verifyRemote(socket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        rCommandClient0.disconnect();
        boolean boolean15 = rCommandClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress16 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = rCommandClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        boolean boolean15 = rCommandClient12.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient16 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient16.disconnect();
        java.nio.charset.Charset charset18 = rLoginClient16.getCharset();
        rCommandClient12.setCharset(charset18);
        rCommandClient0.setCharset(charset18);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        boolean boolean11 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultPort((int) '4');
        java.net.Proxy proxy13 = null;
        rCommandClient0.setProxy(proxy13);
        org.apache.commons.net.bsd.RCommandClient rCommandClient15 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient15.setConnectTimeout((int) (byte) -1);
        boolean boolean18 = rCommandClient15.isRemoteVerificationEnabled();
        rCommandClient15.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset21 = rCommandClient15.getCharset();
        rCommandClient0.setCharset(charset21);
        java.net.InetAddress inetAddress23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charset21);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        javax.net.ServerSocketFactory serverSocketFactory17 = rCommandClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(serverSocketFactory17);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.InetAddress inetAddress7 = null;
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress7, 10, inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        boolean boolean1 = rCommandClient0.isConnected();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress7 = null;
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress7, (int) 'a', inetAddress9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
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
        rCommandClient0.setSendBufferSize(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout((int) (short) -1);
        rCommandClient0.setDefaultTimeout(60000);
        java.lang.Class<?> wildcardClass9 = rCommandClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.lang.Class<?> wildcardClass7 = serverSocketFactory6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.lang.Class<?> wildcardClass9 = rCommandClient0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        org.apache.commons.net.bsd.RCommandClient rCommandClient16 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient16.setConnectTimeout((int) (byte) -1);
        boolean boolean19 = rCommandClient16.isRemoteVerificationEnabled();
        boolean boolean20 = rCommandClient16.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory21 = rCommandClient16.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory21);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        boolean boolean5 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient6 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient6.setConnectTimeout((int) (byte) -1);
        boolean boolean9 = rCommandClient6.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient10 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient10.disconnect();
        java.nio.charset.Charset charset12 = rLoginClient10.getCharset();
        rCommandClient6.setCharset(charset12);
        rCommandClient6.disconnect();
        rCommandClient6.setDefaultPort(100);
        rCommandClient6.setDefaultPort((int) '4');
        java.net.Proxy proxy19 = null;
        rCommandClient6.setProxy(proxy19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient21.setConnectTimeout((int) (byte) -1);
        boolean boolean24 = rCommandClient21.isRemoteVerificationEnabled();
        rCommandClient21.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset27 = rCommandClient21.getCharset();
        rCommandClient6.setCharset(charset27);
        rCommandClient0.setCharset(charset27);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charset27);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        java.net.Proxy proxy7 = rCommandClient0.getProxy();
        boolean boolean8 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) '#', inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("\r\n", "\r\n", "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5, 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, (int) (short) 1, inetAddress11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient6 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient6.setConnectTimeout((int) (byte) -1);
        boolean boolean9 = rCommandClient6.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient10 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient10.disconnect();
        java.nio.charset.Charset charset12 = rLoginClient10.getCharset();
        rCommandClient6.setCharset(charset12);
        rCommandClient6.disconnect();
        rCommandClient6.setDefaultPort(100);
        rCommandClient6.setDefaultPort((int) '4');
        java.net.Proxy proxy19 = null;
        rCommandClient6.setProxy(proxy19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient21.setConnectTimeout((int) (byte) -1);
        boolean boolean24 = rCommandClient21.isRemoteVerificationEnabled();
        rCommandClient21.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset27 = rCommandClient21.getCharset();
        rCommandClient6.setCharset(charset27);
        rCommandClient0.setCharset(charset27);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rcommand("\r\n", "", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charset27);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress14 = rCommandClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        boolean boolean14 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(0);
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        int int12 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (-1), inetAddress15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        java.lang.Class<?> wildcardClass21 = serverSocketFactory19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        java.net.InetAddress inetAddress15 = null;
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress15, 514, inetAddress17, 514);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        int int14 = rCommandClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        rCommandClient0.setReceiveBufferSize((int) (byte) -1);
        boolean boolean8 = rCommandClient0.isRemoteVerificationEnabled();
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        boolean boolean11 = rCommandClient0.isRemoteVerificationEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.nio.charset.Charset charset13 = rCommandClient0.getCharset();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charset13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, (int) (byte) 100, inetAddress6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout(1);
        javax.net.SocketFactory socketFactory12 = null;
        rCommandClient0.setSocketFactory(socketFactory12);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        int int9 = rCommandClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient0.getServerSocketFactory();
        boolean boolean11 = rCommandClient0.isConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 514 + "'", int9 == 514);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5, (int) (byte) -1, inetAddress7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        rCommandClient0.disconnect();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        rCommandClient0.setDefaultTimeout((int) ' ');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        int int5 = rCommandClient2.getDefaultTimeout();
        int int6 = rCommandClient2.getConnectTimeout();
        boolean boolean7 = rCommandClient2.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory8 = rCommandClient2.getServerSocketFactory();
        rExecClient0.setServerSocketFactory(serverSocketFactory8);
        java.net.Proxy proxy10 = rExecClient0.getProxy();
        boolean boolean11 = rExecClient0.isRemoteVerificationEnabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        rCommandClient0.setReceiveBufferSize((int) (byte) -1);
        rCommandClient0.setSendBufferSize(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        java.nio.charset.Charset charset17 = rCommandClient0.getCharset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        int int12 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress13 = null;
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress13, 0, inetAddress15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultPort((int) '4');
        java.net.Proxy proxy13 = null;
        rCommandClient0.setProxy(proxy13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = rCommandClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.net.Proxy proxy6 = null;
        rCommandClient0.setProxy(proxy6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 514 + "'", int14 == 514);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        int int7 = rCommandClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 514 + "'", int7 == 514);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 512, inetAddress8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        int int9 = rCommandClient0.getDefaultTimeout();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        int int12 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress13 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect("\r\n", (int) ' ', inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        rCommandClient0.setDefaultPort((int) 'a');
        java.net.InetAddress inetAddress15 = null;
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress15, (int) '4', inetAddress17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        rCommandClient0.setConnectTimeout(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, 0, inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        rExecClient0.setReceiveBufferSize((int) (short) 100);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, 1023, inetAddress11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 514, inetAddress14);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int9 = rCommandClient0.getDefaultPort();
        rCommandClient0.setDefaultTimeout((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 514 + "'", int9 == 514);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rcommand("hi!", "", "UTF-8", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        rCommandClient0.setDefaultPort(10);
        int int12 = rCommandClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        rCommandClient0.setDefaultPort((int) 'a');
        rCommandClient0.setDefaultPort((int) (short) 100);
        java.net.Proxy proxy17 = rCommandClient0.getProxy();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        boolean boolean15 = rCommandClient12.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient16 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient16.disconnect();
        java.nio.charset.Charset charset18 = rLoginClient16.getCharset();
        rCommandClient12.setCharset(charset18);
        rCommandClient0.setCharset(charset18);
        java.io.InputStream inputStream21 = rCommandClient0.getInputStream();
        java.net.Proxy proxy22 = null;
        rCommandClient0.setProxy(proxy22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.net.InetAddress inetAddress11 = null;
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress11, (int) '#', inetAddress13, 514);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        rCommandClient0.setReceiveBufferSize((int) (byte) -1);
        boolean boolean8 = rCommandClient0.isRemoteVerificationEnabled();
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress13 = null;
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress13, 1, inetAddress15, 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        rCommandClient0.setRemoteVerificationEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("\r\n", "UTF-8", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect("\r\n", 100, inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        int int5 = rCommandClient2.getDefaultTimeout();
        int int6 = rCommandClient2.getConnectTimeout();
        boolean boolean7 = rCommandClient2.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory8 = rCommandClient2.getServerSocketFactory();
        rExecClient0.setServerSocketFactory(serverSocketFactory8);
        java.net.Proxy proxy10 = rExecClient0.getProxy();
        rExecClient0.setReceiveBufferSize(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = rCommandClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy5 = null;
        rCommandClient0.setProxy(proxy5);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rcommand("UTF-8", "UTF-8", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        rCommandClient0.setDefaultPort(1023);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        rCommandClient0.setReceiveBufferSize((int) ' ');
        rCommandClient0.setDefaultTimeout(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        rCommandClient0.setReceiveBufferSize((int) (byte) -1);
        boolean boolean8 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress9, (int) (short) 1, inetAddress11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        boolean boolean11 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoTimeout((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoLinger(false, 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        rCommandClient0.setReceiveBufferSize((int) ' ');
        java.io.OutputStream outputStream10 = rCommandClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(outputStream10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        rCommandClient0.setReceiveBufferSize((int) (byte) -1);
        boolean boolean8 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream9 = rCommandClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(outputStream9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        javax.net.ServerSocketFactory serverSocketFactory17 = rCommandClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(serverSocketFactory17);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        boolean boolean1 = rExecClient0.isAvailable();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rExecClient0.connect(inetAddress2, (int) (byte) -1, inetAddress4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        rCommandClient0.disconnect();
        boolean boolean15 = rCommandClient0.isAvailable();
        java.nio.charset.Charset charset16 = rCommandClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = rCommandClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        boolean boolean13 = rCommandClient0.isRemoteVerificationEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        rCommandClient0.setDefaultTimeout(513);
        boolean boolean10 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = rCommandClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        java.net.Proxy proxy5 = null;
        rLoginClient0.setProxy(proxy5);
        rLoginClient0.setDefaultPort(100);
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        boolean boolean15 = rCommandClient12.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient16 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient16.disconnect();
        java.nio.charset.Charset charset18 = rLoginClient16.getCharset();
        rCommandClient12.setCharset(charset18);
        rCommandClient0.setCharset(charset18);
        java.io.InputStream inputStream21 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = rCommandClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        int int9 = rCommandClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient0.getServerSocketFactory();
        rCommandClient0.setConnectTimeout(0);
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (-1), inetAddress15);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 514 + "'", int9 == 514);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        boolean boolean14 = rCommandClient0.isConnected();
        java.net.Proxy proxy15 = rCommandClient0.getProxy();
        java.net.InetAddress inetAddress18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (-1), inetAddress18);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        boolean boolean14 = rCommandClient0.isConnected();
        java.net.Proxy proxy15 = rCommandClient0.getProxy();
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setReceiveBufferSize((-1));
        java.net.InetAddress inetAddress16 = null;
        java.net.InetAddress inetAddress18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress16, (int) '#', inetAddress18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        rCommandClient0.setConnectTimeout((int) (short) 0);
        boolean boolean8 = rCommandClient0.isConnected();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 514 + "'", int14 == 514);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.io.OutputStream outputStream9 = rCommandClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = rCommandClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(outputStream9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout(1);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        int int4 = rCommandClient0.getDefaultTimeout();
        rCommandClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient6 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient6.setConnectTimeout((int) (byte) -1);
        boolean boolean9 = rCommandClient6.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient10 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient10.disconnect();
        java.nio.charset.Charset charset12 = rLoginClient10.getCharset();
        rCommandClient6.setCharset(charset12);
        rCommandClient6.disconnect();
        rCommandClient6.setDefaultPort(100);
        rCommandClient6.setDefaultPort((int) '4');
        java.net.Proxy proxy19 = null;
        rCommandClient6.setProxy(proxy19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient21.setConnectTimeout((int) (byte) -1);
        boolean boolean24 = rCommandClient21.isRemoteVerificationEnabled();
        rCommandClient21.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset27 = rCommandClient21.getCharset();
        rCommandClient6.setCharset(charset27);
        rLoginClient0.setCharset(charset27);
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.rlogin("UTF-8", "hi!", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charset27);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        java.net.Proxy proxy7 = rCommandClient0.getProxy();
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.addProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        rCommandClient0.setConnectTimeout((int) (short) 0);
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        int int9 = rCommandClient0.getDefaultTimeout();
        rCommandClient0.setReceiveBufferSize((int) (byte) 1);
        java.net.InetAddress inetAddress12 = null;
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12, 0, inetAddress14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.net.Proxy proxy6 = null;
        rCommandClient0.setProxy(proxy6);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
        java.lang.String str14 = rCommandClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-8" + "'", str14, "UTF-8");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        boolean boolean5 = rCommandClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        java.io.InputStream inputStream9 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress10 = null;
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress10, 100, inetAddress12, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress14 = rCommandClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        boolean boolean8 = rCommandClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        rCommandClient0.setDefaultTimeout((int) ' ');
        org.apache.commons.net.bsd.RCommandClient rCommandClient9 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient9.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory10);
        java.lang.String str12 = rCommandClient0.getCharsetName();
        rCommandClient0.setConnectTimeout((int) (short) 1);
        java.net.Proxy proxy15 = null;
        rCommandClient0.setProxy(proxy15);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        int int5 = rExecClient0.getDefaultTimeout();
        rExecClient0.setReceiveBufferSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        java.lang.String str15 = rCommandClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = rCommandClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.io.OutputStream outputStream7 = rCommandClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(outputStream7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        javax.net.SocketFactory socketFactory14 = null;
        rCommandClient0.setSocketFactory(socketFactory14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        boolean boolean15 = rCommandClient12.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient16 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient16.disconnect();
        java.nio.charset.Charset charset18 = rLoginClient16.getCharset();
        rCommandClient12.setCharset(charset18);
        rCommandClient0.setCharset(charset18);
        java.net.Proxy proxy21 = rCommandClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNull(proxy21);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        java.io.InputStream inputStream9 = rCommandClient0.getInputStream();
        boolean boolean10 = rCommandClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("UTF-8", "\r\n", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout((int) (short) -1);
        java.nio.charset.Charset charset7 = rCommandClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        int int1 = rExecClient0.getConnectTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        int int5 = rCommandClient2.getDefaultTimeout();
        int int6 = rCommandClient2.getConnectTimeout();
        rCommandClient2.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy9 = null;
        rCommandClient2.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient2.setSocketFactory(socketFactory11);
        java.io.InputStream inputStream13 = rCommandClient2.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient14 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient14.setConnectTimeout((int) (byte) -1);
        boolean boolean17 = rCommandClient14.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient18 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient18.disconnect();
        java.nio.charset.Charset charset20 = rLoginClient18.getCharset();
        rCommandClient14.setCharset(charset20);
        rCommandClient2.setCharset(charset20);
        rExecClient0.setCharset(charset20);
        java.lang.Class<?> wildcardClass24 = charset20.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        rCommandClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        boolean boolean15 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 514);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 514 + "'", int14 == 514);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        java.io.InputStream inputStream7 = rCommandClient0.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.io.InputStream inputStream6 = rCommandClient0.getInputStream();
        java.io.InputStream inputStream7 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) (short) 10, inetAddress10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        rCommandClient0.setConnectTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = rCommandClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        int int4 = rCommandClient0.getDefaultTimeout();
        boolean boolean5 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress6, (int) (short) 10, inetAddress8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress4, 0, inetAddress6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        java.net.Proxy proxy5 = null;
        rCommandClient0.setProxy(proxy5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        rCommandClient0.setReceiveBufferSize((int) ' ');
        int int10 = rCommandClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        int int2 = rLoginClient0.getDefaultTimeout();
        java.io.OutputStream outputStream3 = rLoginClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(outputStream3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        java.nio.charset.Charset charset12 = rCommandClient0.getCharset();
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 1023, inetAddress15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory7 = rCommandClient0.getServerSocketFactory();
        int int8 = rCommandClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 514 + "'", int8 == 514);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        boolean boolean11 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.InputStream inputStream12 = rCommandClient0.getErrorStream();
        int int13 = rCommandClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 514 + "'", int13 == 514);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient6 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient6.setConnectTimeout((int) (byte) -1);
        boolean boolean9 = rCommandClient6.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient10 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient10.disconnect();
        java.nio.charset.Charset charset12 = rLoginClient10.getCharset();
        rCommandClient6.setCharset(charset12);
        rCommandClient6.disconnect();
        rCommandClient6.setDefaultPort(100);
        rCommandClient6.setDefaultPort((int) '4');
        java.net.Proxy proxy19 = null;
        rCommandClient6.setProxy(proxy19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient21.setConnectTimeout((int) (byte) -1);
        boolean boolean24 = rCommandClient21.isRemoteVerificationEnabled();
        rCommandClient21.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset27 = rCommandClient21.getCharset();
        rCommandClient6.setCharset(charset27);
        rLoginClient0.setCharset(charset27);
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.rlogin("\r\n", "\r\n", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charset27);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        java.io.OutputStream outputStream9 = rCommandClient0.getOutputStream();
        rCommandClient0.setConnectTimeout(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(outputStream9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = rCommandClient0.getServerSocketFactory();
        rCommandClient0.disconnect();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress3, (int) (byte) 1, inetAddress5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        int int9 = rCommandClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress10 = null;
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress10, 513, inetAddress12, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.io.InputStream inputStream7 = rCommandClient0.getErrorStream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient0.getServerSocketFactory();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        rCommandClient0.setSendBufferSize((int) (byte) 10);
        javax.net.SocketFactory socketFactory8 = null;
        rCommandClient0.setSocketFactory(socketFactory8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        javax.net.SocketFactory socketFactory12 = null;
        rCommandClient0.setSocketFactory(socketFactory12);
        rCommandClient0.setReceiveBufferSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory1);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setReceiveBufferSize((-1));
        rCommandClient0.disconnect();
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        rCommandClient0.setDefaultPort((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(514);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) ' ', inetAddress10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout(512);
        java.lang.Class<?> wildcardClass12 = rCommandClient0.getClass();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setReceiveBufferSize((-1));
        rCommandClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress17 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        java.io.InputStream inputStream7 = rCommandClient0.getInputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        int int9 = rCommandClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient0.getServerSocketFactory();
        rCommandClient0.setConnectTimeout(0);
        boolean boolean13 = rCommandClient0.isConnected();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 514 + "'", int9 == 514);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        boolean boolean11 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.InputStream inputStream12 = rCommandClient0.getErrorStream();
        javax.net.ServerSocketFactory serverSocketFactory13 = rCommandClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        rLoginClient0.setSendBufferSize((int) (short) -1);
        java.net.Proxy proxy4 = rLoginClient0.getProxy();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.addProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        boolean boolean7 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (short) 0, inetAddress10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean5 = rCommandClient0.isConnected();
        java.net.Proxy proxy6 = null;
        rCommandClient0.setProxy(proxy6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setReceiveBufferSize((-1));
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        int int2 = rLoginClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect(inetAddress3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        java.io.OutputStream outputStream6 = rCommandClient0.getOutputStream();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (short) 0, inetAddress9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(outputStream6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        rCommandClient0.setDefaultTimeout((int) (short) -1);
        java.io.OutputStream outputStream14 = rCommandClient0.getOutputStream();
        boolean boolean15 = rCommandClient0.isAvailable();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(outputStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoLinger(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.io.InputStream inputStream5 = rCommandClient0.getInputStream();
        rCommandClient0.setConnectTimeout((int) (short) 0);
        int int8 = rCommandClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        boolean boolean5 = rCommandClient0.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        java.lang.String str15 = rCommandClient0.getCharsetName();
        org.apache.commons.net.bsd.RCommandClient rCommandClient16 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient16.setConnectTimeout((int) (byte) -1);
        boolean boolean19 = rCommandClient16.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient20 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient20.disconnect();
        java.nio.charset.Charset charset22 = rLoginClient20.getCharset();
        rCommandClient16.setCharset(charset22);
        rCommandClient16.disconnect();
        rCommandClient16.setDefaultPort(100);
        rCommandClient16.setDefaultTimeout((int) (short) 1);
        org.apache.commons.net.bsd.RCommandClient rCommandClient29 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory30 = rCommandClient29.getServerSocketFactory();
        rCommandClient16.setServerSocketFactory(serverSocketFactory30);
        rCommandClient0.setServerSocketFactory(serverSocketFactory30);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(serverSocketFactory30);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory3 = rLoginClient0.getServerSocketFactory();
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        boolean boolean15 = rCommandClient12.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient16 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient16.disconnect();
        java.nio.charset.Charset charset18 = rLoginClient16.getCharset();
        rCommandClient12.setCharset(charset18);
        rCommandClient0.setCharset(charset18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        rCommandClient0.setReceiveBufferSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        javax.net.SocketFactory socketFactory12 = null;
        rCommandClient0.setSocketFactory(socketFactory12);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory1);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset6 = rCommandClient0.getCharset();
        java.net.Proxy proxy7 = rCommandClient0.getProxy();
        boolean boolean8 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) 0, inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress11 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        javax.net.SocketFactory socketFactory12 = null;
        rCommandClient0.setSocketFactory(socketFactory12);
        java.net.InetAddress inetAddress16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 100, inetAddress16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory1);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 513, inetAddress8);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        rCommandClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isConnected();
        int int13 = rCommandClient0.getDefaultTimeout();
        boolean boolean14 = rCommandClient0.isConnected();
        java.net.Proxy proxy15 = rCommandClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("UTF-8", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        int int13 = rCommandClient0.getConnectTimeout();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        rLoginClient0.setConnectTimeout(10);
        int int5 = rLoginClient0.getDefaultTimeout();
        rLoginClient0.setRemoteVerificationEnabled(true);
        rLoginClient0.setReceiveBufferSize(513);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory5 = rCommandClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", 60000);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        int int9 = rCommandClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = rCommandClient0.getServerSocketFactory();
        boolean boolean11 = rCommandClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 514 + "'", int9 == 514);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setRemoteVerificationEnabled(true);
        boolean boolean5 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RCommandClient rCommandClient6 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory7 = rCommandClient6.getServerSocketFactory();
        org.apache.commons.net.bsd.RCommandClient rCommandClient8 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient8.setConnectTimeout((int) (byte) -1);
        rCommandClient8.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient13 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient13.disconnect();
        java.nio.charset.Charset charset15 = rLoginClient13.getCharset();
        rCommandClient8.setCharset(charset15);
        rCommandClient6.setCharset(charset15);
        rCommandClient0.setCharset(charset15);
        java.net.Proxy proxy19 = rCommandClient0.getProxy();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNull(proxy19);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        rCommandClient0.setDefaultPort((int) '4');
        rCommandClient0.setSendBufferSize((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        boolean boolean15 = rCommandClient12.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient16 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient16.disconnect();
        java.nio.charset.Charset charset18 = rLoginClient16.getCharset();
        rCommandClient12.setCharset(charset18);
        rCommandClient0.setCharset(charset18);
        java.io.InputStream inputStream21 = rCommandClient0.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient22 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient22.setConnectTimeout((int) (byte) -1);
        int int25 = rCommandClient22.getDefaultTimeout();
        int int26 = rCommandClient22.getConnectTimeout();
        rCommandClient22.setRemoteVerificationEnabled(true);
        org.apache.commons.net.bsd.RCommandClient rCommandClient29 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient29.setConnectTimeout((int) (byte) -1);
        boolean boolean32 = rCommandClient29.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory33 = rCommandClient29.getServerSocketFactory();
        rCommandClient22.setServerSocketFactory(serverSocketFactory33);
        javax.net.SocketFactory socketFactory35 = null;
        rCommandClient22.setSocketFactory(socketFactory35);
        rCommandClient22.setConnectTimeout((int) (byte) 10);
        javax.net.ServerSocketFactory serverSocketFactory39 = rCommandClient22.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory39);
        boolean boolean41 = rCommandClient0.isConnected();
        int int42 = rCommandClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory33);
        org.junit.Assert.assertNotNull(serverSocketFactory39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 514 + "'", int42 == 514);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        javax.net.SocketFactory socketFactory9 = null;
        rCommandClient0.setSocketFactory(socketFactory9);
        boolean boolean11 = rCommandClient0.isRemoteVerificationEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress12 = rCommandClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        boolean boolean9 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = rCommandClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int6 = rCommandClient0.getDefaultPort();
        java.lang.String str7 = rCommandClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 514 + "'", int6 == 514);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        boolean boolean1 = rCommandClient0.isConnected();
        org.apache.commons.net.bsd.RCommandClient rCommandClient2 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient2.setConnectTimeout((int) (byte) -1);
        boolean boolean5 = rCommandClient2.isRemoteVerificationEnabled();
        rCommandClient2.setRemoteVerificationEnabled(false);
        java.nio.charset.Charset charset8 = rCommandClient2.getCharset();
        boolean boolean9 = rCommandClient2.isAvailable();
        java.nio.charset.Charset charset10 = rCommandClient2.getCharset();
        rCommandClient0.setCharset(charset10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setRemoteVerificationEnabled(false);
        int int9 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setConnectTimeout((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        int int13 = rCommandClient0.getDefaultTimeout();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        java.net.Proxy proxy13 = rCommandClient0.getProxy();
        java.nio.charset.Charset charset14 = rCommandClient0.getCharset();
        java.lang.String str15 = rCommandClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        rCommandClient0.setDefaultTimeout((int) 'a');
        javax.net.ServerSocketFactory serverSocketFactory6 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (byte) 1, inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("", 512, inetAddress7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultTimeout();
        int int4 = rCommandClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setConnectTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("hi!", "", "UTF-8", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy5 = null;
        rCommandClient0.setProxy(proxy5);
        rCommandClient0.setConnectTimeout(512);
        java.io.InputStream inputStream9 = rCommandClient0.getErrorStream();
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", (int) (short) 100, inetAddress12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        org.apache.commons.net.bsd.RLoginClient rLoginClient3 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient3.disconnect();
        rLoginClient3.setSendBufferSize((int) (short) -1);
        int int7 = rLoginClient3.getConnectTimeout();
        org.apache.commons.net.bsd.RCommandClient rCommandClient8 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient8.setConnectTimeout((int) (byte) -1);
        boolean boolean11 = rCommandClient8.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient12 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient12.disconnect();
        java.nio.charset.Charset charset14 = rLoginClient12.getCharset();
        rCommandClient8.setCharset(charset14);
        rCommandClient8.disconnect();
        rCommandClient8.setDefaultPort(100);
        org.apache.commons.net.bsd.RCommandClient rCommandClient19 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory20 = rCommandClient19.getServerSocketFactory();
        rCommandClient8.setServerSocketFactory(serverSocketFactory20);
        rLoginClient3.setServerSocketFactory(serverSocketFactory20);
        rCommandClient0.setServerSocketFactory(serverSocketFactory20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getErrorStream();
        rCommandClient0.setConnectTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        boolean boolean11 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = rCommandClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        java.io.InputStream inputStream9 = rCommandClient0.getInputStream();
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", 514, inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        java.net.Proxy proxy1 = null;
        rExecClient0.setProxy(proxy1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        rExecClient0.setReceiveBufferSize((int) (byte) -1);
        rExecClient0.setSendBufferSize((int) (short) 100);
        int int5 = rExecClient0.getDefaultTimeout();
        java.net.Proxy proxy6 = rExecClient0.getProxy();
        java.nio.charset.Charset charset7 = rExecClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        boolean boolean16 = rCommandClient0.isRemoteVerificationEnabled();
        java.net.InetAddress inetAddress17 = null;
        java.net.InetAddress inetAddress19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress17, (int) (byte) 1, inetAddress19, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        boolean boolean12 = rCommandClient0.isRemoteVerificationEnabled();
        java.io.OutputStream outputStream13 = rCommandClient0.getOutputStream();
        rCommandClient0.disconnect();
        boolean boolean15 = rCommandClient0.isAvailable();
        java.nio.charset.Charset charset16 = rCommandClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("hi!", "", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        rCommandClient12.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient17 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient17.disconnect();
        java.nio.charset.Charset charset19 = rLoginClient17.getCharset();
        rCommandClient12.setCharset(charset19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory22 = rCommandClient21.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory22);
        org.apache.commons.net.bsd.RCommandClient rCommandClient24 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory25 = rCommandClient24.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory25);
        rCommandClient0.setServerSocketFactory(serverSocketFactory25);
        java.net.Proxy proxy28 = rCommandClient0.getProxy();
        java.net.Proxy proxy29 = rCommandClient0.getProxy();
        java.net.InetAddress inetAddress32 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", (int) (byte) -1, inetAddress32, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
        org.junit.Assert.assertNotNull(serverSocketFactory25);
        org.junit.Assert.assertNull(proxy28);
        org.junit.Assert.assertNull(proxy29);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        rCommandClient0.disconnect();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        javax.net.SocketFactory socketFactory11 = null;
        rCommandClient0.setSocketFactory(socketFactory11);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        java.net.Proxy proxy15 = null;
        rCommandClient0.setProxy(proxy15);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        java.lang.String str18 = rCommandClient0.getCharsetName();
        boolean boolean19 = rCommandClient0.isAvailable();
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-8" + "'", str18, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setRemoteVerificationEnabled(true);
        rCommandClient0.setReceiveBufferSize((-1));
        rCommandClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoLinger(true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        java.nio.charset.Charset charset12 = rCommandClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress13 = rCommandClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.io.InputStream inputStream17 = rCommandClient0.getInputStream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        boolean boolean4 = rCommandClient0.isConnected();
        java.io.OutputStream outputStream5 = rCommandClient0.getOutputStream();
        java.net.Proxy proxy6 = null;
        rCommandClient0.setProxy(proxy6);
        rCommandClient0.setConnectTimeout(100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        boolean boolean8 = rCommandClient0.isAvailable();
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!", 513, inetAddress11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        javax.net.ServerSocketFactory serverSocketFactory12 = rCommandClient0.getServerSocketFactory();
        rCommandClient0.setDefaultTimeout(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        boolean boolean8 = rCommandClient0.isAvailable();
        rCommandClient0.setSendBufferSize(512);
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        java.lang.String str3 = rCommandClient0.getCharsetName();
        int int4 = rCommandClient0.getDefaultTimeout();
        rCommandClient0.disconnect();
        rCommandClient0.setConnectTimeout((int) (short) 10);
        int int8 = rCommandClient0.getConnectTimeout();
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        javax.net.SocketFactory socketFactory13 = null;
        rCommandClient0.setSocketFactory(socketFactory13);
        rCommandClient0.setRemoteVerificationEnabled(false);
        java.net.Proxy proxy17 = null;
        rCommandClient0.setProxy(proxy17);
        java.net.InetAddress inetAddress19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultPort((int) '#');
        java.io.OutputStream outputStream12 = rCommandClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(outputStream12);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        java.net.InetAddress inetAddress14 = null;
        java.net.InetAddress inetAddress16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress14, (int) (short) 10, inetAddress16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid port number 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        java.io.InputStream inputStream11 = rCommandClient0.getInputStream();
        javax.net.ServerSocketFactory serverSocketFactory12 = rCommandClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        int int12 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = rCommandClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        java.net.Proxy proxy5 = rCommandClient0.getProxy();
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setConnectTimeout((int) (short) -1);
        rCommandClient0.setDefaultTimeout(60000);
        rCommandClient0.setRemoteVerificationEnabled(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        javax.net.ServerSocketFactory serverSocketFactory9 = rCommandClient0.getServerSocketFactory();
        java.net.Proxy proxy10 = null;
        rCommandClient0.setProxy(proxy10);
        rCommandClient0.setDefaultPort(10);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        rCommandClient0.setReceiveBufferSize(514);
        int int8 = rCommandClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 514 + "'", int8 == 514);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getConnectTimeout();
        boolean boolean6 = rCommandClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        rCommandClient0.setProxy(proxy7);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        javax.net.SocketFactory socketFactory18 = null;
        rCommandClient0.setSocketFactory(socketFactory18);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        int int3 = rCommandClient0.getDefaultPort();
        boolean boolean4 = rCommandClient0.isRemoteVerificationEnabled();
        javax.net.ServerSocketFactory serverSocketFactory5 = rCommandClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 514 + "'", int3 == 514);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.removeProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        org.apache.commons.net.bsd.RCommandClient rCommandClient10 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient10.setConnectTimeout((int) (byte) -1);
        int int13 = rCommandClient10.getDefaultTimeout();
        int int14 = rCommandClient10.getConnectTimeout();
        rCommandClient10.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy17 = null;
        rCommandClient10.setProxy(proxy17);
        javax.net.SocketFactory socketFactory19 = null;
        rCommandClient10.setSocketFactory(socketFactory19);
        java.io.InputStream inputStream21 = rCommandClient10.getInputStream();
        org.apache.commons.net.bsd.RCommandClient rCommandClient22 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient22.setConnectTimeout((int) (byte) -1);
        boolean boolean25 = rCommandClient22.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient26 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient26.disconnect();
        java.nio.charset.Charset charset28 = rLoginClient26.getCharset();
        rCommandClient22.setCharset(charset28);
        rCommandClient10.setCharset(charset28);
        rCommandClient0.setCharset(charset28);
        java.io.OutputStream outputStream32 = rCommandClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNull(outputStream32);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setConnectTimeout((int) 'a');
        rCommandClient0.setConnectTimeout(1);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        int int15 = rCommandClient12.getDefaultTimeout();
        int int16 = rCommandClient12.getConnectTimeout();
        rCommandClient12.setRemoteVerificationEnabled(true);
        org.apache.commons.net.bsd.RCommandClient rCommandClient19 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient19.setConnectTimeout((int) (byte) -1);
        boolean boolean22 = rCommandClient19.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory23 = rCommandClient19.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory23);
        javax.net.SocketFactory socketFactory25 = null;
        rCommandClient12.setSocketFactory(socketFactory25);
        rCommandClient12.setConnectTimeout((int) (byte) 10);
        javax.net.ServerSocketFactory serverSocketFactory29 = rCommandClient12.getServerSocketFactory();
        rCommandClient0.setServerSocketFactory(serverSocketFactory29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory23);
        org.junit.Assert.assertNotNull(serverSocketFactory29);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = rCommandClient0.getProxy();
        java.io.InputStream inputStream9 = rCommandClient0.getInputStream();
        boolean boolean10 = rCommandClient0.isAvailable();
        int int11 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = rCommandClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.net.bsd.RLoginClient rLoginClient0 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient0.disconnect();
        java.nio.charset.Charset charset2 = rLoginClient0.getCharset();
        int int3 = rLoginClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            rLoginClient0.connect("", (int) (short) 1, inetAddress6);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: All ports in use or insufficient permssion.");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.disconnect();
        rCommandClient0.setDefaultPort(100);
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("UTF-8", 0, inetAddress13);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8: Nome o servizio sconosciuto");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        org.apache.commons.net.bsd.RLoginClient rLoginClient4 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient4.disconnect();
        java.nio.charset.Charset charset6 = rLoginClient4.getCharset();
        rCommandClient0.setCharset(charset6);
        rCommandClient0.setDefaultTimeout((int) (short) 0);
        rCommandClient0.setDefaultTimeout(10);
        org.apache.commons.net.bsd.RCommandClient rCommandClient12 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient12.setConnectTimeout((int) (byte) -1);
        rCommandClient12.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient17 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient17.disconnect();
        java.nio.charset.Charset charset19 = rLoginClient17.getCharset();
        rCommandClient12.setCharset(charset19);
        org.apache.commons.net.bsd.RCommandClient rCommandClient21 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory22 = rCommandClient21.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory22);
        org.apache.commons.net.bsd.RCommandClient rCommandClient24 = new org.apache.commons.net.bsd.RCommandClient();
        javax.net.ServerSocketFactory serverSocketFactory25 = rCommandClient24.getServerSocketFactory();
        rCommandClient12.setServerSocketFactory(serverSocketFactory25);
        rCommandClient0.setServerSocketFactory(serverSocketFactory25);
        boolean boolean28 = rCommandClient0.isAvailable();
        int int29 = rCommandClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
        org.junit.Assert.assertNotNull(serverSocketFactory25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        rCommandClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.bsd.RLoginClient rLoginClient5 = new org.apache.commons.net.bsd.RLoginClient();
        rLoginClient5.disconnect();
        java.nio.charset.Charset charset7 = rLoginClient5.getCharset();
        rCommandClient0.setCharset(charset7);
        java.net.Proxy proxy9 = null;
        rCommandClient0.setProxy(proxy9);
        boolean boolean11 = rCommandClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.rexec("\r\n", "UTF-8", "\r\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isAvailable();
        java.lang.String str4 = rCommandClient0.getCharsetName();
        int int5 = rCommandClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        rCommandClient0.setSocketFactory(socketFactory6);
        rCommandClient0.setDefaultTimeout(513);
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.setSoTimeout(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 514 + "'", int5 == 514);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.net.bsd.RExecClient rExecClient0 = new org.apache.commons.net.bsd.RExecClient();
        int int1 = rExecClient0.getConnectTimeout();
        java.net.Socket socket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = rExecClient0.verifyRemote(socket2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        java.io.InputStream inputStream1 = rCommandClient0.getErrorStream();
        java.io.InputStream inputStream2 = rCommandClient0.getInputStream();
        rCommandClient0.setRemoteVerificationEnabled(true);
        java.net.Proxy proxy5 = null;
        rCommandClient0.setProxy(proxy5);
        rCommandClient0.setConnectTimeout(512);
        java.io.InputStream inputStream9 = rCommandClient0.getErrorStream();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect(inetAddress10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream1);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.net.bsd.RCommandClient rCommandClient0 = new org.apache.commons.net.bsd.RCommandClient();
        rCommandClient0.setConnectTimeout((int) (byte) -1);
        boolean boolean3 = rCommandClient0.isRemoteVerificationEnabled();
        rCommandClient0.setRemoteVerificationEnabled(false);
        rCommandClient0.setDefaultTimeout(514);
        int int8 = rCommandClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            rCommandClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!: Nome o servizio sconosciuto");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 514 + "'", int8 == 514);
    }
}

