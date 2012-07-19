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
import ebay.apis.eblbasecomponents.CreateRecurringPaymentsProfileRequestDetailsType;


/**
 * <p>Java class for CreateRecurringPaymentsProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRecurringPaymentsProfileRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}CreateRecurringPaymentsProfileRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRecurringPaymentsProfileRequestType", propOrder = {
    "createRecurringPaymentsProfileRequestDetails"
})
public class CreateRecurringPaymentsProfileRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CreateRecurringPaymentsProfileRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails;

    /**
     * Gets the value of the createRecurringPaymentsProfileRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public CreateRecurringPaymentsProfileRequestDetailsType getCreateRecurringPaymentsProfileRequestDetails() {
        return createRecurringPaymentsProfileRequestDetails;
    }

    /**
     * Sets the value of the createRecurringPaymentsProfileRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRecurringPaymentsProfileRequestDetailsType }
     *     
     */
    public void setCreateRecurringPaymentsProfileRequestDetails(CreateRecurringPaymentsProfileRequestDetailsType value) {
        this.createRecurringPaymentsProfileRequestDetails = value;
    }

}
