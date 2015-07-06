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

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mule.modules.paypal.AbstractTestCase;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.fail;

@Category({RegressionTests.class})
@RunWith(Parameterized.class)
public class PayPalConnectorTestCases extends AbstractTestCase {

    public PayPalConnectorTestCases(String operation) {
        this.operation = operation;
    }


    @Parameterized.Parameters(name = "{0}TestCase")
    public static Collection data() throws IOException {
        InputStream input = PayPalConnectorTestCases.class.getClassLoader().getResourceAsStream("testconfig.properties");
        properties.load(input);
        List<String> listOfOperation = Arrays.asList(StringUtils.split(properties.getProperty("listOfOperation"), ","));
        return listOfOperation;
    }

    @Test
    public void testInvoke() {
        try {
            Map<String, String> results = test();
            if ("Error".equalsIgnoreCase(results.get("SeverityCode"))) {
                fail(results.get("LongMessage"));
            }
            setTestResults(results);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}