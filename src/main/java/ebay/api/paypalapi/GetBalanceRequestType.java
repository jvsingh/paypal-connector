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


/**
 * <p>Java class for GetBalanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ReturnAllCurrencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBalanceRequestType", propOrder = {
    "returnAllCurrencies"
})
public class GetBalanceRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ReturnAllCurrencies")
    protected String returnAllCurrencies;

    /**
     * Gets the value of the returnAllCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAllCurrencies() {
        return returnAllCurrencies;
    }

    /**
     * Sets the value of the returnAllCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAllCurrencies(String value) {
        this.returnAllCurrencies = value;
    }

}
