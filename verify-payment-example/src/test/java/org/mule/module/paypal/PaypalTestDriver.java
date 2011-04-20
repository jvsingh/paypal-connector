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

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.construct.SimpleFlowConstruct;
import org.mule.tck.FunctionalTestCase;

import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.AddressType;
import ebay.apis.eblbasecomponents.CountryCodeType;
import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.CreditCardTypeType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.PayerInfoType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.PersonNameType;

public class PaypalTestDriver extends FunctionalTestCase 
{

    @Override
    /** @see FunctionalTestCase#getConfigResources() */
    protected String getConfigResources() 
    {
        return "mule-config.xml";
    }

    private SimpleFlowConstruct lookupFlowConstruct(String name)
    {
        return (SimpleFlowConstruct) muleContext.getRegistry().lookupFlowConstruct(name);
    }
   
    @Test
    public void testPayment() throws Exception
    {
        final SimpleFlowConstruct flow = lookupFlowConstruct("paymentDemo");
        final PaypalTestPayload payload = new PaypalTestPayload(createCardDetails(), 
                                                createPaymentDetails(), "127.0.0.1");
        final MuleEvent event = getTestEvent(payload);
        flow.process(event);
    }
    
    
    private CreditCardDetailsType createCardDetails()
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
        payerInfo.setPayerID("333");
        cardDetails.setCardOwner(payerInfo);
        return cardDetails;
    }
   
    private PaymentDetailsType createPaymentDetails()
    {
        PaymentDetailsType paymentDetails = new PaymentDetailsType();
        final BasicAmountType amount = new BasicAmountType();
        amount.setValue("160.0");
        amount.setCurrencyID(CurrencyCodeType.USD);
        paymentDetails.setOrderTotal(amount);
        return paymentDetails;
    }
    
    
}
