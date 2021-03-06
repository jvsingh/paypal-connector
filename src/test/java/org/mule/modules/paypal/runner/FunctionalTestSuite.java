/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */
package org.mule.modules.paypal.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.paypal.functional.GetBalanceOperationTestCase;
import org.mule.modules.paypal.functional.GetPalDetailsOperationTestCase;

@RunWith(Suite.class)
@SuiteClasses({
        GetBalanceOperationTestCase.class,
        GetPalDetailsOperationTestCase.class})
public class FunctionalTestSuite {

}