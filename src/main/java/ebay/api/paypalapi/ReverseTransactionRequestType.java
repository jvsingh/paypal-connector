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
import ebay.apis.eblbasecomponents.ReverseTransactionRequestDetailsType;


/**
 * <p>Java class for ReverseTransactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReverseTransactionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ReverseTransactionRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReverseTransactionRequestType", propOrder = {
    "reverseTransactionRequestDetails"
})
public class ReverseTransactionRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ReverseTransactionRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ReverseTransactionRequestDetailsType reverseTransactionRequestDetails;

    /**
     * Gets the value of the reverseTransactionRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReverseTransactionRequestDetailsType }
     *     
     */
    public ReverseTransactionRequestDetailsType getReverseTransactionRequestDetails() {
        return reverseTransactionRequestDetails;
    }

    /**
     * Sets the value of the reverseTransactionRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReverseTransactionRequestDetailsType }
     *     
     */
    public void setReverseTransactionRequestDetails(ReverseTransactionRequestDetailsType value) {
        this.reverseTransactionRequestDetails = value;
    }

}
