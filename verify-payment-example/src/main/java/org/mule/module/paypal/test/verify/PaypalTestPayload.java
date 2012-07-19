/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal.test.verify;

import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.AddressType;
import ebay.apis.eblbasecomponents.CountryCodeType;
import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.CreditCardTypeType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.PayerInfoType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.PersonNameType;

public class PaypalTestPayload 
{

    private final CreditCardDetailsType cardDetails;
    private final PaymentDetailsType paymentDetails;
    private final String ipAddress;

    public PaypalTestPayload(final String amount, final String userId) 
    {
        this.cardDetails = createCardDetails(userId);
        this.paymentDetails = createPaymentDetails(amount);
        this.ipAddress = "127.0.0.1";
    }

    
    private CreditCardDetailsType createCardDetails(final String userId)
    {
        final CreditCardDetailsType cardDetails = new CreditCardDetailsType();
        cardDetails.setCreditCardType(CreditCardTypeType.VISA);
        cardDetails.setCreditCardNumber("4972116789019528");
        cardDetails.setCVV2("123");
        cardDetails.setExpMonth(4);
        cardDetails.setExpYear(2016);
        PayerInfoType payerInfo = new PayerInfoType();
        AddressType address = new AddressType();
        address.setStreet1("1 Main St.");
        address.setCityName("San Jose");
        address.setStateOrProvince("CA");
        address.setCountry(CountryCodeType.US);
        address.setPostalCode("95131");
        payerInfo.setAddress(address);
        PersonNameType name = new PersonNameType();
        name.setFirstName("John");
        name.setLastName("Doe");
        payerInfo.setPayerName(name);
        payerInfo.setPayerID(userId);
        cardDetails.setCardOwner(payerInfo);
        return cardDetails;
    }
   
    private PaymentDetailsType createPaymentDetails(final String value)
    {
        PaymentDetailsType paymentDetails = new PaymentDetailsType();
        final BasicAmountType amount = new BasicAmountType();
        amount.setValue(value);
        amount.setCurrencyID(CurrencyCodeType.USD);
        paymentDetails.setOrderTotal(amount);
        return paymentDetails;
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
