import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = pOP3SClient0.getLocalPort();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = pOP3SClient0.getSoTimeout();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        int int7 = pOP3SClient0.getState();
        boolean boolean8 = pOP3SClient0.isEndpointCheckingEnabled();
        boolean boolean9 = pOP3SClient0.noop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress10 = pOP3SClient0.getRemoteAddress();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3Client0.getAdditionalReply();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3SClient0.setTcpNoDelay(true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient0.listMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = pOP3SClient0.getTcpNoDelay();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("Number: 0. Size: 0. Id: null");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = pOP3SClient1.getSoTimeout();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray1 = pOP3Client0.listMessages();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress2 = pOP3Client0.getLocalAddress();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = pOP3SClient0.getTcpNoDelay();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3SClient0.setSoLinger(false, 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        int int1 = pOP3SClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = pOP3SClient0.getSoTimeout();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        pOP3SClient0.setEnabledCipherSuites(strArray8);
        boolean boolean11 = pOP3SClient0.deleteMessage(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = pOP3SClient0.getKeepAlive();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = pOP3Client0.getSoTimeout();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.net.pop3.ExtendedPOP3Client extendedPOP3Client0 = new org.apache.commons.net.pop3.ExtendedPOP3Client();
        javax.net.ssl.HostnameVerifier hostnameVerifier1 = extendedPOP3Client0.getHostnameVerifier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        extendedPOP3Client0.setKeepAlive(false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray3 = pOP3SClient0.listUniqueIdentifiers();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3SClient0.setKeepAlive(true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        boolean boolean7 = pOP3SClient0.noop();
        org.apache.commons.net.pop3.POP3MessageInfo[] pOP3MessageInfoArray8 = pOP3SClient0.listMessages();
        javax.net.ServerSocketFactory serverSocketFactory9 = pOP3SClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3SClient0.getAdditionalReply();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.net.pop3.POP3Client pOP3Client0 = new org.apache.commons.net.pop3.POP3Client();
        boolean boolean1 = pOP3Client0.isConnected();
        org.apache.commons.net.pop3.POP3SClient pOP3SClient2 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str3 = pOP3SClient2.getCharsetName();
        java.nio.charset.Charset charset4 = pOP3SClient2.getCharset();
        pOP3Client0.setCharset(charset4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = pOP3Client0.getSoLinger();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = pOP3SClient0.getRemotePort();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = pOP3SClient1.getRemotePort();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        java.lang.String str1 = pOP3SClient0.getCharsetName();
        java.nio.charset.Charset charset2 = pOP3SClient0.getCharset();
        javax.net.ServerSocketFactory serverSocketFactory3 = pOP3SClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3SClient0.setSoTimeout(100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient0 = new org.apache.commons.net.pop3.POP3SClient();
        pOP3SClient0.setDefaultTimeout((int) (byte) 10);
        pOP3SClient0.setSendBufferSize((int) (byte) 1);
        pOP3SClient0.setConnectTimeout((int) (short) 0);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        pOP3SClient0.setEnabledCipherSuites(strArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress10 = pOP3SClient0.getRemoteAddress();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.net.pop3.POP3SClient pOP3SClient1 = new org.apache.commons.net.pop3.POP3SClient("");
        java.lang.String[] strArray2 = pOP3SClient1.getReplyStrings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        pOP3SClient1.getAdditionalReply();
    }
}

