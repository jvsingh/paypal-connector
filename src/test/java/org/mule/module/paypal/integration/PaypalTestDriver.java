/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.paypal.integration;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mule.module.paypal.PaypalCloudConnector;
import org.mule.module.paypal.soap.SoapPaypalFacade;

import ebay.api.paypalapi.DoCaptureResponseType;
import ebay.api.paypalapi.DoDirectPaymentResponseType;
import ebay.api.paypalapi.DoVoidResponseType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.api.paypalapi.GetPalDetailsResponseType;
import ebay.api.paypalapi.GetTransactionDetailsResponseType;
import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.AddressType;
import ebay.apis.eblbasecomponents.CountryCodeType;
import ebay.apis.eblbasecomponents.CreditCardDetailsType;
import ebay.apis.eblbasecomponents.CreditCardTypeType;
import ebay.apis.eblbasecomponents.CurrencyCodeType;
import ebay.apis.eblbasecomponents.PayerInfoType;
import ebay.apis.eblbasecomponents.PaymentActionCodeType;
import ebay.apis.eblbasecomponents.PaymentDetailsType;
import ebay.apis.eblbasecomponents.PersonNameType;

public class PaypalTestDriver
{
    private PaypalCloudConnector connector;
    private SoapPaypalFacade facade;
    
    private String testTransaction;
    
    @Before
    public void setUp() 
    {
        System.setProperty("paypal.username", "pro_1302526952_biz_api1.zaubersoftware.com");
        System.setProperty("paypal.password", "LAES4W4LWSDA62UX");
        System.setProperty("paypal.signature", "AUYo1C9jUswfw0tjHI4WKU5W-TC4AszlIL4rfplcsJSTsY2TbV8nLHxI");
        System.setProperty("paypal.testTransactionId", "9SD57007VA765510A");
        
        final String username = System.getProperty("paypal.username");
        final String password = System.getProperty("paypal.password");
        final String signature = System.getProperty("paypal.signature");
        testTransaction = System.getProperty("paypal.testTransactionId");
        
        facade = new SoapPaypalFacade(username, password, signature, null);
        connector = new PaypalCloudConnector(facade);
        connector.setDefaultCurrency(CurrencyCodeType.USD);
    }

    @Test
    /** Gets configured account's balance */
    public void testGetBalance() 
    {
        final GetBalanceResponseType response = connector.getBalance(true);
        Assert.assertNotNull(response.getBalance());
        Assert.assertTrue(StringUtils.isNotBlank(response.getBalance().getValue()));
    }
    
    @Test
    /** Gets configured account's details */
    public void testPalDetails() 
    {
        GetPalDetailsResponseType palDetails = connector.getPalDetails();
        Assert.assertTrue(StringUtils.isNotBlank(palDetails.getPal()));
    }
    

    @Test
    /** Generates a credit card payment */
    public void testDirectPayment() 
    {
        final DoDirectPaymentResponseType payment = doDirectPayment();
        Assert.assertNotNull(payment.getTransactionID());
    }

    @Test
    /** Gets details of a previously created test transaction */
    public void testGetTransactionDetails() 
    {
        final DoDirectPaymentResponseType payment = doDirectPayment();
        GetTransactionDetailsResponseType transactionDetails 
        = connector.getTransactionDetails(payment.getTransactionID());
        final PersonNameType payerName = transactionDetails
                                        .getPaymentTransactionDetails()
                                        .getPayerInfo()
                                        .getPayerName();
        Assert.assertEquals("John", payerName.getFirstName());
        Assert.assertEquals("Doe", payerName.getLastName());
    }

    @Test
    /** Generates a delayed payment and then voids the authorization */
    public void testDoVoid()
    {
       
        final String authId = doDirectPayment().getTransactionID();
        final DoVoidResponseType response = connector.doVoid(authId, null);
        Assert.assertEquals(authId, response.getAuthorizationID());
    }

    @Test
    /** Generates a delayed payment and then captures the funds */
    public void testCapture() 
    {
        final DoDirectPaymentResponseType payment = doDirectPayment();
        final BasicAmountType amount = payment.getAmount();
        final String authId = payment.getTransactionID();
        
        final DoCaptureResponseType response = connector.capture(authId, true, amount.getValue(), 
                                                        amount.getCurrencyID(), null, null, null);
        
        Assert.assertEquals(authId, response.getDoCaptureResponseDetails().getAuthorizationID());
    }
        
    /* Generates a credit card payment */
    private DoDirectPaymentResponseType doDirectPayment() 
    {
        CreditCardDetailsType cardDetails = new CreditCardDetailsType();
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
        cardDetails.setCardOwner(payerInfo);
        
        PaymentDetailsType paymentDetails = new PaymentDetailsType();
        final BasicAmountType amount = new BasicAmountType();
        amount.setValue("10.0");
        amount.setCurrencyID(CurrencyCodeType.USD);
        paymentDetails.setOrderTotal(amount);
        
        return connector.doDirectPayment("127.0.0.1", cardDetails, paymentDetails, 
                                         PaymentActionCodeType.AUTHORIZATION, false);
    }
    
}


