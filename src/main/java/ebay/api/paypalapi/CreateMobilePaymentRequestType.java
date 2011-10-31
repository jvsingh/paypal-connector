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
import ebay.apis.eblbasecomponents.CreateMobilePaymentRequestDetailsType;


/**
 * <p>Java class for CreateMobilePaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateMobilePaymentRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}CreateMobilePaymentRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateMobilePaymentRequestType", propOrder = {
    "createMobilePaymentRequestDetails"
})
public class CreateMobilePaymentRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CreateMobilePaymentRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected CreateMobilePaymentRequestDetailsType createMobilePaymentRequestDetails;

    /**
     * Gets the value of the createMobilePaymentRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMobilePaymentRequestDetailsType }
     *     
     */
    public CreateMobilePaymentRequestDetailsType getCreateMobilePaymentRequestDetails() {
        return createMobilePaymentRequestDetails;
    }

    /**
     * Sets the value of the createMobilePaymentRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMobilePaymentRequestDetailsType }
     *     
     */
    public void setCreateMobilePaymentRequestDetails(CreateMobilePaymentRequestDetailsType value) {
        this.createMobilePaymentRequestDetails = value;
    }

}
