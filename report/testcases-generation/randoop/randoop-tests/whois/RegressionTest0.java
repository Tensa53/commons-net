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
        int int0 = org.apache.commons.net.whois.WhoisClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("hi!", (int) (short) 10, inetAddress4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("", (int) (short) 1, inetAddress3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress2);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        java.lang.Class<?> wildcardClass5 = whoisClient0.getClass();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        java.net.Socket socket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = whoisClient0.verifyRemote(socket7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.commons.net.whois.WhoisClient.DEFAULT_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "whois.internic.net" + "'", str0, "whois.internic.net");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress4, (int) (byte) 100, inetAddress6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress7, 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultPort();
        java.net.Socket socket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = whoisClient0.verifyRemote(socket4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.apache.commons.net.SocketClient.NETASCII_EOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultPort();
        java.net.Proxy proxy4 = null;
        whoisClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("\r\n", (-1), inetAddress3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        java.net.Socket socket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = whoisClient0.verifyRemote(socket2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = whoisClient0.getInputStream(true, "whois.internic.net", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress2);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultPort();
        java.net.Proxy proxy4 = null;
        whoisClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = whoisClient0.query(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultPort();
        java.net.Proxy proxy4 = null;
        whoisClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = whoisClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        whoisClient0.setSendBufferSize((int) (short) -1);
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        javax.net.SocketFactory socketFactory5 = null;
        whoisClient0.setSocketFactory(socketFactory5);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        whoisClient0.setSendBufferSize(0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress3);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress3, (int) (byte) -1, inetAddress5, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.Class<?> wildcardClass3 = whoisClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        javax.net.ServerSocketFactory serverSocketFactory4 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = whoisClient0.getInputStream(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.setSendBufferSize((int) 'a');
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.setDefaultTimeout(60000);
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress6, (int) 'a', inetAddress8, 43);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        javax.net.SocketFactory socketFactory5 = null;
        whoisClient0.setSocketFactory(socketFactory5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = whoisClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid receive size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = whoisClient0.getInputStream(false, "hi!", "whois.internic.net");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: whois.internic.net");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid receive size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        javax.net.SocketFactory socketFactory5 = null;
        whoisClient0.setSocketFactory(socketFactory5);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        javax.net.SocketFactory socketFactory5 = null;
        whoisClient0.setSocketFactory(socketFactory5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = whoisClient0.query("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("UTF-8", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream12 = whoisClient0.getInputStream(false, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        java.lang.String str4 = whoisClient0.getCharsetName();
        boolean boolean5 = whoisClient0.isAvailable();
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress6, (int) ' ', inetAddress8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        java.lang.String str4 = whoisClient0.getCharsetName();
        boolean boolean5 = whoisClient0.isAvailable();
        int int6 = whoisClient0.getConnectTimeout();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = whoisClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.setSoTimeout(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        java.net.Proxy proxy3 = whoisClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream7 = whoisClient0.getInputStream(false, "", "whois.internic.net");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: whois.internic.net");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = whoisClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = whoisClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.net.Proxy proxy3 = whoisClient0.getProxy();
        whoisClient0.setDefaultTimeout(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        boolean boolean3 = whoisClient0.isAvailable();
        whoisClient0.setReceiveBufferSize(100);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        whoisClient0.setSendBufferSize((int) (short) -1);
        java.net.Socket socket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = whoisClient0.verifyRemote(socket4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        javax.net.ServerSocketFactory serverSocketFactory4 = whoisClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress5, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = whoisClient0.query(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        whoisClient0.setReceiveBufferSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        whoisClient0.disconnect();
        java.lang.String str4 = whoisClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        java.net.Proxy proxy7 = whoisClient0.getProxy();
        java.lang.String str8 = whoisClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.lang.String str4 = whoisClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        boolean boolean2 = whoisClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream6 = whoisClient0.getInputStream(false, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultPort();
        java.net.Proxy proxy4 = null;
        whoisClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = whoisClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.disconnect();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("hi!", 43, inetAddress7, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout(0);
        java.net.Socket socket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = whoisClient0.verifyRemote(socket7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = whoisClient0.query(true, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        whoisClient0.setReceiveBufferSize((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        javax.net.ServerSocketFactory serverSocketFactory4 = whoisClient0.getServerSocketFactory();
        java.lang.Class<?> wildcardClass5 = serverSocketFactory4.getClass();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.lang.String str4 = whoisClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory5 = whoisClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        java.nio.charset.Charset charset5 = whoisClient0.getCharset();
        int int6 = whoisClient0.getConnectTimeout();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("hi!", (int) (short) -1, inetAddress9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream10 = whoisClient0.getInputStream(false, "whois.internic.net");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.setDefaultTimeout(60000);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        int int5 = whoisClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        java.nio.charset.Charset charset5 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient6 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset7 = whoisClient6.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient8 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset9 = whoisClient8.getCharset();
        whoisClient6.setCharset(charset9);
        whoisClient0.setCharset(charset9);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("whois.internic.net", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        int int4 = whoisClient0.getConnectTimeout();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultTimeout();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        java.nio.charset.Charset charset8 = whoisClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("whois.internic.net", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        whoisClient0.setDefaultPort((int) 'a');
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.disconnect();
        javax.net.ServerSocketFactory serverSocketFactory5 = whoisClient0.getServerSocketFactory();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        whoisClient0.setReceiveBufferSize((int) (byte) -1);
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress5, (int) (short) 1, inetAddress7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        whoisClient0.setReceiveBufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = whoisClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        int int4 = whoisClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        whoisClient0.setSendBufferSize((int) (byte) 100);
        java.net.Proxy proxy5 = whoisClient0.getProxy();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = whoisClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        java.nio.charset.Charset charset5 = whoisClient0.getCharset();
        java.net.Proxy proxy6 = null;
        whoisClient0.setProxy(proxy6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = whoisClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.addProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        whoisClient0.setReceiveBufferSize((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = whoisClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        whoisClient0.setReceiveBufferSize((int) (byte) -1);
        whoisClient0.setReceiveBufferSize(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        whoisClient0.setSendBufferSize((int) (byte) 100);
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect(inetAddress5, (int) '4', inetAddress7, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) '#');
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        java.nio.charset.Charset charset5 = whoisClient0.getCharset();
        int int6 = whoisClient0.getConnectTimeout();
        whoisClient0.setConnectTimeout((int) ' ');
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        java.nio.charset.Charset charset5 = whoisClient0.getCharset();
        int int6 = whoisClient0.getConnectTimeout();
        whoisClient0.setDefaultPort((int) ' ');
        java.lang.String str9 = whoisClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        whoisClient0.setSendBufferSize((int) (byte) 100);
        java.net.Proxy proxy5 = whoisClient0.getProxy();
        whoisClient0.setSendBufferSize((int) 'a');
        int int8 = whoisClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 43 + "'", int8 == 43);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        whoisClient0.setReceiveBufferSize(1);
        boolean boolean8 = whoisClient0.isConnected();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        whoisClient0.setDefaultTimeout(1);
        javax.net.SocketFactory socketFactory8 = null;
        whoisClient0.setSocketFactory(socketFactory8);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 43 + "'", int5 == 43);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.setDefaultTimeout(60000);
        boolean boolean6 = whoisClient0.isConnected();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.disconnect();
        whoisClient0.setConnectTimeout(0);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        java.nio.charset.Charset charset5 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient6 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset7 = whoisClient6.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient8 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset9 = whoisClient8.getCharset();
        whoisClient6.setCharset(charset9);
        whoisClient0.setCharset(charset9);
        whoisClient0.setDefaultPort((int) '4');
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        whoisClient0.setSendBufferSize((int) (byte) 100);
        java.net.Proxy proxy5 = whoisClient0.getProxy();
        javax.net.SocketFactory socketFactory6 = null;
        whoisClient0.setSocketFactory(socketFactory6);
        java.lang.String str8 = whoisClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        whoisClient0.setReceiveBufferSize(1);
        whoisClient0.setConnectTimeout(1);
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        javax.net.ServerSocketFactory serverSocketFactory1 = null;
        whoisClient0.setServerSocketFactory(serverSocketFactory1);
        whoisClient0.setSendBufferSize((int) (byte) 0);
        whoisClient0.setReceiveBufferSize((int) ' ');
        java.net.Proxy proxy7 = whoisClient0.getProxy();
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.whois.WhoisClient whoisClient9 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset10 = whoisClient9.getCharset();
        whoisClient9.setDefaultPort((int) (short) 1);
        org.apache.commons.net.whois.WhoisClient whoisClient13 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset14 = whoisClient13.getCharset();
        whoisClient13.setConnectTimeout((int) (byte) 100);
        javax.net.ServerSocketFactory serverSocketFactory17 = whoisClient13.getServerSocketFactory();
        whoisClient9.setServerSocketFactory(serverSocketFactory17);
        whoisClient0.setServerSocketFactory(serverSocketFactory17);
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(serverSocketFactory17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.removeProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        javax.net.ServerSocketFactory serverSocketFactory4 = whoisClient0.getServerSocketFactory();
        java.lang.String str5 = whoisClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        boolean boolean3 = whoisClient0.isAvailable();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            whoisClient0.connect("whois.internic.net", 0, inetAddress6, 1);
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: connect timed out");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

