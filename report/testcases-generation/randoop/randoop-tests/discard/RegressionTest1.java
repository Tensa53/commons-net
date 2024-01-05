import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress11 = discardUDPClient0.getLocalAddress();
        java.lang.String str12 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = discardUDPClient13.getCharset();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient21 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient21.setDefaultTimeout((int) (short) 1);
        discardUDPClient21.setDefaultTimeout(60000);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient26.setDefaultTimeout(0);
        discardUDPClient26.setDefaultTimeout((int) (short) 1);
        java.lang.String str31 = discardUDPClient26.getCharsetName();
        discardUDPClient26.open();
        java.time.Duration duration33 = discardUDPClient26.getSoTimeoutDuration();
        discardUDPClient21.setDefaultTimeout(duration33);
        discardUDPClient13.setSoTimeout(duration33);
        discardUDPClient0.setSoTimeout(duration33);
        int int37 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory38 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory38);
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(inetAddress11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF-8" + "'", str12, "UTF-8");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTF-8" + "'", str31, "UTF-8");
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        boolean boolean20 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient7 = new org.apache.commons.net.discard.DiscardUDPClient();
        boolean boolean8 = discardUDPClient7.isOpen();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient10 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient10.open();
        discardUDPClient10.setDefaultTimeout((-1));
        discardUDPClient10.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress16 = discardUDPClient10.getLocalAddress();
        discardUDPClient7.open(0, inetAddress16);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress25 = discardUDPClient19.getLocalAddress();
        discardUDPClient7.open((int) (short) 0, inetAddress25);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient28 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient28.setDefaultTimeout(0);
        discardUDPClient28.setDefaultTimeout((int) (short) 1);
        java.lang.String str33 = discardUDPClient28.getCharsetName();
        discardUDPClient28.open();
        discardUDPClient28.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient37 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient37.open();
        discardUDPClient37.open();
        java.net.InetAddress inetAddress40 = discardUDPClient37.getLocalAddress();
        discardUDPClient28.open(0, inetAddress40);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress25, 43331, inetAddress40, 0);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(inetAddress16);
        org.junit.Assert.assertNotNull(inetAddress25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-8" + "'", str33, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress40);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        java.lang.Class<?> wildcardClass7 = discardUDPClient0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.io.OutputStream outputStream8 = discardTCPClient0.getOutputStream();
        discardTCPClient0.setSendBufferSize(55336);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = discardTCPClient0.getSoLinger();
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
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = discardTCPClient0.getProxy();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean7 = discardTCPClient0.isAvailable();
        discardTCPClient0.setDefaultPort((int) (byte) -1);
        discardTCPClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        discardTCPClient0.setReceiveBufferSize(10);
        discardTCPClient0.setSendBufferSize(49765);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = discardTCPClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
        boolean boolean4 = discardUDPClient0.isOpen();
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.SocketFactory socketFactory7 = null;
        discardTCPClient0.setSocketFactory(socketFactory7);
        java.lang.String str9 = discardTCPClient0.getCharsetName();
        int int10 = discardTCPClient0.getConnectTimeout();
        java.lang.String str11 = discardTCPClient0.getCharsetName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.net.Socket socket3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = discardTCPClient0.verifyRemote(socket3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory9 = null;
        discardTCPClient0.setSocketFactory(socketFactory9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.open();
        java.net.InetAddress inetAddress3 = discardUDPClient0.getLocalAddress();
        java.nio.charset.Charset charset4 = discardUDPClient0.getCharset();
        java.time.Duration duration5 = discardUDPClient0.getSoTimeoutDuration();
        discardUDPClient0.setDefaultTimeout((int) (byte) -1);
        discardUDPClient0.setSoTimeout((int) (byte) 1);
        org.junit.Assert.assertNotNull(inetAddress3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(duration5);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        int int4 = discardTCPClient0.getDefaultTimeout();
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
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress17, 47200);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress17);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        int int20 = discardTCPClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress21 = discardTCPClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        boolean boolean5 = discardTCPClient0.isConnected();
        discardTCPClient0.disconnect();
        boolean boolean7 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        int int6 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize(53339);
        int int9 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        java.time.Duration duration2 = discardUDPClient0.getSoTimeoutDuration();
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        org.junit.Assert.assertNotNull(duration2);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory5 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory5);
        discardUDPClient0.open();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory3 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory3);
        boolean boolean5 = discardUDPClient0.isOpen();
        int int6 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        java.lang.String str8 = discardTCPClient0.getCharsetName();
        java.net.Proxy proxy9 = null;
        discardTCPClient0.setProxy(proxy9);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        java.net.InetAddress inetAddress15 = discardUDPClient13.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect("hi!", (-1), inetAddress15, 56682);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress15);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        boolean boolean28 = discardTCPClient0.isConnected();
        java.lang.String str29 = discardTCPClient0.getCharsetName();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTF-8" + "'", str29, "UTF-8");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setSoTimeout((int) (short) 10);
        org.junit.Assert.assertNotNull(inetAddress6);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        java.nio.charset.Charset charset6 = discardTCPClient0.getCharset();
        boolean boolean7 = discardTCPClient0.isConnected();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        int int10 = discardTCPClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.disconnect();
        discardTCPClient0.setDefaultTimeout(0);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = discardTCPClient0.getServerSocketFactory();
        boolean boolean5 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        boolean boolean44 = discardUDPClient28.isOpen();
        java.net.InetAddress inetAddress45 = discardUDPClient28.getLocalAddress();
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
            discardTCPClient0.connect(inetAddress45, (int) '4', inetAddress58, 42943);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(charset42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(inetAddress45);
        org.junit.Assert.assertNotNull(inetAddress53);
        org.junit.Assert.assertNotNull(inetAddress58);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.close();
        java.lang.String str3 = discardUDPClient0.getCharsetName();
        int int4 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        discardUDPClient0.close();
        int int14 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(inetAddress9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory11 = null;
        discardUDPClient0.setDatagramSocketFactory(datagramSocketFactory11);
        java.lang.String str13 = discardUDPClient0.getCharsetName();
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF-8" + "'", str13, "UTF-8");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        discardTCPClient0.setConnectTimeout((int) (byte) 100);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.addProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        boolean boolean20 = discardTCPClient0.isConnected();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        int int4 = discardUDPClient0.getDefaultTimeout();
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.setDefaultTimeout((int) (byte) 10);
        int int8 = discardUDPClient0.getLocalPort();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37507 + "'", int8 == 37507);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        javax.net.SocketFactory socketFactory18 = null;
        discardTCPClient0.setSocketFactory(socketFactory18);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setReceiveBufferSize(32);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        int int6 = discardTCPClient0.getDefaultPort();
        java.net.Socket socket7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = discardTCPClient0.verifyRemote(socket7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        int int12 = discardUDPClient6.getSoTimeout();
        java.nio.charset.Charset charset13 = null;
        discardUDPClient6.setCharset(charset13);
        java.nio.charset.Charset charset15 = discardUDPClient6.getCharset();
        int int16 = discardUDPClient6.getSoTimeout();
        discardUDPClient6.setSoTimeout((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient25 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient25.open();
        discardUDPClient25.setDefaultTimeout((-1));
        discardUDPClient25.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress31 = discardUDPClient25.getLocalAddress();
        discardUDPClient25.setDefaultTimeout((int) (byte) 100);
        discardUDPClient25.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory36 = null;
        discardUDPClient25.setDatagramSocketFactory(datagramSocketFactory36);
        java.nio.charset.Charset charset38 = discardUDPClient25.getCharset();
        discardUDPClient19.setCharset(charset38);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient45 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient45.setDefaultTimeout(0);
        discardUDPClient45.setDefaultTimeout((int) (short) 1);
        java.lang.String str50 = discardUDPClient45.getCharsetName();
        discardUDPClient45.open();
        discardUDPClient45.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient54 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient54.open();
        discardUDPClient54.open();
        java.net.InetAddress inetAddress57 = discardUDPClient54.getLocalAddress();
        discardUDPClient45.open(0, inetAddress57);
        discardUDPClient19.send(byteArray44, inetAddress57);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient60 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient60.open();
        discardUDPClient60.setDefaultTimeout((-1));
        discardUDPClient60.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress66 = discardUDPClient60.getLocalAddress();
        discardUDPClient60.setDefaultTimeout((int) (byte) 100);
        discardUDPClient60.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress71 = discardUDPClient60.getLocalAddress();
        discardUDPClient6.send(byteArray44, inetAddress71);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient73 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient73.open();
        discardUDPClient73.setDefaultTimeout((-1));
        discardUDPClient73.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress79 = discardUDPClient73.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray44, inetAddress79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: DatagramSocket");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(charset15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(inetAddress31);
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, 0, 0, -1]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTF-8" + "'", str50, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress57);
        org.junit.Assert.assertNotNull(inetAddress66);
        org.junit.Assert.assertNotNull(inetAddress71);
        org.junit.Assert.assertNotNull(inetAddress79);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout(55336);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream5 = discardTCPClient0.getOutputStream();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient6 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient6.open();
        discardUDPClient6.setDefaultTimeout((-1));
        discardUDPClient6.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress12 = discardUDPClient6.getLocalAddress();
        discardUDPClient6.setDefaultTimeout((int) (byte) 100);
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory15 = null;
        discardUDPClient6.setDatagramSocketFactory(datagramSocketFactory15);
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient80 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient80.open();
        discardUDPClient80.setDefaultTimeout((-1));
        discardUDPClient80.setSoTimeout((int) ' ');
        int int86 = discardUDPClient80.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient87 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient87.open();
        discardUDPClient87.setDefaultTimeout((-1));
        discardUDPClient87.setSoTimeout((int) ' ');
        int int93 = discardUDPClient87.getSoTimeout();
        java.nio.charset.Charset charset94 = discardUDPClient87.getCharset();
        discardUDPClient80.setCharset(charset94);
        boolean boolean96 = discardUDPClient80.isOpen();
        java.net.InetAddress inetAddress97 = discardUDPClient80.getLocalAddress();
        discardUDPClient6.send(byteArray54, (int) (byte) 0, inetAddress97);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress97);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNull(outputStream5);
        org.junit.Assert.assertNotNull(inetAddress12);
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
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 32 + "'", int86 == 32);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 32 + "'", int93 == 32);
        org.junit.Assert.assertNotNull(charset94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(inetAddress97);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient3 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient3.open();
        java.net.InetAddress inetAddress5 = discardUDPClient3.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress5, 55336);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNotNull(inetAddress5);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        int int4 = discardTCPClient0.getConnectTimeout();
        int int5 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setConnectTimeout((int) (byte) 0);
        boolean boolean8 = discardTCPClient0.isConnected();
        discardTCPClient0.disconnect();
        java.net.Proxy proxy10 = discardTCPClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        int int10 = discardUDPClient0.getSoTimeout();
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
        java.time.Duration duration73 = discardUDPClient11.getSoTimeoutDuration();
        discardUDPClient0.setSoTimeout(duration73);
        discardUDPClient0.setDefaultTimeout(47200);
        int int77 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
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
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 47200 + "'", int77 == 47200);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory9 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setDefaultPort((int) '4');
        int int12 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setDefaultPort((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = discardTCPClient0.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        discardTCPClient0.disconnect();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient8 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset9 = null;
        discardTCPClient8.setCharset(charset9);
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient11 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient11.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy14 = null;
        discardTCPClient11.setProxy(proxy14);
        discardTCPClient11.setSendBufferSize(100);
        discardTCPClient11.setConnectTimeout((int) (short) 10);
        javax.net.ServerSocketFactory serverSocketFactory20 = discardTCPClient11.getServerSocketFactory();
        discardTCPClient8.setServerSocketFactory(serverSocketFactory20);
        discardTCPClient0.setServerSocketFactory(serverSocketFactory20);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        javax.net.SocketFactory socketFactory8 = null;
        discardTCPClient0.setSocketFactory(socketFactory8);
        java.net.Proxy proxy10 = discardTCPClient0.getProxy();
        int int11 = discardTCPClient0.getDefaultTimeout();
        java.nio.charset.Charset charset12 = discardTCPClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(charset12);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoLinger(false, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset3);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        discardUDPClient0.setSoTimeout(60000);
        int int11 = discardUDPClient0.getDefaultTimeout();
        int int12 = discardUDPClient0.getSoTimeout();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient19 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient19.open();
        discardUDPClient19.setDefaultTimeout((-1));
        discardUDPClient19.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress25 = discardUDPClient19.getLocalAddress();
        discardUDPClient19.setDefaultTimeout((int) (byte) 100);
        discardUDPClient19.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory30 = null;
        discardUDPClient19.setDatagramSocketFactory(datagramSocketFactory30);
        java.nio.charset.Charset charset32 = discardUDPClient19.getCharset();
        discardUDPClient13.setCharset(charset32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient39 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient39.setDefaultTimeout(0);
        discardUDPClient39.setDefaultTimeout((int) (short) 1);
        java.lang.String str44 = discardUDPClient39.getCharsetName();
        discardUDPClient39.open();
        discardUDPClient39.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient48 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient48.open();
        discardUDPClient48.open();
        java.net.InetAddress inetAddress51 = discardUDPClient48.getLocalAddress();
        discardUDPClient39.open(0, inetAddress51);
        discardUDPClient13.send(byteArray38, inetAddress51);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient55 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient55.open();
        discardUDPClient55.setDefaultTimeout((-1));
        discardUDPClient55.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress61 = discardUDPClient55.getLocalAddress();
        discardUDPClient55.setDefaultTimeout((int) (byte) 100);
        discardUDPClient55.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress66 = discardUDPClient55.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray38, 40588, inetAddress66, 41977);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertNotNull(inetAddress25);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 0, 0, -1]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTF-8" + "'", str44, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress51);
        org.junit.Assert.assertNotNull(inetAddress61);
        org.junit.Assert.assertNotNull(inetAddress66);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
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
            discardTCPClient0.connect(inetAddress31, 58583);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connect: timeout can't be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(charset15);
        org.junit.Assert.assertNotNull(duration16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53716 + "'", int17 == 53716);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF-8" + "'", str24, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress31);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        boolean boolean2 = discardTCPClient0.isAvailable();
        java.lang.String str3 = discardTCPClient0.getCharsetName();
        int int4 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        java.lang.Class<?> wildcardClass26 = discardTCPClient0.getClass();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        boolean boolean28 = discardTCPClient0.isConnected();
        int int29 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.setDefaultTimeout(0);
        discardUDPClient0.setDefaultTimeout((int) (short) 1);
        java.lang.String str5 = discardUDPClient0.getCharsetName();
        discardUDPClient0.open();
        java.time.Duration duration7 = discardUDPClient0.getSoTimeoutDuration();
        java.time.Duration duration8 = discardUDPClient0.getSoTimeoutDuration();
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.lang.String str10 = discardUDPClient0.getCharsetName();
        int int11 = discardUDPClient0.getDefaultTimeout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize((int) (short) -1);
        discardTCPClient0.setDefaultPort((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient8 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient8.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset11 = discardTCPClient8.getCharset();
        discardTCPClient0.setCharset(charset11);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient13 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient13.open();
        discardUDPClient13.setDefaultTimeout((-1));
        discardUDPClient13.setSoTimeout((int) ' ');
        int int19 = discardUDPClient13.getSoTimeout();
        java.nio.charset.Charset charset20 = null;
        discardUDPClient13.setCharset(charset20);
        java.nio.charset.Charset charset22 = discardUDPClient13.getCharset();
        int int23 = discardUDPClient13.getSoTimeout();
        discardUDPClient13.setSoTimeout((int) (byte) 100);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient26 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient26.open();
        discardUDPClient26.setDefaultTimeout((-1));
        discardUDPClient26.setSoTimeout((int) ' ');
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient32 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient32.open();
        discardUDPClient32.setDefaultTimeout((-1));
        discardUDPClient32.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress38 = discardUDPClient32.getLocalAddress();
        discardUDPClient32.setDefaultTimeout((int) (byte) 100);
        discardUDPClient32.setDefaultTimeout((int) 'a');
        org.apache.commons.net.DatagramSocketFactory datagramSocketFactory43 = null;
        discardUDPClient32.setDatagramSocketFactory(datagramSocketFactory43);
        java.nio.charset.Charset charset45 = discardUDPClient32.getCharset();
        discardUDPClient26.setCharset(charset45);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient52 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient52.setDefaultTimeout(0);
        discardUDPClient52.setDefaultTimeout((int) (short) 1);
        java.lang.String str57 = discardUDPClient52.getCharsetName();
        discardUDPClient52.open();
        discardUDPClient52.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient61 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient61.open();
        discardUDPClient61.open();
        java.net.InetAddress inetAddress64 = discardUDPClient61.getLocalAddress();
        discardUDPClient52.open(0, inetAddress64);
        discardUDPClient26.send(byteArray51, inetAddress64);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient67 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient67.open();
        discardUDPClient67.setDefaultTimeout((-1));
        discardUDPClient67.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress73 = discardUDPClient67.getLocalAddress();
        discardUDPClient67.setDefaultTimeout((int) (byte) 100);
        discardUDPClient67.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress78 = discardUDPClient67.getLocalAddress();
        discardUDPClient13.send(byteArray51, inetAddress78);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient81 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient81.open();
        discardUDPClient81.setDefaultTimeout((-1));
        discardUDPClient81.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress87 = discardUDPClient81.getLocalAddress();
        discardUDPClient81.setDefaultTimeout((int) (byte) 100);
        discardUDPClient81.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress92 = discardUDPClient81.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress78, (int) 'a', inetAddress92, 60000);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNull(charset22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(inetAddress38);
        org.junit.Assert.assertNotNull(charset45);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, 0, 0, -1]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTF-8" + "'", str57, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress64);
        org.junit.Assert.assertNotNull(inetAddress73);
        org.junit.Assert.assertNotNull(inetAddress78);
        org.junit.Assert.assertNotNull(inetAddress87);
        org.junit.Assert.assertNotNull(inetAddress92);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
            discardTCPClient0.connect("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open(58583);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Indirizzo gia? in uso (Bind failed)");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        javax.net.ServerSocketFactory serverSocketFactory7 = discardTCPClient0.getServerSocketFactory();
        int int8 = discardTCPClient0.getDefaultPort();
        boolean boolean9 = discardTCPClient0.isAvailable();
        java.net.Proxy proxy10 = discardTCPClient0.getProxy();
        int int11 = discardTCPClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(serverSocketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
        discardUDPClient0.setDefaultTimeout(49957);
        java.net.InetAddress inetAddress22 = discardUDPClient0.getLocalAddress();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52495 + "'", int19 == 52495);
        org.junit.Assert.assertNotNull(inetAddress22);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset3 = discardTCPClient0.getCharset();
        boolean boolean4 = discardTCPClient0.isAvailable();
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        int int7 = discardTCPClient0.getDefaultPort();
        int int8 = discardTCPClient0.getDefaultTimeout();
        int int9 = discardTCPClient0.getDefaultTimeout();
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = discardTCPClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        int int7 = discardUDPClient0.getDefaultTimeout();
        int int8 = discardUDPClient0.getLocalPort();
        discardUDPClient0.close();
        discardUDPClient0.setDefaultTimeout(43331);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36456 + "'", int8 == 36456);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.setDefaultTimeout(60000);
        discardTCPClient0.setDefaultPort((int) (short) -1);
        discardTCPClient0.setConnectTimeout(46312);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        int int10 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(serverSocketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        int int7 = discardUDPClient0.getDefaultTimeout();
        int int8 = discardUDPClient0.getLocalPort();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.open((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44507 + "'", int8 == 44507);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
            discardTCPClient0.setSoTimeout((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        java.net.Proxy proxy4 = null;
        discardTCPClient0.setProxy(proxy4);
        discardTCPClient0.setConnectTimeout(52495);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        discardTCPClient0.disconnect();
        javax.net.SocketFactory socketFactory3 = null;
        discardTCPClient0.setSocketFactory(socketFactory3);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.setSoTimeout(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        discardTCPClient0.setSendBufferSize(100);
        int int7 = discardTCPClient0.getConnectTimeout();
        java.nio.charset.Charset charset8 = discardTCPClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
        boolean boolean28 = discardTCPClient0.isConnected();
        discardTCPClient0.setSendBufferSize(46312);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNull(outputStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTF-8" + "'", str21, "UTF-8");
        org.junit.Assert.assertNotNull(charset22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        int int3 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        int int18 = discardTCPClient0.getDefaultPort();
        java.net.Proxy proxy19 = null;
        discardTCPClient0.setProxy(proxy19);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        discardUDPClient0.open();
        discardUDPClient0.setSoTimeout(60000);
        org.junit.Assert.assertNotNull(inetAddress6);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
            java.lang.String str14 = discardTCPClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory12);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str1 = discardTCPClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory2 = discardTCPClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
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
        discardUDPClient11.setCharset(charset28);
        java.nio.charset.Charset charset30 = discardUDPClient11.getCharset();
        discardTCPClient0.setCharset(charset30);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(charset30);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient2 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient2.open();
        discardUDPClient2.open();
        int int5 = discardUDPClient2.getDefaultTimeout();
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
        discardUDPClient2.setDefaultTimeout(duration19);
        discardUDPClient0.setDefaultTimeout(duration19);
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient23 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient23.open();
        discardUDPClient23.setDefaultTimeout((-1));
        discardUDPClient23.setSoTimeout((int) ' ');
        int int29 = discardUDPClient23.getSoTimeout();
        java.nio.charset.Charset charset30 = null;
        discardUDPClient23.setCharset(charset30);
        java.nio.charset.Charset charset32 = discardUDPClient23.getCharset();
        java.time.Duration duration33 = discardUDPClient23.getSoTimeoutDuration();
        int int34 = discardUDPClient23.getLocalPort();
        byte[] byteArray35 = new byte[] {};
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient36 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient36.setDefaultTimeout(0);
        discardUDPClient36.setDefaultTimeout((int) (short) 1);
        java.lang.String str41 = discardUDPClient36.getCharsetName();
        discardUDPClient36.open();
        discardUDPClient36.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient45 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient45.open();
        discardUDPClient45.open();
        java.net.InetAddress inetAddress48 = discardUDPClient45.getLocalAddress();
        discardUDPClient36.open(0, inetAddress48);
        discardUDPClient23.send(byteArray35, inetAddress48);
        java.net.InetAddress inetAddress52 = null;
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.send(byteArray35, 53339, inetAddress52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal length");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNull(charset18);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNull(charset32);
        org.junit.Assert.assertNotNull(duration33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 42350 + "'", int34 == 42350);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTF-8" + "'", str41, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress48);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setDefaultPort((int) (byte) 100);
        int int3 = discardTCPClient0.getDefaultTimeout();
        discardTCPClient0.setSendBufferSize((int) (short) -1);
        discardTCPClient0.setDefaultPort((-1));
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient8 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient8.setConnectTimeout((int) (byte) -1);
        java.nio.charset.Charset charset11 = discardTCPClient8.getCharset();
        discardTCPClient0.setCharset(charset11);
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
            discardTCPClient0.connect(inetAddress25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF-8" + "'", str18, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress25);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        javax.net.SocketFactory socketFactory4 = null;
        discardTCPClient0.setSocketFactory(socketFactory4);
        discardTCPClient0.setReceiveBufferSize(10);
        java.net.Proxy proxy8 = null;
        discardTCPClient0.setProxy(proxy8);
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = discardTCPClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        discardUDPClient0.setSoTimeout(42718);
        discardUDPClient0.setDefaultTimeout(59623);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.setDefaultTimeout((int) (short) 100);
        discardTCPClient0.disconnect();
        discardTCPClient0.setSendBufferSize(100);
        boolean boolean7 = discardTCPClient0.isAvailable();
        int int8 = discardTCPClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        discardTCPClient0.setSendBufferSize(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = discardTCPClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
            int int11 = discardTCPClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF-8" + "'", str8, "UTF-8");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        int int6 = discardUDPClient0.getSoTimeout();
        java.nio.charset.Charset charset7 = null;
        discardUDPClient0.setCharset(charset7);
        java.nio.charset.Charset charset9 = discardUDPClient0.getCharset();
        java.net.InetAddress inetAddress10 = discardUDPClient0.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            discardUDPClient0.setSoTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: timeout < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(charset9);
        org.junit.Assert.assertNotNull(inetAddress10);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient11 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient11.open();
        discardUDPClient11.setDefaultTimeout((-1));
        discardUDPClient11.setSoTimeout((int) ' ');
        int int17 = discardUDPClient11.getSoTimeout();
        java.nio.charset.Charset charset18 = null;
        discardUDPClient11.setCharset(charset18);
        java.nio.charset.Charset charset20 = discardUDPClient11.getCharset();
        java.time.Duration duration21 = discardUDPClient11.getSoTimeoutDuration();
        int int22 = discardUDPClient11.getLocalPort();
        byte[] byteArray23 = new byte[] {};
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient24 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient24.setDefaultTimeout(0);
        discardUDPClient24.setDefaultTimeout((int) (short) 1);
        java.lang.String str29 = discardUDPClient24.getCharsetName();
        discardUDPClient24.open();
        discardUDPClient24.open();
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient33 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient33.open();
        discardUDPClient33.open();
        java.net.InetAddress inetAddress36 = discardUDPClient33.getLocalAddress();
        discardUDPClient24.open(0, inetAddress36);
        discardUDPClient11.send(byteArray23, inetAddress36);
        // The following exception was thrown during execution in test generation
        try {
            discardTCPClient0.connect(inetAddress36, 59623);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNull(charset20);
        org.junit.Assert.assertNotNull(duration21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52449 + "'", int22 == 52449);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTF-8" + "'", str29, "UTF-8");
        org.junit.Assert.assertNotNull(inetAddress36);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        discardTCPClient0.setConnectTimeout((int) (byte) -1);
        java.net.Proxy proxy3 = null;
        discardTCPClient0.setProxy(proxy3);
        java.net.Proxy proxy5 = discardTCPClient0.getProxy();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient0.getServerSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = discardTCPClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.net.discard.DiscardUDPClient discardUDPClient0 = new org.apache.commons.net.discard.DiscardUDPClient();
        discardUDPClient0.open();
        discardUDPClient0.setDefaultTimeout((-1));
        discardUDPClient0.setSoTimeout((int) ' ');
        java.net.InetAddress inetAddress6 = discardUDPClient0.getLocalAddress();
        discardUDPClient0.setDefaultTimeout((int) (byte) 100);
        discardUDPClient0.setDefaultTimeout((int) 'a');
        java.net.InetAddress inetAddress11 = discardUDPClient0.getLocalAddress();
        java.lang.Class<?> wildcardClass12 = inetAddress11.getClass();
        org.junit.Assert.assertNotNull(inetAddress6);
        org.junit.Assert.assertNotNull(inetAddress11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.nio.charset.Charset charset1 = null;
        discardTCPClient0.setCharset(charset1);
        javax.net.ServerSocketFactory serverSocketFactory3 = discardTCPClient0.getServerSocketFactory();
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient4 = new org.apache.commons.net.discard.DiscardTCPClient();
        java.lang.String str5 = discardTCPClient4.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory6 = discardTCPClient4.getServerSocketFactory();
        discardTCPClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = discardTCPClient0.getCharset();
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(charset8);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        java.io.OutputStream outputStream3 = discardTCPClient0.getOutputStream();
        java.io.OutputStream outputStream4 = discardTCPClient0.getOutputStream();
        java.net.Proxy proxy5 = null;
        discardTCPClient0.setProxy(proxy5);
        discardTCPClient0.setConnectTimeout((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
        org.junit.Assert.assertNull(outputStream3);
        org.junit.Assert.assertNull(outputStream4);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.net.discard.DiscardTCPClient discardTCPClient0 = new org.apache.commons.net.discard.DiscardTCPClient();
        int int1 = discardTCPClient0.getDefaultPort();
        discardTCPClient0.disconnect();
        discardTCPClient0.setConnectTimeout((int) '4');
        discardTCPClient0.setDefaultPort(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }
}
