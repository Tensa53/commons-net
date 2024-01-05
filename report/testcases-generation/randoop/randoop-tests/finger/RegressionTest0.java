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
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress3 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fingerClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, (int) (short) 1, inetAddress8, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.commons.net.SocketClient.NETASCII_EOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.lang.Class<?> wildcardClass3 = fingerClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = fingerClient0.getInputStream(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream6 = fingerClient0.getInputStream(true, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress2, (int) (short) 100, inetAddress4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fingerClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int0 = org.apache.commons.net.finger.FingerClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 79 + "'", int0 == 79);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = fingerClient0.getInputStream(true, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = fingerClient0.getInputStream(false, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (byte) 10, inetAddress5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress8, 1, inetAddress10, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        java.lang.Class<?> wildcardClass4 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 0, inetAddress10, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress8, (int) (short) 1, inetAddress10, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 79, inetAddress10, 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        java.lang.Class<?> wildcardClass6 = fingerClient0.getClass();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = fingerClient0.getInputStream(false, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fingerClient0.query(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = fingerClient0.getInputStream(true, "hi!", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isConnected();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        java.lang.Class<?> wildcardClass4 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fingerClient0.query(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress8);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress12 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = fingerClient0.getInputStream(false, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream12 = fingerClient0.getInputStream(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 79);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, (int) (short) 100, inetAddress5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 79, inetAddress13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream4 = fingerClient0.getInputStream(true, "", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 0, inetAddress6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        java.lang.Class<?> wildcardClass6 = charset5.getClass();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (short) 1, inetAddress10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        java.net.InetAddress inetAddress12 = null;
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress12, (int) (byte) 10, inetAddress14, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = fingerClient0.getInputStream(false, "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        java.net.InetAddress inetAddress11 = null;
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress11, 10, inetAddress13, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress12 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = fingerClient0.getInputStream(false, "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress11 = null;
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress11, (int) (byte) 100, inetAddress13, 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = fingerClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        int int4 = fingerClient0.getDefaultPort();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fingerClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        int int16 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        java.lang.Class<?> wildcardClass10 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress10 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.setConnectTimeout((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fingerClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        boolean boolean8 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        fingerClient0.setDefaultTimeout(1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream15 = fingerClient0.getInputStream(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = fingerClient0.query(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        java.net.Socket socket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fingerClient0.verifyRemote(socket8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: negative send size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream12 = fingerClient0.getInputStream(false, "\r\n", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream15 = fingerClient0.getInputStream(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, (int) (byte) -1, inetAddress8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        java.lang.Class<?> wildcardClass10 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 60000);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream9 = fingerClient0.getInputStream(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        boolean boolean13 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 79);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress24 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        boolean boolean8 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress9 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = fingerClient0.getInputStream(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress5, 0, inetAddress7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
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
        fingerClient0.setReceiveBufferSize((int) (short) -1);
        java.net.Socket socket14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = fingerClient0.verifyRemote(socket14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        int int4 = fingerClient0.getDefaultPort();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = fingerClient0.getInputStream(true, "hi!", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        java.lang.Class<?> wildcardClass22 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        fingerClient0.setConnectTimeout((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
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
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        boolean boolean8 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: negative send size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset3 = null;
        fingerClient2.setCharset(charset3);
        int int5 = fingerClient2.getConnectTimeout();
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient2.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = null;
        fingerClient2.setCharset(charset8);
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fingerClient0.query(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        boolean boolean14 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        fingerClient11.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        fingerClient13.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset17 = fingerClient13.getCharset();
        java.nio.charset.Charset charset18 = fingerClient13.getCharset();
        fingerClient11.setCharset(charset18);
        fingerClient0.setCharset(charset18);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 79);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream14 = fingerClient0.getInputStream(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = fingerClient0.getInputStream(false, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        fingerClient8.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset12 = fingerClient8.getCharset();
        fingerClient8.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient8.setServerSocketFactory(serverSocketFactory18);
        fingerClient0.setServerSocketFactory(serverSocketFactory18);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress8, (int) (short) 10, inetAddress10, (-1));
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(true, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress5, (int) (byte) 1, inetAddress7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress10 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = fingerClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream17 = fingerClient0.getInputStream(false, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isConnected();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        fingerClient0.setDefaultPort((int) (short) -1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        boolean boolean8 = fingerClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset3 = null;
        fingerClient2.setCharset(charset3);
        int int5 = fingerClient2.getConnectTimeout();
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient2.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = null;
        fingerClient2.setCharset(charset8);
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        java.lang.String str8 = fingerClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = fingerClient0.getInputStream(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 0, inetAddress6, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Socket socket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fingerClient0.verifyRemote(socket7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(true, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        boolean boolean12 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fingerClient0.query(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
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
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        boolean boolean8 = fingerClient0.isAvailable();
        fingerClient0.setSendBufferSize((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8", 0, inetAddress10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        int int4 = fingerClient0.getDefaultPort();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy2 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
        org.junit.Assert.assertNull(proxy2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        javax.net.SocketFactory socketFactory3 = null;
        fingerClient0.setSocketFactory(socketFactory3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        int int5 = fingerClient0.getDefaultTimeout();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fingerClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.setConnectTimeout((int) (short) -1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = proxy13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        int int13 = fingerClient10.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient10.setSocketFactory(socketFactory14);
        boolean boolean16 = fingerClient10.isAvailable();
        java.net.Proxy proxy17 = fingerClient10.getProxy();
        fingerClient10.disconnect();
        java.nio.charset.Charset charset19 = null;
        fingerClient10.setCharset(charset19);
        org.apache.commons.net.finger.FingerClient fingerClient21 = new org.apache.commons.net.finger.FingerClient();
        fingerClient21.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        fingerClient23.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset27 = fingerClient23.getCharset();
        java.nio.charset.Charset charset28 = fingerClient23.getCharset();
        fingerClient21.setCharset(charset28);
        fingerClient10.setCharset(charset28);
        fingerClient0.setCharset(charset28);
        int int32 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(proxy17);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        java.net.Socket socket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = fingerClient0.verifyRemote(socket2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setConnectTimeout(1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = fingerClient0.getInputStream(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream13 = fingerClient0.getInputStream(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        int int16 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy17 = fingerClient0.getProxy();
        java.net.InetAddress inetAddress18 = null;
        java.net.InetAddress inetAddress20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress18, (int) ' ', inetAddress20, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        fingerClient0.setDefaultPort(60000);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        fingerClient2.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset6 = fingerClient2.getCharset();
        java.nio.charset.Charset charset7 = fingerClient2.getCharset();
        fingerClient0.setCharset(charset7);
        fingerClient0.setReceiveBufferSize(1);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        java.lang.String str6 = fingerClient0.getCharsetName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream9 = fingerClient0.getInputStream(false, "", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        boolean boolean13 = fingerClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        int int7 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress10 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        java.nio.charset.Charset charset13 = fingerClient10.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory14 = fingerClient10.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        fingerClient0.setDefaultPort((int) (short) -1);
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9, 100, inetAddress11, (-1));
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        int int13 = fingerClient10.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient10.setSocketFactory(socketFactory14);
        boolean boolean16 = fingerClient10.isAvailable();
        java.net.Proxy proxy17 = fingerClient10.getProxy();
        fingerClient10.disconnect();
        java.nio.charset.Charset charset19 = null;
        fingerClient10.setCharset(charset19);
        org.apache.commons.net.finger.FingerClient fingerClient21 = new org.apache.commons.net.finger.FingerClient();
        fingerClient21.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        fingerClient23.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset27 = fingerClient23.getCharset();
        java.nio.charset.Charset charset28 = fingerClient23.getCharset();
        fingerClient21.setCharset(charset28);
        fingerClient10.setCharset(charset28);
        fingerClient0.setCharset(charset28);
        int int32 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(proxy17);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        fingerClient8.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset12 = fingerClient8.getCharset();
        fingerClient8.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient8.setServerSocketFactory(serverSocketFactory18);
        fingerClient0.setServerSocketFactory(serverSocketFactory18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset16 = null;
        fingerClient15.setCharset(charset16);
        int int18 = fingerClient15.getConnectTimeout();
        javax.net.SocketFactory socketFactory19 = null;
        fingerClient15.setSocketFactory(socketFactory19);
        boolean boolean21 = fingerClient15.isAvailable();
        java.net.Proxy proxy22 = fingerClient15.getProxy();
        fingerClient15.disconnect();
        java.nio.charset.Charset charset24 = null;
        fingerClient15.setCharset(charset24);
        org.apache.commons.net.finger.FingerClient fingerClient26 = new org.apache.commons.net.finger.FingerClient();
        fingerClient26.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient28 = new org.apache.commons.net.finger.FingerClient();
        fingerClient28.disconnect();
        fingerClient28.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset32 = fingerClient28.getCharset();
        java.nio.charset.Charset charset33 = fingerClient28.getCharset();
        fingerClient26.setCharset(charset33);
        fingerClient15.setCharset(charset33);
        fingerClient0.setCharset(charset33);
        java.net.InetAddress inetAddress37 = null;
        java.net.InetAddress inetAddress39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress37, (int) (byte) 1, inetAddress39, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset33);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        java.net.Proxy proxy22 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress23 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNull(proxy22);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        java.net.Proxy proxy22 = fingerClient0.getProxy();
        fingerClient0.setDefaultPort(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNull(proxy22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        java.net.Proxy proxy22 = fingerClient0.getProxy();
        boolean boolean23 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        int int14 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setReceiveBufferSize((int) (short) 10);
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        java.nio.charset.Charset charset13 = fingerClient10.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory14 = fingerClient10.getServerSocketFactory();
        int int15 = fingerClient10.getDefaultTimeout();
        boolean boolean16 = fingerClient10.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        fingerClient17.disconnect();
        int int19 = fingerClient17.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient20 = new org.apache.commons.net.finger.FingerClient();
        fingerClient20.disconnect();
        int int22 = fingerClient20.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory23 = fingerClient20.getServerSocketFactory();
        fingerClient17.setServerSocketFactory(serverSocketFactory23);
        fingerClient10.setServerSocketFactory(serverSocketFactory23);
        fingerClient0.setServerSocketFactory(serverSocketFactory23);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 79 + "'", int22 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory23);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        fingerClient11.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        fingerClient13.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset17 = fingerClient13.getCharset();
        java.nio.charset.Charset charset18 = fingerClient13.getCharset();
        fingerClient11.setCharset(charset18);
        fingerClient0.setCharset(charset18);
        java.lang.String str21 = fingerClient0.getCharsetName();
        boolean boolean22 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream26 = fingerClient0.getInputStream(true, "UTF-8", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, (int) 'a', inetAddress5, 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fingerClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        java.net.Proxy proxy22 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNull(proxy22);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        java.lang.String str2 = fingerClient0.getCharsetName();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset4 = null;
        fingerClient3.setCharset(charset4);
        int int6 = fingerClient3.getConnectTimeout();
        javax.net.SocketFactory socketFactory7 = null;
        fingerClient3.setSocketFactory(socketFactory7);
        java.nio.charset.Charset charset9 = null;
        fingerClient3.setCharset(charset9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient3.getServerSocketFactory();
        boolean boolean12 = fingerClient3.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset14 = null;
        fingerClient13.setCharset(charset14);
        int int16 = fingerClient13.getConnectTimeout();
        javax.net.SocketFactory socketFactory17 = null;
        fingerClient13.setSocketFactory(socketFactory17);
        boolean boolean19 = fingerClient13.isAvailable();
        java.net.Proxy proxy20 = fingerClient13.getProxy();
        fingerClient13.disconnect();
        java.nio.charset.Charset charset22 = null;
        fingerClient13.setCharset(charset22);
        org.apache.commons.net.finger.FingerClient fingerClient24 = new org.apache.commons.net.finger.FingerClient();
        fingerClient24.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient26 = new org.apache.commons.net.finger.FingerClient();
        fingerClient26.disconnect();
        fingerClient26.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset30 = fingerClient26.getCharset();
        java.nio.charset.Charset charset31 = fingerClient26.getCharset();
        fingerClient24.setCharset(charset31);
        fingerClient13.setCharset(charset31);
        fingerClient3.setCharset(charset31);
        fingerClient0.setCharset(charset31);
        int int36 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset8 = null;
        fingerClient7.setCharset(charset8);
        int int10 = fingerClient7.getConnectTimeout();
        javax.net.SocketFactory socketFactory11 = null;
        fingerClient7.setSocketFactory(socketFactory11);
        fingerClient7.setSendBufferSize((int) (short) 1);
        fingerClient7.setSendBufferSize((int) (byte) 1);
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        fingerClient17.disconnect();
        int int19 = fingerClient17.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient20 = new org.apache.commons.net.finger.FingerClient();
        fingerClient20.disconnect();
        int int22 = fingerClient20.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory23 = fingerClient20.getServerSocketFactory();
        fingerClient17.setServerSocketFactory(serverSocketFactory23);
        java.nio.charset.Charset charset25 = fingerClient17.getCharset();
        fingerClient7.setCharset(charset25);
        fingerClient0.setCharset(charset25);
        boolean boolean28 = fingerClient0.isConnected();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 79 + "'", int22 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory23);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        fingerClient11.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        fingerClient13.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset17 = fingerClient13.getCharset();
        java.nio.charset.Charset charset18 = fingerClient13.getCharset();
        fingerClient11.setCharset(charset18);
        fingerClient0.setCharset(charset18);
        java.lang.String str21 = fingerClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setConnectTimeout(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fingerClient0.query(false, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = fingerClient0.query(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        boolean boolean6 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = fingerClient0.getInputStream(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        boolean boolean12 = fingerClient0.isConnected();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setDefaultTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream20 = fingerClient0.getInputStream(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        java.net.InetAddress inetAddress16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) '4', inetAddress16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        java.lang.String str8 = fingerClient0.getCharsetName();
        fingerClient0.setDefaultPort((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress14);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        fingerClient11.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        fingerClient13.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset17 = fingerClient13.getCharset();
        java.nio.charset.Charset charset18 = fingerClient13.getCharset();
        fingerClient11.setCharset(charset18);
        fingerClient0.setCharset(charset18);
        java.lang.String str21 = fingerClient0.getCharsetName();
        javax.net.SocketFactory socketFactory22 = null;
        fingerClient0.setSocketFactory(socketFactory22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        boolean boolean13 = fingerClient0.isAvailable();
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient4 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset5 = null;
        fingerClient4.setCharset(charset5);
        java.nio.charset.Charset charset7 = fingerClient4.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient4.getServerSocketFactory();
        int int9 = fingerClient4.getDefaultTimeout();
        boolean boolean10 = fingerClient4.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        fingerClient11.disconnect();
        int int13 = fingerClient11.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient14 = new org.apache.commons.net.finger.FingerClient();
        fingerClient14.disconnect();
        int int16 = fingerClient14.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory17 = fingerClient14.getServerSocketFactory();
        fingerClient11.setServerSocketFactory(serverSocketFactory17);
        fingerClient4.setServerSocketFactory(serverSocketFactory17);
        fingerClient0.setServerSocketFactory(serverSocketFactory17);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(charset7);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 79 + "'", int13 == 79);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory17);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        int int4 = fingerClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        javax.net.ServerSocketFactory serverSocketFactory14 = fingerClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        int int7 = fingerClient0.getConnectTimeout();
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        boolean boolean12 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        fingerClient17.disconnect();
        int int19 = fingerClient17.getDefaultPort();
        java.net.Proxy proxy20 = null;
        fingerClient17.setProxy(proxy20);
        javax.net.ServerSocketFactory serverSocketFactory22 = fingerClient17.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory22);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress24 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        fingerClient0.setDefaultPort(60000);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        int int12 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = fingerClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        fingerClient0.setReceiveBufferSize((int) 'a');
        java.lang.String str9 = fingerClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        boolean boolean2 = fingerClient0.isAvailable();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 100, inetAddress5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (-1), inetAddress10, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(true, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 1, inetAddress15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        int int8 = fingerClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset13 = null;
        fingerClient12.setCharset(charset13);
        int int15 = fingerClient12.getConnectTimeout();
        javax.net.SocketFactory socketFactory16 = null;
        fingerClient12.setSocketFactory(socketFactory16);
        boolean boolean18 = fingerClient12.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient19 = new org.apache.commons.net.finger.FingerClient();
        fingerClient19.disconnect();
        int int21 = fingerClient19.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory22 = fingerClient19.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory22);
        fingerClient0.setServerSocketFactory(serverSocketFactory22);
        boolean boolean25 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = fingerClient0.query(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        org.apache.commons.net.finger.FingerClient fingerClient16 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset17 = null;
        fingerClient16.setCharset(charset17);
        java.nio.charset.Charset charset19 = fingerClient16.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient16.getServerSocketFactory();
        int int21 = fingerClient16.getDefaultTimeout();
        boolean boolean22 = fingerClient16.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        int int25 = fingerClient23.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient26 = new org.apache.commons.net.finger.FingerClient();
        fingerClient26.disconnect();
        int int28 = fingerClient26.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory29 = fingerClient26.getServerSocketFactory();
        fingerClient23.setServerSocketFactory(serverSocketFactory29);
        fingerClient16.setServerSocketFactory(serverSocketFactory29);
        fingerClient0.setServerSocketFactory(serverSocketFactory29);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertNull(charset19);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 79 + "'", int25 == 79);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 79 + "'", int28 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory29);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setConnectTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset3 = null;
        fingerClient2.setCharset(charset3);
        int int5 = fingerClient2.getConnectTimeout();
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient2.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = null;
        fingerClient2.setCharset(charset8);
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setConnectTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setDefaultTimeout((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        boolean boolean8 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        java.net.Proxy proxy22 = fingerClient0.getProxy();
        fingerClient0.setDefaultPort(100);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNull(proxy22);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = fingerClient0.getInputStream(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        java.lang.String str2 = fingerClient0.getCharsetName();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (byte) -1, inetAddress5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        java.lang.String str8 = fingerClient0.getCharsetName();
        fingerClient0.setDefaultPort((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        int int16 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy17 = fingerClient0.getProxy();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        fingerClient0.setDefaultPort((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 79 + "'", int13 == 79);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress11 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient0.setSocketFactory(socketFactory14);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
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
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", 79);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        fingerClient0.setDefaultTimeout((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress11 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        java.net.Proxy proxy14 = fingerClient0.getProxy();
        fingerClient0.setDefaultTimeout((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (byte) 10);
        fingerClient0.setConnectTimeout((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        int int2 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3, (int) (byte) -1, inetAddress5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        java.net.Proxy proxy10 = fingerClient0.getProxy();
        int int11 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(charset13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        int int16 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy17 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultPort();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (int) (byte) 100, inetAddress9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        java.net.Proxy proxy13 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream17 = fingerClient0.getInputStream(false, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream21 = fingerClient0.getInputStream(true, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        boolean boolean6 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress5, (int) (byte) 0, inetAddress7, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory7 = fingerClient0.getServerSocketFactory();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        fingerClient8.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset12 = fingerClient8.getCharset();
        fingerClient8.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient8.setServerSocketFactory(serverSocketFactory18);
        fingerClient0.setServerSocketFactory(serverSocketFactory18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = fingerClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress12 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress16 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        fingerClient0.setDefaultPort((int) (short) -1);
        java.net.Socket socket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fingerClient0.verifyRemote(socket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        int int12 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        fingerClient0.setDefaultTimeout((-1));
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        int int14 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress15 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        boolean boolean7 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = fingerClient0.getInputStream(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
        org.junit.Assert.assertNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
        java.net.Socket socket11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = fingerClient0.verifyRemote(socket11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isConnected();
        java.net.Proxy proxy7 = null;
        fingerClient0.setProxy(proxy7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        java.net.Proxy proxy18 = null;
        fingerClient15.setProxy(proxy18);
        javax.net.ServerSocketFactory serverSocketFactory20 = fingerClient15.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory20);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        java.net.InetAddress inetAddress24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress24);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        java.nio.charset.Charset charset13 = fingerClient10.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory14 = fingerClient10.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress19 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setDefaultTimeout(100);
        java.net.InetAddress inetAddress15 = null;
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress15, (int) 'a', inetAddress17, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        boolean boolean5 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        int int3 = fingerClient0.getDefaultPort();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 79 + "'", int3 == 79);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset13 = null;
        fingerClient12.setCharset(charset13);
        int int15 = fingerClient12.getConnectTimeout();
        javax.net.SocketFactory socketFactory16 = null;
        fingerClient12.setSocketFactory(socketFactory16);
        boolean boolean18 = fingerClient12.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient19 = new org.apache.commons.net.finger.FingerClient();
        fingerClient19.disconnect();
        int int21 = fingerClient19.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory22 = fingerClient19.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory22);
        fingerClient0.setServerSocketFactory(serverSocketFactory22);
        boolean boolean25 = fingerClient0.isConnected();
        java.net.Socket socket26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = fingerClient0.verifyRemote(socket26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        fingerClient0.setReceiveBufferSize(0);
        int int17 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy18 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream21 = fingerClient0.getInputStream(false, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream13 = fingerClient0.getInputStream(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        int int8 = fingerClient0.getDefaultPort();
        fingerClient0.setSendBufferSize((int) '4');
        java.net.Socket socket11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = fingerClient0.verifyRemote(socket11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory18);
        fingerClient0.setServerSocketFactory(serverSocketFactory18);
        java.net.InetAddress inetAddress21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress21);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream14 = fingerClient0.getInputStream(false, "\r\n", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory18);
        fingerClient0.setServerSocketFactory(serverSocketFactory18);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        int int16 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy17 = null;
        fingerClient0.setProxy(proxy17);
        java.net.InetAddress inetAddress19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress19);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient0.setSocketFactory(socketFactory14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setReceiveBufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        boolean boolean12 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(true, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setConnectTimeout((int) '4');
        fingerClient0.setReceiveBufferSize((int) 'a');
        org.apache.commons.net.finger.FingerClient fingerClient9 = new org.apache.commons.net.finger.FingerClient();
        fingerClient9.disconnect();
        int int11 = fingerClient9.getDefaultPort();
        java.net.Proxy proxy12 = null;
        fingerClient9.setProxy(proxy12);
        boolean boolean14 = fingerClient9.isAvailable();
        int int15 = fingerClient9.getDefaultTimeout();
        java.nio.charset.Charset charset16 = fingerClient9.getCharset();
        fingerClient0.setCharset(charset16);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        int int16 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy17 = fingerClient0.getProxy();
        fingerClient0.setSendBufferSize((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        int int8 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        fingerClient0.setSendBufferSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        java.lang.String str8 = fingerClient0.getCharsetName();
        java.lang.String str9 = fingerClient0.getCharsetName();
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertNotNull(charset10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        fingerClient0.setDefaultTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = fingerClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        fingerClient2.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset6 = fingerClient2.getCharset();
        java.nio.charset.Charset charset7 = fingerClient2.getCharset();
        fingerClient0.setCharset(charset7);
        fingerClient0.setConnectTimeout((-1));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        java.lang.Class<?> wildcardClass16 = serverSocketFactory13.getClass();
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        fingerClient0.setReceiveBufferSize(0);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid receive size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        fingerClient0.setReceiveBufferSize(0);
        int int17 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy18 = fingerClient0.getProxy();
        java.lang.Class<?> wildcardClass19 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNull(proxy18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.setDefaultTimeout((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        fingerClient8.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset12 = fingerClient8.getCharset();
        fingerClient8.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient8.setServerSocketFactory(serverSocketFactory18);
        fingerClient0.setServerSocketFactory(serverSocketFactory18);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        org.apache.commons.net.finger.FingerClient fingerClient9 = new org.apache.commons.net.finger.FingerClient();
        fingerClient9.disconnect();
        int int11 = fingerClient9.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory12 = fingerClient9.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory12);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        fingerClient0.setSendBufferSize((int) '4');
        fingerClient0.disconnect();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        java.net.InetAddress inetAddress12 = null;
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress12, (int) (byte) 0, inetAddress14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        int int14 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        boolean boolean6 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        java.lang.String str8 = fingerClient0.getCharsetName();
        boolean boolean9 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress8, 1, inetAddress10, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        java.lang.String str8 = fingerClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        int int7 = fingerClient0.getConnectTimeout();
        java.net.Proxy proxy8 = fingerClient0.getProxy();
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8", (int) '#', inetAddress11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        int int7 = fingerClient0.getConnectTimeout();
        fingerClient0.setSendBufferSize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        fingerClient17.disconnect();
        int int19 = fingerClient17.getDefaultPort();
        java.net.Proxy proxy20 = null;
        fingerClient17.setProxy(proxy20);
        javax.net.ServerSocketFactory serverSocketFactory22 = fingerClient17.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory22);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.setConnectTimeout((int) (short) -1);
        fingerClient0.setReceiveBufferSize((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream18 = fingerClient0.getInputStream(true, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean5 = fingerClient0.isConnected();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        fingerClient0.setDefaultPort((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        java.lang.String str8 = fingerClient0.getCharsetName();
        java.lang.String str9 = fingerClient0.getCharsetName();
        int int10 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        javax.net.SocketFactory socketFactory11 = null;
        fingerClient0.setSocketFactory(socketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress13 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        boolean boolean8 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        boolean boolean7 = fingerClient0.isConnected();
        boolean boolean8 = fingerClient0.isAvailable();
        java.net.InetAddress inetAddress9 = null;
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9, (int) (short) -1, inetAddress11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
        org.junit.Assert.assertNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        java.nio.charset.Charset charset13 = fingerClient10.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory14 = fingerClient10.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory14);
        boolean boolean16 = fingerClient0.isAvailable();
        fingerClient0.setSendBufferSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        java.lang.String str8 = fingerClient0.getCharsetName();
        fingerClient0.setDefaultPort((int) (short) -1);
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8", 1, inetAddress13, 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        java.lang.String str2 = fingerClient0.getCharsetName();
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        boolean boolean4 = fingerClient0.isConnected();
        java.net.Proxy proxy5 = fingerClient0.getProxy();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        int int7 = fingerClient0.getConnectTimeout();
        boolean boolean8 = fingerClient0.isConnected();
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(charset8);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        fingerClient0.setDefaultTimeout((int) (byte) 1);
        fingerClient0.setReceiveBufferSize((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 79 + "'", int13 == 79);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        int int6 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fingerClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultPort();
        int int7 = fingerClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        javax.net.SocketFactory socketFactory11 = null;
        fingerClient0.setSocketFactory(socketFactory11);
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        int int15 = fingerClient13.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory16 = fingerClient13.getServerSocketFactory();
        java.net.Proxy proxy17 = null;
        fingerClient13.setProxy(proxy17);
        java.nio.charset.Charset charset19 = fingerClient13.getCharset();
        fingerClient0.setCharset(charset19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory16);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        int int13 = fingerClient10.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient10.setSocketFactory(socketFactory14);
        boolean boolean16 = fingerClient10.isAvailable();
        java.net.Proxy proxy17 = fingerClient10.getProxy();
        fingerClient10.disconnect();
        java.nio.charset.Charset charset19 = null;
        fingerClient10.setCharset(charset19);
        org.apache.commons.net.finger.FingerClient fingerClient21 = new org.apache.commons.net.finger.FingerClient();
        fingerClient21.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        fingerClient23.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset27 = fingerClient23.getCharset();
        java.nio.charset.Charset charset28 = fingerClient23.getCharset();
        fingerClient21.setCharset(charset28);
        fingerClient10.setCharset(charset28);
        fingerClient0.setCharset(charset28);
        int int32 = fingerClient0.getConnectTimeout();
        fingerClient0.disconnect();
        int int34 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream36 = fingerClient0.getInputStream(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(proxy17);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (short) 0);
        javax.net.SocketFactory socketFactory11 = null;
        fingerClient0.setSocketFactory(socketFactory11);
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: negative send size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        boolean boolean9 = fingerClient0.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        int int13 = fingerClient10.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient10.setSocketFactory(socketFactory14);
        boolean boolean16 = fingerClient10.isAvailable();
        java.net.Proxy proxy17 = fingerClient10.getProxy();
        fingerClient10.disconnect();
        java.nio.charset.Charset charset19 = null;
        fingerClient10.setCharset(charset19);
        org.apache.commons.net.finger.FingerClient fingerClient21 = new org.apache.commons.net.finger.FingerClient();
        fingerClient21.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        fingerClient23.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset27 = fingerClient23.getCharset();
        java.nio.charset.Charset charset28 = fingerClient23.getCharset();
        fingerClient21.setCharset(charset28);
        fingerClient10.setCharset(charset28);
        fingerClient0.setCharset(charset28);
        int int32 = fingerClient0.getConnectTimeout();
        fingerClient0.disconnect();
        int int34 = fingerClient0.getDefaultTimeout();
        fingerClient0.setDefaultTimeout(79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(proxy17);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60000 + "'", int32 == 60000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        java.lang.String str8 = fingerClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        fingerClient6.disconnect();
        int int8 = fingerClient6.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory9 = fingerClient6.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient6.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        fingerClient0.setReceiveBufferSize((int) (short) 1);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        fingerClient0.setDefaultPort((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.setConnectTimeout((int) (short) -1);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        java.lang.String str8 = fingerClient0.getCharsetName();
        java.lang.String str9 = fingerClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress10 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress8);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        fingerClient0.disconnect();
        int int4 = fingerClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient10.getServerSocketFactory();
        fingerClient7.setServerSocketFactory(serverSocketFactory13);
        fingerClient0.setServerSocketFactory(serverSocketFactory13);
        boolean boolean16 = fingerClient0.isConnected();
        java.nio.charset.Charset charset17 = fingerClient0.getCharset();
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(charset17);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultPort();
        int int7 = fingerClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 79 + "'", int6 == 79);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
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
        fingerClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream9 = fingerClient0.getInputStream(true, "hi!", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(charset5);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
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
        int int13 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        fingerClient0.setDefaultTimeout(0);
        fingerClient0.setConnectTimeout(100);
        boolean boolean18 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        boolean boolean2 = fingerClient0.isConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getDefaultTimeout();
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        java.net.Proxy proxy14 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        fingerClient0.setReceiveBufferSize((int) (short) 1);
        java.net.Proxy proxy16 = null;
        fingerClient0.setProxy(proxy16);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress18 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        fingerClient0.setSendBufferSize(1);
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        java.nio.charset.Charset charset13 = fingerClient10.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory14 = fingerClient10.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory14);
        org.apache.commons.net.finger.FingerClient fingerClient16 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset17 = null;
        fingerClient16.setCharset(charset17);
        int int19 = fingerClient16.getConnectTimeout();
        javax.net.SocketFactory socketFactory20 = null;
        fingerClient16.setSocketFactory(socketFactory20);
        java.nio.charset.Charset charset22 = null;
        fingerClient16.setCharset(charset22);
        javax.net.ServerSocketFactory serverSocketFactory24 = fingerClient16.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory24);
        java.net.InetAddress inetAddress28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) 'a', inetAddress28, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory24);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        java.net.Proxy proxy12 = fingerClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.nio.charset.Charset charset9 = null;
        fingerClient0.setCharset(charset9);
        javax.net.SocketFactory socketFactory11 = null;
        fingerClient0.setSocketFactory(socketFactory11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset13 = null;
        fingerClient12.setCharset(charset13);
        int int15 = fingerClient12.getConnectTimeout();
        javax.net.SocketFactory socketFactory16 = null;
        fingerClient12.setSocketFactory(socketFactory16);
        boolean boolean18 = fingerClient12.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient19 = new org.apache.commons.net.finger.FingerClient();
        fingerClient19.disconnect();
        int int21 = fingerClient19.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory22 = fingerClient19.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory22);
        fingerClient0.setServerSocketFactory(serverSocketFactory22);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        java.lang.String str6 = fingerClient0.getCharsetName();
        int int7 = fingerClient0.getConnectTimeout();
        int int8 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.disconnect();
        java.net.Proxy proxy5 = null;
        fingerClient0.setProxy(proxy5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        org.apache.commons.net.finger.FingerClient fingerClient9 = new org.apache.commons.net.finger.FingerClient();
        fingerClient9.disconnect();
        int int11 = fingerClient9.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory12 = fingerClient9.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory12);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.setSendBufferSize((int) (short) 1);
        boolean boolean6 = fingerClient0.isConnected();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        int int2 = fingerClient0.getDefaultPort();
        boolean boolean3 = fingerClient0.isConnected();
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setReceiveBufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fingerClient0.query(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize(1);
        int int8 = fingerClient0.getConnectTimeout();
        int int9 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        fingerClient0.setDefaultTimeout((int) (byte) 1);
        int int12 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress13 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        boolean boolean4 = fingerClient0.isConnected();
        java.net.Proxy proxy5 = fingerClient0.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset7 = null;
        fingerClient6.setCharset(charset7);
        int int9 = fingerClient6.getConnectTimeout();
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient6.setSocketFactory(socketFactory10);
        boolean boolean12 = fingerClient6.isAvailable();
        java.net.Proxy proxy13 = fingerClient6.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient14 = new org.apache.commons.net.finger.FingerClient();
        fingerClient14.disconnect();
        int int16 = fingerClient14.getDefaultPort();
        java.net.Proxy proxy17 = null;
        fingerClient14.setProxy(proxy17);
        javax.net.ServerSocketFactory serverSocketFactory19 = fingerClient14.getServerSocketFactory();
        fingerClient14.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient22 = new org.apache.commons.net.finger.FingerClient();
        fingerClient22.disconnect();
        fingerClient22.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset26 = fingerClient22.getCharset();
        fingerClient22.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient29 = new org.apache.commons.net.finger.FingerClient();
        fingerClient29.disconnect();
        int int31 = fingerClient29.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory32 = fingerClient29.getServerSocketFactory();
        fingerClient22.setServerSocketFactory(serverSocketFactory32);
        fingerClient14.setServerSocketFactory(serverSocketFactory32);
        java.nio.charset.Charset charset35 = fingerClient14.getCharset();
        fingerClient6.setCharset(charset35);
        fingerClient0.setCharset(charset35);
        boolean boolean38 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory19);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 79 + "'", int31 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        int int7 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = fingerClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        fingerClient0.setSendBufferSize((int) (byte) 10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.setConnectTimeout((int) (short) -1);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream18 = fingerClient0.getInputStream(true, "", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset8 = null;
        fingerClient7.setCharset(charset8);
        int int10 = fingerClient7.getConnectTimeout();
        javax.net.SocketFactory socketFactory11 = null;
        fingerClient7.setSocketFactory(socketFactory11);
        fingerClient7.setSendBufferSize((int) (short) 1);
        fingerClient7.setSendBufferSize((int) (byte) 1);
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        fingerClient17.disconnect();
        int int19 = fingerClient17.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient20 = new org.apache.commons.net.finger.FingerClient();
        fingerClient20.disconnect();
        int int22 = fingerClient20.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory23 = fingerClient20.getServerSocketFactory();
        fingerClient17.setServerSocketFactory(serverSocketFactory23);
        java.nio.charset.Charset charset25 = fingerClient17.getCharset();
        fingerClient7.setCharset(charset25);
        fingerClient0.setCharset(charset25);
        fingerClient0.setDefaultTimeout((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 79 + "'", int22 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory23);
        org.junit.Assert.assertNotNull(charset25);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        int int5 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setReceiveBufferSize(10);
        fingerClient0.setSendBufferSize((int) (byte) -1);
        int int14 = fingerClient0.getConnectTimeout();
        int int15 = fingerClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        java.nio.charset.Charset charset10 = null;
        fingerClient0.setCharset(charset10);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        java.net.Proxy proxy15 = null;
        fingerClient12.setProxy(proxy15);
        boolean boolean17 = fingerClient12.isAvailable();
        int int18 = fingerClient12.getDefaultTimeout();
        java.nio.charset.Charset charset19 = fingerClient12.getCharset();
        fingerClient0.setCharset(charset19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        java.nio.charset.Charset charset2 = fingerClient0.getCharset();
        java.lang.Class<?> wildcardClass3 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        javax.net.ServerSocketFactory serverSocketFactory8 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset12 = null;
        fingerClient11.setCharset(charset12);
        int int14 = fingerClient11.getConnectTimeout();
        javax.net.SocketFactory socketFactory15 = null;
        fingerClient11.setSocketFactory(socketFactory15);
        fingerClient11.setSendBufferSize((int) (short) 1);
        fingerClient11.setSendBufferSize((-1));
        fingerClient11.setReceiveBufferSize(10);
        fingerClient11.setSendBufferSize((int) (byte) -1);
        fingerClient11.setReceiveBufferSize((int) (short) 1);
        org.apache.commons.net.finger.FingerClient fingerClient27 = new org.apache.commons.net.finger.FingerClient();
        fingerClient27.disconnect();
        fingerClient27.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset31 = fingerClient27.getCharset();
        boolean boolean32 = fingerClient27.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient33 = new org.apache.commons.net.finger.FingerClient();
        fingerClient33.disconnect();
        fingerClient33.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset37 = fingerClient33.getCharset();
        fingerClient27.setCharset(charset37);
        fingerClient11.setCharset(charset37);
        fingerClient0.setCharset(charset37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charset37);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        int int8 = fingerClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        java.net.Proxy proxy12 = null;
        fingerClient0.setProxy(proxy12);
        boolean boolean14 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress15 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        int int10 = fingerClient8.getDefaultPort();
        java.net.Proxy proxy11 = null;
        fingerClient8.setProxy(proxy11);
        javax.net.ServerSocketFactory serverSocketFactory13 = fingerClient8.getServerSocketFactory();
        fingerClient8.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient16 = new org.apache.commons.net.finger.FingerClient();
        fingerClient16.disconnect();
        fingerClient16.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset20 = fingerClient16.getCharset();
        fingerClient16.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        int int25 = fingerClient23.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory26 = fingerClient23.getServerSocketFactory();
        fingerClient16.setServerSocketFactory(serverSocketFactory26);
        fingerClient8.setServerSocketFactory(serverSocketFactory26);
        java.nio.charset.Charset charset29 = fingerClient8.getCharset();
        fingerClient0.setCharset(charset29);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 79 + "'", int25 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory26);
        org.junit.Assert.assertNotNull(charset29);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        int int7 = fingerClient0.getConnectTimeout();
        fingerClient0.setSendBufferSize((int) '#');
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient0.getServerSocketFactory();
        java.lang.String str11 = fingerClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoLinger(false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        int int8 = fingerClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress9 = fingerClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        fingerClient0.setConnectTimeout((int) (short) 10);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset3 = null;
        fingerClient2.setCharset(charset3);
        int int5 = fingerClient2.getConnectTimeout();
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient2.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = null;
        fingerClient2.setCharset(charset8);
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        boolean boolean4 = fingerClient0.isConnected();
        java.net.Proxy proxy5 = fingerClient0.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset7 = null;
        fingerClient6.setCharset(charset7);
        int int9 = fingerClient6.getConnectTimeout();
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient6.setSocketFactory(socketFactory10);
        boolean boolean12 = fingerClient6.isAvailable();
        java.net.Proxy proxy13 = fingerClient6.getProxy();
        org.apache.commons.net.finger.FingerClient fingerClient14 = new org.apache.commons.net.finger.FingerClient();
        fingerClient14.disconnect();
        int int16 = fingerClient14.getDefaultPort();
        java.net.Proxy proxy17 = null;
        fingerClient14.setProxy(proxy17);
        javax.net.ServerSocketFactory serverSocketFactory19 = fingerClient14.getServerSocketFactory();
        fingerClient14.setSendBufferSize((int) ' ');
        org.apache.commons.net.finger.FingerClient fingerClient22 = new org.apache.commons.net.finger.FingerClient();
        fingerClient22.disconnect();
        fingerClient22.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset26 = fingerClient22.getCharset();
        fingerClient22.setConnectTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient29 = new org.apache.commons.net.finger.FingerClient();
        fingerClient29.disconnect();
        int int31 = fingerClient29.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory32 = fingerClient29.getServerSocketFactory();
        fingerClient22.setServerSocketFactory(serverSocketFactory32);
        fingerClient14.setServerSocketFactory(serverSocketFactory32);
        java.nio.charset.Charset charset35 = fingerClient14.getCharset();
        fingerClient6.setCharset(charset35);
        fingerClient0.setCharset(charset35);
        boolean boolean38 = fingerClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream41 = fingerClient0.getInputStream(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory19);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 79 + "'", int31 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        fingerClient0.setDefaultPort(60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.nio.charset.Charset charset4 = fingerClient0.getCharset();
        fingerClient0.setSendBufferSize(79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        boolean boolean2 = fingerClient0.isAvailable();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        java.lang.Class<?> wildcardClass5 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        int int8 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset9 = fingerClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        fingerClient0.setDefaultTimeout(100);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset13 = null;
        fingerClient12.setCharset(charset13);
        int int15 = fingerClient12.getConnectTimeout();
        javax.net.SocketFactory socketFactory16 = null;
        fingerClient12.setSocketFactory(socketFactory16);
        boolean boolean18 = fingerClient12.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient19 = new org.apache.commons.net.finger.FingerClient();
        fingerClient19.disconnect();
        int int21 = fingerClient19.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory22 = fingerClient19.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory22);
        fingerClient0.setServerSocketFactory(serverSocketFactory22);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream27 = fingerClient0.getInputStream(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory22);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory10 = fingerClient7.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory10);
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        org.apache.commons.net.finger.FingerClient fingerClient6 = new org.apache.commons.net.finger.FingerClient();
        int int7 = fingerClient6.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient8 = new org.apache.commons.net.finger.FingerClient();
        fingerClient8.disconnect();
        int int10 = fingerClient8.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory11 = fingerClient8.getServerSocketFactory();
        fingerClient6.setServerSocketFactory(serverSocketFactory11);
        java.nio.charset.Charset charset13 = fingerClient6.getCharset();
        fingerClient0.setCharset(charset13);
        fingerClient0.setConnectTimeout((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(charset13);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        int int4 = fingerClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory5 = null;
        fingerClient0.setSocketFactory(socketFactory5);
        boolean boolean7 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress7);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        int int8 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy9 = null;
        fingerClient0.setProxy(proxy9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        fingerClient0.disconnect();
        int int9 = fingerClient0.getDefaultTimeout();
        java.lang.String str10 = fingerClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
    }
}

