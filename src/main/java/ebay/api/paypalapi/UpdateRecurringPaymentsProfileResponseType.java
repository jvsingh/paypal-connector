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
import ebay.apis.eblbasecomponents.UpdateRecurringPaymentsProfileResponseDetailsType;


/**
 * <p>Java class for UpdateRecurringPaymentsProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRecurringPaymentsProfileResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}UpdateRecurringPaymentsProfileResponseDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRecurringPaymentsProfileResponseType", propOrder = {
    "updateRecurringPaymentsProfileResponseDetails"
})
public class UpdateRecurringPaymentsProfileResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "UpdateRecurringPaymentsProfileResponseDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected UpdateRecurringPaymentsProfileResponseDetailsType updateRecurringPaymentsProfileResponseDetails;

    /**
     * Gets the value of the updateRecurringPaymentsProfileResponseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRecurringPaymentsProfileResponseDetailsType }
     *     
     */
    public UpdateRecurringPaymentsProfileResponseDetailsType getUpdateRecurringPaymentsProfileResponseDetails() {
        return updateRecurringPaymentsProfileResponseDetails;
    }

    /**
     * Sets the value of the updateRecurringPaymentsProfileResponseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRecurringPaymentsProfileResponseDetailsType }
     *     
     */
    public void setUpdateRecurringPaymentsProfileResponseDetails(UpdateRecurringPaymentsProfileResponseDetailsType value) {
        this.updateRecurringPaymentsProfileResponseDetails = value;
    }

}
