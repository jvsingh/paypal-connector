/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrialPeriod" type="{urn:ebay:apis:eBLBaseComponents}BillingPeriodDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentPeriod" type="{urn:ebay:apis:eBLBaseComponents}BillingPeriodDetailsType"/>
 *         &lt;element name="MaxFailedPayments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActivationDetails" type="{urn:ebay:apis:eBLBaseComponents}ActivationDetailsType" minOccurs="0"/>
 *         &lt;element name="AutoBillOutstandingAmount" type="{urn:ebay:apis:eBLBaseComponents}AutoBillType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDetailsType", propOrder = {
    "description",
    "trialPeriod",
    "paymentPeriod",
    "maxFailedPayments",
    "activationDetails",
    "autoBillOutstandingAmount"
})
public class ScheduleDetailsType {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "TrialPeriod")
    protected BillingPeriodDetailsType trialPeriod;
    @XmlElement(name = "PaymentPeriod", required = true)
    protected BillingPeriodDetailsType paymentPeriod;
    @XmlElement(name = "MaxFailedPayments")
    protected Integer maxFailedPayments;
    @XmlElement(name = "ActivationDetails")
    protected ActivationDetailsType activationDetails;
    @XmlElement(name = "AutoBillOutstandingAmount")
    protected AutoBillType autoBillOutstandingAmount;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the trialPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPeriodDetailsType }
     *     
     */
    public BillingPeriodDetailsType getTrialPeriod() {
        return trialPeriod;
    }

    /**
     * Sets the value of the trialPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPeriodDetailsType }
     *     
     */
    public void setTrialPeriod(BillingPeriodDetailsType value) {
        this.trialPeriod = value;
    }

    /**
     * Gets the value of the paymentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPeriodDetailsType }
     *     
     */
    public BillingPeriodDetailsType getPaymentPeriod() {
        return paymentPeriod;
    }

    /**
     * Sets the value of the paymentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPeriodDetailsType }
     *     
     */
    public void setPaymentPeriod(BillingPeriodDetailsType value) {
        this.paymentPeriod = value;
    }

    /**
     * Gets the value of the maxFailedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFailedPayments() {
        return maxFailedPayments;
    }

    /**
     * Sets the value of the maxFailedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFailedPayments(Integer value) {
        this.maxFailedPayments = value;
    }

    /**
     * Gets the value of the activationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationDetailsType }
     *     
     */
    public ActivationDetailsType getActivationDetails() {
        return activationDetails;
    }

    /**
     * Sets the value of the activationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationDetailsType }
     *     
     */
    public void setActivationDetails(ActivationDetailsType value) {
        this.activationDetails = value;
    }

    /**
     * Gets the value of the autoBillOutstandingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AutoBillType }
     *     
     */
    public AutoBillType getAutoBillOutstandingAmount() {
        return autoBillOutstandingAmount;
    }

    /**
     * Sets the value of the autoBillOutstandingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoBillType }
     *     
     */
    public void setAutoBillOutstandingAmount(AutoBillType value) {
        this.autoBillOutstandingAmount = value;
    }

}