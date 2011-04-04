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

import org.mule.module.paypal.PaypalFacade;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import ebay.api.paypalapi.GetBalanceReq;
import ebay.api.paypalapi.GetBalanceRequestType;
import ebay.api.paypalapi.GetBalanceResponseType;
import ebay.api.paypalapi.PayPalAPIAAInterface;
import ebay.api.paypalapi.PayPalAPIInterface;
import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.AckCodeType;
import ebay.apis.eblbasecomponents.ErrorType;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang.UnhandledException;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * https://cms.paypal.com/us/cgi-bin/?cmd=_render-content&content_ID=developer/
 * e_howto_api_soap_PayPalSOAPAPIArchitecture
 */
public class SoapPaypalFacade implements PaypalFacade
{
    private PayPalAPIInterface api;
    private PayPalAPIAAInterface extendedApi;

    private PayPalAPIInterface getApi()
    {
        if (api == null)
        {
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

            factory.getInInterceptors().add(new LoggingInInterceptor());
            factory.getOutInterceptors().add(new LoggingOutInterceptor());
            factory.setServiceClass(PayPalAPIInterface.class);
            factory.setAddress("https://api-3t.sandbox.paypal.com/2.0/");
            api = (PayPalAPIInterface) factory.create();

            final List<Header> headers = new ArrayList<Header>();
            Header dummyHeader;
            try
            {
                dummyHeader = new Header(new QName("uri:org.apache.cxf", "dummy"), "decapitated",
                    new JAXBDataBinding(String.class));
                headers.add(dummyHeader);

                // client side:
                ((BindingProvider) api).getRequestContext().put(Header.HEADER_LIST, headers);
            }
            catch (JAXBException e)
            {
                throw new UnhandledException(e);
            }
        }
        return api;
    }

    public GetBalanceResponseType getBalance(final boolean returnAllCurrencies)
    {
        final GetBalanceReq balanceRequest = new GetBalanceReq();
        final GetBalanceRequestType type = new GetBalanceRequestType();
        type.setReturnAllCurrencies(tostring(returnAllCurrencies));
        balanceRequest.setGetBalanceRequest(type);
        final GetBalanceResponseType ret = getApi().getBalance(balanceRequest);
        handleError(ret);

        return ret;
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
    private static String tostring(boolean b)
    {
        return b ? "1" : "0";
    }
}
