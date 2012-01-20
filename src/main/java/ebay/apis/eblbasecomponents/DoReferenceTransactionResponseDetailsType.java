/**
 * Mule Paypal Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ebay.apis.corecomponenttypes.BasicAmountType;


/**
 * <p>Java class for DoReferenceTransactionResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoReferenceTransactionResponseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentInfo" type="{urn:ebay:apis:eBLBaseComponents}PaymentInfoType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="AVSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVV2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{urn:ebay:apis:eBLBaseComponents}TransactionId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoReferenceTransactionResponseDetailsType", propOrder = {
    "billingAgreementID",
    "paymentInfo",
    "amount",
    "avsCode",
    "cvv2Code",
    "transactionID"
})
public class DoReferenceTransactionResponseDetailsType {

    @XmlElement(name = "BillingAgreementID")
    protected String billingAgreementID;
    @XmlElement(name = "PaymentInfo")
    protected PaymentInfoType paymentInfo;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "AVSCode")
    protected String avsCode;
    @XmlElement(name = "CVV2Code")
    protected String cvv2Code;
    @XmlElement(name = "TransactionID")
    protected String transactionID;

    /**
     * Gets the value of the billingAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAgreementID() {
        return billingAgreementID;
    }

    /**
     * Sets the value of the billingAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAgreementID(String value) {
        this.billingAgreementID = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPaymentInfo(PaymentInfoType value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setAmount(BasicAmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSCode(String value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the cvv2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2Code() {
        return cvv2Code;
    }

    /**
     * Sets the value of the cvv2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2Code(String value) {
        this.cvv2Code = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

}
