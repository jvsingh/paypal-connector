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
import ebay.apis.eblbasecomponents.FMFDetailsType;
import ebay.apis.eblbasecomponents.MerchantPullPaymentResponseType;


/**
 * <p>Java class for BillUserResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillUserResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}BillUserResponseDetails"/>
 *         &lt;element name="FMFDetails" type="{urn:ebay:apis:eBLBaseComponents}FMFDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillUserResponseType", propOrder = {
    "billUserResponseDetails",
    "fmfDetails"
})
public class BillUserResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "BillUserResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected MerchantPullPaymentResponseType billUserResponseDetails;
    @XmlElement(name = "FMFDetails")
    protected FMFDetailsType fmfDetails;

    /**
     * Gets the value of the billUserResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantPullPaymentResponseType }
     *     
     */
    public MerchantPullPaymentResponseType getBillUserResponseDetails() {
        return billUserResponseDetails;
    }

    /**
     * Sets the value of the billUserResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantPullPaymentResponseType }
     *     
     */
    public void setBillUserResponseDetails(MerchantPullPaymentResponseType value) {
        this.billUserResponseDetails = value;
    }

    /**
     * Gets the value of the fmfDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FMFDetailsType }
     *     
     */
    public FMFDetailsType getFMFDetails() {
        return fmfDetails;
    }

    /**
     * Sets the value of the fmfDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FMFDetailsType }
     *     
     */
    public void setFMFDetails(FMFDetailsType value) {
        this.fmfDetails = value;
    }

}
