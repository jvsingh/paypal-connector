/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.paypal;

import java.util.Map;

import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class ParamMapToTestPayloadTransformer extends AbstractTransformer implements DiscoverableTransformer
{
    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING + 1;

    public ParamMapToTestPayloadTransformer()
    {
        registerSourceType(DataTypeFactory.OBJECT);
        setReturnClass(PaypalTestPayload.class);
        setName("ParamMapToTestPayloadTransformer");
    }
    
    @Override
    protected Object doTransform(Object src, String enc) throws TransformerException
    {
        @SuppressWarnings("unchecked")
        final Map<String, Object> map = (Map<String, Object>) src;
        final String amount = (String) map.get("amount");
        return new PaypalTestPayload(amount);
    }
    
    public int getPriorityWeighting()
    {
        return weighting;
    }

    public void setPriorityWeighting(int weighting)
    {
        this.weighting = weighting;
        
    }
    
}


