/**
 * Mule S3 Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Cloud Connector Development Kit
 */
package org.mule.module.paypal.config;

import java.util.HashMap;

import org.mule.construct.SimpleFlowConstruct;
import org.mule.tck.FunctionalTestCase;

public class PaypalNamespaceHandlerTestCase extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return"paypal-namespace-config.xml";
    }

    public void testSendMessageToFlow()throws Exception
    {
    /*
        This test case tests your Mule integration.

        To test your flow directly (i.e. without any inbound endpoints, declare a flow in
        paypal-namespace-config.xml and put the element from your
        cloud connector's namespace that you want to test into it.
        A proper example was put into paypal-namespace-config.xml

        Now you can send data to your test flow from the unit test:

        String payload = <your input to the flow here>;
        SimpleFlowConstruct flow = lookupFlowConstruct("theFlow");
        MuleEvent event = getTestEvent(payload);
        MuleEvent responseEvent = flow.process(event);
        assertEquals(<expected test output>, responseEvent.getMessage().getPayloadAsString());
    */
    }

    private SimpleFlowConstruct lookupFlowConstruct(String name)
    {
        return(SimpleFlowConstruct)muleContext.getRegistry().lookupFlowConstruct(name);
    }
    
    public void testNamespaceConfig2() throws Exception
    {
        assertNotNull(lookupFlowConstruct("theFlow").process(getTestEvent("x")));
    }

    /*
    public void testname() throws Exception
    {
     lookupFlowConstruct("theFlow").process(getTestEvent(new HashMap<K, V>()))   
    }
    */

}
