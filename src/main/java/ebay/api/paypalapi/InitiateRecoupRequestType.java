/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.enhanceddatatypes.EnhancedInitiateRecoupRequestDetailsType;


/**
 * <p>Java class for InitiateRecoupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitiateRecoupRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:EnhancedDataTypes}EnhancedInitiateRecoupRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitiateRecoupRequestType", propOrder = {
    "enhancedInitiateRecoupRequestDetails"
})
public class InitiateRecoupRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "EnhancedInitiateRecoupRequestDetails", namespace = "urn:ebay:apis:EnhancedDataTypes", required = true)
    protected EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails;

    /**
     * Gets the value of the enhancedInitiateRecoupRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedInitiateRecoupRequestDetailsType }
     *     
     */
    public EnhancedInitiateRecoupRequestDetailsType getEnhancedInitiateRecoupRequestDetails() {
        return enhancedInitiateRecoupRequestDetails;
    }

    /**
     * Sets the value of the enhancedInitiateRecoupRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedInitiateRecoupRequestDetailsType }
     *     
     */
    public void setEnhancedInitiateRecoupRequestDetails(EnhancedInitiateRecoupRequestDetailsType value) {
        this.enhancedInitiateRecoupRequestDetails = value;
    }

}
