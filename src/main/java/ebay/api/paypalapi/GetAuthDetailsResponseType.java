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
import ebay.apis.eblbasecomponents.GetAuthDetailsResponseDetailsType;


/**
 * <p>Java class for GetAuthDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAuthDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetAuthDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAuthDetailsResponseType", propOrder = {
    "getAuthDetailsResponseDetails"
})
public class GetAuthDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetAuthDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetAuthDetailsResponseDetailsType getAuthDetailsResponseDetails;

    /**
     * Gets the value of the getAuthDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetAuthDetailsResponseDetailsType }
     *     
     */
    public GetAuthDetailsResponseDetailsType getGetAuthDetailsResponseDetails() {
        return getAuthDetailsResponseDetails;
    }

    /**
     * Sets the value of the getAuthDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAuthDetailsResponseDetailsType }
     *     
     */
    public void setGetAuthDetailsResponseDetails(GetAuthDetailsResponseDetailsType value) {
        this.getAuthDetailsResponseDetails = value;
    }

}
