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
import ebay.apis.eblbasecomponents.GetAccessPermissionDetailsResponseDetailsType;


/**
 * <p>Java class for GetAccessPermissionDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccessPermissionDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetAccessPermissionDetailsResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccessPermissionDetailsResponseType", propOrder = {
    "getAccessPermissionDetailsResponseDetails"
})
public class GetAccessPermissionDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "GetAccessPermissionDetailsResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetAccessPermissionDetailsResponseDetailsType getAccessPermissionDetailsResponseDetails;

    /**
     * Gets the value of the getAccessPermissionDetailsResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccessPermissionDetailsResponseDetailsType }
     *     
     */
    public GetAccessPermissionDetailsResponseDetailsType getGetAccessPermissionDetailsResponseDetails() {
        return getAccessPermissionDetailsResponseDetails;
    }

    /**
     * Sets the value of the getAccessPermissionDetailsResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccessPermissionDetailsResponseDetailsType }
     *     
     */
    public void setGetAccessPermissionDetailsResponseDetails(GetAccessPermissionDetailsResponseDetailsType value) {
        this.getAccessPermissionDetailsResponseDetails = value;
    }

}
