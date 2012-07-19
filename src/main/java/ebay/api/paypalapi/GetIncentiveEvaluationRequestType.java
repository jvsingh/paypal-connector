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
import ebay.apis.eblbasecomponents.GetIncentiveEvaluationRequestDetailsType;


/**
 * <p>Java class for GetIncentiveEvaluationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIncentiveEvaluationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}GetIncentiveEvaluationRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIncentiveEvaluationRequestType", propOrder = {
    "getIncentiveEvaluationRequestDetails"
})
public class GetIncentiveEvaluationRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "GetIncentiveEvaluationRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected GetIncentiveEvaluationRequestDetailsType getIncentiveEvaluationRequestDetails;

    /**
     * Gets the value of the getIncentiveEvaluationRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GetIncentiveEvaluationRequestDetailsType }
     *     
     */
    public GetIncentiveEvaluationRequestDetailsType getGetIncentiveEvaluationRequestDetails() {
        return getIncentiveEvaluationRequestDetails;
    }

    /**
     * Sets the value of the getIncentiveEvaluationRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIncentiveEvaluationRequestDetailsType }
     *     
     */
    public void setGetIncentiveEvaluationRequestDetails(GetIncentiveEvaluationRequestDetailsType value) {
        this.getIncentiveEvaluationRequestDetails = value;
    }

}
