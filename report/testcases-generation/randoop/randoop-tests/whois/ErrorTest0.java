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
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream3 = whoisClient0.getInputStream(false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream3 = whoisClient0.getInputStream(true, "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = whoisClient0.getRemotePort();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream2 = whoisClient0.getInputStream("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = whoisClient0.query(false, "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setKeepAlive(true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = whoisClient0.getSoLinger();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = whoisClient0.query(false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = whoisClient0.getKeepAlive();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream3 = whoisClient0.getInputStream("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoLinger(false, (int) '#');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setKeepAlive(true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = whoisClient0.getRemotePort();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = whoisClient0.getRemotePort();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getRemotePort();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = whoisClient0.query(true, "whois.internic.net");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream5 = whoisClient0.getInputStream("UTF-8");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getSoTimeout();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream6 = whoisClient0.getInputStream(false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        java.lang.String str4 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoTimeout((int) (byte) -1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoTimeout((int) '4');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = whoisClient0.query("UTF-8");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        whoisClient0.setDefaultTimeout(60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream8 = whoisClient0.getInputStream(true, "\r\n");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getLocalPort();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = whoisClient0.getLocalAddress();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = whoisClient0.getRemotePort();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        java.lang.String str4 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress2 = whoisClient0.getRemoteAddress();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoTimeout((int) (short) -1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = whoisClient0.getSoLinger();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = whoisClient0.getRemotePort();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        whoisClient0.setSendBufferSize((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = whoisClient0.getRemoteAddress();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.lang.String str4 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream6 = whoisClient0.getInputStream(false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoTimeout(0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = whoisClient0.getSoTimeout();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = whoisClient0.getLocalAddress();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        java.lang.String str4 = whoisClient0.getCharsetName();
        boolean boolean5 = whoisClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = whoisClient0.getLocalPort();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoLinger(false, (int) (short) 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoTimeout(100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress5 = whoisClient0.getLocalAddress();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        whoisClient0.setSendBufferSize((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream6 = whoisClient0.getInputStream(true, "");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = whoisClient0.query(false, "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = whoisClient0.getRemotePort();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        boolean boolean3 = whoisClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getRemotePort();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress2 = whoisClient0.getRemoteAddress();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress9 = whoisClient0.getRemoteAddress();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        whoisClient0.setConnectTimeout((int) (short) 10);
        whoisClient0.setDefaultTimeout((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream11 = whoisClient0.getInputStream(true, "UTF-8");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoLinger(false, (int) (byte) 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        java.net.Proxy proxy3 = whoisClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = whoisClient0.query("whois.internic.net");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        whoisClient0.setSendBufferSize(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream4 = whoisClient0.getInputStream(false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = whoisClient0.query("");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream8 = whoisClient0.getInputStream(false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        int int3 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getSoLinger();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        boolean boolean3 = whoisClient0.isAvailable();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getSoLinger();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        whoisClient0.setSendBufferSize((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getRemotePort();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        whoisClient0.setSendBufferSize(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = whoisClient0.query(false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = whoisClient0.getRemotePort();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        java.net.Proxy proxy7 = whoisClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = whoisClient0.query("hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream6 = whoisClient0.getInputStream(true, "hi!");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.lang.String str4 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = whoisClient0.query(false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = whoisClient0.getLocalPort();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        java.net.Proxy proxy7 = whoisClient0.getProxy();
        java.lang.String str8 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream11 = whoisClient0.getInputStream(true, "\r\n");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        whoisClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress4 = whoisClient0.getRemoteAddress();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        whoisClient0.setReceiveBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream9 = whoisClient0.getInputStream(true, "", "UTF-8");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        whoisClient0.setSendBufferSize((int) (byte) 100);
        java.net.Proxy proxy5 = whoisClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = whoisClient0.query(true, "whois.internic.net");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        boolean boolean1 = whoisClient0.isAvailable();
        java.net.Proxy proxy2 = whoisClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = whoisClient0.query("hi!");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        boolean boolean2 = whoisClient0.isConnected();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream4 = whoisClient0.getInputStream("\r\n");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.lang.String str4 = whoisClient0.getCharsetName();
        javax.net.ServerSocketFactory serverSocketFactory5 = whoisClient0.getServerSocketFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = whoisClient0.getRemotePort();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.net.Proxy proxy3 = whoisClient0.getProxy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(false);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setKeepAlive(true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        int int4 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream6 = whoisClient0.getInputStream("UTF-8");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        whoisClient0.disconnect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoLinger(true, (int) 'a');
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        java.lang.String str4 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = whoisClient0.getSoLinger();
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setTcpNoDelay(false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        java.lang.String str4 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream7 = whoisClient0.getInputStream(false, "hi!");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        int int2 = whoisClient0.getDefaultTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress3 = whoisClient0.getLocalAddress();
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setDefaultPort((int) (short) 1);
        int int4 = whoisClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream6 = whoisClient0.getInputStream("");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        whoisClient0.setReceiveBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setSoLinger(true, 43);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        whoisClient0.setReceiveBufferSize(0);
        int int6 = whoisClient0.getDefaultTimeout();
        java.net.Proxy proxy7 = whoisClient0.getProxy();
        java.lang.String str8 = whoisClient0.getCharsetName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream10 = whoisClient0.getInputStream("hi!");
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        int int1 = whoisClient0.getConnectTimeout();
        int int2 = whoisClient0.getConnectTimeout();
        java.lang.String str3 = whoisClient0.getCharsetName();
        whoisClient0.setReceiveBufferSize((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.InetAddress inetAddress6 = whoisClient0.getLocalAddress();
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        whoisClient0.setConnectTimeout((int) (byte) 100);
        int int4 = whoisClient0.getConnectTimeout();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        whoisClient0.setKeepAlive(true);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        org.apache.commons.net.whois.WhoisClient whoisClient0 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset1 = whoisClient0.getCharset();
        org.apache.commons.net.whois.WhoisClient whoisClient2 = new org.apache.commons.net.whois.WhoisClient();
        java.nio.charset.Charset charset3 = whoisClient2.getCharset();
        whoisClient0.setCharset(charset3);
        int int5 = whoisClient0.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = whoisClient0.query(true);
    }
}

