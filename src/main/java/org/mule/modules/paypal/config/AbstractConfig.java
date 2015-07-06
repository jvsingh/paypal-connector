/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.modules.paypal.config;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.mule.api.ConnectionException;
import org.mule.api.ConnectionExceptionCode;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.modules.paypal.util.PayPalAPIHelper;
import org.mule.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConfig {

    private static final Logger logger = LogManager.getLogger(AbstractConfig.class.getName());

    private static final String PORT_TYPE_NAME_1 = "PayPalAPI";
    private static final String PORT_TYPE_NAME_2 = "PayPalAPIAA";
    private static final String SERVICE_NAME = "PayPalAPIInterfaceService";
    final String rootStringValue = "RequesterCredentials";
    final String subRootStringValue = "Credentials";
    final String appIdStringValue = "AppId";
    final String usernameStringValue = "Username";
    final String passwordStringValue = "Password";
    final String SOAP_HEADER_CREDENTIAL_NAMESPACE_1 = "urn:ebay:api:PayPalAPI";
    final String SOAP_HEADER_CREDENTIAL_NAMESPACE_2 = "urn:ebay:apis:eBLBaseComponents";
    final String XMLNS = "xmlns";
    final String PREFIX_1 = "urn";
    final String w3_NAMESPACE = "http://www.w3.org/2000/xmlns/";
    final String PREFIX_2 = "urn1";


    /**
     * Username used to initialise a PayPal session.
     */
    @Configurable
    @Placement(order = 1, group = "Connection")
    private String username;

    /**
     * Password to authenticate the user.
     */
    @Configurable
    @Placement(order = 2, group = "Connection")
    @Password
    private String password;

    /**
     * ServiceNow endpoint URL.
     */
    @Configurable
    @Placement(order = 3, group = "Connection")
    private String serviceAddress;


    @Configurable
    @Placement(order = 5, group = "Connection")
    private String appId;


    @WsdlServiceEndpoint
    public String resolveAddress(final ServiceDefinition serviceDefinition) {
        return getServiceAddress();
    }

    @WsdlServiceRetriever
    public List<ServiceDefinition> getDefinitions() {
        final List<ServiceDefinition> result = new ArrayList<>();
        final String wsdlPath = "PayPalSvc.wsdl";
        result.add(new DefaultServiceDefinition(PORT_TYPE_NAME_1, PORT_TYPE_NAME_1, wsdlPath, SERVICE_NAME, PORT_TYPE_NAME_1));
        result.add(new DefaultServiceDefinition(PORT_TYPE_NAME_2, PORT_TYPE_NAME_2, wsdlPath, SERVICE_NAME, PORT_TYPE_NAME_2));
        return result;
    }

    @TestConnectivity(label = "Validate Config")
    public void validateConfig() throws org.mule.api.ConnectionException {

        // Check username has been configured ...
        if (StringUtils.isBlank(getUsername())) {
            throw new org.mule.api.ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", "Username attribute must not be null");
        }

        // Check password is not empty ...
        if (StringUtils.isBlank(getPassword())) {
            throw new org.mule.api.ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", "Password attribute must not be null");
        }

        // Check service address has been defined ...
        if (StringUtils.isBlank(getServiceAddress())) {
            throw new org.mule.api.ConnectionException(ConnectionExceptionCode.UNKNOWN_HOST, "", "Service address attribute must not be null");
        }

        try {
            authenticate();
        } catch (Exception e) {
            throw new ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", e.getMessage(), e);
        }


    }

    @NotNull
    protected Document getDocument(@NotNull DocumentBuilder builder) {
        Document doc = builder.newDocument();

        // create the root element node
        Element element = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_1, PREFIX_1 + ":" + rootStringValue);
        element.setAttributeNS(w3_NAMESPACE, XMLNS + ":" + PREFIX_1, SOAP_HEADER_CREDENTIAL_NAMESPACE_1);
        doc.appendChild(element);

        // create another root element
        Element subElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_2, PREFIX_2 + ":" + subRootStringValue);

        subElement.setAttributeNS(w3_NAMESPACE, XMLNS + ":" + PREFIX_2, SOAP_HEADER_CREDENTIAL_NAMESPACE_2);
        element.appendChild(subElement);

        // add app id element
        Element appIdElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_2, PREFIX_2 + ":" + appIdStringValue);
        appIdElement.setAttributeNS(w3_NAMESPACE, XMLNS + ":" + PREFIX_2, SOAP_HEADER_CREDENTIAL_NAMESPACE_2);
        appIdElement.insertBefore(doc.createTextNode(getAppId()), appIdElement.getLastChild());
        subElement.appendChild(appIdElement);

        // add username element
        Element usernameElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_2, PREFIX_2 + ":" + usernameStringValue);
        usernameElement.setAttributeNS(w3_NAMESPACE, XMLNS + ":" + PREFIX_2, SOAP_HEADER_CREDENTIAL_NAMESPACE_2);
        usernameElement.insertBefore(doc.createTextNode(getUsername()), usernameElement.getLastChild());
        subElement.appendChild(usernameElement);

        // add password element
        Element passwordElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_2, PREFIX_2 + ":" + passwordStringValue);
        passwordElement.setAttributeNS(w3_NAMESPACE, XMLNS + ":" + PREFIX_2, SOAP_HEADER_CREDENTIAL_NAMESPACE_2);
        passwordElement.insertBefore(doc.createTextNode(getPassword()), passwordElement.getLastChild());
        subElement.appendChild(passwordElement);

        addCredentialToDocument(doc, subElement);

        return doc;
    }

    protected abstract void addCredentialToDocument(@NotNull Document doc, @NotNull Element whereToAdd);

    protected abstract void authenticate() throws Exception;


    /**
     * GETTERS AND SETTERS
     */

    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @NotNull
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

}
