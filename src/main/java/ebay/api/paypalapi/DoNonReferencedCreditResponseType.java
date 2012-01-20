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
import ebay.apis.eblbasecomponents.DoNonReferencedCreditResponseDetailsType;


/**
 * <p>Java class for DoNonReferencedCreditResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoNonReferencedCreditResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoNonReferencedCreditResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoNonReferencedCreditResponseType", propOrder = {
    "doNonReferencedCreditResponseDetails"
})
public class DoNonReferencedCreditResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DoNonReferencedCreditResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoNonReferencedCreditResponseDetailsType doNonReferencedCreditResponseDetails;

    /**
     * Gets the value of the doNonReferencedCreditResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoNonReferencedCreditResponseDetailsType }
     *     
     */
    public DoNonReferencedCreditResponseDetailsType getDoNonReferencedCreditResponseDetails() {
        return doNonReferencedCreditResponseDetails;
    }

    /**
     * Sets the value of the doNonReferencedCreditResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoNonReferencedCreditResponseDetailsType }
     *     
     */
    public void setDoNonReferencedCreditResponseDetails(DoNonReferencedCreditResponseDetailsType value) {
        this.doNonReferencedCreditResponseDetails = value;
    }

}
