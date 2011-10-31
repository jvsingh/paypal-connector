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

import javax.xml.bind.annotation.XmlEnumValue;

import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;

/**
 * Mule-Devkit-friendly mirror of
 * {@link ebay.apis.eblbasecomponents.PaymentActionCodeType} that is not annotated
 * with Jaxb, in order to avoid code generation errors
 * 
 * @author flbulgarelli
 */
public enum PaymentActionCode
{

    NONE, AUTHORIZATION, SALE, ORDER;

    public PaymentActionCodeType totoPaypalType()
    {
        return Enums.translate(this, PaymentActionCodeType.class);
    }
}
