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

import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;

public class PaypalTestPayload 
{

    private final CreditCardDetailsType cardDetails;
    private final PaymentDetailsType paymentDetails;
    private final String ipAddress;

    public PaypalTestPayload(final CreditCardDetailsType cardDetails,
            final PaymentDetailsType paymentDetails,
            final String ipAddress) 
    {
        this.cardDetails = cardDetails;
        this.paymentDetails = paymentDetails;
        this.ipAddress = ipAddress;
    }

    public CreditCardDetailsType getCardDetails() 
    {
        return cardDetails;
    }

    public PaymentDetailsType getPaymentDetails() 
    {
        return paymentDetails;
    }
    
    public String getIpAddress() 
    {
        return ipAddress;
    }
    
}
