/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.api.paypalapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.eblbasecomponents.AbstractResponseType;
import ebay.apis.eblbasecomponents.GetExpressCheckoutDetailsResponseDetailsType;


/**
 * <p>Java class for GetExpressCheckoutDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetExpressCheckoutDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetExpressCheckoutDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExpressCheckoutDetailsResponseType", propOrder = {
    "getExpressCheckoutDetailsResponseDetails"
})
public class GetExpressCheckoutDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetExpressCheckoutDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetailsResponseDetails;

    /**
     * Gets the value of the getExpressCheckoutDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetExpressCheckoutDetailsResponseDetailsType }
     *     
     */
    public GetExpressCheckoutDetailsResponseDetailsType getGetExpressCheckoutDetailsResponseDetails() {
        return getExpressCheckoutDetailsResponseDetails;
    }

    /**
     * Sets the value of the getExpressCheckoutDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetExpressCheckoutDetailsResponseDetailsType }
     *     
     */
    public void setGetExpressCheckoutDetailsResponseDetails(GetExpressCheckoutDetailsResponseDetailsType value) {
        this.getExpressCheckoutDetailsResponseDetails = value;
    }

}
