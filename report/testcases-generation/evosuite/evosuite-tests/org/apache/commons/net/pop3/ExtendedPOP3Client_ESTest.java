/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 07 09:33:16 GMT 2023
 */

package org.apache.commons.net.pop3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.pop3.ExtendedPOP3Client;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExtendedPOP3Client_ESTest extends ExtendedPOP3Client_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExtendedPOP3Client extendedPOP3Client0 = new ExtendedPOP3Client();
      // Undeclared exception!
      try { 
        extendedPOP3Client0.auth((ExtendedPOP3Client.AUTH_METHOD) null, "\r\n", "\r\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.pop3.ExtendedPOP3Client", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExtendedPOP3Client.AUTH_METHOD extendedPOP3Client_AUTH_METHOD0 = ExtendedPOP3Client.AUTH_METHOD.PLAIN;
      String string0 = extendedPOP3Client_AUTH_METHOD0.getAuthName();
      assertEquals("PLAIN", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExtendedPOP3Client extendedPOP3Client0 = new ExtendedPOP3Client();
      ExtendedPOP3Client.AUTH_METHOD extendedPOP3Client_AUTH_METHOD0 = ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5;
      // Undeclared exception!
      try { 
        extendedPOP3Client0.auth(extendedPOP3Client_AUTH_METHOD0, "\r\n", "\r\n");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Socket is not connected
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }
}
