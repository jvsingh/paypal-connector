/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.modules.paypal;

import com.google.common.reflect.TypeToken;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.List;

public class PayPalTestCase {

    @Test
    public void test(){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            // error - should NOT be allowed to proceed
        }
        getDocument(builder);

    }

    private Document getDocument(DocumentBuilder builder) {
        final String rootStringValue = "RequesterCredentials";
        final String subRootStringValue = "Credentials";
        final String appIdStringValue = "AppId";
        final String usernameStringValue = "Username";
        final String passwordStringValue = "Password";
        final String signatureStringValue = "Signature";


        Document doc = builder.newDocument();
        // create the root element node
        Element element = doc.createElementNS("urn:ebay:api:PayPalAPI", "urn:" + rootStringValue);
        element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:urn", "urn:ebay:api:PayPalAPI");
        doc.appendChild(element);

        // create another root element
        Element subElement = doc.createElementNS("urn:ebay:apis:eBLBaseComponents", "urn1:" + subRootStringValue);
        subElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:urn1", "urn:ebay:apis:eBLBaseComponents");
        element.appendChild(subElement);

        // add app id element
        Element appIdElement =doc.createElementNS("urn:ebay:apis:eBLBaseComponents", "urn1:" + appIdStringValue);
        appIdElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:urn1", "urn:ebay:apis:eBLBaseComponents");
        appIdElement.insertBefore(doc.createTextNode("APPID"), appIdElement.getLastChild());
        subElement.appendChild(appIdElement);

        // add username element
        Element usernameElement = doc.createElementNS("urn:ebay:apis:eBLBaseComponents", "urn1:" + usernameStringValue);
        usernameElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:urn1", "urn:ebay:apis:eBLBaseComponents");
        usernameElement.insertBefore(doc.createTextNode("username"), usernameElement.getLastChild());
        subElement.appendChild(usernameElement);

        // add password element
        Element passwordElement = doc.createElementNS("urn:ebay:apis:eBLBaseComponents", "urn1:" + passwordStringValue);
        passwordElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:urn1", "urn:ebay:apis:eBLBaseComponents");
        passwordElement.insertBefore(doc.createTextNode("password"), passwordElement.getLastChild());
        subElement.appendChild(passwordElement);

        // add signature element
        Element signatureElement = doc.createElementNS("urn:ebay:apis:eBLBaseComponents", "urn1:" + signatureStringValue);
        signatureElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:urn1", "urn:ebay:apis:eBLBaseComponents");
        signatureElement.insertBefore(doc.createTextNode("sig"), signatureElement.getLastChild());
        subElement.appendChild(signatureElement);

        trans(doc);
        return doc;
    }

    private void trans(Document doc)  {
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tf.newTransformer();
            transformer.transform(domSource, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        System.out.println("XML IN String format is: \n" + writer.toString());
    }

//    @Test
    public void testCase() throws Exception {
        Type listString = new TypeToken<List<Document>>(){}.getType();
        System.out.println(listString.toString());
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        // Send SOAP Message to SOAP Server
        String url = "https://apisandbox.zuora.com/apps/services/a/66.0";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);
        printSOAPResponse(soapResponse);

        QName bodyName = new QName("http://api.zuora.com/", "Session", "ns1");

        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        Node body = soapResponse.getSOAPBody();
        String result = xpath.evaluate("//ns1:Session/text()", body);
//        Iterator it = soapResponse.getSOAPBody().getElementsByTagName("result").item(0).getTextContent();
//
//        while (it.hasNext()) {
//            SOAPBodyElement element = (SOAPBodyElement) it.next();
//            System.out.println(element.getValue());
//        }
        soapConnection.close();

    }

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://api.zuora.com/";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("api", serverURI);

        /*
        Constructed SOAP Request Message:
        <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:example="http://ws.cdyne.com/">
            <SOAP-ENV:Header/>
            <SOAP-ENV:Body>
                <example:VerifyEmail>
                    <example:email>mutantninja@gmail.com</example:email>
                    <example:LicenseKey>123</example:LicenseKey>
                </example:VerifyEmail>
            </SOAP-ENV:Body>
        </SOAP-ENV:Envelope>
         */

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("login", "api");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("username", "api");
        soapBodyElem1.addTextNode("mule@muletax.com");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("password", "api");
        soapBodyElem2.addTextNode("Mule2012");

//        MimeHeaders headers = soapMessage.getMimeHeaders();
//        headers.addHeader("SOAPAction", "");

        soapMessage.saveChanges();

        /* Print the request message */
        System.out.print("Request SOAP Message = ");
        soapMessage.writeTo(System.out);
        System.out.println();

        return soapMessage;
    }

    private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.print("\nResponse SOAP Message = ");
        StreamResult result = new StreamResult(System.out);
        transformer.transform(sourceContent, result);
    }
}
