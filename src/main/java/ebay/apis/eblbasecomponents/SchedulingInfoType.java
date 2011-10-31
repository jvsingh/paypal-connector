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


/**
 *  
 *                        Contains information for Scheduling limits for the user. All dtails must be present,unless we will have revise call one day,
 *                        just in case we might let's make min occur = 0
 *                    
 * 
 * <p>Java class for SchedulingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchedulingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxScheduledMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinScheduledMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxScheduledItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchedulingInfoType", propOrder = {
    "maxScheduledMinutes",
    "minScheduledMinutes",
    "maxScheduledItems"
})
public class SchedulingInfoType {

    @XmlElement(name = "MaxScheduledMinutes")
    protected Integer maxScheduledMinutes;
    @XmlElement(name = "MinScheduledMinutes")
    protected Integer minScheduledMinutes;
    @XmlElement(name = "MaxScheduledItems")
    protected Integer maxScheduledItems;

    /**
     * Gets the value of the maxScheduledMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxScheduledMinutes() {
        return maxScheduledMinutes;
    }

    /**
     * Sets the value of the maxScheduledMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxScheduledMinutes(Integer value) {
        this.maxScheduledMinutes = value;
    }

    /**
     * Gets the value of the minScheduledMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinScheduledMinutes() {
        return minScheduledMinutes;
    }

    /**
     * Sets the value of the minScheduledMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinScheduledMinutes(Integer value) {
        this.minScheduledMinutes = value;
    }

    /**
     * Gets the value of the maxScheduledItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxScheduledItems() {
        return maxScheduledItems;
    }

    /**
     * Sets the value of the maxScheduledItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxScheduledItems(Integer value) {
        this.maxScheduledItems = value;
    }

}
