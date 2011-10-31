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


/**
 * <p>Java class for GetPalDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPalDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Pal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPalDetailsResponseType", propOrder = {
    "pal",
    "locale"
})
public class GetPalDetailsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Pal", required = true)
    protected String pal;
    @XmlElement(name = "Locale", required = true)
    protected String locale;

    /**
     * Gets the value of the pal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPal() {
        return pal;
    }

    /**
     * Sets the value of the pal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPal(String value) {
        this.pal = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
