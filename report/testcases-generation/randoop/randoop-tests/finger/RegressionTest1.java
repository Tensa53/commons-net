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
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient9 = new org.apache.commons.net.finger.FingerClient();
        fingerClient9.disconnect();
        int int11 = fingerClient9.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory15 = fingerClient12.getServerSocketFactory();
        fingerClient9.setServerSocketFactory(serverSocketFactory15);
        fingerClient0.setServerSocketFactory(serverSocketFactory15);
        java.net.InetAddress inetAddress18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory15);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.net.Proxy proxy6 = null;
        fingerClient0.setProxy(proxy6);
        boolean boolean8 = fingerClient0.isAvailable();
        fingerClient0.setDefaultPort((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        fingerClient0.setDefaultPort(79);
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        int int19 = fingerClient0.getConnectTimeout();
        java.net.Proxy proxy20 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNull(proxy18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
        org.junit.Assert.assertNull(proxy20);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        org.apache.commons.net.finger.FingerClient fingerClient5 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset6 = null;
        fingerClient5.setCharset(charset6);
        int int8 = fingerClient5.getConnectTimeout();
        javax.net.SocketFactory socketFactory9 = null;
        fingerClient5.setSocketFactory(socketFactory9);
        fingerClient5.setSendBufferSize((int) (short) 1);
        fingerClient5.setSendBufferSize((-1));
        fingerClient5.setReceiveBufferSize(10);
        fingerClient5.setSendBufferSize((int) (byte) -1);
        fingerClient5.setReceiveBufferSize((int) (short) 1);
        org.apache.commons.net.finger.FingerClient fingerClient21 = new org.apache.commons.net.finger.FingerClient();
        fingerClient21.disconnect();
        fingerClient21.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset25 = fingerClient21.getCharset();
        boolean boolean26 = fingerClient21.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient27 = new org.apache.commons.net.finger.FingerClient();
        fingerClient27.disconnect();
        fingerClient27.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset31 = fingerClient27.getCharset();
        fingerClient21.setCharset(charset31);
        fingerClient5.setCharset(charset31);
        fingerClient0.setCharset(charset31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertNotNull(charset25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charset31);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset14 = null;
        fingerClient13.setCharset(charset14);
        java.nio.charset.Charset charset16 = fingerClient13.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory17 = fingerClient13.getServerSocketFactory();
        int int18 = fingerClient13.getDefaultTimeout();
        boolean boolean19 = fingerClient13.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient20 = new org.apache.commons.net.finger.FingerClient();
        fingerClient20.disconnect();
        int int22 = fingerClient20.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient23 = new org.apache.commons.net.finger.FingerClient();
        fingerClient23.disconnect();
        int int25 = fingerClient23.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory26 = fingerClient23.getServerSocketFactory();
        fingerClient20.setServerSocketFactory(serverSocketFactory26);
        fingerClient13.setServerSocketFactory(serverSocketFactory26);
        fingerClient10.setServerSocketFactory(serverSocketFactory26);
        java.nio.charset.Charset charset30 = fingerClient10.getCharset();
        org.apache.commons.net.finger.FingerClient fingerClient31 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset32 = null;
        fingerClient31.setCharset(charset32);
        int int34 = fingerClient31.getConnectTimeout();
        javax.net.SocketFactory socketFactory35 = null;
        fingerClient31.setSocketFactory(socketFactory35);
        boolean boolean37 = fingerClient31.isAvailable();
        java.net.Proxy proxy38 = fingerClient31.getProxy();
        fingerClient31.disconnect();
        java.nio.charset.Charset charset40 = null;
        fingerClient31.setCharset(charset40);
        org.apache.commons.net.finger.FingerClient fingerClient42 = new org.apache.commons.net.finger.FingerClient();
        fingerClient42.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient44 = new org.apache.commons.net.finger.FingerClient();
        fingerClient44.disconnect();
        fingerClient44.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset48 = fingerClient44.getCharset();
        java.nio.charset.Charset charset49 = fingerClient44.getCharset();
        fingerClient42.setCharset(charset49);
        fingerClient31.setCharset(charset49);
        fingerClient10.setCharset(charset49);
        fingerClient0.setCharset(charset49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = fingerClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(charset16);
        org.junit.Assert.assertNotNull(serverSocketFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 79 + "'", int22 == 79);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 79 + "'", int25 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory26);
        org.junit.Assert.assertNull(charset30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60000 + "'", int34 == 60000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(proxy38);
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(charset49);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        java.net.InetAddress inetAddress31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress31);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        int int4 = fingerClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory5 = null;
        fingerClient0.setSocketFactory(socketFactory5);
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (int) '#', inetAddress9, (-1));
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charset7);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
            fingerClient0.setKeepAlive(false);
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
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
            int int12 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        java.lang.String str15 = fingerClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF-8" + "'", str15, "UTF-8");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        fingerClient0.disconnect();
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient0.setSocketFactory(socketFactory6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        fingerClient0.setReceiveBufferSize((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
            java.lang.String str16 = fingerClient0.query(true, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        fingerClient0.setConnectTimeout((int) (short) -1);
        boolean boolean5 = fingerClient0.isConnected();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = fingerClient0.query(false, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
            java.net.InetAddress inetAddress8 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        boolean boolean7 = fingerClient0.isConnected();
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener10);
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
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
            int int12 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
            java.lang.String str18 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress18 = fingerClient0.getRemoteAddress();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(charset17);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        java.lang.String str3 = fingerClient0.getCharsetName();
        int int4 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        int int19 = fingerClient0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream23 = fingerClient0.getInputStream(false, "hi!", "UTF-8");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fingerClient0.query(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        fingerClient0.setReceiveBufferSize(100);
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
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        fingerClient0.setConnectTimeout((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        // The following exception was thrown during execution in test generation
        try {
            int int11 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        int int2 = fingerClient0.getDefaultPort();
        java.lang.String str3 = fingerClient0.getCharsetName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
            java.lang.String str10 = fingerClient0.query(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((int) (byte) 1);
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        int int12 = fingerClient10.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        int int15 = fingerClient13.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory16 = fingerClient13.getServerSocketFactory();
        fingerClient10.setServerSocketFactory(serverSocketFactory16);
        java.nio.charset.Charset charset18 = fingerClient10.getCharset();
        fingerClient0.setCharset(charset18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = fingerClient0.query(true, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory16);
        org.junit.Assert.assertNotNull(charset18);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        int int25 = fingerClient0.getDefaultPort();
        boolean boolean26 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory20);
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        java.nio.charset.Charset charset5 = fingerClient0.getCharset();
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        boolean boolean7 = fingerClient0.isConnected();
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = fingerClient0.getSoTimeout();
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
            boolean boolean17 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        // The following exception was thrown during execution in test generation
        try {
            int int36 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charset31);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getDefaultPort();
        int int4 = fingerClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 79 + "'", int3 == 79);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        int int14 = fingerClient0.getConnectTimeout();
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.disconnect();
        java.lang.Class<?> wildcardClass7 = fingerClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        fingerClient0.setConnectTimeout((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = fingerClient0.query(false, "hi!");
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
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = fingerClient0.getCharsetName();
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
            java.io.InputStream inputStream26 = fingerClient0.getInputStream(false, "", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        int int14 = fingerClient0.getConnectTimeout();
        java.net.Socket socket15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = fingerClient0.verifyRemote(socket15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        fingerClient0.disconnect();
        java.net.InetAddress inetAddress24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("UTF-8", 100, inetAddress24, 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: UTF-8");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
            boolean boolean15 = fingerClient0.getKeepAlive();
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
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        int int8 = fingerClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        fingerClient0.setDefaultPort((-1));
        int int8 = fingerClient0.getDefaultTimeout();
        int int9 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        javax.net.SocketFactory socketFactory12 = null;
        fingerClient0.setSocketFactory(socketFactory12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient9 = new org.apache.commons.net.finger.FingerClient();
        fingerClient9.disconnect();
        int int11 = fingerClient9.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory15 = fingerClient12.getServerSocketFactory();
        fingerClient9.setServerSocketFactory(serverSocketFactory15);
        fingerClient0.setServerSocketFactory(serverSocketFactory15);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory15);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = fingerClient0.getCharsetName();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(charset17);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress3);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory2);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setConnectTimeout((int) (byte) 1);
        fingerClient0.setSendBufferSize((-1));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
        java.net.Proxy proxy6 = fingerClient0.getProxy();
        int int7 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
            java.io.InputStream inputStream17 = fingerClient0.getInputStream(false, "\r\n");
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress8 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertNotNull(charset7);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        java.lang.String str3 = fingerClient0.getCharsetName();
        boolean boolean4 = fingerClient0.isConnected();
        fingerClient0.setReceiveBufferSize((-1));
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        int int8 = fingerClient0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        int int4 = fingerClient0.getDefaultPort();
        javax.net.SocketFactory socketFactory5 = null;
        fingerClient0.setSocketFactory(socketFactory5);
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        int int14 = fingerClient0.getConnectTimeout();
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 0, inetAddress17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((-1));
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
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress15);
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
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        fingerClient0.setDefaultTimeout((int) (byte) 0);
        boolean boolean4 = fingerClient0.isAvailable();
        boolean boolean5 = fingerClient0.isAvailable();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
            fingerClient0.setSoLinger(false, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
            fingerClient0.connect("", (int) (byte) 100);
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
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        java.net.InetAddress inetAddress17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) '4', inetAddress17, 79);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        boolean boolean36 = fingerClient0.isConnected();
        java.net.InetAddress inetAddress37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress37, 79);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        fingerClient0.setConnectTimeout((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = fingerClient0.getLocalPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
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
            fingerClient0.connect("", (int) (short) 1);
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
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
            int int39 = fingerClient0.getRemotePort();
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
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
            boolean boolean23 = fingerClient0.getTcpNoDelay();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient3 = new org.apache.commons.net.finger.FingerClient();
        fingerClient3.disconnect();
        int int5 = fingerClient3.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory6 = fingerClient3.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory6);
        java.nio.charset.Charset charset8 = fingerClient0.getCharset();
        java.net.InetAddress inetAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress9);
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
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        fingerClient0.disconnect();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress19 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
            java.lang.String str23 = fingerClient0.query(true, "hi!");
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
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        fingerClient0.setSendBufferSize(1);
        java.net.Proxy proxy9 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory3 = fingerClient0.getServerSocketFactory();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        int int9 = fingerClient7.getDefaultPort();
        java.net.Proxy proxy10 = null;
        fingerClient7.setProxy(proxy10);
        boolean boolean12 = fingerClient7.isAvailable();
        int int13 = fingerClient7.getDefaultTimeout();
        java.nio.charset.Charset charset14 = fingerClient7.getCharset();
        fingerClient0.setCharset(charset14);
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress16 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charset14);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        java.net.InetAddress inetAddress15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", (int) '#', inetAddress15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
            java.net.InetAddress inetAddress15 = fingerClient0.getRemoteAddress();
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
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        fingerClient0.setConnectTimeout((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = fingerClient0.getInputStream(true, "\r\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        int int4 = fingerClient0.getDefaultTimeout();
        fingerClient0.disconnect();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        fingerClient0.setReceiveBufferSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fingerClient0.getSoLinger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
            boolean boolean13 = fingerClient0.getKeepAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        fingerClient0.setSendBufferSize(10);
        java.net.InetAddress inetAddress12 = null;
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress12, 0, inetAddress14, (int) '4');
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
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
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
        fingerClient0.setSendBufferSize((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
            fingerClient0.removeProtocolCommandListener(protocolCommandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        java.net.Proxy proxy15 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        java.nio.charset.Charset charset11 = fingerClient0.getCharset();
        java.net.Socket socket12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = fingerClient0.verifyRemote(socket12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(charset11);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        fingerClient0.setDefaultPort((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        fingerClient10.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset14 = null;
        fingerClient10.setCharset(charset14);
        fingerClient10.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean18 = fingerClient17.isConnected();
        java.nio.charset.Charset charset19 = fingerClient17.getCharset();
        fingerClient10.setCharset(charset19);
        fingerClient0.setCharset(charset19);
        javax.net.SocketFactory socketFactory22 = null;
        fingerClient0.setSocketFactory(socketFactory22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
            java.io.InputStream inputStream13 = fingerClient0.getInputStream(false, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
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
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress6, 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        int int7 = fingerClient0.getConnectTimeout();
        fingerClient0.setDefaultTimeout((int) (byte) 1);
        fingerClient0.setSendBufferSize((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = fingerClient0.getSoLinger();
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
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
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
        fingerClient0.setSendBufferSize(10);
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset13 = null;
        fingerClient12.setCharset(charset13);
        int int15 = fingerClient12.getConnectTimeout();
        javax.net.SocketFactory socketFactory16 = null;
        fingerClient12.setSocketFactory(socketFactory16);
        fingerClient12.setSendBufferSize((int) (short) 1);
        fingerClient12.setSendBufferSize((int) (byte) 1);
        org.apache.commons.net.finger.FingerClient fingerClient22 = new org.apache.commons.net.finger.FingerClient();
        fingerClient22.disconnect();
        int int24 = fingerClient22.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient25 = new org.apache.commons.net.finger.FingerClient();
        fingerClient25.disconnect();
        int int27 = fingerClient25.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory28 = fingerClient25.getServerSocketFactory();
        fingerClient22.setServerSocketFactory(serverSocketFactory28);
        java.nio.charset.Charset charset30 = fingerClient22.getCharset();
        fingerClient12.setCharset(charset30);
        fingerClient0.setCharset(charset30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 79 + "'", int24 == 79);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 79 + "'", int27 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory28);
        org.junit.Assert.assertNotNull(charset30);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
        fingerClient0.setReceiveBufferSize(79);
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        java.net.Socket socket11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = fingerClient0.verifyRemote(socket11);
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
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        java.net.Proxy proxy18 = fingerClient0.getProxy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream11 = fingerClient0.getInputStream(true, "hi!", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
        int int25 = fingerClient0.getDefaultPort();
        fingerClient0.setConnectTimeout(10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener28);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        fingerClient0.setReceiveBufferSize(0);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient0.setSocketFactory(socketFactory6);
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        fingerClient0.setConnectTimeout((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        fingerClient10.disconnect();
        fingerClient10.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset14 = null;
        fingerClient10.setCharset(charset14);
        fingerClient10.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient17 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean18 = fingerClient17.isConnected();
        java.nio.charset.Charset charset19 = fingerClient17.getCharset();
        fingerClient10.setCharset(charset19);
        fingerClient0.setCharset(charset19);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream24 = fingerClient0.getInputStream(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        int int19 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress18 = fingerClient0.getRemoteAddress();
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
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        int int6 = fingerClient0.getDefaultTimeout();
        // The following exception was thrown during execution in test generation
        try {
            java.net.InetAddress inetAddress7 = fingerClient0.getLocalAddress();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        boolean boolean2 = fingerClient0.isAvailable();
        fingerClient0.setDefaultTimeout((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient15 = new org.apache.commons.net.finger.FingerClient();
        fingerClient15.disconnect();
        int int17 = fingerClient15.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient15.getServerSocketFactory();
        fingerClient12.setServerSocketFactory(serverSocketFactory18);
        java.nio.charset.Charset charset20 = fingerClient12.getCharset();
        fingerClient0.setCharset(charset20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = fingerClient0.getTcpNoDelay();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
        org.junit.Assert.assertNotNull(charset20);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        javax.net.SocketFactory socketFactory8 = null;
        fingerClient0.setSocketFactory(socketFactory8);
        java.net.Proxy proxy10 = null;
        fingerClient0.setProxy(proxy10);
        java.net.InetAddress inetAddress12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress12);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        fingerClient7.disconnect();
        java.lang.String str9 = fingerClient7.getCharsetName();
        org.apache.commons.net.finger.FingerClient fingerClient10 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset11 = null;
        fingerClient10.setCharset(charset11);
        int int13 = fingerClient10.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = null;
        fingerClient10.setSocketFactory(socketFactory14);
        java.nio.charset.Charset charset16 = null;
        fingerClient10.setCharset(charset16);
        javax.net.ServerSocketFactory serverSocketFactory18 = fingerClient10.getServerSocketFactory();
        boolean boolean19 = fingerClient10.isConnected();
        org.apache.commons.net.finger.FingerClient fingerClient20 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset21 = null;
        fingerClient20.setCharset(charset21);
        int int23 = fingerClient20.getConnectTimeout();
        javax.net.SocketFactory socketFactory24 = null;
        fingerClient20.setSocketFactory(socketFactory24);
        boolean boolean26 = fingerClient20.isAvailable();
        java.net.Proxy proxy27 = fingerClient20.getProxy();
        fingerClient20.disconnect();
        java.nio.charset.Charset charset29 = null;
        fingerClient20.setCharset(charset29);
        org.apache.commons.net.finger.FingerClient fingerClient31 = new org.apache.commons.net.finger.FingerClient();
        fingerClient31.disconnect();
        org.apache.commons.net.finger.FingerClient fingerClient33 = new org.apache.commons.net.finger.FingerClient();
        fingerClient33.disconnect();
        fingerClient33.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset37 = fingerClient33.getCharset();
        java.nio.charset.Charset charset38 = fingerClient33.getCharset();
        fingerClient31.setCharset(charset38);
        fingerClient20.setCharset(charset38);
        fingerClient10.setCharset(charset38);
        fingerClient7.setCharset(charset38);
        fingerClient0.setCharset(charset38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60000 + "'", int1 == 60000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60000 + "'", int23 == 60000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(proxy27);
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(charset38);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(60000);
        fingerClient0.setDefaultPort((int) ' ');
        java.net.Socket socket10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = fingerClient0.verifyRemote(socket10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        boolean boolean5 = fingerClient0.isAvailable();
        java.lang.String str6 = fingerClient0.getCharsetName();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF-8" + "'", str6, "UTF-8");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((-1));
        java.nio.charset.Charset charset10 = fingerClient0.getCharset();
        int int11 = fingerClient0.getConnectTimeout();
        javax.net.ServerSocketFactory serverSocketFactory12 = null;
        fingerClient0.setServerSocketFactory(serverSocketFactory12);
        fingerClient0.setDefaultTimeout((int) '#');
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60000 + "'", int11 == 60000);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        int int14 = fingerClient0.getConnectTimeout();
        boolean boolean15 = fingerClient0.isConnected();
        fingerClient0.setConnectTimeout((int) (byte) 10);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream22 = fingerClient0.getInputStream(true, "", "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        int int1 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient2 = new org.apache.commons.net.finger.FingerClient();
        fingerClient2.disconnect();
        int int4 = fingerClient2.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient2.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory5);
        java.nio.charset.Charset charset7 = fingerClient0.getCharset();
        fingerClient0.setReceiveBufferSize((int) (byte) 100);
        java.net.InetAddress inetAddress10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress10);
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
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
        fingerClient0.setConnectTimeout((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        fingerClient0.setConnectTimeout(100);
        java.lang.Class<?> wildcardClass5 = fingerClient0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory2 = fingerClient0.getServerSocketFactory();
        java.lang.String str3 = fingerClient0.getCharsetName();
        boolean boolean4 = fingerClient0.isConnected();
        fingerClient0.setDefaultPort((int) 'a');
        org.junit.Assert.assertNotNull(charset1);
        org.junit.Assert.assertNotNull(serverSocketFactory2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        int int8 = fingerClient0.getDefaultTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
            fingerClient0.setSoLinger(false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        fingerClient0.setSendBufferSize((int) (byte) 1);
        fingerClient0.setSendBufferSize((int) (short) 100);
        fingerClient0.setDefaultPort((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean1 = fingerClient0.isConnected();
        boolean boolean2 = fingerClient0.isAvailable();
        boolean boolean3 = fingerClient0.isAvailable();
        java.net.Proxy proxy4 = fingerClient0.getProxy();
        java.lang.Class<?> wildcardClass5 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        fingerClient0.setDefaultTimeout((int) '4');
        java.nio.charset.Charset charset6 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: hi!");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset6);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        fingerClient0.setProxy(proxy7);
        int int9 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize(0);
        int int12 = fingerClient0.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        boolean boolean14 = fingerClient13.isConnected();
        java.nio.charset.Charset charset15 = fingerClient13.getCharset();
        fingerClient0.setCharset(charset15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charset15);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setConnectTimeout((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        boolean boolean12 = fingerClient0.isAvailable();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
        boolean boolean10 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.setSendBufferSize((-1));
        boolean boolean3 = fingerClient0.isConnected();
        java.net.Proxy proxy4 = null;
        fingerClient0.setProxy(proxy4);
        fingerClient0.setDefaultPort((-1));
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.setSoTimeout((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        javax.net.SocketFactory socketFactory28 = null;
        fingerClient0.setSocketFactory(socketFactory28);
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
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
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
        javax.net.ServerSocketFactory serverSocketFactory15 = fingerClient0.getServerSocketFactory();
        javax.net.SocketFactory socketFactory16 = null;
        fingerClient0.setSocketFactory(socketFactory16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = fingerClient0.getSoTimeout();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(serverSocketFactory15);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
        java.nio.charset.Charset charset11 = fingerClient0.getCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream13 = fingerClient0.getInputStream(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(charset11);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
        int int17 = fingerClient0.getDefaultPort();
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 79 + "'", int12 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        boolean boolean14 = fingerClient0.isAvailable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 79 + "'", int13 == 79);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        fingerClient0.setConnectTimeout((int) (short) -1);
        fingerClient0.disconnect();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
        java.lang.Class<?> wildcardClass37 = fingerClient0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60000 + "'", int18 == 60000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertNotNull(charset32);
        org.junit.Assert.assertNotNull(charset33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.removeProtocolCommandListener(protocolCommandListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
        java.net.Proxy proxy16 = fingerClient0.getProxy();
        int int17 = fingerClient0.getDefaultTimeout();
        fingerClient0.setSendBufferSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory6);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertNull(proxy16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = null;
        fingerClient0.setProxy(proxy7);
        int int9 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize(0);
        int int12 = fingerClient0.getConnectTimeout();
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect(inetAddress13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid receive size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        fingerClient0.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset4 = null;
        fingerClient0.setCharset(charset4);
        int int6 = fingerClient0.getDefaultPort();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
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
            java.lang.String str12 = fingerClient0.getCharsetName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertNull(charset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        fingerClient0.disconnect();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(serverSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60000 + "'", int16 == 60000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(charset31);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        fingerClient0.setSendBufferSize((int) (short) 1);
        boolean boolean8 = fingerClient0.isAvailable();
        fingerClient0.setSendBufferSize(79);
        java.net.InetAddress inetAddress13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 0, inetAddress13, 79);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        fingerClient12.setDefaultPort((int) (byte) -1);
        java.nio.charset.Charset charset16 = fingerClient12.getCharset();
        fingerClient12.setConnectTimeout((int) '4');
        fingerClient12.setReceiveBufferSize((int) 'a');
        org.apache.commons.net.finger.FingerClient fingerClient21 = new org.apache.commons.net.finger.FingerClient();
        fingerClient21.disconnect();
        int int23 = fingerClient21.getDefaultPort();
        java.net.Proxy proxy24 = null;
        fingerClient21.setProxy(proxy24);
        boolean boolean26 = fingerClient21.isAvailable();
        int int27 = fingerClient21.getDefaultTimeout();
        java.nio.charset.Charset charset28 = fingerClient21.getCharset();
        fingerClient12.setCharset(charset28);
        fingerClient0.setCharset(charset28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = fingerClient0.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory10);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 79 + "'", int23 == 79);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(charset28);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        java.nio.charset.Charset charset6 = null;
        fingerClient0.setCharset(charset6);
        int int8 = fingerClient0.getDefaultTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient9 = new org.apache.commons.net.finger.FingerClient();
        fingerClient9.disconnect();
        int int11 = fingerClient9.getDefaultPort();
        org.apache.commons.net.finger.FingerClient fingerClient12 = new org.apache.commons.net.finger.FingerClient();
        fingerClient12.disconnect();
        int int14 = fingerClient12.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory15 = fingerClient12.getServerSocketFactory();
        fingerClient9.setServerSocketFactory(serverSocketFactory15);
        fingerClient0.setServerSocketFactory(serverSocketFactory15);
        java.nio.charset.Charset charset18 = fingerClient0.getCharset();
        java.net.Proxy proxy19 = null;
        fingerClient0.setProxy(proxy19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 79 + "'", int11 == 79);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 79 + "'", int14 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory15);
        org.junit.Assert.assertNull(charset18);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
        fingerClient0.disconnect();
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNull(proxy12);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        java.net.InetAddress inetAddress14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("\r\n", 10, inetAddress14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: ??");
        } catch (java.net.UnknownHostException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
        fingerClient0.setDefaultTimeout((int) '4');
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset14 = fingerClient13.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory15 = fingerClient13.getServerSocketFactory();
        fingerClient0.setServerSocketFactory(serverSocketFactory15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 79 + "'", int8 == 79);
        org.junit.Assert.assertNotNull(charset14);
        org.junit.Assert.assertNotNull(serverSocketFactory15);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        javax.net.SocketFactory socketFactory6 = null;
        fingerClient0.setSocketFactory(socketFactory6);
        fingerClient0.disconnect();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        int int3 = fingerClient0.getConnectTimeout();
        javax.net.SocketFactory socketFactory4 = null;
        fingerClient0.setSocketFactory(socketFactory4);
        boolean boolean6 = fingerClient0.isAvailable();
        java.net.Proxy proxy7 = fingerClient0.getProxy();
        fingerClient0.disconnect();
        java.net.Socket socket9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fingerClient0.verifyRemote(socket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        int int5 = fingerClient0.getDefaultTimeout();
        fingerClient0.setReceiveBufferSize((int) '4');
        boolean boolean8 = fingerClient0.isConnected();
        java.net.InetAddress inetAddress11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.connect("", (int) (byte) 100, inetAddress11, 79);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connessione rifiutata (Connection refused)");
        } catch (java.net.ConnectException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
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
            fingerClient0.connect(inetAddress13, (int) 'a');
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
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset1 = null;
        fingerClient0.setCharset(charset1);
        java.nio.charset.Charset charset3 = fingerClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory4 = fingerClient0.getServerSocketFactory();
        int int5 = fingerClient0.getDefaultTimeout();
        boolean boolean6 = fingerClient0.isAvailable();
        org.apache.commons.net.finger.FingerClient fingerClient7 = new org.apache.commons.net.finger.FingerClient();
        java.nio.charset.Charset charset8 = null;
        fingerClient7.setCharset(charset8);
        int int10 = fingerClient7.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient11 = new org.apache.commons.net.finger.FingerClient();
        int int12 = fingerClient11.getConnectTimeout();
        org.apache.commons.net.finger.FingerClient fingerClient13 = new org.apache.commons.net.finger.FingerClient();
        fingerClient13.disconnect();
        int int15 = fingerClient13.getDefaultPort();
        javax.net.ServerSocketFactory serverSocketFactory16 = fingerClient13.getServerSocketFactory();
        fingerClient11.setServerSocketFactory(serverSocketFactory16);
        java.nio.charset.Charset charset18 = fingerClient11.getCharset();
        fingerClient7.setCharset(charset18);
        fingerClient0.setCharset(charset18);
        boolean boolean21 = fingerClient0.isConnected();
        org.junit.Assert.assertNull(charset3);
        org.junit.Assert.assertNotNull(serverSocketFactory4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory16);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.net.finger.FingerClient fingerClient0 = new org.apache.commons.net.finger.FingerClient();
        fingerClient0.disconnect();
        int int2 = fingerClient0.getDefaultPort();
        java.net.Proxy proxy3 = null;
        fingerClient0.setProxy(proxy3);
        javax.net.ServerSocketFactory serverSocketFactory5 = fingerClient0.getServerSocketFactory();
        fingerClient0.setSendBufferSize((int) ' ');
        java.net.Proxy proxy8 = null;
        fingerClient0.setProxy(proxy8);
        javax.net.SocketFactory socketFactory10 = null;
        fingerClient0.setSocketFactory(socketFactory10);
        org.apache.commons.net.ProtocolCommandListener protocolCommandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fingerClient0.addProtocolCommandListener(protocolCommandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
        org.junit.Assert.assertNotNull(serverSocketFactory5);
    }
}

