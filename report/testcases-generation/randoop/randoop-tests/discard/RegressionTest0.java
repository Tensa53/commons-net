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
        int int0 = org.apache.commons.net.discard.DiscardTCPClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (short) -1, inetAddress2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray7, (int) (byte) 10, inetAddress9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 0, 0, 1]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        java.time.Duration duration2 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout(duration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        java.time.Duration duration3 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setDefaultTimeout(duration3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener1 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress2, (-1), inetAddress4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        byte[] byteArray4 = new byte[] {};
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray4, inetAddress5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        byte[] byteArray2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray2, (int) (byte) 100, inetAddress4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null packet buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8", 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        java.net.Socket socket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = discardTCPClient0.verifyRemote(socket3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100 };
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray9, (int) '#', inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 100]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        java.net.InetAddress inetAddress2 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress2);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray9, 0, inetAddress11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null buffer || null address");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 100]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.time.Duration duration6 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setDefaultTimeout(duration6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.lang.Class<?> wildcardClass6 = discardUDPClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.time.Duration duration7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout(duration7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = discardTCPClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", 100);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        boolean boolean5 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = discardTCPClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        java.net.Socket socket4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = discardTCPClient0.verifyRemote(socket4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean4 = discardUDPClient3.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress12 = discardUDPClient6.getLocalAddress();
        discardUDPClient3.open(0, inetAddress12);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inetAddress12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8", 60000);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean8 = discardUDPClient7.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress16 = discardUDPClient10.getLocalAddress();
        discardUDPClient7.open(0, inetAddress16);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8", 9, inetAddress16, 1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inetAddress16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress9, 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        java.nio.charset.Charset charset12 = null;
        discardUDPClient5.setCharset(charset12);
        java.nio.charset.Charset charset14 = discardUDPClient5.getCharset();
        java.time.Duration duration15 = discardUDPClient5.getSoTimeoutDuration();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout(duration15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNull(charset14);
        org.junit.Assert.assertNotNull(duration15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        java.nio.charset.Charset charset22 = discardUDPClient6.getCharset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean27 = discardUDPClient26.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient29 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient29.open();
        discardUDPClient29.setDefaultTimeout((-1));
        discardUDPClient29.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress35 = discardUDPClient29.getLocalAddress();
        discardUDPClient26.open(0, inetAddress35);
        discardUDPClient6.send(byteArray25, inetAddress35);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) ' ', inetAddress35);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(inetAddress35);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(9);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress4 = discardTCPClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.time.Duration duration10 = discardUDPClient0.getSoTimeoutDuration();
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) 0, inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(true, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(charset17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        boolean boolean2 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int0 = org.apache.commons.net.discard.DiscardUDPClient.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        java.net.Socket socket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = discardTCPClient0.verifyRemote(socket2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.net.Socket socket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = discardTCPClient0.verifyRemote(socket2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean10 = discardUDPClient9.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress18 = discardUDPClient12.getLocalAddress();
        discardUDPClient9.open(0, inetAddress18);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient21 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient21.open();
        discardUDPClient21.setDefaultTimeout((-1));
        discardUDPClient21.setSoTimeout((int) ' ');
        int int27 = discardUDPClient21.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.open();
        discardUDPClient28.setDefaultTimeout((-1));
        discardUDPClient28.setSoTimeout((int) ' ');
        int int34 = discardUDPClient28.getSoTimeout();
        java.nio.charset.Charset charset35 = discardUDPClient28.getCharset();
        discardUDPClient21.setCharset(charset35);
        java.nio.charset.Charset charset37 = discardUDPClient21.getCharset();
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean42 = discardUDPClient41.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient44 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient44.open();
        discardUDPClient44.setDefaultTimeout((-1));
        discardUDPClient44.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress50 = discardUDPClient44.getLocalAddress();
        discardUDPClient41.open(0, inetAddress50);
        discardUDPClient21.send(byteArray40, inetAddress50);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress18, (int) (byte) -1, inetAddress50, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(inetAddress18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(inetAddress50);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean19 = discardUDPClient18.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient21 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient21.open();
        discardUDPClient21.setDefaultTimeout((-1));
        discardUDPClient21.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress27 = discardUDPClient21.getLocalAddress();
        discardUDPClient18.open(0, inetAddress27);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8", 10, inetAddress27, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(inetAddress27);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) -1, inetAddress7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        java.io.OutputStream outputStream10 = discardTCPClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNull(outputStream10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setReceiveBufferSize(32);
        int int5 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        discardUDPClient5.setCharset(charset19);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory21 = null;
        discardUDPClient5.setDatagramSocketFactory(datagramSocketFactory21);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient30.open();
        discardUDPClient30.setDefaultTimeout((-1));
        discardUDPClient30.setSoTimeout((int) ' ');
        int int36 = discardUDPClient30.getSoTimeout();
        java.nio.charset.Charset charset37 = discardUDPClient30.getCharset();
        discardUDPClient23.setCharset(charset37);
        java.nio.charset.Charset charset39 = discardUDPClient23.getCharset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient43 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean44 = discardUDPClient43.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient46 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient46.open();
        discardUDPClient46.setDefaultTimeout((-1));
        discardUDPClient46.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress52 = discardUDPClient46.getLocalAddress();
        discardUDPClient43.open(0, inetAddress52);
        discardUDPClient23.send(byteArray42, inetAddress52);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient55 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean56 = discardUDPClient55.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient58 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient58.open();
        discardUDPClient58.setDefaultTimeout((-1));
        discardUDPClient58.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress64 = discardUDPClient58.getLocalAddress();
        discardUDPClient55.open(0, inetAddress64);
        discardUDPClient5.send(byteArray42, inetAddress64);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient68 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean69 = discardUDPClient68.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient71 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient71.open();
        discardUDPClient71.setDefaultTimeout((-1));
        discardUDPClient71.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress77 = discardUDPClient71.getLocalAddress();
        discardUDPClient68.open(0, inetAddress77);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress64, (int) (short) 100, inetAddress77, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(inetAddress52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(inetAddress64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(inetAddress77);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.net.Socket socket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = discardTCPClient0.verifyRemote(socket8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        java.io.OutputStream outputStream10 = discardTCPClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress11 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNull(outputStream10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress14 = discardUDPClient8.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) 100, inetAddress14);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(inetAddress14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient4 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient4.open();
        discardUDPClient4.setDefaultTimeout((-1));
        discardUDPClient4.setSoTimeout((int) ' ');
        int int10 = discardUDPClient4.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        int int17 = discardUDPClient11.getSoTimeout();
        java.nio.charset.Charset charset18 = discardUDPClient11.getCharset();
        discardUDPClient4.setCharset(charset18);
        java.nio.charset.Charset charset20 = discardUDPClient4.getCharset();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean25 = discardUDPClient24.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress33 = discardUDPClient27.getLocalAddress();
        discardUDPClient24.open(0, inetAddress33);
        discardUDPClient4.send(byteArray23, inetAddress33);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", (int) (short) 100, inetAddress33, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(inetAddress33);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
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
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.nio.charset.Charset charset19 = discardUDPClient3.getCharset();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean24 = discardUDPClient23.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient26.open();
        discardUDPClient26.setDefaultTimeout((-1));
        discardUDPClient26.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress32 = discardUDPClient26.getLocalAddress();
        discardUDPClient23.open(0, inetAddress32);
        discardUDPClient3.send(byteArray22, inetAddress32);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress32);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(inetAddress32);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        discardUDPClient5.setCharset(charset19);
        java.nio.charset.Charset charset21 = discardUDPClient5.getCharset();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean26 = discardUDPClient25.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.open();
        discardUDPClient28.setDefaultTimeout((-1));
        discardUDPClient28.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress34 = discardUDPClient28.getLocalAddress();
        discardUDPClient25.open(0, inetAddress34);
        discardUDPClient5.send(byteArray24, inetAddress34);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient38.open();
        discardUDPClient38.open();
        java.net.InetAddress inetAddress41 = discardUDPClient38.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray24, (int) (byte) -1, inetAddress41, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(inetAddress34);
        org.junit.Assert.assertNotNull(inetAddress41);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        java.time.Duration duration3 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout(duration3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = discardTCPClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        java.lang.Class<?> wildcardClass9 = discardTCPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        boolean boolean5 = discardUDPClient0.isOpen();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = discardUDPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.open();
        java.net.InetAddress inetAddress12 = discardUDPClient9.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient14 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient14.open();
        discardUDPClient14.setDefaultTimeout((-1));
        discardUDPClient14.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress20 = discardUDPClient14.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress12, 100, inetAddress20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress12);
        org.junit.Assert.assertNotNull(inetAddress20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        int int17 = discardUDPClient11.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        java.nio.charset.Charset charset25 = discardUDPClient18.getCharset();
        discardUDPClient11.setCharset(charset25);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory27 = null;
        discardUDPClient11.setDatagramSocketFactory(datagramSocketFactory27);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient29 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient29.open();
        discardUDPClient29.setDefaultTimeout((-1));
        discardUDPClient29.setSoTimeout((int) ' ');
        int int35 = discardUDPClient29.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient36 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient36.open();
        discardUDPClient36.setDefaultTimeout((-1));
        discardUDPClient36.setSoTimeout((int) ' ');
        int int42 = discardUDPClient36.getSoTimeout();
        java.nio.charset.Charset charset43 = discardUDPClient36.getCharset();
        discardUDPClient29.setCharset(charset43);
        java.nio.charset.Charset charset45 = discardUDPClient29.getCharset();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient49 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean50 = discardUDPClient49.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient52 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient52.open();
        discardUDPClient52.setDefaultTimeout((-1));
        discardUDPClient52.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress58 = discardUDPClient52.getLocalAddress();
        discardUDPClient49.open(0, inetAddress58);
        discardUDPClient29.send(byteArray48, inetAddress58);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient61 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean62 = discardUDPClient61.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient64 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient64.open();
        discardUDPClient64.setDefaultTimeout((-1));
        discardUDPClient64.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress70 = discardUDPClient64.getLocalAddress();
        discardUDPClient61.open(0, inetAddress70);
        discardUDPClient11.send(byteArray48, inetAddress70);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress9, (int) (short) 100, inetAddress70, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(inetAddress9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(inetAddress58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(inetAddress70);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.open();
        java.net.InetAddress inetAddress12 = discardUDPClient9.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient14 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient14.open();
        discardUDPClient14.setDefaultTimeout((-1));
        discardUDPClient14.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress20 = discardUDPClient14.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress12, (int) (short) -1, inetAddress20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress12);
        org.junit.Assert.assertNotNull(inetAddress20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        discardUDPClient0.setSoTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean13 = discardUDPClient12.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress21 = discardUDPClient15.getLocalAddress();
        discardUDPClient12.open(0, inetAddress21);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) 100, inetAddress21);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(inetAddress21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        discardUDPClient5.setCharset(charset19);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory21 = null;
        discardUDPClient5.setDatagramSocketFactory(datagramSocketFactory21);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient30.open();
        discardUDPClient30.setDefaultTimeout((-1));
        discardUDPClient30.setSoTimeout((int) ' ');
        int int36 = discardUDPClient30.getSoTimeout();
        java.nio.charset.Charset charset37 = discardUDPClient30.getCharset();
        discardUDPClient23.setCharset(charset37);
        java.nio.charset.Charset charset39 = discardUDPClient23.getCharset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient43 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean44 = discardUDPClient43.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient46 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient46.open();
        discardUDPClient46.setDefaultTimeout((-1));
        discardUDPClient46.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress52 = discardUDPClient46.getLocalAddress();
        discardUDPClient43.open(0, inetAddress52);
        discardUDPClient23.send(byteArray42, inetAddress52);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient55 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean56 = discardUDPClient55.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient58 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient58.open();
        discardUDPClient58.setDefaultTimeout((-1));
        discardUDPClient58.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress64 = discardUDPClient58.getLocalAddress();
        discardUDPClient55.open(0, inetAddress64);
        discardUDPClient5.send(byteArray42, inetAddress64);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient67 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient67.open();
        discardUDPClient67.setDefaultTimeout((-1));
        discardUDPClient67.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress73 = discardUDPClient67.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray42, inetAddress73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(inetAddress52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(inetAddress64);
        org.junit.Assert.assertNotNull(inetAddress73);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.lang.Class<?> wildcardClass3 = discardTCPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        discardTCPClient0.disconnect();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = discardUDPClient19.getCharset();
        discardUDPClient12.setCharset(charset26);
        java.nio.charset.Charset charset28 = discardUDPClient12.getCharset();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient32 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean33 = discardUDPClient32.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient35 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient35.open();
        discardUDPClient35.setDefaultTimeout((-1));
        discardUDPClient35.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress41 = discardUDPClient35.getLocalAddress();
        discardUDPClient32.open(0, inetAddress41);
        discardUDPClient12.send(byteArray31, inetAddress41);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient45 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient45.open();
        discardUDPClient45.setDefaultTimeout((-1));
        discardUDPClient45.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress51 = discardUDPClient45.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray31, (int) (short) -1, inetAddress51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(inetAddress41);
        org.junit.Assert.assertNotNull(inetAddress51);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean9 = discardUDPClient8.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress17 = discardUDPClient11.getLocalAddress();
        discardUDPClient8.open(0, inetAddress17);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inetAddress17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        boolean boolean3 = discardTCPClient0.isAvailable();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        java.nio.charset.Charset charset22 = discardUDPClient6.getCharset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean27 = discardUDPClient26.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient29 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient29.open();
        discardUDPClient29.setDefaultTimeout((-1));
        discardUDPClient29.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress35 = discardUDPClient29.getLocalAddress();
        discardUDPClient26.open(0, inetAddress35);
        discardUDPClient6.send(byteArray25, inetAddress35);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", 100, inetAddress35, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(inetAddress35);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setDefaultTimeout(0);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.open();
        discardUDPClient7.setDefaultTimeout((-1));
        discardUDPClient7.setSoTimeout((int) ' ');
        int int13 = discardUDPClient7.getSoTimeout();
        java.nio.charset.Charset charset14 = discardUDPClient7.getCharset();
        int int15 = discardUDPClient7.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        int int22 = discardUDPClient16.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        java.nio.charset.Charset charset30 = discardUDPClient23.getCharset();
        discardUDPClient16.setCharset(charset30);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory32 = null;
        discardUDPClient16.setDatagramSocketFactory(datagramSocketFactory32);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        int int47 = discardUDPClient41.getSoTimeout();
        java.nio.charset.Charset charset48 = discardUDPClient41.getCharset();
        discardUDPClient34.setCharset(charset48);
        java.nio.charset.Charset charset50 = discardUDPClient34.getCharset();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient54 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean55 = discardUDPClient54.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient57 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient57.open();
        discardUDPClient57.setDefaultTimeout((-1));
        discardUDPClient57.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress63 = discardUDPClient57.getLocalAddress();
        discardUDPClient54.open(0, inetAddress63);
        discardUDPClient34.send(byteArray53, inetAddress63);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient66 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean67 = discardUDPClient66.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient69 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient69.open();
        discardUDPClient69.setDefaultTimeout((-1));
        discardUDPClient69.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress75 = discardUDPClient69.getLocalAddress();
        discardUDPClient66.open(0, inetAddress75);
        discardUDPClient16.send(byteArray53, inetAddress75);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient78 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean79 = discardUDPClient78.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient81 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient81.open();
        discardUDPClient81.setDefaultTimeout((-1));
        discardUDPClient81.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress87 = discardUDPClient81.getLocalAddress();
        discardUDPClient78.open(0, inetAddress87);
        discardUDPClient7.send(byteArray53, inetAddress87);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress87, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(inetAddress63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(inetAddress75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(inetAddress87);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = discardTCPClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        boolean boolean8 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.open();
        java.net.InetAddress inetAddress20 = discardUDPClient17.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) '4', inetAddress20);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(inetAddress20);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        java.net.Socket socket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = discardTCPClient0.verifyRemote(socket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        byte[] byteArray6 = new byte[] { (byte) 10 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.open();
        discardUDPClient7.setDefaultTimeout((-1));
        discardUDPClient7.setSoTimeout((int) ' ');
        int int13 = discardUDPClient7.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient14 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient14.open();
        discardUDPClient14.setDefaultTimeout((-1));
        discardUDPClient14.setSoTimeout((int) ' ');
        int int20 = discardUDPClient14.getSoTimeout();
        java.nio.charset.Charset charset21 = discardUDPClient14.getCharset();
        discardUDPClient7.setCharset(charset21);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory23 = null;
        discardUDPClient7.setDatagramSocketFactory(datagramSocketFactory23);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient32 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient32.open();
        discardUDPClient32.setDefaultTimeout((-1));
        discardUDPClient32.setSoTimeout((int) ' ');
        int int38 = discardUDPClient32.getSoTimeout();
        java.nio.charset.Charset charset39 = discardUDPClient32.getCharset();
        discardUDPClient25.setCharset(charset39);
        java.nio.charset.Charset charset41 = discardUDPClient25.getCharset();
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient45 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean46 = discardUDPClient45.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient48 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient48.open();
        discardUDPClient48.setDefaultTimeout((-1));
        discardUDPClient48.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress54 = discardUDPClient48.getLocalAddress();
        discardUDPClient45.open(0, inetAddress54);
        discardUDPClient25.send(byteArray44, inetAddress54);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient57 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean58 = discardUDPClient57.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient60 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient60.open();
        discardUDPClient60.setDefaultTimeout((-1));
        discardUDPClient60.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress66 = discardUDPClient60.getLocalAddress();
        discardUDPClient57.open(0, inetAddress66);
        discardUDPClient7.send(byteArray44, inetAddress66);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray6, inetAddress66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(inetAddress54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(inetAddress66);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = discardTCPClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        discardUDPClient0.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory22 = null;
        discardUDPClient6.setDatagramSocketFactory(datagramSocketFactory22);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient24.open();
        discardUDPClient24.setDefaultTimeout((-1));
        discardUDPClient24.setSoTimeout((int) ' ');
        int int30 = discardUDPClient24.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        int int37 = discardUDPClient31.getSoTimeout();
        java.nio.charset.Charset charset38 = discardUDPClient31.getCharset();
        discardUDPClient24.setCharset(charset38);
        java.nio.charset.Charset charset40 = discardUDPClient24.getCharset();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient44 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean45 = discardUDPClient44.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient47.open();
        discardUDPClient47.setDefaultTimeout((-1));
        discardUDPClient47.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress53 = discardUDPClient47.getLocalAddress();
        discardUDPClient44.open(0, inetAddress53);
        discardUDPClient24.send(byteArray43, inetAddress53);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient56 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean57 = discardUDPClient56.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient59.open();
        discardUDPClient59.setDefaultTimeout((-1));
        discardUDPClient59.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress65 = discardUDPClient59.getLocalAddress();
        discardUDPClient56.open(0, inetAddress65);
        discardUDPClient6.send(byteArray43, inetAddress65);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient69 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient69.open();
        discardUDPClient69.open();
        java.net.InetAddress inetAddress72 = discardUDPClient69.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray43, (int) (byte) 100, inetAddress72, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(inetAddress53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(inetAddress65);
        org.junit.Assert.assertNotNull(inetAddress72);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        discardUDPClient0.setSoTimeout(0);
        int int9 = discardUDPClient0.getLocalPort();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 42718 + "'", int9 == 42718);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        java.io.OutputStream outputStream10 = discardTCPClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNull(outputStream10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.lang.String str9 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.Class<?> wildcardClass8 = discardTCPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient18.getCharset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean39 = discardUDPClient38.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress47 = discardUDPClient41.getLocalAddress();
        discardUDPClient38.open(0, inetAddress47);
        discardUDPClient18.send(byteArray37, inetAddress47);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient0.send(byteArray37, inetAddress59);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient62.open();
        discardUDPClient62.setDefaultTimeout((-1));
        discardUDPClient62.setSoTimeout((int) ' ');
        int int68 = discardUDPClient62.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient69 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient69.open();
        discardUDPClient69.setDefaultTimeout((-1));
        discardUDPClient69.setSoTimeout((int) ' ');
        int int75 = discardUDPClient69.getSoTimeout();
        java.nio.charset.Charset charset76 = discardUDPClient69.getCharset();
        discardUDPClient62.setCharset(charset76);
        java.nio.charset.Charset charset78 = discardUDPClient62.getCharset();
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient82 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean83 = discardUDPClient82.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient85 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient85.open();
        discardUDPClient85.setDefaultTimeout((-1));
        discardUDPClient85.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress91 = discardUDPClient85.getLocalAddress();
        discardUDPClient82.open(0, inetAddress91);
        discardUDPClient62.send(byteArray81, inetAddress91);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient94 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient94.open();
        discardUDPClient94.open();
        java.net.InetAddress inetAddress97 = discardUDPClient94.getLocalAddress();
        discardUDPClient0.send(byteArray81, inetAddress97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inetAddress47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 32 + "'", int75 == 32);
        org.junit.Assert.assertNotNull(charset76);
        org.junit.Assert.assertNotNull(charset78);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(inetAddress91);
        org.junit.Assert.assertNotNull(inetAddress97);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient2 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient2.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy5 = null;
        discardTCPClient2.setProxy(proxy5);
        discardTCPClient2.setSendBufferSize(100);
        discardTCPClient2.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory11 = discardTCPClient2.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory11);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean14 = discardUDPClient13.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress22 = discardUDPClient16.getLocalAddress();
        discardUDPClient13.open(0, inetAddress22);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(inetAddress22);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient4 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient4.open();
        discardUDPClient4.setDefaultTimeout((-1));
        discardUDPClient4.setSoTimeout((int) ' ');
        int int10 = discardUDPClient4.getSoTimeout();
        java.nio.charset.Charset charset11 = discardUDPClient4.getCharset();
        int int12 = discardUDPClient4.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient20.open();
        discardUDPClient20.setDefaultTimeout((-1));
        discardUDPClient20.setSoTimeout((int) ' ');
        int int26 = discardUDPClient20.getSoTimeout();
        java.nio.charset.Charset charset27 = discardUDPClient20.getCharset();
        discardUDPClient13.setCharset(charset27);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory29 = null;
        discardUDPClient13.setDatagramSocketFactory(datagramSocketFactory29);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        int int37 = discardUDPClient31.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient38.open();
        discardUDPClient38.setDefaultTimeout((-1));
        discardUDPClient38.setSoTimeout((int) ' ');
        int int44 = discardUDPClient38.getSoTimeout();
        java.nio.charset.Charset charset45 = discardUDPClient38.getCharset();
        discardUDPClient31.setCharset(charset45);
        java.nio.charset.Charset charset47 = discardUDPClient31.getCharset();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient51 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean52 = discardUDPClient51.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient54 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient54.open();
        discardUDPClient54.setDefaultTimeout((-1));
        discardUDPClient54.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress60 = discardUDPClient54.getLocalAddress();
        discardUDPClient51.open(0, inetAddress60);
        discardUDPClient31.send(byteArray50, inetAddress60);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient63 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean64 = discardUDPClient63.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient66 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient66.open();
        discardUDPClient66.setDefaultTimeout((-1));
        discardUDPClient66.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress72 = discardUDPClient66.getLocalAddress();
        discardUDPClient63.open(0, inetAddress72);
        discardUDPClient13.send(byteArray50, inetAddress72);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient75 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean76 = discardUDPClient75.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient78 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient78.open();
        discardUDPClient78.setDefaultTimeout((-1));
        discardUDPClient78.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress84 = discardUDPClient78.getLocalAddress();
        discardUDPClient75.open(0, inetAddress84);
        discardUDPClient4.send(byteArray50, inetAddress84);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", (int) ' ', inetAddress84, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(inetAddress60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(inetAddress72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(inetAddress84);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.setDefaultTimeout(0);
        discardUDPClient5.setDefaultTimeout((int) (short) 1);
        java.lang.String str10 = discardUDPClient5.getCharsetName();
        discardUDPClient5.open();
        java.time.Duration duration12 = discardUDPClient5.getSoTimeoutDuration();
        discardUDPClient0.setDefaultTimeout(duration12);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        int int3 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress3 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient18.getCharset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean39 = discardUDPClient38.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress47 = discardUDPClient41.getLocalAddress();
        discardUDPClient38.open(0, inetAddress47);
        discardUDPClient18.send(byteArray37, inetAddress47);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient0.send(byteArray37, inetAddress59);
        java.lang.String str62 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory63 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory63);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inetAddress47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTF-8" + "'", str62, "UTF-8");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultPort();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = discardTCPClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
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
        int int17 = discardUDPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean20 = discardUDPClient19.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.setDefaultTimeout((-1));
        discardUDPClient22.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress28 = discardUDPClient22.getLocalAddress();
        discardUDPClient19.open(0, inetAddress28);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) 'a', inetAddress28);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(inetAddress28);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(9);
        int int4 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = discardUDPClient0.getCharset();
        int int8 = discardUDPClient0.getSoTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        int int7 = discardUDPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        int int3 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        boolean boolean9 = discardTCPClient0.isConnected();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((-1));
        boolean boolean9 = discardTCPClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener4 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) 'a');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        int int9 = discardUDPClient3.getSoTimeout();
        java.nio.charset.Charset charset10 = discardUDPClient3.getCharset();
        int int11 = discardUDPClient3.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = discardUDPClient19.getCharset();
        discardUDPClient12.setCharset(charset26);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory28 = null;
        discardUDPClient12.setDatagramSocketFactory(datagramSocketFactory28);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient30.open();
        discardUDPClient30.setDefaultTimeout((-1));
        discardUDPClient30.setSoTimeout((int) ' ');
        int int36 = discardUDPClient30.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient37 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient37.open();
        discardUDPClient37.setDefaultTimeout((-1));
        discardUDPClient37.setSoTimeout((int) ' ');
        int int43 = discardUDPClient37.getSoTimeout();
        java.nio.charset.Charset charset44 = discardUDPClient37.getCharset();
        discardUDPClient30.setCharset(charset44);
        java.nio.charset.Charset charset46 = discardUDPClient30.getCharset();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient30.send(byteArray49, inetAddress59);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean63 = discardUDPClient62.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient65 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient65.open();
        discardUDPClient65.setDefaultTimeout((-1));
        discardUDPClient65.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress71 = discardUDPClient65.getLocalAddress();
        discardUDPClient62.open(0, inetAddress71);
        discardUDPClient12.send(byteArray49, inetAddress71);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient74 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean75 = discardUDPClient74.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient77 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient77.open();
        discardUDPClient77.setDefaultTimeout((-1));
        discardUDPClient77.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress83 = discardUDPClient77.getLocalAddress();
        discardUDPClient74.open(0, inetAddress83);
        discardUDPClient3.send(byteArray49, inetAddress83);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient87 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient87.open();
        discardUDPClient87.open();
        java.net.InetAddress inetAddress90 = discardUDPClient87.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray49, (int) 'a', inetAddress90, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(inetAddress71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(inetAddress83);
        org.junit.Assert.assertNotNull(inetAddress90);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        int int10 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress11 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress6 = discardTCPClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.lang.String str4 = discardUDPClient0.getCharsetName();
        boolean boolean5 = discardUDPClient0.isOpen();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        discardUDPClient0.close();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        java.net.Socket socket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = discardTCPClient0.verifyRemote(socket3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        java.net.Socket socket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = discardTCPClient0.verifyRemote(socket3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean17 = discardUDPClient16.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress25 = discardUDPClient19.getLocalAddress();
        discardUDPClient16.open(0, inetAddress25);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress25, 1);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(inetAddress25);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        java.nio.charset.Charset charset5 = discardUDPClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory15 = null;
        discardTCPClient0.setSocketFactory(socketFactory15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        java.nio.charset.Charset charset5 = discardUDPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        java.nio.charset.Charset charset22 = discardUDPClient6.getCharset();
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean27 = discardUDPClient26.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient29 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient29.open();
        discardUDPClient29.setDefaultTimeout((-1));
        discardUDPClient29.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress35 = discardUDPClient29.getLocalAddress();
        discardUDPClient26.open(0, inetAddress35);
        discardUDPClient6.send(byteArray25, inetAddress35);
        java.net.InetAddress inetAddress39 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray25, 1, inetAddress39, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(inetAddress35);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        boolean boolean5 = discardUDPClient0.isOpen();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory6 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.Duration duration8 = discardUDPClient0.getSoTimeoutDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress5 = discardUDPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
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
        int int17 = discardUDPClient0.getDefaultTimeout();
        discardUDPClient0.close();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        java.lang.String str3 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory4 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = discardTCPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        byte[] byteArray5 = new byte[] {};
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        java.nio.charset.Charset charset13 = discardUDPClient6.getCharset();
        int int14 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        int int21 = discardUDPClient15.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.setDefaultTimeout((-1));
        discardUDPClient22.setSoTimeout((int) ' ');
        int int28 = discardUDPClient22.getSoTimeout();
        java.nio.charset.Charset charset29 = discardUDPClient22.getCharset();
        discardUDPClient15.setCharset(charset29);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory31 = null;
        discardUDPClient15.setDatagramSocketFactory(datagramSocketFactory31);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient33 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient33.open();
        discardUDPClient33.setDefaultTimeout((-1));
        discardUDPClient33.setSoTimeout((int) ' ');
        int int39 = discardUDPClient33.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient40 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient40.open();
        discardUDPClient40.setDefaultTimeout((-1));
        discardUDPClient40.setSoTimeout((int) ' ');
        int int46 = discardUDPClient40.getSoTimeout();
        java.nio.charset.Charset charset47 = discardUDPClient40.getCharset();
        discardUDPClient33.setCharset(charset47);
        java.nio.charset.Charset charset49 = discardUDPClient33.getCharset();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean54 = discardUDPClient53.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient56 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient56.open();
        discardUDPClient56.setDefaultTimeout((-1));
        discardUDPClient56.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress62 = discardUDPClient56.getLocalAddress();
        discardUDPClient53.open(0, inetAddress62);
        discardUDPClient33.send(byteArray52, inetAddress62);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient65 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean66 = discardUDPClient65.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient68 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient68.open();
        discardUDPClient68.setDefaultTimeout((-1));
        discardUDPClient68.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress74 = discardUDPClient68.getLocalAddress();
        discardUDPClient65.open(0, inetAddress74);
        discardUDPClient15.send(byteArray52, inetAddress74);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient77 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean78 = discardUDPClient77.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient80 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient80.open();
        discardUDPClient80.setDefaultTimeout((-1));
        discardUDPClient80.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress86 = discardUDPClient80.getLocalAddress();
        discardUDPClient77.open(0, inetAddress86);
        discardUDPClient6.send(byteArray52, inetAddress86);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray5, inetAddress86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(inetAddress62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(inetAddress74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(inetAddress86);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", 32);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress15 = discardUDPClient9.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.open();
        java.net.InetAddress inetAddress20 = discardUDPClient17.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress15, (-1), inetAddress20, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertNotNull(inetAddress15);
        org.junit.Assert.assertNotNull(inetAddress20);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress12 = discardUDPClient6.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient14 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient14.open();
        discardUDPClient14.open();
        java.net.InetAddress inetAddress17 = discardUDPClient14.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress12, (int) '#', inetAddress17, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(inetAddress12);
        org.junit.Assert.assertNotNull(inetAddress17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.setDefaultTimeout((int) 'a');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        int int15 = discardUDPClient9.getSoTimeout();
        java.nio.charset.Charset charset16 = null;
        discardUDPClient9.setCharset(charset16);
        java.nio.charset.Charset charset18 = discardUDPClient9.getCharset();
        java.time.Duration duration19 = discardUDPClient9.getSoTimeoutDuration();
        discardUDPClient6.setDefaultTimeout(duration19);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout(duration19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNull(charset18);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        boolean boolean5 = discardUDPClient0.isOpen();
        boolean boolean6 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        int int14 = discardUDPClient8.getSoTimeout();
        java.nio.charset.Charset charset15 = discardUDPClient8.getCharset();
        int int16 = discardUDPClient8.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.setDefaultTimeout((-1));
        discardUDPClient17.setSoTimeout((int) ' ');
        int int23 = discardUDPClient17.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient24.open();
        discardUDPClient24.setDefaultTimeout((-1));
        discardUDPClient24.setSoTimeout((int) ' ');
        int int30 = discardUDPClient24.getSoTimeout();
        java.nio.charset.Charset charset31 = discardUDPClient24.getCharset();
        discardUDPClient17.setCharset(charset31);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory33 = null;
        discardUDPClient17.setDatagramSocketFactory(datagramSocketFactory33);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient35 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient35.open();
        discardUDPClient35.setDefaultTimeout((-1));
        discardUDPClient35.setSoTimeout((int) ' ');
        int int41 = discardUDPClient35.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient42 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient42.open();
        discardUDPClient42.setDefaultTimeout((-1));
        discardUDPClient42.setSoTimeout((int) ' ');
        int int48 = discardUDPClient42.getSoTimeout();
        java.nio.charset.Charset charset49 = discardUDPClient42.getCharset();
        discardUDPClient35.setCharset(charset49);
        java.nio.charset.Charset charset51 = discardUDPClient35.getCharset();
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient55 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean56 = discardUDPClient55.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient58 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient58.open();
        discardUDPClient58.setDefaultTimeout((-1));
        discardUDPClient58.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress64 = discardUDPClient58.getLocalAddress();
        discardUDPClient55.open(0, inetAddress64);
        discardUDPClient35.send(byteArray54, inetAddress64);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient67 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean68 = discardUDPClient67.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient70 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient70.open();
        discardUDPClient70.setDefaultTimeout((-1));
        discardUDPClient70.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress76 = discardUDPClient70.getLocalAddress();
        discardUDPClient67.open(0, inetAddress76);
        discardUDPClient17.send(byteArray54, inetAddress76);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient79 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean80 = discardUDPClient79.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient82 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient82.open();
        discardUDPClient82.setDefaultTimeout((-1));
        discardUDPClient82.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress88 = discardUDPClient82.getLocalAddress();
        discardUDPClient79.open(0, inetAddress88);
        discardUDPClient8.send(byteArray54, inetAddress88);
        discardUDPClient0.open(0, inetAddress88);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(charset51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(inetAddress64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(inetAddress76);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(inetAddress88);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((-1));
        discardTCPClient0.setConnectTimeout((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.time.Duration duration10 = discardUDPClient0.getSoTimeoutDuration();
        discardUDPClient0.close();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory15 = null;
        discardTCPClient0.setSocketFactory(socketFactory15);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress17 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        discardUDPClient5.setCharset(charset19);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory21 = null;
        discardUDPClient5.setDatagramSocketFactory(datagramSocketFactory21);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient30.open();
        discardUDPClient30.setDefaultTimeout((-1));
        discardUDPClient30.setSoTimeout((int) ' ');
        int int36 = discardUDPClient30.getSoTimeout();
        java.nio.charset.Charset charset37 = discardUDPClient30.getCharset();
        discardUDPClient23.setCharset(charset37);
        java.nio.charset.Charset charset39 = discardUDPClient23.getCharset();
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient43 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean44 = discardUDPClient43.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient46 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient46.open();
        discardUDPClient46.setDefaultTimeout((-1));
        discardUDPClient46.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress52 = discardUDPClient46.getLocalAddress();
        discardUDPClient43.open(0, inetAddress52);
        discardUDPClient23.send(byteArray42, inetAddress52);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient55 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean56 = discardUDPClient55.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient58 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient58.open();
        discardUDPClient58.setDefaultTimeout((-1));
        discardUDPClient58.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress64 = discardUDPClient58.getLocalAddress();
        discardUDPClient55.open(0, inetAddress64);
        discardUDPClient5.send(byteArray42, inetAddress64);
        java.time.Duration duration67 = discardUDPClient5.getSoTimeoutDuration();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout(duration67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(inetAddress52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(inetAddress64);
        org.junit.Assert.assertNotNull(duration67);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
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
        int int17 = discardUDPClient0.getDefaultTimeout();
        int int18 = discardUDPClient0.getLocalPort();
        java.time.Duration duration19 = discardUDPClient0.getSoTimeoutDuration();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56373 + "'", int18 == 56373);
        org.junit.Assert.assertNotNull(duration19);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        boolean boolean5 = discardUDPClient0.isOpen();
        discardUDPClient0.setDefaultTimeout(32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        javax.net.ServerSocketFactory serverSocketFactory5 = discardTCPClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        discardTCPClient0.setSendBufferSize(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.SocketFactory socketFactory10 = null;
        discardTCPClient0.setSocketFactory(socketFactory10);
        boolean boolean12 = discardTCPClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress11 = discardUDPClient0.getLocalAddress();
        java.time.Duration duration12 = discardUDPClient0.getSoTimeoutDuration();
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(inetAddress11);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        java.net.Proxy proxy7 = discardTCPClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.lang.String str9 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient7.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy10 = null;
        discardTCPClient7.setProxy(proxy10);
        discardTCPClient7.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory14 = discardTCPClient7.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory14);
        java.lang.Class<?> wildcardClass16 = discardTCPClient0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = discardTCPClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.net.Socket socket1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = discardTCPClient0.verifyRemote(socket1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        int int10 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) '4');
        discardTCPClient0.setDefaultPort(56373);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        int int11 = discardTCPClient0.getDefaultTimeout();
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setSoTimeout((int) (short) 1);
        org.junit.Assert.assertNotNull(inetAddress6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient18.getCharset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean39 = discardUDPClient38.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress47 = discardUDPClient41.getLocalAddress();
        discardUDPClient38.open(0, inetAddress47);
        discardUDPClient18.send(byteArray37, inetAddress47);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient0.send(byteArray37, inetAddress59);
        java.lang.Class<?> wildcardClass62 = inetAddress59.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inetAddress47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean21 = discardUDPClient20.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress29 = discardUDPClient23.getLocalAddress();
        discardUDPClient20.open(0, inetAddress29);
        discardUDPClient0.send(byteArray19, inetAddress29);
        boolean boolean32 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inetAddress29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient7.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy10 = null;
        discardTCPClient7.setProxy(proxy10);
        discardTCPClient7.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory14 = discardTCPClient7.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory14);
        java.net.Socket socket16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = discardTCPClient0.verifyRemote(socket16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str7 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = discardTCPClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setDefaultPort(0);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        int int7 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        int int10 = discardUDPClient0.getSoTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setDefaultPort(0);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setDefaultPort(0);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.open();
        java.net.InetAddress inetAddress14 = discardUDPClient11.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(inetAddress14);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory15 = null;
        discardTCPClient0.setSocketFactory(socketFactory15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = discardTCPClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient18.getCharset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean39 = discardUDPClient38.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress47 = discardUDPClient41.getLocalAddress();
        discardUDPClient38.open(0, inetAddress47);
        discardUDPClient18.send(byteArray37, inetAddress47);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient0.send(byteArray37, inetAddress59);
        java.lang.String str62 = discardUDPClient0.getCharsetName();
        byte[] byteArray63 = new byte[] {};
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient65 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient65.open();
        discardUDPClient65.open();
        java.net.InetAddress inetAddress68 = discardUDPClient65.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray63, 56682, inetAddress68, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inetAddress47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTF-8" + "'", str62, "UTF-8");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[]");
        org.junit.Assert.assertNotNull(inetAddress68);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        int int14 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        int int21 = discardUDPClient15.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.setDefaultTimeout((-1));
        discardUDPClient22.setSoTimeout((int) ' ');
        int int28 = discardUDPClient22.getSoTimeout();
        java.nio.charset.Charset charset29 = discardUDPClient22.getCharset();
        discardUDPClient15.setCharset(charset29);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory31 = null;
        discardUDPClient15.setDatagramSocketFactory(datagramSocketFactory31);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient33 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient33.open();
        discardUDPClient33.setDefaultTimeout((-1));
        discardUDPClient33.setSoTimeout((int) ' ');
        int int39 = discardUDPClient33.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient40 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient40.open();
        discardUDPClient40.setDefaultTimeout((-1));
        discardUDPClient40.setSoTimeout((int) ' ');
        int int46 = discardUDPClient40.getSoTimeout();
        java.nio.charset.Charset charset47 = discardUDPClient40.getCharset();
        discardUDPClient33.setCharset(charset47);
        java.nio.charset.Charset charset49 = discardUDPClient33.getCharset();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean54 = discardUDPClient53.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient56 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient56.open();
        discardUDPClient56.setDefaultTimeout((-1));
        discardUDPClient56.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress62 = discardUDPClient56.getLocalAddress();
        discardUDPClient53.open(0, inetAddress62);
        discardUDPClient33.send(byteArray52, inetAddress62);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient65 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean66 = discardUDPClient65.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient68 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient68.open();
        discardUDPClient68.setDefaultTimeout((-1));
        discardUDPClient68.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress74 = discardUDPClient68.getLocalAddress();
        discardUDPClient65.open(0, inetAddress74);
        discardUDPClient15.send(byteArray52, inetAddress74);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient77 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean78 = discardUDPClient77.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient80 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient80.open();
        discardUDPClient80.setDefaultTimeout((-1));
        discardUDPClient80.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress86 = discardUDPClient80.getLocalAddress();
        discardUDPClient77.open(0, inetAddress86);
        discardUDPClient6.send(byteArray52, inetAddress86);
        java.net.InetAddress inetAddress89 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray52, inetAddress89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(charset29);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(charset47);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(inetAddress62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(inetAddress74);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(inetAddress86);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        int int15 = discardUDPClient9.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        int int22 = discardUDPClient16.getSoTimeout();
        java.nio.charset.Charset charset23 = discardUDPClient16.getCharset();
        discardUDPClient9.setCharset(charset23);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory25 = null;
        discardUDPClient9.setDatagramSocketFactory(datagramSocketFactory25);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        int int33 = discardUDPClient27.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        java.nio.charset.Charset charset41 = discardUDPClient34.getCharset();
        discardUDPClient27.setCharset(charset41);
        java.nio.charset.Charset charset43 = discardUDPClient27.getCharset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean48 = discardUDPClient47.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient50.open();
        discardUDPClient50.setDefaultTimeout((-1));
        discardUDPClient50.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress56 = discardUDPClient50.getLocalAddress();
        discardUDPClient47.open(0, inetAddress56);
        discardUDPClient27.send(byteArray46, inetAddress56);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean60 = discardUDPClient59.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient62.open();
        discardUDPClient62.setDefaultTimeout((-1));
        discardUDPClient62.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress68 = discardUDPClient62.getLocalAddress();
        discardUDPClient59.open(0, inetAddress68);
        discardUDPClient9.send(byteArray46, inetAddress68);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", 43331, inetAddress68, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(inetAddress56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(inetAddress68);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             discardUDPClient0.open(60000);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        java.io.OutputStream outputStream15 = discardTCPClient0.getOutputStream();
        boolean boolean16 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(outputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        int int5 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
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
        int int13 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        java.time.Duration duration7 = discardUDPClient0.getSoTimeoutDuration();
        java.time.Duration duration8 = discardUDPClient0.getSoTimeoutDuration();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory9 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        discardTCPClient0.setDefaultTimeout(43331);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = discardUDPClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        boolean boolean3 = discardTCPClient0.isAvailable();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient4 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient4.open();
        discardUDPClient4.setDefaultTimeout((-1));
        discardUDPClient4.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress10 = discardUDPClient4.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress10, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inetAddress10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = discardTCPClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        int int18 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = null;
        discardUDPClient19.setCharset(charset26);
        java.nio.charset.Charset charset28 = discardUDPClient19.getCharset();
        java.time.Duration duration29 = discardUDPClient19.getSoTimeoutDuration();
        discardUDPClient0.setDefaultTimeout(duration29);
        discardUDPClient0.setSoTimeout(56373);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(charset28);
        org.junit.Assert.assertNotNull(duration29);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory11 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory11);
        int int13 = discardUDPClient0.getLocalPort();
        org.junit.Assert.assertNotNull(inetAddress6);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 42943 + "'", int13 == 42943);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(10);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        java.net.Proxy proxy8 = discardTCPClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        java.lang.String str17 = discardUDPClient0.getCharsetName();
        boolean boolean18 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-8" + "'", str17, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = discardTCPClient0.getServerSocketFactory();
        java.lang.Class<?> wildcardClass5 = serverSocketFactory4.getClass();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.close();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str7 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.setDefaultTimeout((-1));
        discardUDPClient17.setSoTimeout((int) ' ');
        int int23 = discardUDPClient17.getSoTimeout();
        java.nio.charset.Charset charset24 = discardUDPClient17.getCharset();
        discardUDPClient10.setCharset(charset24);
        java.nio.charset.Charset charset26 = discardUDPClient10.getCharset();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean31 = discardUDPClient30.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient33 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient33.open();
        discardUDPClient33.setDefaultTimeout((-1));
        discardUDPClient33.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress39 = discardUDPClient33.getLocalAddress();
        discardUDPClient30.open(0, inetAddress39);
        discardUDPClient10.send(byteArray29, inetAddress39);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", (int) (short) -1, inetAddress39, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(inetAddress39);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isAvailable();
        java.lang.String str3 = discardTCPClient0.getCharsetName();
        int int4 = discardTCPClient0.getDefaultPort();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((-1));
        discardTCPClient0.setConnectTimeout(42943);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        java.lang.Class<?> wildcardClass10 = serverSocketFactory9.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        int int6 = discardTCPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.setDefaultTimeout(0);
        discardUDPClient7.setDefaultTimeout((int) (short) 1);
        java.lang.String str12 = discardUDPClient7.getCharsetName();
        discardUDPClient7.open();
        discardUDPClient7.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.open();
        java.net.InetAddress inetAddress19 = discardUDPClient16.getLocalAddress();
        discardUDPClient7.open(0, inetAddress19);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        java.net.InetAddress inetAddress24 = discardUDPClient22.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress19, (int) (short) -1, inetAddress24, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress19);
        org.junit.Assert.assertNotNull(inetAddress24);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory15 = null;
        discardTCPClient0.setSocketFactory(socketFactory15);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = discardTCPClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = discardUDPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.setDefaultTimeout((int) (short) 1);
        discardUDPClient8.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.setDefaultTimeout(0);
        discardUDPClient13.setDefaultTimeout((int) (short) 1);
        java.lang.String str18 = discardUDPClient13.getCharsetName();
        discardUDPClient13.open();
        java.time.Duration duration20 = discardUDPClient13.getSoTimeoutDuration();
        discardUDPClient8.setDefaultTimeout(duration20);
        discardUDPClient0.setSoTimeout(duration20);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-8" + "'", str18, "UTF-8");
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        java.net.Proxy proxy2 = discardTCPClient0.getProxy();
        org.junit.Assert.assertNull(proxy2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isConnected();
        discardTCPClient0.setSendBufferSize(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        boolean boolean5 = discardUDPClient0.isOpen();
        boolean boolean6 = discardUDPClient0.isOpen();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray12, (int) (short) 100, inetAddress14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 1, 0, 10, -1]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        int int10 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) '4');
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress9 = discardTCPClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        discardTCPClient0.setSendBufferSize((int) '#');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        int int17 = discardUDPClient11.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        java.nio.charset.Charset charset25 = discardUDPClient18.getCharset();
        discardUDPClient11.setCharset(charset25);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory27 = null;
        discardUDPClient11.setDatagramSocketFactory(datagramSocketFactory27);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient29 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient29.open();
        discardUDPClient29.setDefaultTimeout((-1));
        discardUDPClient29.setSoTimeout((int) ' ');
        int int35 = discardUDPClient29.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient36 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient36.open();
        discardUDPClient36.setDefaultTimeout((-1));
        discardUDPClient36.setSoTimeout((int) ' ');
        int int42 = discardUDPClient36.getSoTimeout();
        java.nio.charset.Charset charset43 = discardUDPClient36.getCharset();
        discardUDPClient29.setCharset(charset43);
        java.nio.charset.Charset charset45 = discardUDPClient29.getCharset();
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient49 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean50 = discardUDPClient49.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient52 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient52.open();
        discardUDPClient52.setDefaultTimeout((-1));
        discardUDPClient52.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress58 = discardUDPClient52.getLocalAddress();
        discardUDPClient49.open(0, inetAddress58);
        discardUDPClient29.send(byteArray48, inetAddress58);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient61 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean62 = discardUDPClient61.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient64 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient64.open();
        discardUDPClient64.setDefaultTimeout((-1));
        discardUDPClient64.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress70 = discardUDPClient64.getLocalAddress();
        discardUDPClient61.open(0, inetAddress70);
        discardUDPClient11.send(byteArray48, inetAddress70);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(inetAddress58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(inetAddress70);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        discardTCPClient0.setDefaultTimeout((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        int int5 = discardTCPClient0.getDefaultPort();
        java.io.OutputStream outputStream6 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy7 = discardTCPClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNull(outputStream6);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.io.OutputStream outputStream2 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNull(outputStream2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.Class<?> wildcardClass3 = discardUDPClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient2 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient2.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy5 = null;
        discardTCPClient2.setProxy(proxy5);
        discardTCPClient2.setSendBufferSize(100);
        discardTCPClient2.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory11 = discardTCPClient2.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
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
        int int17 = discardUDPClient0.getDefaultTimeout();
        int int18 = discardUDPClient0.getLocalPort();
        int int19 = discardUDPClient0.getSoTimeout();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47200 + "'", int18 == 47200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.SocketFactory socketFactory10 = null;
        discardTCPClient0.setSocketFactory(socketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        int int14 = discardUDPClient8.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        int int21 = discardUDPClient15.getSoTimeout();
        java.nio.charset.Charset charset22 = discardUDPClient15.getCharset();
        discardUDPClient8.setCharset(charset22);
        java.nio.charset.Charset charset24 = discardUDPClient8.getCharset();
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean29 = discardUDPClient28.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress37 = discardUDPClient31.getLocalAddress();
        discardUDPClient28.open(0, inetAddress37);
        discardUDPClient8.send(byteArray27, inetAddress37);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress37, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(inetAddress37);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        discardTCPClient0.setDefaultTimeout((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient9 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int10 = discardTCPClient9.getDefaultPort();
        discardTCPClient9.disconnect();
        java.io.OutputStream outputStream12 = discardTCPClient9.getOutputStream();
        java.io.OutputStream outputStream13 = discardTCPClient9.getOutputStream();
        java.net.Proxy proxy14 = null;
        discardTCPClient9.setProxy(proxy14);
        java.nio.charset.Charset charset16 = discardTCPClient9.getCharset();
        discardTCPClient0.setCharset(charset16);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(outputStream12);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        discardTCPClient0.setReceiveBufferSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        boolean boolean5 = discardUDPClient0.isOpen();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory6 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory6);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory8 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory8);
        discardUDPClient0.setDefaultTimeout((int) (byte) -1);
        boolean boolean12 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        boolean boolean5 = discardUDPClient0.isOpen();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory6 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory6);
        discardUDPClient0.close();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        int int14 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        java.time.Duration duration7 = discardUDPClient0.getSoTimeoutDuration();
        java.time.Duration duration8 = discardUDPClient0.getSoTimeoutDuration();
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory10 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        int int4 = discardUDPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((-1));
        boolean boolean9 = discardTCPClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize((int) (short) -1);
        discardTCPClient0.setReceiveBufferSize(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = discardUDPClient0.getCharset();
        int int8 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory10 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient20.open();
        discardUDPClient20.setDefaultTimeout((-1));
        discardUDPClient20.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress26 = discardUDPClient20.getLocalAddress();
        discardUDPClient20.setDefaultTimeout((int) (byte) 100);
        discardUDPClient20.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress31 = discardUDPClient20.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(43331, inetAddress31);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(inetAddress26);
        org.junit.Assert.assertNotNull(inetAddress31);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        java.io.OutputStream outputStream10 = discardTCPClient0.getOutputStream();
        java.lang.Class<?> wildcardClass11 = discardTCPClient0.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNull(outputStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        int int6 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((int) '4');
        int int12 = discardTCPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        discardTCPClient0.setReceiveBufferSize((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(true, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient9 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient9.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy12 = null;
        discardTCPClient9.setProxy(proxy12);
        discardTCPClient9.setSendBufferSize(100);
        discardTCPClient9.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory18 = discardTCPClient9.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory18);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.SocketFactory socketFactory10 = null;
        discardTCPClient0.setSocketFactory(socketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.nio.charset.Charset charset18 = discardUDPClient0.getCharset();
        discardUDPClient0.setSoTimeout((int) (short) 100);
        int int21 = discardUDPClient0.getLocalPort();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40588 + "'", int21 == 40588);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        java.nio.charset.Charset charset2 = discardTCPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.open();
        java.net.InetAddress inetAddress8 = discardUDPClient5.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", 42943, inetAddress8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(inetAddress8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize((int) (short) -1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress12 = discardUDPClient6.getLocalAddress();
        discardUDPClient6.setDefaultTimeout((int) (byte) 100);
        discardUDPClient6.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress17 = discardUDPClient6.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress17);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(inetAddress12);
        org.junit.Assert.assertNotNull(inetAddress17);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        int int3 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient9 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int10 = discardTCPClient9.getDefaultPort();
        discardTCPClient9.disconnect();
        java.io.OutputStream outputStream12 = discardTCPClient9.getOutputStream();
        java.io.OutputStream outputStream13 = discardTCPClient9.getOutputStream();
        java.net.Proxy proxy14 = null;
        discardTCPClient9.setProxy(proxy14);
        java.nio.charset.Charset charset16 = discardTCPClient9.getCharset();
        discardTCPClient0.setCharset(charset16);
        javax.net.SocketFactory socketFactory18 = null;
        discardTCPClient0.setSocketFactory(socketFactory18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(outputStream12);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        discardUDPClient5.setCharset(charset19);
        java.nio.charset.Charset charset21 = discardUDPClient5.getCharset();
        java.nio.charset.Charset charset22 = discardUDPClient5.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient30.open();
        discardUDPClient30.setDefaultTimeout((-1));
        discardUDPClient30.setSoTimeout((int) ' ');
        int int36 = discardUDPClient30.getSoTimeout();
        java.nio.charset.Charset charset37 = discardUDPClient30.getCharset();
        discardUDPClient23.setCharset(charset37);
        discardUDPClient23.setDefaultTimeout((int) (short) 1);
        int int41 = discardUDPClient23.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient42 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient42.open();
        discardUDPClient42.setDefaultTimeout((-1));
        discardUDPClient42.setSoTimeout((int) ' ');
        int int48 = discardUDPClient42.getSoTimeout();
        java.nio.charset.Charset charset49 = null;
        discardUDPClient42.setCharset(charset49);
        java.nio.charset.Charset charset51 = discardUDPClient42.getCharset();
        java.time.Duration duration52 = discardUDPClient42.getSoTimeoutDuration();
        discardUDPClient23.setDefaultTimeout(duration52);
        discardUDPClient5.setDefaultTimeout(duration52);
        discardUDPClient0.setDefaultTimeout(duration52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNull(charset51);
        org.junit.Assert.assertNotNull(duration52);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        java.io.OutputStream outputStream10 = discardTCPClient0.getOutputStream();
        boolean boolean11 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertNull(outputStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        java.lang.String str9 = discardUDPClient0.getCharsetName();
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = discardUDPClient0.getCharset();
        int int8 = discardUDPClient0.getSoTimeout();
        int int9 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean11 = discardUDPClient10.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress19 = discardUDPClient13.getLocalAddress();
        discardUDPClient10.open(0, inetAddress19);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.setDefaultTimeout((-1));
        discardUDPClient22.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress28 = discardUDPClient22.getLocalAddress();
        discardUDPClient10.open((int) (short) 0, inetAddress28);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (short) 100, inetAddress28);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inetAddress19);
        org.junit.Assert.assertNotNull(inetAddress28);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        int int5 = discardTCPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient7.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy10 = null;
        discardTCPClient7.setProxy(proxy10);
        discardTCPClient7.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory14 = discardTCPClient7.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory14);
        discardTCPClient0.setReceiveBufferSize(1);
        discardTCPClient0.setDefaultTimeout(0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        int int15 = discardUDPClient9.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        int int22 = discardUDPClient16.getSoTimeout();
        java.nio.charset.Charset charset23 = discardUDPClient16.getCharset();
        discardUDPClient9.setCharset(charset23);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory25 = null;
        discardUDPClient9.setDatagramSocketFactory(datagramSocketFactory25);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        int int33 = discardUDPClient27.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        java.nio.charset.Charset charset41 = discardUDPClient34.getCharset();
        discardUDPClient27.setCharset(charset41);
        java.nio.charset.Charset charset43 = discardUDPClient27.getCharset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean48 = discardUDPClient47.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient50.open();
        discardUDPClient50.setDefaultTimeout((-1));
        discardUDPClient50.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress56 = discardUDPClient50.getLocalAddress();
        discardUDPClient47.open(0, inetAddress56);
        discardUDPClient27.send(byteArray46, inetAddress56);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean60 = discardUDPClient59.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient62.open();
        discardUDPClient62.setDefaultTimeout((-1));
        discardUDPClient62.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress68 = discardUDPClient62.getLocalAddress();
        discardUDPClient59.open(0, inetAddress68);
        discardUDPClient9.send(byteArray46, inetAddress68);
        java.lang.String str71 = discardUDPClient9.getCharsetName();
        java.nio.charset.Charset charset72 = discardUDPClient9.getCharset();
        discardTCPClient0.setCharset(charset72);
        boolean boolean74 = discardTCPClient0.isConnected();
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(inetAddress56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(inetAddress68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTF-8" + "'", str71, "UTF-8");
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient7.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy10 = null;
        discardTCPClient7.setProxy(proxy10);
        discardTCPClient7.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory14 = discardTCPClient7.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory14);
        discardTCPClient0.setReceiveBufferSize(1);
        discardTCPClient0.setSendBufferSize(56373);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        int int15 = discardUDPClient9.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        int int22 = discardUDPClient16.getSoTimeout();
        java.nio.charset.Charset charset23 = discardUDPClient16.getCharset();
        discardUDPClient9.setCharset(charset23);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory25 = null;
        discardUDPClient9.setDatagramSocketFactory(datagramSocketFactory25);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        int int33 = discardUDPClient27.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        java.nio.charset.Charset charset41 = discardUDPClient34.getCharset();
        discardUDPClient27.setCharset(charset41);
        java.nio.charset.Charset charset43 = discardUDPClient27.getCharset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean48 = discardUDPClient47.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient50.open();
        discardUDPClient50.setDefaultTimeout((-1));
        discardUDPClient50.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress56 = discardUDPClient50.getLocalAddress();
        discardUDPClient47.open(0, inetAddress56);
        discardUDPClient27.send(byteArray46, inetAddress56);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean60 = discardUDPClient59.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient62.open();
        discardUDPClient62.setDefaultTimeout((-1));
        discardUDPClient62.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress68 = discardUDPClient62.getLocalAddress();
        discardUDPClient59.open(0, inetAddress68);
        discardUDPClient9.send(byteArray46, inetAddress68);
        java.lang.String str71 = discardUDPClient9.getCharsetName();
        java.nio.charset.Charset charset72 = discardUDPClient9.getCharset();
        discardTCPClient0.setCharset(charset72);
        java.lang.Class<?> wildcardClass74 = discardTCPClient0.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(inetAddress56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(inetAddress68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTF-8" + "'", str71, "UTF-8");
        org.junit.Assert.assertNotNull(charset72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        discardTCPClient0.setReceiveBufferSize((int) 'a');
        int int10 = discardTCPClient0.getDefaultTimeout();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(56682);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        discardUDPClient0.setDefaultTimeout(56682);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.setDefaultTimeout((int) 'a');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        java.nio.charset.Charset charset17 = null;
        discardUDPClient10.setCharset(charset17);
        java.nio.charset.Charset charset19 = discardUDPClient10.getCharset();
        java.time.Duration duration20 = discardUDPClient10.getSoTimeoutDuration();
        discardUDPClient7.setDefaultTimeout(duration20);
        discardUDPClient0.setSoTimeout(duration20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNull(charset19);
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setReceiveBufferSize(32);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.io.OutputStream outputStream9 = discardTCPClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(outputStream9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize((int) (short) -1);
        discardTCPClient0.setDefaultPort((-1));
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress14 = discardUDPClient8.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.setDefaultTimeout((-1));
        discardUDPClient22.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress28 = discardUDPClient22.getLocalAddress();
        discardUDPClient22.setDefaultTimeout((int) (byte) 100);
        discardUDPClient22.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory33 = null;
        discardUDPClient22.setDatagramSocketFactory(datagramSocketFactory33);
        java.nio.charset.Charset charset35 = discardUDPClient22.getCharset();
        discardUDPClient16.setCharset(charset35);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient42 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient42.setDefaultTimeout(0);
        discardUDPClient42.setDefaultTimeout((int) (short) 1);
        java.lang.String str47 = discardUDPClient42.getCharsetName();
        discardUDPClient42.open();
        discardUDPClient42.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient51 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient51.open();
        discardUDPClient51.open();
        java.net.InetAddress inetAddress54 = discardUDPClient51.getLocalAddress();
        discardUDPClient42.open(0, inetAddress54);
        discardUDPClient16.send(byteArray41, inetAddress54);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress14, 42718, inetAddress54, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(inetAddress14);
        org.junit.Assert.assertNotNull(inetAddress28);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 0, 0, -1]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTF-8" + "'", str47, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress54);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        discardUDPClient0.close();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory12 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        int int4 = discardTCPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int6 = discardTCPClient5.getDefaultPort();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient7.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy10 = null;
        discardTCPClient7.setProxy(proxy10);
        discardTCPClient7.setSendBufferSize(100);
        discardTCPClient7.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory16 = discardTCPClient7.getServerSocketFactory();
        discardTCPClient5.setServerSocketFactory(serverSocketFactory16);
        discardTCPClient0.setServerSocketFactory(serverSocketFactory16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(serverSocketFactory16);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory22 = null;
        discardUDPClient6.setDatagramSocketFactory(datagramSocketFactory22);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient24.open();
        discardUDPClient24.setDefaultTimeout((-1));
        discardUDPClient24.setSoTimeout((int) ' ');
        int int30 = discardUDPClient24.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        int int37 = discardUDPClient31.getSoTimeout();
        java.nio.charset.Charset charset38 = discardUDPClient31.getCharset();
        discardUDPClient24.setCharset(charset38);
        java.nio.charset.Charset charset40 = discardUDPClient24.getCharset();
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient44 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean45 = discardUDPClient44.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient47.open();
        discardUDPClient47.setDefaultTimeout((-1));
        discardUDPClient47.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress53 = discardUDPClient47.getLocalAddress();
        discardUDPClient44.open(0, inetAddress53);
        discardUDPClient24.send(byteArray43, inetAddress53);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient56 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean57 = discardUDPClient56.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient59.open();
        discardUDPClient59.setDefaultTimeout((-1));
        discardUDPClient59.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress65 = discardUDPClient59.getLocalAddress();
        discardUDPClient56.open(0, inetAddress65);
        discardUDPClient6.send(byteArray43, inetAddress65);
        java.net.InetAddress inetAddress68 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray43, inetAddress68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(inetAddress53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(inetAddress65);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(10);
        java.net.Proxy proxy9 = null;
        discardTCPClient0.setProxy(proxy9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.setReceiveBufferSize((int) ' ');
        java.net.Socket socket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = discardTCPClient0.verifyRemote(socket8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        boolean boolean4 = discardTCPClient0.isAvailable();
        discardTCPClient0.setConnectTimeout((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        boolean boolean4 = discardTCPClient0.isAvailable();
        int int5 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.open();
        discardUDPClient7.setDefaultTimeout((-1));
        discardUDPClient7.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress13 = discardUDPClient7.getLocalAddress();
        discardUDPClient7.setDefaultTimeout((int) (byte) 100);
        discardUDPClient7.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress18 = discardUDPClient7.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress18);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(inetAddress13);
        org.junit.Assert.assertNotNull(inetAddress18);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        boolean boolean4 = discardTCPClient0.isAvailable();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress17 = discardUDPClient11.getLocalAddress();
        discardUDPClient11.setDefaultTimeout((int) (byte) 100);
        discardUDPClient11.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory22 = null;
        discardUDPClient11.setDatagramSocketFactory(datagramSocketFactory22);
        java.nio.charset.Charset charset24 = discardUDPClient11.getCharset();
        discardUDPClient5.setCharset(charset24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.setDefaultTimeout(0);
        discardUDPClient31.setDefaultTimeout((int) (short) 1);
        java.lang.String str36 = discardUDPClient31.getCharsetName();
        discardUDPClient31.open();
        discardUDPClient31.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient40 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient40.open();
        discardUDPClient40.open();
        java.net.InetAddress inetAddress43 = discardUDPClient40.getLocalAddress();
        discardUDPClient31.open(0, inetAddress43);
        discardUDPClient5.send(byteArray30, inetAddress43);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient47.open();
        discardUDPClient47.setDefaultTimeout((-1));
        discardUDPClient47.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress53 = discardUDPClient47.getLocalAddress();
        discardUDPClient47.setDefaultTimeout((int) (byte) 100);
        discardUDPClient47.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress58 = discardUDPClient47.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress43, 1, inetAddress58, 35);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inetAddress17);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 0, 0, -1]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTF-8" + "'", str36, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress43);
        org.junit.Assert.assertNotNull(inetAddress53);
        org.junit.Assert.assertNotNull(inetAddress58);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener3 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress18 = discardUDPClient12.getLocalAddress();
        discardUDPClient0.open((int) (short) 0, inetAddress18);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient20.close();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.setDefaultTimeout((int) 'a');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = null;
        discardUDPClient25.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient25.getCharset();
        java.time.Duration duration35 = discardUDPClient25.getSoTimeoutDuration();
        discardUDPClient22.setDefaultTimeout(duration35);
        discardUDPClient20.setDefaultTimeout(duration35);
        discardUDPClient0.setSoTimeout(duration35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
        org.junit.Assert.assertNotNull(inetAddress18);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNull(charset34);
        org.junit.Assert.assertNotNull(duration35);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        java.net.Socket socket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = discardTCPClient0.verifyRemote(socket3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.setReceiveBufferSize((int) ' ');
        discardTCPClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress9 = discardUDPClient3.getLocalAddress();
        discardUDPClient0.open(0, inetAddress9);
        boolean boolean11 = discardUDPClient0.isOpen();
        discardUDPClient0.open();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
        java.nio.charset.Charset charset4 = discardUDPClient0.getCharset();
        int int5 = discardUDPClient0.getSoTimeout();
        int int6 = discardUDPClient0.getLocalPort();
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 55336 + "'", int6 == 55336);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(outputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-8" + "'", str14, "UTF-8");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setSendBufferSize(47200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str7 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout((int) (byte) 0);
        int int10 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        int int10 = discardUDPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        int int17 = discardUDPClient11.getSoTimeout();
        java.nio.charset.Charset charset18 = discardUDPClient11.getCharset();
        discardUDPClient0.setCharset(charset18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        java.nio.charset.Charset charset7 = discardTCPClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient7 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient7.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy10 = null;
        discardTCPClient7.setProxy(proxy10);
        discardTCPClient7.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory14 = discardTCPClient7.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory14);
        discardTCPClient0.setReceiveBufferSize(1);
        int int18 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        java.io.OutputStream outputStream15 = discardTCPClient0.getOutputStream();
        boolean boolean16 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(outputStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        java.net.Proxy proxy8 = discardTCPClient0.getProxy();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        int int7 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        java.nio.charset.Charset charset7 = discardTCPClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
        java.lang.String str4 = discardUDPClient0.getCharsetName();
        java.time.Duration duration5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setDefaultTimeout(duration5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory11 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory11);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient13 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset14 = null;
        discardTCPClient13.setCharset(charset14);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient16 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient16.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy19 = null;
        discardTCPClient16.setProxy(proxy19);
        discardTCPClient16.setSendBufferSize(100);
        discardTCPClient16.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory25 = discardTCPClient16.getServerSocketFactory();
        discardTCPClient13.setServerSocketFactory(serverSocketFactory25);
        discardTCPClient13.setDefaultPort((int) 'a');
        boolean boolean29 = discardTCPClient13.isConnected();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient30 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int31 = discardTCPClient30.getDefaultPort();
        discardTCPClient30.disconnect();
        java.io.OutputStream outputStream33 = discardTCPClient30.getOutputStream();
        java.lang.String str34 = discardTCPClient30.getCharsetName();
        java.nio.charset.Charset charset35 = discardTCPClient30.getCharset();
        discardTCPClient13.setCharset(charset35);
        discardUDPClient0.setCharset(charset35);
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(serverSocketFactory25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNull(outputStream33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTF-8" + "'", str34, "UTF-8");
        org.junit.Assert.assertNotNull(charset35);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        discardTCPClient0.setDefaultPort(42943);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        int int3 = discardTCPClient0.getConnectTimeout();
        int int4 = discardTCPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.open();
        discardUDPClient5.setDefaultTimeout((-1));
        discardUDPClient5.setSoTimeout((int) ' ');
        int int11 = discardUDPClient5.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        java.nio.charset.Charset charset19 = discardUDPClient12.getCharset();
        discardUDPClient5.setCharset(charset19);
        boolean boolean21 = discardUDPClient5.isOpen();
        java.net.InetAddress inetAddress22 = discardUDPClient5.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress22, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(inetAddress22);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
        java.nio.charset.Charset charset4 = discardUDPClient0.getCharset();
        int int5 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        java.nio.charset.Charset charset22 = discardUDPClient6.getCharset();
        java.nio.charset.Charset charset23 = discardUDPClient6.getCharset();
        discardUDPClient0.setCharset(charset23);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient26.open();
        discardUDPClient26.setDefaultTimeout((-1));
        discardUDPClient26.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress32 = discardUDPClient26.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(55336, inetAddress32);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(inetAddress32);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        discardUDPClient6.setCharset(charset20);
        boolean boolean22 = discardUDPClient6.isOpen();
        java.net.InetAddress inetAddress23 = discardUDPClient6.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        java.net.InetAddress inetAddress27 = discardUDPClient25.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress23, (int) 'a', inetAddress27, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(inetAddress23);
        org.junit.Assert.assertNotNull(inetAddress27);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(10);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean11 = discardUDPClient10.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress19 = discardUDPClient13.getLocalAddress();
        discardUDPClient10.open(0, inetAddress19);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.setDefaultTimeout((-1));
        discardUDPClient22.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress28 = discardUDPClient22.getLocalAddress();
        discardUDPClient10.open((int) (short) 0, inetAddress28);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress37 = discardUDPClient31.getLocalAddress();
        discardUDPClient31.setDefaultTimeout((int) (byte) 100);
        discardUDPClient31.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress42 = discardUDPClient31.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress28, (int) (byte) 1, inetAddress42, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(inetAddress19);
        org.junit.Assert.assertNotNull(inetAddress28);
        org.junit.Assert.assertNotNull(inetAddress37);
        org.junit.Assert.assertNotNull(inetAddress42);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        int int18 = discardUDPClient0.getSoTimeout();
        discardUDPClient0.setSoTimeout((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str3 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        java.net.Socket socket5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = discardTCPClient0.verifyRemote(socket5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean1 = discardUDPClient0.isOpen();
        discardUDPClient0.open();
        discardUDPClient0.open(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setReceiveBufferSize((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        discardTCPClient0.setConnectTimeout((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.open();
        discardUDPClient7.open();
        java.net.InetAddress inetAddress10 = discardUDPClient7.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = discardUDPClient19.getCharset();
        discardUDPClient12.setCharset(charset26);
        java.nio.charset.Charset charset28 = discardUDPClient12.getCharset();
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient32 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean33 = discardUDPClient32.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient35 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient35.open();
        discardUDPClient35.setDefaultTimeout((-1));
        discardUDPClient35.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress41 = discardUDPClient35.getLocalAddress();
        discardUDPClient32.open(0, inetAddress41);
        discardUDPClient12.send(byteArray31, inetAddress41);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress10, (-1), inetAddress41, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(inetAddress10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(inetAddress41);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        java.net.Proxy proxy8 = discardTCPClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress9 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        java.lang.String str17 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient24.open();
        discardUDPClient24.setDefaultTimeout((-1));
        discardUDPClient24.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress30 = discardUDPClient24.getLocalAddress();
        discardUDPClient24.setDefaultTimeout((int) (byte) 100);
        discardUDPClient24.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory35 = null;
        discardUDPClient24.setDatagramSocketFactory(datagramSocketFactory35);
        java.nio.charset.Charset charset37 = discardUDPClient24.getCharset();
        discardUDPClient18.setCharset(charset37);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient44 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient44.setDefaultTimeout(0);
        discardUDPClient44.setDefaultTimeout((int) (short) 1);
        java.lang.String str49 = discardUDPClient44.getCharsetName();
        discardUDPClient44.open();
        discardUDPClient44.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.open();
        java.net.InetAddress inetAddress56 = discardUDPClient53.getLocalAddress();
        discardUDPClient44.open(0, inetAddress56);
        discardUDPClient18.send(byteArray43, inetAddress56);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient60 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient60.open();
        java.net.InetAddress inetAddress62 = discardUDPClient60.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray43, 35, inetAddress62, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-8" + "'", str17, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress30);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[10, 0, 0, -1]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTF-8" + "'", str49, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress56);
        org.junit.Assert.assertNotNull(inetAddress62);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        int int18 = discardUDPClient0.getDefaultTimeout();
        int int19 = discardUDPClient0.getDefaultTimeout();
        java.time.Duration duration20 = discardUDPClient0.getSoTimeoutDuration();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(duration20);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        java.net.Proxy proxy9 = null;
        discardTCPClient0.setProxy(proxy9);
        java.net.Proxy proxy11 = discardTCPClient0.getProxy();
        java.io.OutputStream outputStream12 = discardTCPClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(outputStream12);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
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
        int int17 = discardUDPClient0.getDefaultTimeout();
        int int18 = discardUDPClient0.getLocalPort();
        int int19 = discardUDPClient0.getSoTimeout();
        discardUDPClient0.setSoTimeout(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49957 + "'", int18 == 49957);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        int int7 = discardTCPClient0.getDefaultPort();
        int int8 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize(60000);
        int int17 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        int int17 = discardUDPClient0.getDefaultTimeout();
        int int18 = discardUDPClient0.getLocalPort();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient20.open();
        discardUDPClient20.setDefaultTimeout((-1));
        discardUDPClient20.setSoTimeout((int) ' ');
        int int26 = discardUDPClient20.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        int int33 = discardUDPClient27.getSoTimeout();
        java.nio.charset.Charset charset34 = discardUDPClient27.getCharset();
        discardUDPClient20.setCharset(charset34);
        boolean boolean36 = discardUDPClient20.isOpen();
        java.net.InetAddress inetAddress37 = discardUDPClient20.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(97, inetAddress37);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35888 + "'", int18 == 35888);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(inetAddress37);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.setDefaultTimeout((-1));
        discardUDPClient17.setSoTimeout((int) ' ');
        int int23 = discardUDPClient17.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient24.open();
        discardUDPClient24.setDefaultTimeout((-1));
        discardUDPClient24.setSoTimeout((int) ' ');
        int int30 = discardUDPClient24.getSoTimeout();
        java.nio.charset.Charset charset31 = discardUDPClient24.getCharset();
        discardUDPClient17.setCharset(charset31);
        java.nio.charset.Charset charset33 = discardUDPClient17.getCharset();
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient37 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean38 = discardUDPClient37.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient40 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient40.open();
        discardUDPClient40.setDefaultTimeout((-1));
        discardUDPClient40.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress46 = discardUDPClient40.getLocalAddress();
        discardUDPClient37.open(0, inetAddress46);
        discardUDPClient17.send(byteArray36, inetAddress46);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(0, inetAddress46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(inetAddress46);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        discardTCPClient0.setDefaultPort((int) (byte) 1);
        java.net.Socket socket8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = discardTCPClient0.verifyRemote(socket8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setConnectTimeout((-1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        int int5 = discardTCPClient0.getDefaultTimeout();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = discardTCPClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        int int4 = discardUDPClient0.getDefaultTimeout();
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        int int6 = discardUDPClient0.getSoTimeout();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("");
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(10);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress9 = discardTCPClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize(60000);
        boolean boolean17 = discardTCPClient0.isAvailable();
        int int18 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient18.getCharset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean39 = discardUDPClient38.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress47 = discardUDPClient41.getLocalAddress();
        discardUDPClient38.open(0, inetAddress47);
        discardUDPClient18.send(byteArray37, inetAddress47);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient0.send(byteArray37, inetAddress59);
        java.lang.String str62 = discardUDPClient0.getCharsetName();
        java.lang.Class<?> wildcardClass63 = discardUDPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inetAddress47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTF-8" + "'", str62, "UTF-8");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        discardUDPClient0.open();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout((int) ' ');
        boolean boolean5 = discardUDPClient0.isOpen();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory6 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory6);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory8 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardUDPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        boolean boolean16 = discardUDPClient0.isOpen();
        java.net.InetAddress inetAddress17 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout(42943);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(inetAddress17);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory8 = null;
        discardTCPClient0.setSocketFactory(socketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        boolean boolean6 = discardTCPClient0.isConnected();
        discardTCPClient0.setReceiveBufferSize((int) 'a');
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((int) '4');
        int int12 = discardTCPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(false, 40588);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        boolean boolean4 = discardTCPClient0.isAvailable();
        discardTCPClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        boolean boolean1 = discardTCPClient0.isAvailable();
        boolean boolean2 = discardTCPClient0.isConnected();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        java.lang.String str23 = discardUDPClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTF-8" + "'", str23, "UTF-8");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        javax.net.ServerSocketFactory serverSocketFactory15 = discardTCPClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(outputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-8" + "'", str14, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory15);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Socket socket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = discardTCPClient0.verifyRemote(socket3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
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
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean21 = discardUDPClient20.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress29 = discardUDPClient23.getLocalAddress();
        discardUDPClient20.open(0, inetAddress29);
        discardUDPClient0.send(byteArray19, inetAddress29);
        java.lang.String str32 = discardUDPClient0.getCharsetName();
        java.lang.String str33 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        int int47 = discardUDPClient41.getSoTimeout();
        java.nio.charset.Charset charset48 = discardUDPClient41.getCharset();
        discardUDPClient34.setCharset(charset48);
        boolean boolean50 = discardUDPClient34.isOpen();
        java.net.InetAddress inetAddress51 = discardUDPClient34.getLocalAddress();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient52 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient52.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy55 = null;
        discardTCPClient52.setProxy(proxy55);
        java.net.Proxy proxy57 = discardTCPClient52.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory58 = discardTCPClient52.getServerSocketFactory();
        java.lang.String str59 = discardTCPClient52.getCharsetName();
        java.nio.charset.Charset charset60 = discardTCPClient52.getCharset();
        discardUDPClient34.setCharset(charset60);
        discardUDPClient0.setCharset(charset60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inetAddress29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTF-8" + "'", str32, "UTF-8");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-8" + "'", str33, "UTF-8");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(inetAddress51);
        org.junit.Assert.assertNull(proxy57);
        org.junit.Assert.assertNotNull(serverSocketFactory58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "UTF-8" + "'", str59, "UTF-8");
        org.junit.Assert.assertNotNull(charset60);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        java.net.Proxy proxy9 = null;
        discardTCPClient0.setProxy(proxy9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        int int7 = discardTCPClient0.getDefaultPort();
        int int8 = discardTCPClient0.getDefaultTimeout();
        java.lang.Class<?> wildcardClass9 = discardTCPClient0.getClass();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient14 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int15 = discardTCPClient14.getDefaultPort();
        discardTCPClient14.disconnect();
        java.io.OutputStream outputStream17 = discardTCPClient14.getOutputStream();
        java.io.OutputStream outputStream18 = discardTCPClient14.getOutputStream();
        java.net.Proxy proxy19 = null;
        discardTCPClient14.setProxy(proxy19);
        java.nio.charset.Charset charset21 = discardTCPClient14.getCharset();
        discardTCPClient0.setCharset(charset21);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNull(outputStream17);
        org.junit.Assert.assertNull(outputStream18);
        org.junit.Assert.assertNotNull(charset21);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.lang.String str9 = discardTCPClient0.getCharsetName();
        int int10 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        discardTCPClient0.setDefaultTimeout(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoTimeout(43331);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        discardTCPClient0.setSendBufferSize((int) (short) 0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = discardTCPClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory9 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory9);
        discardUDPClient0.open();
        org.junit.Assert.assertNotNull(inetAddress6);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNull(outputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        int int3 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setConnectTimeout((int) (short) 0);
        discardTCPClient0.setDefaultTimeout((int) (byte) 1);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isConnected();
        java.lang.Class<?> wildcardClass3 = discardTCPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient4 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient4.open();
        discardUDPClient4.setDefaultTimeout((-1));
        discardUDPClient4.setSoTimeout((int) ' ');
        int int10 = discardUDPClient4.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        int int17 = discardUDPClient11.getSoTimeout();
        java.nio.charset.Charset charset18 = discardUDPClient11.getCharset();
        discardUDPClient4.setCharset(charset18);
        boolean boolean20 = discardUDPClient4.isOpen();
        java.net.InetAddress inetAddress21 = discardUDPClient4.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) ' ', inetAddress21);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(inetAddress21);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        java.net.Proxy proxy9 = null;
        discardTCPClient0.setProxy(proxy9);
        java.net.Proxy proxy11 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", 47200);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        java.net.Proxy proxy6 = null;
        discardTCPClient0.setProxy(proxy6);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.setDefaultTimeout(0);
        discardUDPClient9.setDefaultTimeout((int) (short) 1);
        java.lang.String str14 = discardUDPClient9.getCharsetName();
        discardUDPClient9.open();
        discardUDPClient9.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.open();
        java.net.InetAddress inetAddress21 = discardUDPClient18.getLocalAddress();
        discardUDPClient9.open(0, inetAddress21);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress21, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF-8" + "'", str14, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress21);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        boolean boolean9 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.nio.charset.Charset charset18 = discardUDPClient0.getCharset();
        discardUDPClient0.setSoTimeout((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permesso negato (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        int int4 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        java.net.InetAddress inetAddress11 = discardUDPClient9.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n", 0, inetAddress11, 41977);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(inetAddress11);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        java.lang.String str17 = discardUDPClient0.getCharsetName();
        int int18 = discardUDPClient0.getDefaultTimeout();
        discardUDPClient0.setSoTimeout(49957);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-8" + "'", str17, "UTF-8");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) 'a');
        int int3 = discardUDPClient0.getDefaultTimeout();
        java.lang.Class<?> wildcardClass4 = discardUDPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        discardUDPClient0.setSoTimeout(60000);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = discardUDPClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.disconnect();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient7.setDefaultTimeout(0);
        discardUDPClient7.setDefaultTimeout((int) (short) 1);
        java.lang.String str12 = discardUDPClient7.getCharsetName();
        discardUDPClient7.open();
        discardUDPClient7.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.open();
        java.net.InetAddress inetAddress19 = discardUDPClient16.getLocalAddress();
        discardUDPClient7.open(0, inetAddress19);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress19);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress19);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        boolean boolean16 = discardTCPClient0.isConnected();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient17 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int18 = discardTCPClient17.getDefaultPort();
        discardTCPClient17.disconnect();
        java.io.OutputStream outputStream20 = discardTCPClient17.getOutputStream();
        java.lang.String str21 = discardTCPClient17.getCharsetName();
        java.nio.charset.Charset charset22 = discardTCPClient17.getCharset();
        discardTCPClient0.setCharset(charset22);
        discardTCPClient0.setDefaultPort(0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress11 = discardUDPClient0.getLocalAddress();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = discardUDPClient19.getCharset();
        discardUDPClient12.setCharset(charset26);
        discardUDPClient12.setDefaultTimeout((int) (short) 1);
        int int30 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        int int37 = discardUDPClient31.getSoTimeout();
        java.nio.charset.Charset charset38 = null;
        discardUDPClient31.setCharset(charset38);
        java.nio.charset.Charset charset40 = discardUDPClient31.getCharset();
        java.time.Duration duration41 = discardUDPClient31.getSoTimeoutDuration();
        discardUDPClient12.setDefaultTimeout(duration41);
        discardUDPClient0.setDefaultTimeout(duration41);
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(inetAddress11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNull(charset40);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        int int18 = discardUDPClient0.getSoTimeout();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        int int6 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory8 = null;
        discardTCPClient0.setSocketFactory(socketFactory8);
        boolean boolean10 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.time.Duration duration10 = discardUDPClient0.getSoTimeoutDuration();
        int int11 = discardUDPClient0.getLocalPort();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        java.net.InetAddress inetAddress15 = discardUDPClient13.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (byte) -1, inetAddress15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(duration10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35810 + "'", int11 == 35810);
        org.junit.Assert.assertNotNull(inetAddress15);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        java.net.Proxy proxy9 = null;
        discardTCPClient0.setProxy(proxy9);
        boolean boolean11 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (short) 1);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        int int22 = discardUDPClient16.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        java.nio.charset.Charset charset30 = discardUDPClient23.getCharset();
        discardUDPClient16.setCharset(charset30);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory32 = null;
        discardUDPClient16.setDatagramSocketFactory(datagramSocketFactory32);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        int int47 = discardUDPClient41.getSoTimeout();
        java.nio.charset.Charset charset48 = discardUDPClient41.getCharset();
        discardUDPClient34.setCharset(charset48);
        java.nio.charset.Charset charset50 = discardUDPClient34.getCharset();
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient54 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean55 = discardUDPClient54.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient57 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient57.open();
        discardUDPClient57.setDefaultTimeout((-1));
        discardUDPClient57.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress63 = discardUDPClient57.getLocalAddress();
        discardUDPClient54.open(0, inetAddress63);
        discardUDPClient34.send(byteArray53, inetAddress63);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient66 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean67 = discardUDPClient66.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient69 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient69.open();
        discardUDPClient69.setDefaultTimeout((-1));
        discardUDPClient69.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress75 = discardUDPClient69.getLocalAddress();
        discardUDPClient66.open(0, inetAddress75);
        discardUDPClient16.send(byteArray53, inetAddress75);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", 60000, inetAddress75, 42943);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(inetAddress63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(inetAddress75);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        int int3 = discardTCPClient0.getDefaultPort();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient4.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient4.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient8 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient8.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory11 = discardTCPClient8.getServerSocketFactory();
        discardTCPClient4.setServerSocketFactory(serverSocketFactory11);
        javax.net.ServerSocketFactory serverSocketFactory13 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory13);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress15 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        int int5 = discardTCPClient0.getConnectTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.setDefaultTimeout(0);
        discardUDPClient6.setDefaultTimeout((int) (short) 1);
        java.lang.String str11 = discardUDPClient6.getCharsetName();
        discardUDPClient6.open();
        discardUDPClient6.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.open();
        java.net.InetAddress inetAddress18 = discardUDPClient15.getLocalAddress();
        discardUDPClient6.open(0, inetAddress18);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress18, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress18);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        int int2 = discardTCPClient0.getConnectTimeout();
        boolean boolean3 = discardTCPClient0.isAvailable();
        int int4 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = discardUDPClient0.getCharset();
        int int8 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        int int15 = discardUDPClient9.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient16 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient16.open();
        discardUDPClient16.setDefaultTimeout((-1));
        discardUDPClient16.setSoTimeout((int) ' ');
        int int22 = discardUDPClient16.getSoTimeout();
        java.nio.charset.Charset charset23 = discardUDPClient16.getCharset();
        discardUDPClient9.setCharset(charset23);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory25 = null;
        discardUDPClient9.setDatagramSocketFactory(datagramSocketFactory25);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        int int33 = discardUDPClient27.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient34 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient34.open();
        discardUDPClient34.setDefaultTimeout((-1));
        discardUDPClient34.setSoTimeout((int) ' ');
        int int40 = discardUDPClient34.getSoTimeout();
        java.nio.charset.Charset charset41 = discardUDPClient34.getCharset();
        discardUDPClient27.setCharset(charset41);
        java.nio.charset.Charset charset43 = discardUDPClient27.getCharset();
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient47 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean48 = discardUDPClient47.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient50.open();
        discardUDPClient50.setDefaultTimeout((-1));
        discardUDPClient50.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress56 = discardUDPClient50.getLocalAddress();
        discardUDPClient47.open(0, inetAddress56);
        discardUDPClient27.send(byteArray46, inetAddress56);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean60 = discardUDPClient59.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient62.open();
        discardUDPClient62.setDefaultTimeout((-1));
        discardUDPClient62.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress68 = discardUDPClient62.getLocalAddress();
        discardUDPClient59.open(0, inetAddress68);
        discardUDPClient9.send(byteArray46, inetAddress68);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient71 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean72 = discardUDPClient71.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient74 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient74.open();
        discardUDPClient74.setDefaultTimeout((-1));
        discardUDPClient74.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress80 = discardUDPClient74.getLocalAddress();
        discardUDPClient71.open(0, inetAddress80);
        discardUDPClient0.send(byteArray46, inetAddress80);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(charset43);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(inetAddress56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(inetAddress68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(inetAddress80);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        boolean boolean16 = discardTCPClient0.isConnected();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient17 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int18 = discardTCPClient17.getDefaultPort();
        discardTCPClient17.disconnect();
        java.io.OutputStream outputStream20 = discardTCPClient17.getOutputStream();
        java.lang.String str21 = discardTCPClient17.getCharsetName();
        java.nio.charset.Charset charset22 = discardTCPClient17.getCharset();
        discardTCPClient0.setCharset(charset22);
        discardTCPClient0.setDefaultPort(0);
        discardTCPClient0.setConnectTimeout(35);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoTimeout((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        int int6 = discardTCPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setKeepAlive(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        discardTCPClient0.setReceiveBufferSize((int) 'a');
        java.lang.String str10 = discardTCPClient0.getCharsetName();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.setDefaultTimeout(0);
        discardUDPClient17.setDefaultTimeout((int) (short) 1);
        java.lang.String str22 = discardUDPClient17.getCharsetName();
        discardUDPClient17.open();
        java.time.Duration duration24 = discardUDPClient17.getSoTimeoutDuration();
        discardUDPClient0.setDefaultTimeout(duration24);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF-8" + "'", str22, "UTF-8");
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        boolean boolean4 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = discardTCPClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        int int6 = discardTCPClient0.getDefaultPort();
        java.io.OutputStream outputStream7 = discardTCPClient0.getOutputStream();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNull(outputStream7);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.time.Duration duration10 = discardUDPClient0.getSoTimeoutDuration();
        java.net.InetAddress inetAddress11 = discardUDPClient0.getLocalAddress();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory12 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(inetAddress11);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setDefaultPort(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient9 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient9.open();
        discardUDPClient9.setDefaultTimeout((-1));
        discardUDPClient9.setSoTimeout((int) ' ');
        int int15 = discardUDPClient9.getSoTimeout();
        java.nio.charset.Charset charset16 = discardUDPClient9.getCharset();
        int int17 = discardUDPClient9.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory34 = null;
        discardUDPClient18.setDatagramSocketFactory(datagramSocketFactory34);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient36 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient36.open();
        discardUDPClient36.setDefaultTimeout((-1));
        discardUDPClient36.setSoTimeout((int) ' ');
        int int42 = discardUDPClient36.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient43 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient43.open();
        discardUDPClient43.setDefaultTimeout((-1));
        discardUDPClient43.setSoTimeout((int) ' ');
        int int49 = discardUDPClient43.getSoTimeout();
        java.nio.charset.Charset charset50 = discardUDPClient43.getCharset();
        discardUDPClient36.setCharset(charset50);
        java.nio.charset.Charset charset52 = discardUDPClient36.getCharset();
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient56 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean57 = discardUDPClient56.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient59.open();
        discardUDPClient59.setDefaultTimeout((-1));
        discardUDPClient59.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress65 = discardUDPClient59.getLocalAddress();
        discardUDPClient56.open(0, inetAddress65);
        discardUDPClient36.send(byteArray55, inetAddress65);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient68 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean69 = discardUDPClient68.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient71 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient71.open();
        discardUDPClient71.setDefaultTimeout((-1));
        discardUDPClient71.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress77 = discardUDPClient71.getLocalAddress();
        discardUDPClient68.open(0, inetAddress77);
        discardUDPClient18.send(byteArray55, inetAddress77);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient80 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean81 = discardUDPClient80.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient83 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient83.open();
        discardUDPClient83.setDefaultTimeout((-1));
        discardUDPClient83.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress89 = discardUDPClient83.getLocalAddress();
        discardUDPClient80.open(0, inetAddress89);
        discardUDPClient9.send(byteArray55, inetAddress89);
        java.net.InetAddress inetAddress93 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray55, 97, inetAddress93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertNotNull(charset50);
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(inetAddress65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(inetAddress77);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(inetAddress89);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultTimeout((int) (byte) 1);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        int int3 = discardTCPClient0.getConnectTimeout();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.setDefaultTimeout(0);
        discardUDPClient8.setDefaultTimeout((int) (short) 1);
        java.lang.String str13 = discardUDPClient8.getCharsetName();
        discardUDPClient8.open();
        discardUDPClient8.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.open();
        java.net.InetAddress inetAddress20 = discardUDPClient17.getLocalAddress();
        discardUDPClient8.open(0, inetAddress20);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", (-1), inetAddress20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF-8" + "'", str13, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress20);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        boolean boolean16 = discardTCPClient0.isConnected();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient17 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int18 = discardTCPClient17.getDefaultPort();
        discardTCPClient17.disconnect();
        java.io.OutputStream outputStream20 = discardTCPClient17.getOutputStream();
        java.lang.String str21 = discardTCPClient17.getCharsetName();
        java.nio.charset.Charset charset22 = discardTCPClient17.getCharset();
        discardTCPClient0.setCharset(charset22);
        discardTCPClient0.setDefaultPort(0);
        java.net.Proxy proxy26 = discardTCPClient0.getProxy();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNull(proxy26);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str7 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout((int) (byte) 0);
        int int10 = discardTCPClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient8 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int9 = discardTCPClient8.getDefaultPort();
        discardTCPClient8.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy12 = discardTCPClient8.getProxy();
        discardTCPClient8.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient15 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int16 = discardTCPClient15.getDefaultPort();
        discardTCPClient15.disconnect();
        java.io.OutputStream outputStream18 = discardTCPClient15.getOutputStream();
        java.lang.String str19 = discardTCPClient15.getCharsetName();
        java.nio.charset.Charset charset20 = discardTCPClient15.getCharset();
        discardTCPClient8.setCharset(charset20);
        discardTCPClient0.setCharset(charset20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNull(outputStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTF-8" + "'", str19, "UTF-8");
        org.junit.Assert.assertNotNull(charset20);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isAvailable();
        java.lang.String str3 = discardTCPClient0.getCharsetName();
        int int4 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setConnectTimeout(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.lang.String str9 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        int int16 = discardUDPClient10.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.setDefaultTimeout((-1));
        discardUDPClient17.setSoTimeout((int) ' ');
        int int23 = discardUDPClient17.getSoTimeout();
        java.nio.charset.Charset charset24 = discardUDPClient17.getCharset();
        discardUDPClient10.setCharset(charset24);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory26 = null;
        discardUDPClient10.setDatagramSocketFactory(datagramSocketFactory26);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.open();
        discardUDPClient28.setDefaultTimeout((-1));
        discardUDPClient28.setSoTimeout((int) ' ');
        int int34 = discardUDPClient28.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient35 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient35.open();
        discardUDPClient35.setDefaultTimeout((-1));
        discardUDPClient35.setSoTimeout((int) ' ');
        int int41 = discardUDPClient35.getSoTimeout();
        java.nio.charset.Charset charset42 = discardUDPClient35.getCharset();
        discardUDPClient28.setCharset(charset42);
        java.nio.charset.Charset charset44 = discardUDPClient28.getCharset();
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient48 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean49 = discardUDPClient48.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient51 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient51.open();
        discardUDPClient51.setDefaultTimeout((-1));
        discardUDPClient51.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress57 = discardUDPClient51.getLocalAddress();
        discardUDPClient48.open(0, inetAddress57);
        discardUDPClient28.send(byteArray47, inetAddress57);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient60 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean61 = discardUDPClient60.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient63 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient63.open();
        discardUDPClient63.setDefaultTimeout((-1));
        discardUDPClient63.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress69 = discardUDPClient63.getLocalAddress();
        discardUDPClient60.open(0, inetAddress69);
        discardUDPClient10.send(byteArray47, inetAddress69);
        java.time.Duration duration72 = discardUDPClient10.getSoTimeoutDuration();
        discardUDPClient0.setSoTimeout(duration72);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(inetAddress57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(inetAddress69);
        org.junit.Assert.assertNotNull(duration72);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.time.Duration duration10 = discardUDPClient0.getSoTimeoutDuration();
        discardUDPClient0.setSoTimeout(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setDefaultPort(0);
        java.net.Proxy proxy11 = null;
        discardTCPClient0.setProxy(proxy11);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isAvailable();
        discardTCPClient0.setConnectTimeout(41977);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean6 = discardUDPClient5.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress14 = discardUDPClient8.getLocalAddress();
        discardUDPClient5.open(0, inetAddress14);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.open();
        java.net.InetAddress inetAddress20 = discardUDPClient17.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress14, (int) '#', inetAddress20, 56373);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(inetAddress14);
        org.junit.Assert.assertNotNull(inetAddress20);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.open();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(46312);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        discardUDPClient0.setSoTimeout(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        byte[] byteArray11 = null;
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.setDefaultTimeout(0);
        discardUDPClient13.setDefaultTimeout((int) (short) 1);
        java.lang.String str18 = discardUDPClient13.getCharsetName();
        discardUDPClient13.open();
        discardUDPClient13.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient22 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient22.open();
        discardUDPClient22.open();
        java.net.InetAddress inetAddress25 = discardUDPClient22.getLocalAddress();
        discardUDPClient13.open(0, inetAddress25);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray11, (int) (short) 1, inetAddress25, 50413);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null packet buffer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-8" + "'", str18, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress25);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertNotNull(charset23);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        int int4 = discardUDPClient0.getDefaultTimeout();
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.setDefaultTimeout(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((int) '4');
        int int12 = discardTCPClient0.getDefaultTimeout();
        java.lang.Class<?> wildcardClass13 = discardTCPClient0.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = discardTCPClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(outputStream8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isAvailable();
        java.lang.String str3 = discardTCPClient0.getCharsetName();
        int int4 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        java.lang.String str5 = discardTCPClient0.getCharsetName();
        boolean boolean6 = discardTCPClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        boolean boolean9 = discardTCPClient0.isAvailable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoTimeout(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        java.lang.Class<?> wildcardClass11 = discardTCPClient0.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        discardUDPClient0.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient5 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient5.setDefaultTimeout(0);
        discardUDPClient5.setDefaultTimeout((int) (short) 1);
        java.lang.String str10 = discardUDPClient5.getCharsetName();
        discardUDPClient5.open();
        java.time.Duration duration12 = discardUDPClient5.getSoTimeoutDuration();
        discardUDPClient0.setDefaultTimeout(duration12);
        discardUDPClient0.open();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        int int14 = discardUDPClient8.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        int int21 = discardUDPClient15.getSoTimeout();
        java.nio.charset.Charset charset22 = discardUDPClient15.getCharset();
        discardUDPClient8.setCharset(charset22);
        java.nio.charset.Charset charset24 = discardUDPClient8.getCharset();
        java.nio.charset.Charset charset25 = discardUDPClient8.getCharset();
        discardTCPClient0.setCharset(charset25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(charset25);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        int int7 = discardUDPClient0.getDefaultTimeout();
        discardUDPClient0.close();
        java.lang.Class<?> wildcardClass9 = discardUDPClient0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy6 = discardTCPClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNull(outputStream5);
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        discardUDPClient0.setSoTimeout(10);
        int int8 = discardUDPClient0.getLocalPort();
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53339 + "'", int8 == 53339);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        int int10 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) '4');
        discardTCPClient0.setDefaultPort(56373);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        int int10 = discardUDPClient0.getSoTimeout();
        discardUDPClient0.setSoTimeout((int) (byte) 100);
        int int13 = discardUDPClient0.getDefaultTimeout();
        int int14 = discardUDPClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(41977);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        discardTCPClient0.setSendBufferSize(9);
        discardTCPClient0.setSendBufferSize((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.disconnect();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        discardTCPClient0.setDefaultPort((int) 'a');
        boolean boolean16 = discardTCPClient0.isConnected();
        int int17 = discardTCPClient0.getDefaultTimeout();
        java.nio.charset.Charset charset18 = discardTCPClient0.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient20.open();
        discardUDPClient20.setDefaultTimeout((-1));
        discardUDPClient20.setSoTimeout((int) ' ');
        int int26 = discardUDPClient20.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient27 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient27.open();
        discardUDPClient27.setDefaultTimeout((-1));
        discardUDPClient27.setSoTimeout((int) ' ');
        int int33 = discardUDPClient27.getSoTimeout();
        java.nio.charset.Charset charset34 = discardUDPClient27.getCharset();
        discardUDPClient20.setCharset(charset34);
        java.nio.charset.Charset charset36 = discardUDPClient20.getCharset();
        discardUDPClient19.setCharset(charset36);
        java.nio.charset.Charset charset38 = discardUDPClient19.getCharset();
        discardTCPClient0.setCharset(charset38);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(charset18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(charset36);
        org.junit.Assert.assertNotNull(charset38);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        int int9 = discardUDPClient0.getLocalPort();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49765 + "'", int9 == 49765);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress11 = discardUDPClient0.getLocalAddress();
        int int12 = discardUDPClient0.getSoTimeout();
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(inetAddress11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        java.net.Proxy proxy8 = null;
        discardTCPClient0.setProxy(proxy8);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory15 = null;
        discardTCPClient0.setSocketFactory(socketFactory15);
        int int17 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60000 + "'", int17 == 60000);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        int int10 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        int int5 = discardTCPClient0.getDefaultPort();
        java.io.OutputStream outputStream6 = discardTCPClient0.getOutputStream();
        int int7 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertNull(outputStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        discardUDPClient0.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = discardUDPClient19.getCharset();
        discardUDPClient12.setCharset(charset26);
        discardUDPClient12.setDefaultTimeout((int) (short) 1);
        int int30 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient31 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient31.open();
        discardUDPClient31.setDefaultTimeout((-1));
        discardUDPClient31.setSoTimeout((int) ' ');
        int int37 = discardUDPClient31.getSoTimeout();
        java.nio.charset.Charset charset38 = null;
        discardUDPClient31.setCharset(charset38);
        java.nio.charset.Charset charset40 = discardUDPClient31.getCharset();
        java.time.Duration duration41 = discardUDPClient31.getSoTimeoutDuration();
        discardUDPClient12.setDefaultTimeout(duration41);
        discardUDPClient0.setDefaultTimeout(duration41);
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNull(charset40);
        org.junit.Assert.assertNotNull(duration41);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        discardTCPClient0.setDefaultPort((int) (short) 0);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        discardTCPClient0.setSendBufferSize(40588);
        javax.net.ServerSocketFactory serverSocketFactory13 = discardTCPClient0.getServerSocketFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        int int3 = discardTCPClient0.getConnectTimeout();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultTimeout();
        java.net.Socket socket6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = discardTCPClient0.verifyRemote(socket6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress3 = discardTCPClient0.getRemoteAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.close();
        java.lang.String str2 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        discardUDPClient3.setDefaultTimeout((-1));
        discardUDPClient3.setSoTimeout((int) ' ');
        int int9 = discardUDPClient3.getSoTimeout();
        java.nio.charset.Charset charset10 = discardUDPClient3.getCharset();
        int int11 = discardUDPClient3.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient12 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient12.open();
        discardUDPClient12.setDefaultTimeout((-1));
        discardUDPClient12.setSoTimeout((int) ' ');
        int int18 = discardUDPClient12.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        int int25 = discardUDPClient19.getSoTimeout();
        java.nio.charset.Charset charset26 = discardUDPClient19.getCharset();
        discardUDPClient12.setCharset(charset26);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory28 = null;
        discardUDPClient12.setDatagramSocketFactory(datagramSocketFactory28);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient30 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient30.open();
        discardUDPClient30.setDefaultTimeout((-1));
        discardUDPClient30.setSoTimeout((int) ' ');
        int int36 = discardUDPClient30.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient37 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient37.open();
        discardUDPClient37.setDefaultTimeout((-1));
        discardUDPClient37.setSoTimeout((int) ' ');
        int int43 = discardUDPClient37.getSoTimeout();
        java.nio.charset.Charset charset44 = discardUDPClient37.getCharset();
        discardUDPClient30.setCharset(charset44);
        java.nio.charset.Charset charset46 = discardUDPClient30.getCharset();
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient30.send(byteArray49, inetAddress59);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean63 = discardUDPClient62.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient65 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient65.open();
        discardUDPClient65.setDefaultTimeout((-1));
        discardUDPClient65.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress71 = discardUDPClient65.getLocalAddress();
        discardUDPClient62.open(0, inetAddress71);
        discardUDPClient12.send(byteArray49, inetAddress71);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient74 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean75 = discardUDPClient74.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient77 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient77.open();
        discardUDPClient77.setDefaultTimeout((-1));
        discardUDPClient77.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress83 = discardUDPClient77.getLocalAddress();
        discardUDPClient74.open(0, inetAddress83);
        discardUDPClient3.send(byteArray49, inetAddress83);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient86 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient86.open();
        discardUDPClient86.open();
        discardUDPClient86.open();
        java.lang.String str90 = discardUDPClient86.getCharsetName();
        java.net.InetAddress inetAddress91 = discardUDPClient86.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray49, inetAddress91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(charset44);
        org.junit.Assert.assertNotNull(charset46);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(inetAddress71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(inetAddress83);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "UTF-8" + "'", str90, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress91);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
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
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.nio.charset.Charset charset18 = discardUDPClient0.getCharset();
        discardUDPClient0.setSoTimeout((int) (short) 100);
        int int21 = discardUDPClient0.getSoTimeout();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory16 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient18 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient18.open();
        discardUDPClient18.setDefaultTimeout((-1));
        discardUDPClient18.setSoTimeout((int) ' ');
        int int24 = discardUDPClient18.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        int int31 = discardUDPClient25.getSoTimeout();
        java.nio.charset.Charset charset32 = discardUDPClient25.getCharset();
        discardUDPClient18.setCharset(charset32);
        java.nio.charset.Charset charset34 = discardUDPClient18.getCharset();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient38 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean39 = discardUDPClient38.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.open();
        discardUDPClient41.setDefaultTimeout((-1));
        discardUDPClient41.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress47 = discardUDPClient41.getLocalAddress();
        discardUDPClient38.open(0, inetAddress47);
        discardUDPClient18.send(byteArray37, inetAddress47);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient50 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean51 = discardUDPClient50.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient53 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient53.open();
        discardUDPClient53.setDefaultTimeout((-1));
        discardUDPClient53.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress59 = discardUDPClient53.getLocalAddress();
        discardUDPClient50.open(0, inetAddress59);
        discardUDPClient0.send(byteArray37, inetAddress59);
        java.time.Duration duration62 = discardUDPClient0.getSoTimeoutDuration();
        java.time.Duration duration63 = discardUDPClient0.getSoTimeoutDuration();
        int int64 = discardUDPClient0.getSoTimeout();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(inetAddress47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(inetAddress59);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.lang.String str9 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        int int8 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setDefaultPort(0);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress11 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        boolean boolean4 = discardTCPClient0.isAvailable();
        boolean boolean5 = discardTCPClient0.isAvailable();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        java.nio.charset.Charset charset13 = null;
        discardUDPClient6.setCharset(charset13);
        java.nio.charset.Charset charset15 = discardUDPClient6.getCharset();
        java.time.Duration duration16 = discardUDPClient6.getSoTimeoutDuration();
        int int17 = discardUDPClient6.getLocalPort();
        byte[] byteArray18 = new byte[] {};
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.setDefaultTimeout(0);
        discardUDPClient19.setDefaultTimeout((int) (short) 1);
        java.lang.String str24 = discardUDPClient19.getCharsetName();
        discardUDPClient19.open();
        discardUDPClient19.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.open();
        discardUDPClient28.open();
        java.net.InetAddress inetAddress31 = discardUDPClient28.getLocalAddress();
        discardUDPClient19.open(0, inetAddress31);
        discardUDPClient6.send(byteArray18, inetAddress31);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress31, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(charset15);
        org.junit.Assert.assertNotNull(duration16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50296 + "'", int17 == 50296);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF-8" + "'", str24, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress31);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        boolean boolean23 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(charset21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        discardTCPClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNull(outputStream5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.lang.String str4 = discardTCPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str6 = discardTCPClient5.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient5.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory7);
        boolean boolean9 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.lang.String str9 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress10 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        discardTCPClient0.setDefaultTimeout((int) (byte) 0);
        boolean boolean6 = discardTCPClient0.isConnected();
        java.lang.String str7 = discardTCPClient0.getCharsetName();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF-8" + "'", str7, "UTF-8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setSendBufferSize((int) (byte) 100);
        int int10 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setTcpNoDelay(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
        java.nio.charset.Charset charset4 = discardUDPClient0.getCharset();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient5 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient5.setDefaultPort((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient8 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient8.open();
        discardUDPClient8.setDefaultTimeout((-1));
        discardUDPClient8.setSoTimeout((int) ' ');
        int int14 = discardUDPClient8.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        int int21 = discardUDPClient15.getSoTimeout();
        java.nio.charset.Charset charset22 = discardUDPClient15.getCharset();
        discardUDPClient8.setCharset(charset22);
        discardUDPClient8.setDefaultTimeout((int) (short) 1);
        java.nio.charset.Charset charset26 = discardUDPClient8.getCharset();
        discardTCPClient5.setCharset(charset26);
        discardUDPClient0.setCharset(charset26);
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(charset26);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setDefaultPort(1);
        java.nio.charset.Charset charset5 = discardTCPClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory8 = null;
        discardTCPClient0.setSocketFactory(socketFactory8);
        java.net.Proxy proxy10 = discardTCPClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(false, 40588);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
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
        boolean boolean16 = discardUDPClient0.isOpen();
        discardUDPClient0.setDefaultTimeout((int) (byte) -1);
        int int19 = discardUDPClient0.getLocalPort();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient21 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient21.open();
        discardUDPClient21.setDefaultTimeout((-1));
        discardUDPClient21.setSoTimeout((int) ' ');
        int int27 = discardUDPClient21.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.open();
        discardUDPClient28.setDefaultTimeout((-1));
        discardUDPClient28.setSoTimeout((int) ' ');
        int int34 = discardUDPClient28.getSoTimeout();
        java.nio.charset.Charset charset35 = discardUDPClient28.getCharset();
        discardUDPClient21.setCharset(charset35);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory37 = null;
        discardUDPClient21.setDatagramSocketFactory(datagramSocketFactory37);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient39 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient39.open();
        discardUDPClient39.setDefaultTimeout((-1));
        discardUDPClient39.setSoTimeout((int) ' ');
        int int45 = discardUDPClient39.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient46 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient46.open();
        discardUDPClient46.setDefaultTimeout((-1));
        discardUDPClient46.setSoTimeout((int) ' ');
        int int52 = discardUDPClient46.getSoTimeout();
        java.nio.charset.Charset charset53 = discardUDPClient46.getCharset();
        discardUDPClient39.setCharset(charset53);
        java.nio.charset.Charset charset55 = discardUDPClient39.getCharset();
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient59 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean60 = discardUDPClient59.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient62 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient62.open();
        discardUDPClient62.setDefaultTimeout((-1));
        discardUDPClient62.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress68 = discardUDPClient62.getLocalAddress();
        discardUDPClient59.open(0, inetAddress68);
        discardUDPClient39.send(byteArray58, inetAddress68);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient71 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean72 = discardUDPClient71.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient74 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient74.open();
        discardUDPClient74.setDefaultTimeout((-1));
        discardUDPClient74.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress80 = discardUDPClient74.getLocalAddress();
        discardUDPClient71.open(0, inetAddress80);
        discardUDPClient21.send(byteArray58, inetAddress80);
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(50413, inetAddress80);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34198 + "'", int19 == 34198);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(charset55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(inetAddress68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(inetAddress80);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        boolean boolean4 = discardTCPClient0.isAvailable();
        int int5 = discardTCPClient0.getDefaultTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        int int11 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        int int7 = discardTCPClient0.getDefaultPort();
        int int8 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize(49957);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        discardTCPClient0.setSendBufferSize(40588);
        java.nio.charset.Charset charset11 = discardTCPClient0.getCharset();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset11);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient17 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient17.open();
        discardUDPClient17.setDefaultTimeout((-1));
        discardUDPClient17.setSoTimeout((int) ' ');
        int int23 = discardUDPClient17.getSoTimeout();
        java.nio.charset.Charset charset24 = discardUDPClient17.getCharset();
        int int25 = discardUDPClient17.getSoTimeout();
        java.time.Duration duration26 = discardUDPClient17.getSoTimeoutDuration();
        discardUDPClient0.setDefaultTimeout(duration26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(duration26);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
        java.lang.String str17 = discardUDPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF-8" + "'", str17, "UTF-8");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        int int6 = discardTCPClient0.getDefaultPort();
        boolean boolean7 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient20 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean21 = discardUDPClient20.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress29 = discardUDPClient23.getLocalAddress();
        discardUDPClient20.open(0, inetAddress29);
        discardUDPClient0.send(byteArray19, inetAddress29);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory32 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(inetAddress29);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory2 = null;
        discardTCPClient0.setSocketFactory(socketFactory2);
        boolean boolean4 = discardTCPClient0.isAvailable();
        discardTCPClient0.disconnect();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        discardTCPClient0.setConnectTimeout(40588);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.nio.charset.Charset charset5 = discardUDPClient0.getCharset();
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        boolean boolean8 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        int int5 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setDefaultPort(60000);
        int int8 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.nio.charset.Charset charset10 = discardUDPClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNull(charset10);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        java.nio.charset.Charset charset7 = discardTCPClient0.getCharset();
        boolean boolean8 = discardTCPClient0.isAvailable();
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress17);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        int int10 = discardUDPClient0.getSoTimeout();
        discardUDPClient0.setSoTimeout((int) (byte) 100);
        int int13 = discardUDPClient0.getDefaultTimeout();
        int int14 = discardUDPClient0.getDefaultTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient15 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient15.open();
        discardUDPClient15.setDefaultTimeout((-1));
        discardUDPClient15.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress21 = discardUDPClient15.getLocalAddress();
        discardUDPClient15.setDefaultTimeout((int) (byte) 100);
        discardUDPClient15.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress26 = discardUDPClient15.getLocalAddress();
        java.lang.String str27 = discardUDPClient15.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.open();
        discardUDPClient28.setDefaultTimeout((-1));
        discardUDPClient28.setSoTimeout((int) ' ');
        int int34 = discardUDPClient28.getSoTimeout();
        java.nio.charset.Charset charset35 = discardUDPClient28.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient36 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient36.setDefaultTimeout((int) (short) 1);
        discardUDPClient36.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient41 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient41.setDefaultTimeout(0);
        discardUDPClient41.setDefaultTimeout((int) (short) 1);
        java.lang.String str46 = discardUDPClient41.getCharsetName();
        discardUDPClient41.open();
        java.time.Duration duration48 = discardUDPClient41.getSoTimeoutDuration();
        discardUDPClient36.setDefaultTimeout(duration48);
        discardUDPClient28.setSoTimeout(duration48);
        discardUDPClient15.setSoTimeout(duration48);
        discardUDPClient0.setDefaultTimeout(duration48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(inetAddress21);
        org.junit.Assert.assertNotNull(inetAddress26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTF-8" + "'", str27, "UTF-8");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTF-8" + "'", str46, "UTF-8");
        org.junit.Assert.assertNotNull(duration48);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        int int6 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNull(outputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient3 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient3.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy6 = null;
        discardTCPClient3.setProxy(proxy6);
        discardTCPClient3.setSendBufferSize(100);
        discardTCPClient3.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory12 = discardTCPClient3.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory12);
        boolean boolean14 = discardTCPClient0.isAvailable();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        int int7 = discardUDPClient0.getDefaultTimeout();
        java.lang.String str8 = discardUDPClient0.getCharsetName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory8 = null;
        discardTCPClient0.setSocketFactory(socketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout((int) 'a');
        boolean boolean3 = discardUDPClient0.isOpen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        int int3 = discardTCPClient0.getConnectTimeout();
        java.nio.charset.Charset charset4 = discardTCPClient0.getCharset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(charset4);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        discardTCPClient0.setDefaultTimeout((int) '#');
        discardTCPClient0.setSendBufferSize(47200);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        java.lang.String str2 = discardTCPClient0.getCharsetName();
        int int3 = discardTCPClient0.getConnectTimeout();
        discardTCPClient0.setConnectTimeout((int) (short) 0);
        discardTCPClient0.setDefaultTimeout((int) (byte) 1);
        int int8 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient9 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int10 = discardTCPClient9.getDefaultPort();
        discardTCPClient9.disconnect();
        java.io.OutputStream outputStream12 = discardTCPClient9.getOutputStream();
        java.io.OutputStream outputStream13 = discardTCPClient9.getOutputStream();
        java.net.Proxy proxy14 = null;
        discardTCPClient9.setProxy(proxy14);
        java.nio.charset.Charset charset16 = discardTCPClient9.getCharset();
        discardTCPClient0.setCharset(charset16);
        discardTCPClient0.setConnectTimeout(32);
        discardTCPClient0.setConnectTimeout((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(outputStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNull(outputStream12);
        org.junit.Assert.assertNull(outputStream13);
        org.junit.Assert.assertNotNull(charset16);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        discardTCPClient0.disconnect();
        org.junit.Assert.assertNotNull(charset3);
    }
}
