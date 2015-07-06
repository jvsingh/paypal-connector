/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.modules.paypal.config;

import org.jetbrains.annotations.NotNull;
import org.mule.api.annotations.components.WsdlProvider;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.LinkedList;
import java.util.List;

/**
 * PayPal Advance Global configuration. This component should be used if a global
 * configuration is created using username, password and uses client-side certificates
 */
@WsdlProvider(configElementName = "config-advance", friendlyName = "configuration (Certificate)")
public class CertificateConfig extends AbstractConfig {

    @Override
    protected void authenticate() throws Exception {

    }

    @Override
    protected void addCredentialToDocument(@NotNull Document doc, @NotNull Element element) {

    }

    // TODO - implement new Header genration using PayPal API Certificate
//    @WsdlHeaders
    public List<Document> headerResolver(final ServiceDefinition serviceDefinition, String operationName) {
        List<Document> result = new LinkedList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            // error - should NOT be allowed to proceed
        }
//        result.add(getDocument(builder));
        return result;
    }

}
