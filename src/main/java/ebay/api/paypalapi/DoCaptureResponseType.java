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
import ebay.apis.eblbasecomponents.DoCaptureResponseDetailsType;


/**
 * <p>Java class for DoCaptureResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoCaptureResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}DoCaptureResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoCaptureResponseType", propOrder = {
    "doCaptureResponseDetails"
})
public class DoCaptureResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DoCaptureResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected DoCaptureResponseDetailsType doCaptureResponseDetails;

    /**
     * Gets the value of the doCaptureResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoCaptureResponseDetailsType }
     *     
     */
    public DoCaptureResponseDetailsType getDoCaptureResponseDetails() {
        return doCaptureResponseDetails;
    }

    /**
     * Sets the value of the doCaptureResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoCaptureResponseDetailsType }
     *     
     */
    public void setDoCaptureResponseDetails(DoCaptureResponseDetailsType value) {
        this.doCaptureResponseDetails = value;
    }

}
