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
import ebay.apis.eblbasecomponents.DoMobileCheckoutPaymentResponseDetailsType;


/**
 * <p>Java class for DoMobileCheckoutPaymentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoMobileCheckoutPaymentResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoMobileCheckoutPaymentResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoMobileCheckoutPaymentResponseType", propOrder = {
    "doMobileCheckoutPaymentResponseDetails"
})
public class DoMobileCheckoutPaymentResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DoMobileCheckoutPaymentResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoMobileCheckoutPaymentResponseDetailsType doMobileCheckoutPaymentResponseDetails;

    /**
     * Gets the value of the doMobileCheckoutPaymentResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoMobileCheckoutPaymentResponseDetailsType }
     *     
     */
    public DoMobileCheckoutPaymentResponseDetailsType getDoMobileCheckoutPaymentResponseDetails() {
        return doMobileCheckoutPaymentResponseDetails;
    }

    /**
     * Sets the value of the doMobileCheckoutPaymentResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoMobileCheckoutPaymentResponseDetailsType }
     *     
     */
    public void setDoMobileCheckoutPaymentResponseDetails(DoMobileCheckoutPaymentResponseDetailsType value) {
        this.doMobileCheckoutPaymentResponseDetails = value;
    }

}
