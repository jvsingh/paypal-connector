/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.modules.paypal.util;


import javax.xml.soap.*;

public class PayPalAPIHelper {

    private static final String NAMESPACE_URI = "http://api.zuora.com/";
    private static final String _LOGIN_NODE = "login";
    private static final String _USERNAME_NODE = "username";
    private static final String _PASSWORD_NODE = "password";
    private static final String _PREFIX = "api";

    public static String login(String url, String username, String password) throws Exception {
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        // Send SOAP Message to SOAP Server
//        String url = "https://apisandbox.zuora.com/apps/services/a/66.0";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(username, password), url);
        final String sessionId = soapResponse.getSOAPBody().getFirstChild().getFirstChild().getFirstChild().getFirstChild().getNodeValue();
        soapConnection.close();
        return sessionId;
    }

    private static SOAPMessage createSOAPRequest(String username, String password) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(_PREFIX, NAMESPACE_URI);

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement(_LOGIN_NODE, _PREFIX);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(_USERNAME_NODE, _PREFIX);
        soapBodyElem1.addTextNode(username);
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement(_PASSWORD_NODE, _PREFIX);
        soapBodyElem2.addTextNode(password);
        soapMessage.saveChanges();

        return soapMessage;
    }
}
