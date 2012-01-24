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
import ebay.apis.enhanceddatatypes.EnhancedCompleteRecoupRequestDetailsType;


/**
 * <p>Java class for CompleteRecoupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteRecoupRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:EnhancedDataTypes}EnhancedCompleteRecoupRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteRecoupRequestType", propOrder = {
    "enhancedCompleteRecoupRequestDetails"
})
public class CompleteRecoupRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "EnhancedCompleteRecoupRequestDetails", namespace = "urn:ebay:apis:EnhancedDataTypes", required = true)
    protected EnhancedCompleteRecoupRequestDetailsType enhancedCompleteRecoupRequestDetails;

    /**
     * Gets the value of the enhancedCompleteRecoupRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCompleteRecoupRequestDetailsType }
     *     
     */
    public EnhancedCompleteRecoupRequestDetailsType getEnhancedCompleteRecoupRequestDetails() {
        return enhancedCompleteRecoupRequestDetails;
    }

    /**
     * Sets the value of the enhancedCompleteRecoupRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCompleteRecoupRequestDetailsType }
     *     
     */
    public void setEnhancedCompleteRecoupRequestDetails(EnhancedCompleteRecoupRequestDetailsType value) {
        this.enhancedCompleteRecoupRequestDetails = value;
    }

}
