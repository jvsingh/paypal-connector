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
import ebay.apis.eblbasecomponents.BillOutstandingAmountRequestDetailsType;


/**
 * <p>Java class for BillOutstandingAmountRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillOutstandingAmountRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}BillOutstandingAmountRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillOutstandingAmountRequestType", propOrder = {
    "billOutstandingAmountRequestDetails"
})
public class BillOutstandingAmountRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "BillOutstandingAmountRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected BillOutstandingAmountRequestDetailsType billOutstandingAmountRequestDetails;

    /**
     * Gets the value of the billOutstandingAmountRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BillOutstandingAmountRequestDetailsType }
     *     
     */
    public BillOutstandingAmountRequestDetailsType getBillOutstandingAmountRequestDetails() {
        return billOutstandingAmountRequestDetails;
    }

    /**
     * Sets the value of the billOutstandingAmountRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillOutstandingAmountRequestDetailsType }
     *     
     */
    public void setBillOutstandingAmountRequestDetails(BillOutstandingAmountRequestDetailsType value) {
        this.billOutstandingAmountRequestDetails = value;
    }

}
