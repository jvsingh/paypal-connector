/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
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
import org.mule.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConfig {

    private static final Logger logger = LogManager.getLogger(AbstractConfig.class.getName());

    private static final String PORT_TYPE_NAME_API = "PayPalAPI";
    private static final String PORT_TYPE_NAME_APIAA = "PayPalAPIAA";
    private static final String SERVICE_NAME = "PayPalAPIInterfaceService";
    protected static final String rootStringValue = "RequesterCredentials";
    protected static final String subRootStringValue = "Credentials";
    protected static final String appIdStringValue = "AppId";
    protected static final String usernameStringValue = "Username";
    protected static final String passwordStringValue = "Password";
    protected static final String SOAP_HEADER_CREDENTIAL_NAMESPACE_API = "urn:ebay:api:PayPalAPI";
    protected static final String SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP = "urn:ebay:apis:eBLBaseComponents";
    protected static final String XMLNS = "xmlns";
    protected static final String PREFIX_REQUESTCRED = "urn";
    protected static final String W3_NAMESPACE = "http://www.w3.org/2000/xmlns/";
    protected static final String PREFIX_CREDENTIALS = "urn1";

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
     * PayPal endpoint URL.
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
        result.add(new DefaultServiceDefinition(PORT_TYPE_NAME_API, PORT_TYPE_NAME_API, wsdlPath, SERVICE_NAME, PORT_TYPE_NAME_API));
        result.add(new DefaultServiceDefinition(PORT_TYPE_NAME_APIAA, PORT_TYPE_NAME_APIAA, wsdlPath, SERVICE_NAME, PORT_TYPE_NAME_APIAA));
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
        } catch (ConnectionException ce) {
            logger.error("Error in validating config.", ce);
            throw ce;
        } catch (Exception e) {
            logger.error("Error in validating config.", e);
            throw new ConnectionException(ConnectionExceptionCode.INCORRECT_CREDENTIALS, "", e.getMessage(), e);

        }

    }

    @NotNull
    protected Document getDocument(@NotNull DocumentBuilder builder) {
        Document doc = builder.newDocument();

        // create the root element node
        Element element = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_API, PREFIX_REQUESTCRED + ":" + rootStringValue);
        element.setAttributeNS(W3_NAMESPACE, XMLNS + ":" + PREFIX_REQUESTCRED, SOAP_HEADER_CREDENTIAL_NAMESPACE_API);
        doc.appendChild(element);

        // create another root element
        Element subElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP, PREFIX_CREDENTIALS + ":" + subRootStringValue);

        subElement.setAttributeNS(W3_NAMESPACE, XMLNS + ":" + PREFIX_CREDENTIALS, SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP);
        element.appendChild(subElement);

        // add app id element
        Element appIdElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP, PREFIX_CREDENTIALS + ":" + appIdStringValue);
        appIdElement.setAttributeNS(W3_NAMESPACE, XMLNS + ":" + PREFIX_CREDENTIALS, SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP);
        appIdElement.insertBefore(doc.createTextNode(getAppId()), appIdElement.getLastChild());
        subElement.appendChild(appIdElement);

        // add username element
        Element usernameElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP, PREFIX_CREDENTIALS + ":" + usernameStringValue);
        usernameElement.setAttributeNS(W3_NAMESPACE, XMLNS + ":" + PREFIX_CREDENTIALS, SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP);
        usernameElement.insertBefore(doc.createTextNode(getUsername()), usernameElement.getLastChild());
        subElement.appendChild(usernameElement);

        // add password element
        Element passwordElement = doc.createElementNS(SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP, PREFIX_CREDENTIALS + ":" + passwordStringValue);
        passwordElement.setAttributeNS(W3_NAMESPACE, XMLNS + ":" + PREFIX_CREDENTIALS, SOAP_HEADER_CREDENTIAL_NAMESPACE_BASECOMP);
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
