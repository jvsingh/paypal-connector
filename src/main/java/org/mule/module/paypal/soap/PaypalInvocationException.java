/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal.soap;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.ErrorType;

/**
 * Paypal returned an error
 */
public class PaypalInvocationException extends RuntimeException
{
    private final AbstractResponseType type;

    public PaypalInvocationException(final AbstractResponseType type)
    {
        super(getMsg(type));
        this.type = type;
    }

    public PaypalInvocationException(final AbstractResponseType type, final Throwable cause)
    {
        super(getMsg(type), cause);
        this.type = type;
    }

    public AbstractResponseType getType()
    {
        return type;
    }

    protected static String getMsg(final AbstractResponseType type)
    {
        final StringBuilder sb = new StringBuilder();
        for (final ErrorType error : type.getErrors())
        {
            sb.append(String.format("%s: %3s %s (#%s)", error.getSeverityCode().name(), error.getErrorCode(),
                error.getShortMessage(), type.getCorrelationID()));
        }
        return sb.toString();
    }

}
