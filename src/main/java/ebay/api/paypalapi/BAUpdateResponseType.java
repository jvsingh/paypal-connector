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

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.BAUpdateResponseDetailsType;


/**
 * <p>Java class for BAUpdateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAUpdateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}BAUpdateResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAUpdateResponseType", propOrder = {
    "baUpdateResponseDetails"
})
public class BAUpdateResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "BAUpdateResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected BAUpdateResponseDetailsType baUpdateResponseDetails;

    /**
     * Gets the value of the baUpdateResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BAUpdateResponseDetailsType }
     *     
     */
    public BAUpdateResponseDetailsType getBAUpdateResponseDetails() {
        return baUpdateResponseDetails;
    }

    /**
     * Sets the value of the baUpdateResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BAUpdateResponseDetailsType }
     *     
     */
    public void setBAUpdateResponseDetails(BAUpdateResponseDetailsType value) {
        this.baUpdateResponseDetails = value;
    }

}
