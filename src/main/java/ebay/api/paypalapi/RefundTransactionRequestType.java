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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import ebay.apis.corecomponenttypes.BasicAmountType;
import ebay.apis.eblbasecomponents.AbstractRequestType;
import ebay.apis.eblbasecomponents.RefundSourceCodeType;
import ebay.apis.eblbasecomponents.RefundType;


/**
 * <p>Java class for RefundTransactionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="TransactionID" type="{urn:ebay:apis:eBLBaseComponents}TransactionId"/>
 *         &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundType" type="{urn:ebay:apis:eBLBaseComponents}RefundType" minOccurs="0"/>
 *         &lt;element name="Amount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetryUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundSource" type="{urn:ebay:apis:eBLBaseComponents}RefundSourceCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundTransactionRequestType", propOrder = {
    "transactionID",
    "invoiceID",
    "refundType",
    "amount",
    "memo",
    "retryUntil",
    "refundSource"
})
public class RefundTransactionRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "InvoiceID")
    protected String invoiceID;
    @XmlElement(name = "RefundType")
    protected RefundType refundType;
    @XmlElement(name = "Amount")
    protected BasicAmountType amount;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "RetryUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retryUntil;
    @XmlElement(name = "RefundSource")
    protected RefundSourceCodeType refundSource;

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

    /**
     * Gets the value of the invoiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceID() {
        return invoiceID;
    }

    /**
     * Sets the value of the invoiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceID(String value) {
        this.invoiceID = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefundType(RefundType value) {
        this.refundType = value;
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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the retryUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetryUntil() {
        return retryUntil;
    }

    /**
     * Sets the value of the retryUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetryUntil(XMLGregorianCalendar value) {
        this.retryUntil = value;
    }

    /**
     * Gets the value of the refundSource property.
     * 
     * @return
     *     possible object is
     *     {@link RefundSourceCodeType }
     *     
     */
    public RefundSourceCodeType getRefundSource() {
        return refundSource;
    }

    /**
     * Sets the value of the refundSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundSourceCodeType }
     *     
     */
    public void setRefundSource(RefundSourceCodeType value) {
        this.refundSource = value;
    }

}
