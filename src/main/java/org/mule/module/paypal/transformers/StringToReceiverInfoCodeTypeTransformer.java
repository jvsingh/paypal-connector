/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.module.paypal.transformers;

import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class StringToReceiverInfoCodeTypeTransformer extends AbstractTransformer implements DiscoverableTransformer
{
    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING + 1;

    public StringToReceiverInfoCodeTypeTransformer()
    {
        registerSourceType(String.class);
        setReturnClass(ebay.apis.eblbasecomponents.ReceiverInfoCodeType.class);
        setName("StringToReceiverInfoCodeTypeTransformer");
    }

    @Override
    protected Object doTransform(Object src, String enc) throws TransformerException
    {
        return Enum.valueOf(ebay.apis.eblbasecomponents.ReceiverInfoCodeType.class, (String)src);
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