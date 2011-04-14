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
import ebay.api.paypalapi.DoAuthorizationResponseType;
import ebay.api.paypalapi.DoCaptureResponseType;
import ebay.api.paypalapi.DoDirectPaymentResponseType;
import ebay.api.paypalapi.DoReauthorizationResponseType;
import ebay.api.paypalapi.DoVoidResponseType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.api.paypalapi.GetPalDetailsResponseType;
import ebay.api.paypalapi.GetTransactionDetailsResponseType;
import ebay.api.paypalapi.ManagePendingTransactionStatusResponseType;
import ebay.api.paypalapi.RefundTransactionResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.CompleteCodeType;
import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.FMFPendingTransactionActionType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.RefundType;
import ebay.apis.eblbasecomponents.TransactionEntityType;

public interface PaypalFacade
{

    GetBalanceResponseType getBalance(boolean returnAllCurrencies);
    
    AddressVerifyResponseType addressVerify(String email, String street, String zip);
    
    DoCaptureResponseType capture(String authorizationId, CompleteCodeType complete,
                                 BasicAmountType amount, String invoiceId, 
                                 String note, String softDescriptor);

    DoAuthorizationResponseType authorize(String transactionId, BasicAmountType amount, 
                                  TransactionEntityType transactionEntity);
    
    DoReauthorizationResponseType reAuthorize(String authorizationId, BasicAmountType amount);
    
    DoVoidResponseType doVoid(String authorizationId, String note);
    
    GetTransactionDetailsResponseType getTransactionDetails(String transactionId);
    
    ManagePendingTransactionStatusResponseType managePendingTransactionStatus(String transactionId,
                                  FMFPendingTransactionActionType action);
    
    GetPalDetailsResponseType getPalDetails();
    
    RefundTransactionResponseType refundTransaction(String transactionId, String invoiceId, 
                                  RefundType refundType, BasicAmountType amount, String memo);
    
    DoDirectPaymentResponseType doDirectPayment(String ipAddress, CreditCardDetailsType cardDetails, 
                                  PaymentDetailsType paymentDetails, PaymentActionCodeType paymentAction, 
                                  Integer setReturnFMFDetails);
}


