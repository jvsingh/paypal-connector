/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.paypal.testcases;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.paypal.AbstractTestCase;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@Category({ RegressionTests.class })
public class GetPalDetailsOperationTestCases extends AbstractTestCase {

    private final String operation = "GetPalDetails";
    private final String wsdlId = "PayPalAPI";

    @Override
    protected void setUp() throws Exception {
    }

    @Test
    public void testGetBalance() {
        try {
            Map<String, String> results = test(wsdlId, operation);
            assertEquals("Success", results.get("Ack"));
            if ("Error".equalsIgnoreCase(results.get("SeverityCode"))) {
                fail(results.get("LongMessage"));
            }
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
