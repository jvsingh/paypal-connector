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

import ebay.apis.eblbasecomponents.TransactionEntityType;

/**
 * Mule-Devkit-friendly mirror of {@link TransactionEntityType} that is not annotated
 * with Jaxb, in order to avoid code generation errors
 * 
 * @author flbulgarelli
 */
public enum TransactionEntity
{
    NONE, AUTH, REAUTH, ORDER, PAYMENT;
    public TransactionEntityType toPaypalType()
    {
        return Enums.translate(this, TransactionEntityType.class);
    }

}
