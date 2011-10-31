/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.apis.enhanceddatatypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ebay.apis.enhanceddatatypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnhancedCompleteRecoupRequestDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupRequestDetails");
    private final static QName _EnhancedCompleteRecoupResponseDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupResponseDetails");
    private final static QName _EnhancedInitiateRecoupRequestDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedInitiateRecoupRequestDetails");
    private final static QName _EnhancedCancelRecoupRequestDetails_QNAME = new QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCancelRecoupRequestDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ebay.apis.enhanceddatatypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnhancedInitiateRecoupRequestDetailsType }
     * 
     */
    public EnhancedInitiateRecoupRequestDetailsType createEnhancedInitiateRecoupRequestDetailsType() {
        return new EnhancedInitiateRecoupRequestDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedPaymentInfoType }
     * 
     */
    public EnhancedPaymentInfoType createEnhancedPaymentInfoType() {
        return new EnhancedPaymentInfoType();
    }

    /**
     * Create an instance of {@link EnhancedPaymentDataType }
     * 
     */
    public EnhancedPaymentDataType createEnhancedPaymentDataType() {
        return new EnhancedPaymentDataType();
    }

    /**
     * Create an instance of {@link EnhancedCompleteRecoupRequestDetailsType }
     * 
     */
    public EnhancedCompleteRecoupRequestDetailsType createEnhancedCompleteRecoupRequestDetailsType() {
        return new EnhancedCompleteRecoupRequestDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedItemDataType }
     * 
     */
    public EnhancedItemDataType createEnhancedItemDataType() {
        return new EnhancedItemDataType();
    }

    /**
     * Create an instance of {@link EnhancedCompleteRecoupResponseDetailsType }
     * 
     */
    public EnhancedCompleteRecoupResponseDetailsType createEnhancedCompleteRecoupResponseDetailsType() {
        return new EnhancedCompleteRecoupResponseDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedCancelRecoupRequestDetailsType }
     * 
     */
    public EnhancedCancelRecoupRequestDetailsType createEnhancedCancelRecoupRequestDetailsType() {
        return new EnhancedCancelRecoupRequestDetailsType();
    }

    /**
     * Create an instance of {@link EnhancedCheckoutDataType }
     * 
     */
    public EnhancedCheckoutDataType createEnhancedCheckoutDataType() {
        return new EnhancedCheckoutDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCompleteRecoupRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedCompleteRecoupRequestDetails")
    public JAXBElement<EnhancedCompleteRecoupRequestDetailsType> createEnhancedCompleteRecoupRequestDetails(EnhancedCompleteRecoupRequestDetailsType value) {
        return new JAXBElement<EnhancedCompleteRecoupRequestDetailsType>(_EnhancedCompleteRecoupRequestDetails_QNAME, EnhancedCompleteRecoupRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCompleteRecoupResponseDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedCompleteRecoupResponseDetails")
    public JAXBElement<EnhancedCompleteRecoupResponseDetailsType> createEnhancedCompleteRecoupResponseDetails(EnhancedCompleteRecoupResponseDetailsType value) {
        return new JAXBElement<EnhancedCompleteRecoupResponseDetailsType>(_EnhancedCompleteRecoupResponseDetails_QNAME, EnhancedCompleteRecoupResponseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedInitiateRecoupRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedInitiateRecoupRequestDetails")
    public JAXBElement<EnhancedInitiateRecoupRequestDetailsType> createEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType value) {
        return new JAXBElement<EnhancedInitiateRecoupRequestDetailsType>(_EnhancedInitiateRecoupRequestDetails_QNAME, EnhancedInitiateRecoupRequestDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnhancedCancelRecoupRequestDetailsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ebay:apis:EnhancedDataTypes", name = "EnhancedCancelRecoupRequestDetails")
    public JAXBElement<EnhancedCancelRecoupRequestDetailsType> createEnhancedCancelRecoupRequestDetails(EnhancedCancelRecoupRequestDetailsType value) {
        return new JAXBElement<EnhancedCancelRecoupRequestDetailsType>(_EnhancedCancelRecoupRequestDetails_QNAME, EnhancedCancelRecoupRequestDetailsType.class, null, value);
    }

}
