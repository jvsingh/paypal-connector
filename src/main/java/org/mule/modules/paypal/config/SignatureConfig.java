/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */
package org.mule.modules.paypal.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.mule.api.ConnectionExceptionCode;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.ws.WsdlHeaders;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.modules.paypal.util.PayPalAPIHelper;
import org.mule.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.LinkedList;
import java.util.List;

/**
 * PayPal Simple Global configuration. This component should be used if a global configuration is created using username, password and signature (via the SOAP headers).
 */
@WsdlProvider(configElementName = "config", friendlyName = "configuration (Signature)")
public class SignatureConfig extends AbstractConfig {

    private static final Logger logger = LogManager.getLogger(SignatureConfig.class.getName());

    /**
     * PayPal API Signature.
     */
    @Configurable
    @Placement(order = 4, group = "Connection")
    private String signature;

    @WsdlHeaders
    public List<Document> headerResolver(final ServiceDefinition serviceDefinition, String operationName) {
        List<Document> result = new LinkedList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = dbf.newDocumentBuilder();
            result.add(getDocument(builder));
        } catch (ParserConfigurationException e) {
            logger.error("Error in resolving SOAP headers.", e);
        }
        return result;
    }

    @Override
    protected void addCredentialToDocument(@NotNull Document doc, @NotNull Element element) {
        final String signatureStringValue = "Signature";
        // add signature element
        Element signatureElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP, PREFIX_CREDENTIALS + ":" + signatureStringValue);
        signatureElement.setAttributeNS(W3_NAMESPACE, XMLNS + ":" + PREFIX_CREDENTIALS, SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP);
        signatureElement.insertBefore(doc.createTextNode(getSignature()), signatureElement.getLastChild());
        element.appendChild(signatureElement);
    }

    @Override
    protected void authenticate() throws Exception {
        // Check if signature has been defined ...
        if (StringUtils.isBlank(getSignature())) {
            throw new org.mule.api.ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", "Signature attribute must not be null");
        }
        // Add a test GetPalDetails call to check if credentials are valid
        PayPalAPIHelper.getPalDetails(getServiceAddress(), getUsername(), getPassword(), getAppId(), getSignature());
    }

    @NotNull
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}
