/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PaypalFacadeAdaptor
{
    private static Logger logger = LoggerFactory.getLogger(PaypalFacadeAdaptor.class);
    
    @SuppressWarnings("unchecked")
    public static PaypalFacade adapt(final PaypalFacade facade)
    {
        return (PaypalFacade) Proxy.newProxyInstance(
            PaypalFacadeAdaptor.class.getClassLoader(), new Class[]{PaypalFacade.class},
            new InvocationHandler()
            {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
                {
                    if (logger.isDebugEnabled()) 
                    {
                        logger.debug("Invoked method {0} with arguments {1}", method.getName(), args);
                    }
                    try
                    {
                        Object ret = method.invoke(facade, args);
                        if (logger.isDebugEnabled()) 
                        {
                            logger.debug("Returned method {0} with value {1}", ret);
                        }
                        return ret;
                    }
                    catch (Exception e)
                    {
                        if (logger.isWarnEnabled())
                        {
                            logger.warn("Method " + method.getName() + " thew " + e.getClass(), e);
                        }
                        throw e;
                    }
                    
                }
            });
    }
}


