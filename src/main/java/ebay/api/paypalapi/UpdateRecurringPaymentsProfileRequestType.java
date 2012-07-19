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

import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.UpdateRecurringPaymentsProfileRequestDetailsType;


/**
 * <p>Java class for UpdateRecurringPaymentsProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRecurringPaymentsProfileRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}UpdateRecurringPaymentsProfileRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRecurringPaymentsProfileRequestType", propOrder = {
    "updateRecurringPaymentsProfileRequestDetails"
})
public class UpdateRecurringPaymentsProfileRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "UpdateRecurringPaymentsProfileRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected UpdateRecurringPaymentsProfileRequestDetailsType updateRecurringPaymentsProfileRequestDetails;

    /**
     * Gets the value of the updateRecurringPaymentsProfileRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public UpdateRecurringPaymentsProfileRequestDetailsType getUpdateRecurringPaymentsProfileRequestDetails() {
        return updateRecurringPaymentsProfileRequestDetails;
    }

    /**
     * Sets the value of the updateRecurringPaymentsProfileRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public void setUpdateRecurringPaymentsProfileRequestDetails(UpdateRecurringPaymentsProfileRequestDetailsType value) {
        this.updateRecurringPaymentsProfileRequestDetails = value;
    }

}
