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
import ebay.apis.eblbasecomponents.SetAccessPermissionsRequestDetailsType;


/**
 * <p>Java class for SetAccessPermissionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetAccessPermissionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}SetAccessPermissionsRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAccessPermissionsRequestType", propOrder = {
    "setAccessPermissionsRequestDetails"
})
public class SetAccessPermissionsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "SetAccessPermissionsRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected SetAccessPermissionsRequestDetailsType setAccessPermissionsRequestDetails;

    /**
     * Gets the value of the setAccessPermissionsRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SetAccessPermissionsRequestDetailsType }
     *     
     */
    public SetAccessPermissionsRequestDetailsType getSetAccessPermissionsRequestDetails() {
        return setAccessPermissionsRequestDetails;
    }

    /**
     * Sets the value of the setAccessPermissionsRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetAccessPermissionsRequestDetailsType }
     *     
     */
    public void setSetAccessPermissionsRequestDetails(SetAccessPermissionsRequestDetailsType value) {
        this.setAccessPermissionsRequestDetails = value;
    }

}
