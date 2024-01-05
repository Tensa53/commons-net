/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 07 09:42:32 GMT 2023
 */

package org.apache.commons.net.chargen;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.commons.net.chargen.CharGenUDPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CharGenUDPClient_ESTest extends CharGenUDPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress("~aviXX", byteArray0);
      charGenUDPClient0.open(1377, inetAddress0);
      charGenUDPClient0.send(inetAddress0, 0);
      assertEquals(11, CharGenUDPClient.SYSTAT_PORT);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      charGenUDPClient0.open();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      charGenUDPClient0.send(inetAddress0);
      assertTrue(inetAddress0.isLoopbackAddress());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      charGenUDPClient0.open();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      byte[] byteArray0 = new byte[6];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      byte[] byteArray1 = charGenUDPClient0.receive();
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      charGenUDPClient0.open();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      byte[] byteArray1 = charGenUDPClient0.receive();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      // Undeclared exception!
      try { 
        charGenUDPClient0.send(inetAddress0, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      charGenUDPClient0.open();
      try { 
        charGenUDPClient0.receive();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      // Undeclared exception!
      try { 
        charGenUDPClient0.send(inetAddress0, (-286));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-286
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      // Undeclared exception!
      try { 
        charGenUDPClient0.send(inetAddress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      // Undeclared exception!
      try { 
        charGenUDPClient0.receive();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }
}
