/**
 * Mule S3 Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.paypal;

import ebay.api.paypalapi.AddressVerifyResponseType;
import ebay.api.paypalapi.DoCaptureResponseType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CompleteCodeType;

public interface PaypalFacade
{

    GetBalanceResponseType getBalance(final boolean returnAllCurrencies);
    
    AddressVerifyResponseType addressVerify(final String email, final String street, 
                                            final String zip);
    
    DoCaptureResponseType capture(final String authorizationId, final CompleteCodeType complete,
                                         final BasicAmountType amount, final String invoiceId, 
                                         final String note, final String softDescriptor);
    
}


