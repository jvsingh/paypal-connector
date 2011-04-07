/**
 * Mule S3 Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.paypal.soap;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.mule.module.paypal.PaypalFacade;

import ebay.api.paypalapi.AddressVerifyReq;
import ebay.api.paypalapi.AddressVerifyRequestType;
import ebay.api.paypalapi.AddressVerifyResponseType;
import ebay.api.paypalapi.GetBalanceReq;
import ebay.api.paypalapi.GetBalanceRequestType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.api.paypalapi.GetPalDetailsRequestType;
import ebay.api.paypalapi.PayPalAPIAAInterface;
import ebay.api.paypalapi.PayPalAPIInterface;
import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.AckCodeType;
import ebay.apis.eblbasecomponents.UserIdPasswordType;

/**
 * https://cms.paypal.com/us/cgi-bin/?cmd=_render-content&content_ID=developer/
 * e_howto_api_soap_PayPalSOAPAPIArchitecture
 */
public class SoapPaypalFacade implements PaypalFacade
{
    private final String username;
    private final String password;
    private final String signature;
    private final String subject;

    private String apiVersion = "66.0";
    private PayPalAPIInterface api;
    private PayPalAPIAAInterface extendedApi;

    /**
     * Creates the SoapPaypalFacade.
     * 
     * @param username Paypal username
     * @param password Paypal password
     * @param signature PayPal-generated unique digital signature (a line of text, or
     *            hash) that you copy from PayPal's website and include in your API
     *            calls. An alternative to API Certificate security.
     * @param subject An indicator in an API call of the account for whom the call is
     *            being made
     */
    public SoapPaypalFacade(final String username,
                            final String password,
                            final String signature,
                            final String subject)
    {
        Validate.notEmpty(password);
        Validate.notEmpty(signature);
        Validate.notEmpty(username);
        
        this.username = username;
        this.password = password;
        this.signature = signature;
        this.subject = subject;
    }

    private PayPalAPIInterface getApi()
    {
        if (api == null)
        {
            final JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

            factory.getInInterceptors().add(new LoggingInInterceptor());
            factory.getOutInterceptors().add(new LoggingOutInterceptor());
            factory.setServiceClass(PayPalAPIInterface.class);
            factory.setAddress("https://api-3t.sandbox.paypal.com/2.0/");
            api = (PayPalAPIInterface) factory.create();
            final List<Header> headers = new ArrayList<Header>();

            final UserIdPasswordType creds = new UserIdPasswordType();
            creds.setUsername(username);
            creds.setPassword(password);
            creds.setSignature(signature);
            creds.setSubject(subject);

            Header authHeader;
            try
            {
                authHeader = new Header(new QName("urn:ebay:api:PayPalAPI", "RequesterCredentials"), creds,
                    new JAXBDataBinding(creds.getClass()));
                headers.add(authHeader);

                // client side:
                ((BindingProvider) api).getRequestContext().put(Header.HEADER_LIST, headers);
            }
            catch (final JAXBException e)
            {
                throw new UnhandledException(e);
            }
        }
        return api;
    }

    public GetBalanceResponseType getBalance(final boolean returnAllCurrencies)
    {
        final GetBalanceReq balanceRequest = new GetBalanceReq();
        final GetBalanceRequestType payload = new GetBalanceRequestType();
        payload.setReturnAllCurrencies(tostring(returnAllCurrencies));
        payload.setVersion(apiVersion);
        balanceRequest.setGetBalanceRequest(payload);
        final GetBalanceResponseType ret = getApi().getBalance(balanceRequest);
        handleError(ret);

        return ret;
    }

    public AddressVerifyResponseType addressVerify(final String email, final String street, final String zip)
    {
        Validate.notNull(email, "email is null");
        Validate.notNull(street, "street is null");
        Validate.notNull(zip, "zip is null");
        
        final AddressVerifyReq request = new AddressVerifyReq();
        final AddressVerifyRequestType payload = new AddressVerifyRequestType();
        payload.setEmail(email);
        payload.setStreet(street);
        payload.setZip(zip);
        payload.setVersion(apiVersion);
        request.setAddressVerifyRequest(payload);
        final AddressVerifyResponseType ret = getApi().addressVerify(request);
        handleError(ret);

        return ret;
    }

    
    /**
     * @param apiVersion the apiVersion to set
     */
    public void setApiVersion(final String apiVersion)
    {
        Validate.isTrue(StringUtils.isNotBlank(apiVersion));
        
        this.apiVersion = apiVersion;
    }
    
    protected void handleError(final AbstractResponseType type)
    {
        final AckCodeType ack = type.getAck();

        if (AckCodeType.FAILURE.equals(ack) || AckCodeType.FAILURE_WITH_WARNING.equals(ack))
        {
            throw new PaypalInvocationException(type);
        }
    }

    /**
     * Several methods expects "1" as true and "0" as false
     */
    private static String tostring(final boolean b)
    {
        return b ? "1" : "0";
    }

}
