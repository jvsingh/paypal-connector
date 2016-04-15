/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */
package org.mule.modules.paypal.util;

import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.mule.api.ConnectionExceptionCode;
import org.mule.modules.paypal.exception.PayPalConnectionException;
import org.w3c.dom.NodeList;

import javax.xml.soap.*;

public class PayPalAPIHelper {

    private static final String rootStringValue = "RequesterCredentials";
    private static final String subRootStringValue = "Credentials";
    private static final String appIdStringValue = "AppId";
    private static final String usernameStringValue = "Username";
    private static final String passwordStringValue = "Password";
    private static final String versionStringValue = "Version";

    private static final String SOAP_HEADER_CREDENTIAL_NAMESPACE_1 = "urn:ebay:api:PayPalAPI";
    private static final String SOAP_HEADER_CREDENTIAL_NAMESPACE_2 = "urn:ebay:apis:eBLBaseComponents";
    private static final String PREFIX_1 = "urn";
    private static final String PREFIX_2 = "urn1";

    private PayPalAPIHelper() {
    }

    public static void getPalDetails(@NotNull String url, @NotNull String username, @NotNull String password, @NotNull String appId, String signature, String version) throws Exception {
    	
    	SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        // Send SOAP Message to SOAP Server
        SOAPMessage soapResponse;
        try {
            soapResponse = soapConnection.call(createGetPalDetailsSOAPRequest(username, password, appId, signature, version), url);
        } catch (Exception e) {
            throw new org.mule.api.ConnectionException(ConnectionExceptionCode.UNKNOWN_HOST, "", "PayPal SOAP Endpoint not reachable.", e);
        }
        if (soapResponse.getSOAPBody().hasFault()) {
            Exception e = processException(soapResponse);
            throw e;
        }
        NodeList palList = soapResponse.getSOAPBody().getElementsByTagName("Pal");
        if (palList == null || (palList != null && palList.getLength() == 0)) {
            Exception e = processException(soapResponse);
            throw e;
        }
        String pal = soapResponse.getSOAPBody().getElementsByTagName("Pal").item(0).getTextContent();
        if (StringUtils.isEmpty(pal)) {
            Exception e = processException(soapResponse);
            throw e;
        }
        soapConnection.close();
    }

    private static Exception processException(@NotNull SOAPMessage soapResponse) {
        Exception exception;
        try {
            String errorLngMsg = soapResponse.getSOAPBody().getElementsByTagName("LongMessage").item(0).getTextContent();
            String errorCode = soapResponse.getSOAPBody().getElementsByTagName("ErrorCode").item(0).getTextContent();
            exception = new PayPalConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, errorCode, errorLngMsg);
        } catch (SOAPException e) {
            exception = e;
        }
        return exception;
    }

    private static SOAPMessage createGetPalDetailsSOAPRequest(@NotNull String username, @NotNull String password, @NotNull String appId, String signature, String version) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();

        envelope.addNamespaceDeclaration(PREFIX_1, SOAP_HEADER_CREDENTIAL_NAMESPACE_1);
        envelope.addNamespaceDeclaration(PREFIX_2, SOAP_HEADER_CREDENTIAL_NAMESPACE_2);

        SOAPHeader soapHeader = envelope.getHeader();
        if (soapHeader == null)
            soapHeader = envelope.addHeader();

        SOAPElement soapReqElement = soapHeader.addChildElement(rootStringValue, PREFIX_1);
        SOAPElement soapCredElement = soapReqElement.addChildElement(subRootStringValue, PREFIX_2);
        soapCredElement.addChildElement(appIdStringValue, PREFIX_2).addTextNode(appId);
        soapCredElement.addChildElement(usernameStringValue, PREFIX_2).addTextNode(username);
        soapCredElement.addChildElement(passwordStringValue, PREFIX_2).addTextNode(password);
        soapCredElement.addChildElement("Signature", PREFIX_2).addTextNode(signature);

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("GetPalDetailsReq", PREFIX_1);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("GetPalDetailsRequest", PREFIX_1);
        soapBodyElem1.addChildElement("Version", PREFIX_2).addTextNode(version);
        soapMessage.saveChanges();
        return soapMessage;
    }
}
