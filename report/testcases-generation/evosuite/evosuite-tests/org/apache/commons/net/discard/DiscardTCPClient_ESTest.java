/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 06 20:48:04 GMT 2023
 */

package org.apache.commons.net.discard;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.net.discard.DiscardTCPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DiscardTCPClient_ESTest extends DiscardTCPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiscardTCPClient discardTCPClient0 = new DiscardTCPClient();
      discardTCPClient0.getOutputStream();
      assertEquals(9, discardTCPClient0.getDefaultPort());
  }
}
