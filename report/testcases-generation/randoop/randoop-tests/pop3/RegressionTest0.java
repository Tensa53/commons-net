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
        int int0 = org.apache.commons.net.pop3.POP3Reply.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = org.apache.commons.net.pop3.POP3Command.STAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = org.apache.commons.net.SocketClient.NETASCII_EOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\r\n" + "'", str0, "\r\n");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect(inetAddress1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = org.apache.commons.net.pop3.POP3Command.getCommand(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "USER" + "'", str1, "USER");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pOP3SClient3.sendCommand("\r\n", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = org.apache.commons.net.pop3.POP3.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 110 + "'", int0 == 110);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = org.apache.commons.net.pop3.POP3Command.RSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ssl.KeyManager keyManager3 = null;
        pOP3SClient0.setKeyManager(keyManager3);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.getAdditionalReply();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = org.apache.commons.net.pop3.POP3Command.TOP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = org.apache.commons.net.pop3.POP3.TRANSACTION_STATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect("USER", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: USER");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        int int1 = pOP3SClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ssl.KeyManager keyManager3 = null;
        pOP3SClient0.setKeyManager(keyManager3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = pOP3SClient0.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pOP3SClient0.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = org.apache.commons.net.pop3.POP3Command.APOP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int0 = org.apache.commons.net.pop3.POP3Command.PASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int0 = org.apache.commons.net.pop3.POP3Command.LIST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.getAdditionalReply();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = pOP3SClient3.execTLS();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int0 = org.apache.commons.net.pop3.POP3Command.RETR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = pOP3SClient3.sendCommand(1, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        pOP3SClient0.setReceiveBufferSize(0);
        pOP3SClient0.setSendBufferSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int0 = org.apache.commons.net.pop3.POP3.AUTHORIZATION_STATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setSoLinger(false, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = null;
        pOP3SClient3.setTrustManager(trustManager5);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.nio.charset.Charset charset8 = pOP3SClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = pOP3SClient0.sendCommand("", "Number: 0. Size: 0. Id: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        javax.net.ssl.TrustManager trustManager3 = pOP3SClient0.getTrustManager();
        int int4 = pOP3SClient0.getConnectTimeout();
        org.junit.Assert.assertNull(trustManager3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = pOP3SClient3.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        int int1 = pOP3MessageInfo0.size;
        java.lang.String str2 = pOP3MessageInfo0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str2, "Number: 0. Size: 0. Id: null");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int0 = org.apache.commons.net.pop3.POP3Command.AUTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        java.net.Proxy proxy3 = pOP3SClient0.getProxy();
        javax.net.ssl.TrustManager trustManager4 = pOP3SClient0.getTrustManager();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNull(proxy3);
        org.junit.Assert.assertNull(trustManager4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int0 = org.apache.commons.net.pop3.POP3Command.NOOP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = pOP3SClient0.getHostnameVerifier();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(hostnameVerifier8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        java.net.InetAddress inetAddress8 = null;
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect(inetAddress8, (int) (byte) 0, inetAddress10, (-1));
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int0 = org.apache.commons.net.pop3.POP3.UPDATE_STATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.identifier = "";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = org.apache.commons.net.pop3.POP3.DISCONNECTED_STATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str1 = org.apache.commons.net.pop3.POP3Command.getCommand((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PASS" + "'", str1, "PASS");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = org.apache.commons.net.pop3.POP3Command.CAPA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        pOP3MessageInfo0.identifier = "USER";
        java.lang.String str3 = pOP3MessageInfo0.identifier;
        int int4 = pOP3MessageInfo0.size;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "USER" + "'", str3, "USER");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.net.pop3.POP3 pOP3_0 = new org.apache.commons.net.pop3.POP3();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        boolean boolean3 = pOP3SClient0.noop();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory3 = pOP3SClient0.getServerSocketFactory();
        pOP3SClient0.setSendBufferSize((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false);
        boolean boolean3 = pOP3SClient2.isEndpointCheckingEnabled();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray9 = pOP3SClient0.listUniqueIdentifiers();
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect(inetAddress10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isConnected();
        java.nio.charset.Charset charset6 = pOP3SClient3.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = pOP3SClient3.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isConnected();
        java.nio.charset.Charset charset6 = pOP3SClient3.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pOP3SClient3.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = pOP3SClient2.sendCommand((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        pOP3SClient3.setEndpointCheckingEnabled(false);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo9 = pOP3SClient3.listUniqueIdentifier((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
        org.junit.Assert.assertNull(pOP3MessageInfo9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        java.io.Reader reader10 = pOP3SClient0.retrieveMessage(9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = pOP3SClient0.sendCommand("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reader10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("USER", false, sSLContext2);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress4 = pOP3SClient3.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        boolean boolean9 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo11 = pOP3SClient0.listMessage((int) (byte) -1);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo13 = pOP3SClient0.listUniqueIdentifier((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pOP3MessageInfo11);
        org.junit.Assert.assertNull(pOP3MessageInfo13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setSoLinger(false, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.disconnect();
        pOP3SClient0.setDefaultTimeout(1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        boolean boolean6 = pOP3SClient3.reset();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient7 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str8 = pOP3SClient7.getCharsetName();
        java.nio.charset.Charset charset9 = pOP3SClient7.getCharset();
        java.net.Proxy proxy10 = pOP3SClient7.getProxy();
        org.apache.commons.net.pop3.POP3Client pOP3Client11 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean12 = pOP3Client11.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient13 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str14 = pOP3SClient13.getCharsetName();
        java.nio.charset.Charset charset15 = pOP3SClient13.getCharset();
        pOP3Client11.setCharset(charset15);
        pOP3SClient7.setCharset(charset15);
        pOP3SClient3.setCharset(charset15);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect("Number: 0. Size: 0. Id: null");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Number: 0. Size: 0. Id: null");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-8" + "'", str14, "UTF-8");
        org.junit.Assert.assertNotNull(charset15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        pOP3SClient0.setDefaultPort(10);
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient8 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext7);
        int int9 = pOP3SClient8.getState();
        javax.net.ssl.TrustManager trustManager10 = pOP3SClient8.getTrustManager();
        boolean boolean11 = pOP3SClient8.reset();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient12 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str13 = pOP3SClient12.getCharsetName();
        java.nio.charset.Charset charset14 = pOP3SClient12.getCharset();
        java.net.Proxy proxy15 = pOP3SClient12.getProxy();
        org.apache.commons.net.pop3.POP3Client pOP3Client16 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean17 = pOP3Client16.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient18 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str19 = pOP3SClient18.getCharsetName();
        java.nio.charset.Charset charset20 = pOP3SClient18.getCharset();
        pOP3Client16.setCharset(charset20);
        pOP3SClient12.setCharset(charset20);
        pOP3SClient8.setCharset(charset20);
        pOP3SClient0.setCharset(charset20);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(trustManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF-8" + "'", str13, "UTF-8");
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNull(proxy15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF-8" + "'", str19, "UTF-8");
        org.junit.Assert.assertNotNull(charset20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient(false, sSLContext1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = pOP3SClient2.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = pOP3SClient2.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int0 = org.apache.commons.net.pop3.POP3Command.DELE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int int0 = org.apache.commons.net.pop3.POP3Command.UIDL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = pOP3Client0.sendCommand((int) (short) 0, "PASS");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("USER", false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str3 = pOP3SClient2.getCharsetName();
        java.nio.charset.Charset charset4 = pOP3SClient2.getCharset();
        pOP3Client0.setCharset(charset4);
        pOP3Client0.setState((int) (short) 10);
        boolean boolean8 = pOP3Client0.noop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pOP3SClient3.sendCommand((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient(true);
        pOP3SClient1.setReceiveBufferSize(60000);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("Number: 0. Size: 0. Id: null");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = extendedPOP3Client0.sendCommand("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int0 = org.apache.commons.net.pop3.POP3Command.USER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray3 = pOP3SClient0.listUniqueIdentifiers();
        java.lang.String[] strArray4 = pOP3SClient0.getReplyStrings();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pOP3SClient0.sendCommand("USER", "CRAM-MD5");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        javax.net.ssl.KeyManager keyManager2 = null;
        pOP3SClient0.setKeyManager(keyManager2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress4 = pOP3Client0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        int int3 = pOP3SClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.setSoTimeout(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.io.Reader reader9 = pOP3SClient0.retrieveMessage(6);
        pOP3SClient0.setReceiveBufferSize(9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reader9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        int int9 = pOP3SClient0.getState();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener10);
        boolean boolean12 = pOP3SClient0.reset();
        javax.net.SocketFactory socketFactory13 = null;
        pOP3SClient0.setSocketFactory(socketFactory13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        int int9 = pOP3SClient0.getState();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = pOP3SClient0.sendCommand("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int0 = org.apache.commons.net.pop3.POP3Reply.OK_INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        pOP3SClient3.setEndpointCheckingEnabled(false);
        java.lang.String str8 = pOP3SClient3.getCharsetName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient0.listMessages();
        boolean boolean9 = pOP3SClient0.isAvailable();
        pOP3SClient0.setEndpointCheckingEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int0 = org.apache.commons.net.pop3.POP3Command.QUIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        java.lang.String str2 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.number = (byte) -1;
        int int5 = pOP3MessageInfo0.size;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str2, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        java.lang.String str5 = pOP3SClient3.getCharsetName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        int int5 = pOP3SClient3.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = pOP3SClient3.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo6 = pOP3SClient3.status();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pOP3MessageInfo6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        boolean boolean4 = pOP3SClient0.deleteMessage(7);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = pOP3SClient0.getHostnameVerifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(hostnameVerifier5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int0 = org.apache.commons.net.pop3.POP3Reply.OK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.nio.charset.Charset charset8 = pOP3SClient0.getCharset();
        boolean boolean12 = pOP3SClient0.login("", "UTF-8", "hi!");
        boolean boolean13 = pOP3SClient0.noop();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient0.listMessages();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        javax.net.ssl.HostnameVerifier hostnameVerifier1 = extendedPOP3Client0.getHostnameVerifier();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        extendedPOP3Client0.removeProtocolCommandistener(protocolCommandListener2);
        org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD aUTH_METHOD4 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedPOP3Client0.auth(aUTH_METHOD4, "PASS", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier1);
        org.junit.Assert.assertTrue("'" + aUTH_METHOD4 + "' != '" + org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN + "'", aUTH_METHOD4.equals(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        java.io.Reader reader5 = pOP3SClient3.retrieveMessage((int) (short) 10);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo6 = pOP3SClient3.status();
        org.junit.Assert.assertNull(reader5);
        org.junit.Assert.assertNull(pOP3MessageInfo6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.identifier;
        pOP3MessageInfo0.identifier = "";
        pOP3MessageInfo0.number = 100;
        pOP3MessageInfo0.number = 9;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient(true, sSLContext1);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo4 = pOP3SClient2.listMessage(9);
        org.junit.Assert.assertNull(pOP3MessageInfo4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        java.net.InetAddress inetAddress4 = null;
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3Client0.connect(inetAddress4, (int) (byte) -1, inetAddress6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = pOP3SClient3.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.lang.String str2 = pOP3SClient0.getReplyString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        pOP3SClient3.setEndpointCheckingEnabled(false);
        int int8 = pOP3SClient3.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 995 + "'", int8 == 995);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD aUTH_METHOD0 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN;
        java.lang.String str1 = aUTH_METHOD0.getAuthName();
        org.junit.Assert.assertTrue("'" + aUTH_METHOD0 + "' != '" + org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN + "'", aUTH_METHOD0.equals(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PLAIN" + "'", str1, "PLAIN");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient(false, sSLContext1);
        int int3 = pOP3SClient2.getConnectTimeout();
        boolean boolean4 = pOP3SClient2.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient(true, sSLContext1);
        java.net.Proxy proxy3 = pOP3SClient2.getProxy();
        org.junit.Assert.assertNull(proxy3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        javax.net.ssl.HostnameVerifier hostnameVerifier1 = extendedPOP3Client0.getHostnameVerifier();
        org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD aUTH_METHOD2 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = extendedPOP3Client0.auth(aUTH_METHOD2, "PLAIN", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier1);
        org.junit.Assert.assertTrue("'" + aUTH_METHOD2 + "' != '" + org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5 + "'", aUTH_METHOD2.equals(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        pOP3SClient3.setDefaultTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = pOP3SClient3.sendCommand("hi!", "CRAM-MD5");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        java.lang.String str2 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.number = (byte) -1;
        java.lang.String str5 = pOP3MessageInfo0.identifier;
        java.lang.String str6 = pOP3MessageInfo0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str2, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Number: -1. Size: 0. Id: null" + "'", str6, "Number: -1. Size: 0. Id: null");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        java.net.InetAddress inetAddress6 = null;
        java.net.InetAddress inetAddress8 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect(inetAddress6, (-1), inetAddress8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ssl.KeyManager keyManager3 = null;
        pOP3SClient0.setKeyManager(keyManager3);
        pOP3SClient0.setEndpointCheckingEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pOP3SClient0.sendCommand(4, "USER");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        pOP3SClient3.setReceiveBufferSize(60000);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect("Number: 0. Size: 0. Id: null", 8, inetAddress12, 13);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Number: 0. Size: 0. Id: null");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        pOP3SClient0.setEnabledCipherSuites(strArray8);
        boolean boolean11 = pOP3SClient0.deleteMessage(0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str1 = org.apache.commons.net.pop3.POP3Command.getCommand((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TOP" + "'", str1, "TOP");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.removeProtocolCommandListener(protocolCommandListener2);
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3Client0.connect(inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("USER", false, sSLContext2);
        int int4 = pOP3SClient3.getDefaultTimeout();
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo6 = pOP3SClient3.listUniqueIdentifier((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pOP3SClient3.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pOP3MessageInfo6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("CRAM-MD5", false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        pOP3SClient0.setDefaultPort(10);
        java.lang.String str5 = pOP3SClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = pOP3SClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("USER");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient3.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray6 = pOP3SClient3.listUniqueIdentifiers();
        java.lang.String[] strArray7 = pOP3SClient3.getReplyStrings();
        pOP3SClient2.setEnabledProtocols(strArray7);
        pOP3SClient1.setEnabledProtocols(strArray7);
        org.junit.Assert.assertNull(pOP3MessageInfoArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient(false, sSLContext1);
        int int3 = pOP3SClient2.getConnectTimeout();
        java.net.Socket socket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = pOP3SClient2.verifyRemote(socket4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo((int) '#', 995);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient6 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext5);
        boolean boolean7 = pOP3SClient6.isAvailable();
        java.net.Proxy proxy8 = pOP3SClient6.getProxy();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient9 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str10 = pOP3SClient9.getCharsetName();
        java.nio.charset.Charset charset11 = pOP3SClient9.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory12 = pOP3SClient9.getServerSocketFactory();
        pOP3SClient6.setServerSocketFactory(serverSocketFactory12);
        pOP3SClient2.setServerSocketFactory(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        java.lang.String str4 = pOP3SClient3.getCharsetName();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = pOP3SClient3.getHostnameVerifier();
        boolean boolean6 = pOP3SClient3.reset();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNull(hostnameVerifier5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.identifier = "hi!";
        pOP3MessageInfo0.identifier = "UTF-8";
        pOP3MessageInfo0.size = (short) 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        pOP3SClient3.setReceiveBufferSize(60000);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray10 = pOP3SClient3.listUniqueIdentifiers();
        javax.net.ssl.KeyManager keyManager11 = null;
        pOP3SClient3.setKeyManager(keyManager11);
        org.junit.Assert.assertNull(pOP3MessageInfoArray10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isConnected();
        boolean boolean6 = pOP3SClient3.isEndpointCheckingEnabled();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        javax.net.ssl.HostnameVerifier hostnameVerifier1 = extendedPOP3Client0.getHostnameVerifier();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        extendedPOP3Client0.removeProtocolCommandistener(protocolCommandListener2);
        int int4 = extendedPOP3Client0.getConnectTimeout();
        org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD aUTH_METHOD5 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = extendedPOP3Client0.auth(aUTH_METHOD5, "UTF-8", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + aUTH_METHOD5 + "' != '" + org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN + "'", aUTH_METHOD5.equals(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient0.listMessages();
        javax.net.ServerSocketFactory serverSocketFactory9 = pOP3SClient0.getServerSocketFactory();
        java.lang.String str10 = pOP3SClient0.getReplyString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray8);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        pOP3Client0.removeProtocolCommandistener(protocolCommandListener4);
        java.net.Proxy proxy6 = null;
        pOP3Client0.setProxy(proxy6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.identifier = "hi!";
        pOP3MessageInfo0.identifier = "USER";
        java.lang.String str6 = pOP3MessageInfo0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Number: 0. Size: 0. Id: USER" + "'", str6, "Number: 0. Size: 0. Id: USER");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.getAdditionalReply();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        javax.net.ssl.TrustManager trustManager3 = pOP3SClient0.getTrustManager();
        java.net.Proxy proxy4 = pOP3SClient0.getProxy();
        org.junit.Assert.assertNull(trustManager3);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("Number: 0. Size: 0. Id: USER", false, sSLContext2);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        pOP3SClient0.setReceiveBufferSize(0);
        java.lang.String[] strArray10 = pOP3SClient0.getEnabledProtocols();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = pOP3SClient0.logout();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        int int9 = pOP3SClient0.getState();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener10);
        java.io.Reader reader13 = pOP3SClient0.retrieveMessage((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(reader13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = pOP3SClient3.sendCommand((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        pOP3SClient0.setDefaultPort(10);
        java.io.Reader reader7 = pOP3SClient0.retrieveMessageTop(0, 10);
        org.junit.Assert.assertNull(reader7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray3 = pOP3SClient0.listUniqueIdentifiers();
        java.lang.String[] strArray4 = pOP3SClient0.getReplyStrings();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray5 = pOP3SClient0.listUniqueIdentifiers();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pOP3SClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(pOP3MessageInfoArray5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        java.lang.String str4 = pOP3SClient3.getCharsetName();
        java.lang.String[] strArray5 = pOP3SClient3.getReplyStrings();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("");
        java.lang.String[] strArray2 = pOP3SClient1.getReplyStrings();
        boolean boolean3 = pOP3SClient1.noop();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo(0, "Number: 0. Size: 0. Id: null");
        int int3 = pOP3MessageInfo2.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect(inetAddress3);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo6 = pOP3SClient0.listUniqueIdentifier(60000);
        javax.net.ssl.KeyManager keyManager7 = null;
        pOP3SClient0.setKeyManager(keyManager7);
        org.junit.Assert.assertNull(pOP3MessageInfo6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        java.net.Proxy proxy5 = pOP3SClient3.getProxy();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient6 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str7 = pOP3SClient6.getCharsetName();
        java.nio.charset.Charset charset8 = pOP3SClient6.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory9 = pOP3SClient6.getServerSocketFactory();
        pOP3SClient3.setServerSocketFactory(serverSocketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = pOP3SClient3.sendCommand(3, "Number: -1. Size: 0. Id: null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = null;
        pOP3SClient3.setTrustManager(trustManager5);
        boolean boolean8 = pOP3SClient3.deleteMessage(13);
        int int9 = pOP3SClient3.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setSoLinger(true, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        boolean boolean6 = pOP3SClient3.noop();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pOP3SClient3.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.lang.String[] strArray8 = pOP3SClient0.getEnabledProtocols();
        pOP3SClient0.disconnect();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray4 = pOP3SClient3.listMessages();
        int int5 = pOP3SClient3.getDefaultPort();
        org.junit.Assert.assertNull(pOP3MessageInfoArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 995 + "'", int5 == 995);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray6 = pOP3SClient3.listUniqueIdentifiers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pOP3SClient3.capa();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
        org.junit.Assert.assertNull(pOP3MessageInfoArray6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        pOP3SClient3.setReceiveBufferSize(60000);
        pOP3SClient3.setConnectTimeout(11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.nio.charset.Charset charset8 = pOP3SClient0.getCharset();
        boolean boolean12 = pOP3SClient0.login("", "UTF-8", "hi!");
        int int13 = pOP3SClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = pOP3SClient0.capa();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setSoLinger(true, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        pOP3SClient3.setEndpointCheckingEnabled(false);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect("Number: 0. Size: 0. Id: null", 0, inetAddress10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: Number: 0. Size: 0. Id: null");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo8 = pOP3SClient3.status();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = pOP3SClient3.execTLS();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfo8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        pOP3SClient3.setDefaultTimeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = pOP3SClient3.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        java.lang.String str2 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.identifier = "PASS";
        pOP3MessageInfo0.size = 9;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str2, "Number: 0. Size: 0. Id: null");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient4 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str5 = pOP3SClient4.getCharsetName();
        java.nio.charset.Charset charset6 = pOP3SClient4.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory7 = pOP3SClient4.getServerSocketFactory();
        pOP3Client0.setServerSocketFactory(serverSocketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = pOP3Client0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = pOP3SClient3.sendCommand("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        pOP3SClient3.setDefaultTimeout((int) (byte) 1);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient8 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient8.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray11 = pOP3SClient8.listUniqueIdentifiers();
        java.lang.String[] strArray12 = pOP3SClient8.getReplyStrings();
        pOP3SClient3.setEnabledProtocols(strArray12);
        int int14 = pOP3SClient3.getState();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        javax.net.ssl.TrustManager trustManager5 = null;
        pOP3SClient3.setTrustManager(trustManager5);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        javax.net.ssl.HostnameVerifier hostnameVerifier1 = extendedPOP3Client0.getHostnameVerifier();
        int int2 = extendedPOP3Client0.getDefaultTimeout();
        org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD aUTH_METHOD3 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = extendedPOP3Client0.auth(aUTH_METHOD3, "USER", "PLAIN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + aUTH_METHOD3 + "' != '" + org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5 + "'", aUTH_METHOD3.equals(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isAvailable();
        java.lang.String[] strArray6 = pOP3SClient3.getEnabledCipherSuites();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.getAdditionalReply();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        java.lang.String[] strArray11 = new java.lang.String[] { "\r\n", "UTF-8", "\r\n", "\r\n", "\r\n", "USER" };
        pOP3SClient3.setEnabledProtocols(strArray11);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.setSoLinger(true, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.disconnect();
        boolean boolean2 = pOP3SClient0.isEndpointCheckingEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        java.net.Proxy proxy3 = pOP3SClient0.getProxy();
        javax.net.SocketFactory socketFactory4 = null;
        pOP3SClient0.setSocketFactory(socketFactory4);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo6 = pOP3SClient0.status();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNull(proxy3);
        org.junit.Assert.assertNull(pOP3MessageInfo6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isConnected();
        java.lang.String str6 = pOP3SClient3.getReplyString();
        org.apache.commons.net.pop3.POP3Client pOP3Client7 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3Client7.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        pOP3Client7.addProtocolCommandListener(protocolCommandListener9);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient11 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str12 = pOP3SClient11.getCharsetName();
        java.nio.charset.Charset charset13 = pOP3SClient11.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory14 = pOP3SClient11.getServerSocketFactory();
        pOP3Client7.setServerSocketFactory(serverSocketFactory14);
        pOP3SClient3.setServerSocketFactory(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(pOP3MessageInfoArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray6 = pOP3SClient3.listUniqueIdentifiers();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pOP3SClient3.sendCommand("PASS", "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
        org.junit.Assert.assertNull(pOP3MessageInfoArray6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        int int3 = pOP3SClient0.getDefaultTimeout();
        java.lang.String[] strArray4 = pOP3SClient0.getEnabledCipherSuites();
        int int5 = pOP3SClient0.getState();
        javax.net.SocketFactory socketFactory6 = null;
        pOP3SClient0.setSocketFactory(socketFactory6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        javax.net.ssl.SSLContext sSLContext0 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient(sSLContext0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3SClient1.removeProtocolCommandistener(protocolCommandListener2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        javax.net.ssl.TrustManager trustManager8 = pOP3SClient0.getTrustManager();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(trustManager8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        javax.net.ServerSocketFactory serverSocketFactory4 = pOP3Client0.getServerSocketFactory();
        boolean boolean5 = pOP3Client0.reset();
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo(0, 3);
        java.lang.String str3 = pOP3MessageInfo2.toString();
        java.lang.String str4 = pOP3MessageInfo2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Number: 0. Size: 3. Id: null" + "'", str3, "Number: 0. Size: 3. Id: null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Number: 0. Size: 3. Id: null" + "'", str4, "Number: 0. Size: 3. Id: null");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo(1, (int) (byte) -1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        javax.net.ssl.TrustManager trustManager3 = pOP3SClient0.getTrustManager();
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo5 = pOP3SClient0.listMessage((int) (short) 1);
        boolean boolean9 = pOP3SClient0.login("\r\n", "PASS", "hi!");
        org.junit.Assert.assertNull(trustManager3);
        org.junit.Assert.assertNull(pOP3MessageInfo5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect("TOP", (int) (byte) -1, inetAddress7, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.io.Reader reader9 = pOP3SClient0.retrieveMessage(6);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = pOP3SClient0.getHostnameVerifier();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reader9);
        org.junit.Assert.assertNull(hostnameVerifier10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        java.lang.String[] strArray11 = new java.lang.String[] { "\r\n", "UTF-8", "\r\n", "\r\n", "\r\n", "USER" };
        pOP3SClient3.setEnabledProtocols(strArray11);
        java.net.InetAddress inetAddress13 = null;
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect(inetAddress13, 3, inetAddress15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        int int3 = pOP3SClient0.getDefaultTimeout();
        java.lang.String[] strArray4 = pOP3SClient0.getEnabledCipherSuites();
        boolean boolean5 = pOP3SClient0.isConnected();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("USER", true, sSLContext2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient4 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str5 = pOP3SClient4.getCharsetName();
        java.nio.charset.Charset charset6 = pOP3SClient4.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory7 = pOP3SClient4.getServerSocketFactory();
        pOP3Client0.setServerSocketFactory(serverSocketFactory7);
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3Client0.connect(inetAddress9, 12);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        java.nio.charset.Charset charset8 = pOP3SClient0.getCharset();
        boolean boolean12 = pOP3SClient0.login("", "UTF-8", "hi!");
        java.lang.String[] strArray13 = pOP3SClient0.getReplyStrings();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("");
        java.net.Proxy proxy2 = pOP3SClient1.getProxy();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        pOP3SClient1.removeProtocolCommandListener(protocolCommandListener3);
        int int5 = pOP3SClient1.getState();
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo6 = pOP3SClient0.listUniqueIdentifier(60000);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pOP3SClient0.capa();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfo6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str3 = pOP3SClient2.getCharsetName();
        java.nio.charset.Charset charset4 = pOP3SClient2.getCharset();
        pOP3Client0.setCharset(charset4);
        pOP3Client0.setState((int) (short) 10);
        int int8 = pOP3Client0.getConnectTimeout();
        pOP3Client0.setConnectTimeout(10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray11 = pOP3Client0.listUniqueIdentifiers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNull(pOP3MessageInfoArray11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("");
        java.lang.String[] strArray2 = pOP3SClient1.getReplyStrings();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        pOP3SClient1.addProtocolCommandListener(protocolCommandListener3);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        int int9 = pOP3SClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        pOP3SClient0.setDefaultPort(10);
        boolean boolean8 = pOP3SClient0.login("UTF-8", "TOP", "PLAIN");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pOP3SClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        pOP3Client0.setReceiveBufferSize((int) (byte) 1);
        pOP3Client0.setConnectTimeout((int) ' ');
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        java.io.Reader reader5 = pOP3SClient3.retrieveMessage((int) (short) 10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        pOP3SClient3.removeProtocolCommandistener(protocolCommandListener6);
        org.junit.Assert.assertNull(reader5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        javax.net.SocketFactory socketFactory2 = null;
        pOP3Client0.setSocketFactory(socketFactory2);
        java.lang.Class<?> wildcardClass4 = pOP3Client0.getClass();
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3Client0.addProtocolCommandListener(protocolCommandListener2);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient4 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str5 = pOP3SClient4.getCharsetName();
        java.nio.charset.Charset charset6 = pOP3SClient4.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory7 = pOP3SClient4.getServerSocketFactory();
        pOP3Client0.setServerSocketFactory(serverSocketFactory7);
        java.lang.String str9 = pOP3Client0.getCharsetName();
        org.junit.Assert.assertNull(pOP3MessageInfoArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo((int) (byte) 100, "Number: 0. Size: 3. Id: null");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        pOP3SClient3.setState((int) (byte) 0);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient3.listMessages();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        pOP3SClient3.setSendBufferSize((int) (byte) 0);
        pOP3SClient3.setSendBufferSize((int) ' ');
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        pOP3SClient0.setDefaultPort((int) '4');
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        pOP3MessageInfo0.identifier = "USER";
        java.lang.String str3 = pOP3MessageInfo0.identifier;
        java.lang.String str4 = pOP3MessageInfo0.identifier;
        pOP3MessageInfo0.number = (byte) 1;
        pOP3MessageInfo0.number = 0;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "USER" + "'", str3, "USER");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "USER" + "'", str4, "USER");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        javax.net.ssl.SSLContext sSLContext3 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient4 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext3);
        int int5 = pOP3SClient4.getState();
        javax.net.ssl.TrustManager trustManager6 = pOP3SClient4.getTrustManager();
        boolean boolean7 = pOP3SClient4.reset();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient8 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str9 = pOP3SClient8.getCharsetName();
        java.nio.charset.Charset charset10 = pOP3SClient8.getCharset();
        java.net.Proxy proxy11 = pOP3SClient8.getProxy();
        org.apache.commons.net.pop3.POP3Client pOP3Client12 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean13 = pOP3Client12.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient14 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str15 = pOP3SClient14.getCharsetName();
        java.nio.charset.Charset charset16 = pOP3SClient14.getCharset();
        pOP3Client12.setCharset(charset16);
        pOP3SClient8.setCharset(charset16);
        pOP3SClient4.setCharset(charset16);
        pOP3Client0.setCharset(charset16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(trustManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        pOP3SClient0.setDefaultPort(10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        pOP3SClient0.removeProtocolCommandistener(protocolCommandListener5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = pOP3SClient0.getHostnameVerifier();
        org.junit.Assert.assertNull(hostnameVerifier7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str1 = org.apache.commons.net.pop3.POP3Command.getCommand(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RETR" + "'", str1, "RETR");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo8 = pOP3SClient3.status();
        javax.net.ssl.TrustManager trustManager9 = null;
        pOP3SClient3.setTrustManager(trustManager9);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener11 = null;
        pOP3SClient3.removeProtocolCommandistener(protocolCommandListener11);
        org.junit.Assert.assertNull(pOP3MessageInfo8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("USER");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = pOP3SClient1.execTLS();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray3 = pOP3SClient0.listMessages();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = pOP3SClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray3 = pOP3SClient0.listUniqueIdentifiers();
        java.lang.String[] strArray4 = pOP3SClient0.getReplyStrings();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray5 = pOP3SClient0.listUniqueIdentifiers();
        javax.net.ServerSocketFactory serverSocketFactory6 = pOP3SClient0.getServerSocketFactory();
        org.junit.Assert.assertNull(pOP3MessageInfoArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(pOP3MessageInfoArray5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        java.net.Proxy proxy3 = pOP3SClient0.getProxy();
        org.apache.commons.net.pop3.POP3Client pOP3Client4 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean5 = pOP3Client4.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient6 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str7 = pOP3SClient6.getCharsetName();
        java.nio.charset.Charset charset8 = pOP3SClient6.getCharset();
        pOP3Client4.setCharset(charset8);
        pOP3SClient0.setCharset(charset8);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = pOP3SClient0.getHostnameVerifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNull(proxy3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("USER", false, sSLContext2);
        int int4 = pOP3SClient3.getDefaultTimeout();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray5 = pOP3SClient3.listMessages();
        boolean boolean8 = pOP3SClient3.login("USER", "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pOP3MessageInfoArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        pOP3SClient3.addProtocolCommandListener(protocolCommandListener6);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient8 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str9 = pOP3SClient8.getCharsetName();
        java.nio.charset.Charset charset10 = pOP3SClient8.getCharset();
        java.net.Proxy proxy11 = pOP3SClient8.getProxy();
        org.apache.commons.net.pop3.POP3Client pOP3Client12 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean13 = pOP3Client12.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient14 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str15 = pOP3SClient14.getCharsetName();
        java.nio.charset.Charset charset16 = pOP3SClient14.getCharset();
        pOP3Client12.setCharset(charset16);
        pOP3SClient8.setCharset(charset16);
        pOP3SClient3.setCharset(charset16);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = pOP3SClient3.getHostnameVerifier();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNull(hostnameVerifier20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str3 = pOP3SClient2.getCharsetName();
        java.nio.charset.Charset charset4 = pOP3SClient2.getCharset();
        pOP3Client0.setCharset(charset4);
        pOP3Client0.setState((int) (short) 10);
        int int8 = pOP3Client0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        java.io.Reader reader5 = pOP3SClient3.retrieveMessage((int) (short) 10);
        javax.net.ssl.TrustManager trustManager6 = pOP3SClient3.getTrustManager();
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo8 = pOP3SClient3.listUniqueIdentifier(9);
        org.junit.Assert.assertNull(reader5);
        org.junit.Assert.assertNull(trustManager6);
        org.junit.Assert.assertNull(pOP3MessageInfo8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        java.nio.charset.Charset charset4 = pOP3SClient3.getCharset();
        pOP3SClient3.setDefaultPort(5);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        pOP3SClient3.removeProtocolCommandistener(protocolCommandListener7);
        java.net.Socket socket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = pOP3SClient3.verifyRemote(socket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory3 = pOP3SClient0.getServerSocketFactory();
        java.lang.String[] strArray4 = pOP3SClient0.getEnabledProtocols();
        boolean boolean8 = pOP3SClient0.login("PASS", "UTF-8", "UTF-8");
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray9 = pOP3SClient0.listMessages();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        int int9 = pOP3SClient0.getState();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener10);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect(inetAddress12, 2);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", false);
        boolean boolean3 = pOP3SClient2.reset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo(100, (int) (byte) 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        int int9 = pOP3SClient0.getState();
        javax.net.ssl.TrustManager trustManager10 = null;
        pOP3SClient0.setTrustManager(trustManager10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = pOP3SClient0.execTLS();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient("Number: 0. Size: 0. Id: USER", true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray4 = pOP3SClient3.listMessages();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray5 = pOP3SClient3.listMessages();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = pOP3SClient3.execTLS();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pOP3MessageInfoArray4);
        org.junit.Assert.assertNull(pOP3MessageInfoArray5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        boolean boolean5 = pOP3SClient3.isEndpointCheckingEnabled();
        boolean boolean6 = pOP3SClient3.noop();
        java.net.Socket socket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = pOP3SClient3.verifyRemote(socket7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        int int4 = pOP3SClient3.getState();
        javax.net.ssl.TrustManager trustManager5 = pOP3SClient3.getTrustManager();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = pOP3SClient3.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(trustManager5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        pOP3MessageInfo0.identifier = "USER";
        java.lang.String str3 = pOP3MessageInfo0.identifier;
        java.lang.String str4 = pOP3MessageInfo0.identifier;
        int int5 = pOP3MessageInfo0.size;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "USER" + "'", str3, "USER");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "USER" + "'", str4, "USER");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        javax.net.ssl.SSLContext sSLContext9 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient10 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext9);
        int int11 = pOP3SClient10.getState();
        javax.net.ssl.TrustManager trustManager12 = pOP3SClient10.getTrustManager();
        boolean boolean13 = pOP3SClient10.reset();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient14 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str15 = pOP3SClient14.getCharsetName();
        java.nio.charset.Charset charset16 = pOP3SClient14.getCharset();
        java.net.Proxy proxy17 = pOP3SClient14.getProxy();
        org.apache.commons.net.pop3.POP3Client pOP3Client18 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean19 = pOP3Client18.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient20 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str21 = pOP3SClient20.getCharsetName();
        java.nio.charset.Charset charset22 = pOP3SClient20.getCharset();
        pOP3Client18.setCharset(charset22);
        pOP3SClient14.setCharset(charset22);
        pOP3SClient10.setCharset(charset22);
        pOP3SClient0.setCharset(charset22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = pOP3SClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(trustManager12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNull(proxy17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.identifier = "hi!";
        pOP3MessageInfo0.identifier = "USER";
        int int6 = pOP3MessageInfo0.size;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        javax.net.SocketFactory socketFactory8 = null;
        pOP3SClient0.setSocketFactory(socketFactory8);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ssl.KeyManager keyManager3 = null;
        pOP3SClient0.setKeyManager(keyManager3);
        pOP3SClient0.setEndpointCheckingEnabled(false);
        org.apache.commons.net.pop3.POP3SClient pOP3SClient7 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient8 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient8.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray11 = pOP3SClient8.listUniqueIdentifiers();
        java.lang.String[] strArray12 = pOP3SClient8.getReplyStrings();
        pOP3SClient7.setEnabledProtocols(strArray12);
        pOP3SClient0.setEnabledProtocols(strArray12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNull(pOP3MessageInfoArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        javax.net.ssl.TrustManager trustManager8 = null;
        pOP3SClient0.setTrustManager(trustManager8);
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo0 = new org.apache.commons.net.pop3.POP3MessageInfo();
        java.lang.String str1 = pOP3MessageInfo0.toString();
        java.lang.String str2 = pOP3MessageInfo0.toString();
        pOP3MessageInfo0.number = (byte) -1;
        pOP3MessageInfo0.identifier = "TOP";
        pOP3MessageInfo0.identifier = "Number: 0. Size: 0. Id: null";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str1, "Number: 0. Size: 0. Id: null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Number: 0. Size: 0. Id: null" + "'", str2, "Number: 0. Size: 0. Id: null");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("USER", false, sSLContext2);
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = pOP3SClient3.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = pOP3SClient3.sendCommand("CRAM-MD5", "RETR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("\r\n", false, sSLContext2);
        java.io.Reader reader5 = pOP3SClient3.retrieveMessage((int) (short) 10);
        boolean boolean6 = pOP3SClient3.isEndpointCheckingEnabled();
        java.net.InetAddress inetAddress7 = null;
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect(inetAddress7, 2, inetAddress9, 8);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = pOP3SClient3.execTLS();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        pOP3SClient0.setEnabledCipherSuites(strArray8);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        pOP3SClient0.removeProtocolCommandListener(protocolCommandListener10);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo2 = new org.apache.commons.net.pop3.POP3MessageInfo((int) ' ', "Number: 0. Size: 0. Id: null");
        int int3 = pOP3MessageInfo2.size;
        int int4 = pOP3MessageInfo2.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("\r\n");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("");
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        pOP3SClient1.removeProtocolCommandistener(protocolCommandListener2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        boolean boolean9 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo pOP3MessageInfo11 = pOP3SClient0.listMessage((int) (byte) -1);
        int int12 = pOP3SClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pOP3MessageInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        javax.net.ssl.HostnameVerifier hostnameVerifier1 = extendedPOP3Client0.getHostnameVerifier();
        javax.net.ServerSocketFactory serverSocketFactory2 = extendedPOP3Client0.getServerSocketFactory();
        org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD aUTH_METHOD3 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5;
        java.lang.String str4 = aUTH_METHOD3.getAuthName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = extendedPOP3Client0.auth(aUTH_METHOD3, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hostnameVerifier1);
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertTrue("'" + aUTH_METHOD3 + "' != '" + org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5 + "'", aUTH_METHOD3.equals(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CRAM-MD5" + "'", str4, "CRAM-MD5");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient0.listMessages();
        boolean boolean9 = pOP3SClient0.isAvailable();
        java.net.Proxy proxy10 = pOP3SClient0.getProxy();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pOP3MessageInfoArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        pOP3SClient0.addProtocolCommandListener(protocolCommandListener1);
        pOP3SClient0.setDefaultPort(10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = pOP3SClient0.sendCommand(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Socket is not connected");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        java.io.Reader reader6 = pOP3SClient3.retrieveMessage((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reader6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        boolean boolean4 = pOP3SClient3.isAvailable();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient3.connect(inetAddress5, 5, inetAddress7, 9);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("UTF-8");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        javax.net.ssl.SSLContext sSLContext2 = null;
        org.apache.commons.net.pop3.POP3SClient pOP3SClient3 = new org.apache.commons.net.pop3.POP3SClient("UTF-8", true, sSLContext2);
        pOP3SClient3.setReceiveBufferSize((int) '4');
        javax.net.ssl.TrustManager trustManager6 = null;
        pOP3SClient3.setTrustManager(trustManager6);
        pOP3SClient3.setReceiveBufferSize(60000);
        javax.net.ssl.TrustManager trustManager10 = pOP3SClient3.getTrustManager();
        org.junit.Assert.assertNull(trustManager10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient(false);
        java.lang.String[] strArray2 = pOP3SClient1.getEnabledCipherSuites();
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory3 = pOP3SClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            pOP3SClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }
}

