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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BAUpdateRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baUpdateRequest"
})
@XmlRootElement(name = "BillAgreementUpdateReq")
public class BillAgreementUpdateReq {

    @XmlElement(name = "BAUpdateRequest", required = true)
    protected BAUpdateRequestType baUpdateRequest;

    /**
     * Gets the value of the baUpdateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BAUpdateRequestType }
     *     
     */
    public BAUpdateRequestType getBAUpdateRequest() {
        return baUpdateRequest;
    }

    /**
     * Sets the value of the baUpdateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BAUpdateRequestType }
     *     
     */
    public void setBAUpdateRequest(BAUpdateRequestType value) {
        this.baUpdateRequest = value;
    }

}
