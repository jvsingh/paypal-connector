/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.modules.paypal.functional;

import org.junit.Rule;
import org.junit.rules.Timeout;
import org.mule.modules.paypal.PayPalConnector;
import org.mule.modules.paypal.testdata.TestdataBuilder;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTestCase extends org.mule.tools.devkit.ctf.junit.AbstractTestCase<PayPalConnector> {


    protected Map<String, String> testResults;
    protected static Properties properties = new Properties();

    @Rule
    public Timeout globalTimeout = new Timeout(600000, TimeUnit.MILLISECONDS);

    public AbstractTestCase() {
        testResults = new HashMap<>();
        this.setConnectorClass(PayPalConnector.class);
    }


    protected Map<String, String> test(String wsdlId, String whichOperation) throws Exception {
        Map<String, String> results = new HashMap<>();
        XMLStreamReader request = TestdataBuilder.getRequest(whichOperation);

        final ConnectorDispatcher<PayPalConnector> dispatcher = this.getDispatcher();
        XMLStreamReader streamReader = dispatcher.invokeWsdlOperation(request, wsdlId, whichOperation);

        while (true) {
            int event = streamReader.next();
            if (event == XMLStreamConstants.END_DOCUMENT) {
                streamReader.close();
                break;
            }
            if (event == XMLStreamConstants.START_ELEMENT) {
                String name = streamReader.getLocalName();
                int eventType = streamReader.next();
                if (eventType == XMLStreamConstants.CHARACTERS) {
                    String value = streamReader.getText();
                    results.put(name, value);
                } else if (eventType == XMLStreamConstants.START_ELEMENT) {
                    String chldname = streamReader.getLocalName();
                    int chldeventType = streamReader.next();
                    if (chldeventType == XMLStreamConstants.CHARACTERS) {
                        String value = streamReader.getText();
                        results.put(chldname, value);
                    }
                }
            }
        }
        System.out.println("results = " + results);

        return Collections.unmodifiableMap(results);
    }


    public void setTestResults(Map<String, String> testResults) {
        this.testResults = testResults;
    }
}