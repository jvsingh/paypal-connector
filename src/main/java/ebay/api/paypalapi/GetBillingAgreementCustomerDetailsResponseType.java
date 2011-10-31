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
import ebay.apis.eblbasecomponents.GetBillingAgreementCustomerDetailsResponseDetailsType;


/**
 * <p>Java class for GetBillingAgreementCustomerDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBillingAgreementCustomerDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetBillingAgreementCustomerDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBillingAgreementCustomerDetailsResponseType", propOrder = {
    "getBillingAgreementCustomerDetailsResponseDetails"
})
public class GetBillingAgreementCustomerDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetBillingAgreementCustomerDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetBillingAgreementCustomerDetailsResponseDetailsType getBillingAgreementCustomerDetailsResponseDetails;

    /**
     * Gets the value of the getBillingAgreementCustomerDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetBillingAgreementCustomerDetailsResponseDetailsType }
     *     
     */
    public GetBillingAgreementCustomerDetailsResponseDetailsType getGetBillingAgreementCustomerDetailsResponseDetails() {
        return getBillingAgreementCustomerDetailsResponseDetails;
    }

    /**
     * Sets the value of the getBillingAgreementCustomerDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBillingAgreementCustomerDetailsResponseDetailsType }
     *     
     */
    public void setGetBillingAgreementCustomerDetailsResponseDetails(GetBillingAgreementCustomerDetailsResponseDetailsType value) {
        this.getBillingAgreementCustomerDetailsResponseDetails = value;
    }

}
