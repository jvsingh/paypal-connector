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
import ebay.apis.eblbasecomponents.AuthorizationInfoType;


/**
 * <p>Java class for DoReauthorizationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoReauthorizationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}AuthorizationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoReauthorizationResponseType", propOrder = {
    "authorizationID",
    "authorizationInfo"
})
public class DoReauthorizationResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "AuthorizationID", required = true)
    protected String authorizationID;
    @XmlElement(name = "AuthorizationInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected AuthorizationInfoType authorizationInfo;

    /**
     * Gets the value of the authorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Sets the value of the authorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationID(String value) {
        this.authorizationID = value;
    }

    /**
     * Gets the value of the authorizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationInfoType }
     *     
     */
    public AuthorizationInfoType getAuthorizationInfo() {
        return authorizationInfo;
    }

    /**
     * Sets the value of the authorizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationInfoType }
     *     
     */
    public void setAuthorizationInfo(AuthorizationInfoType value) {
        this.authorizationInfo = value;
    }

}
