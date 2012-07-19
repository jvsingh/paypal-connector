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
 * 
 * 				Enhanced Data Information. Example: AID for Airlines
 * 			
 * 
 * <p>Java class for EnhancedDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhancedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineItinerary" type="{urn:ebay:apis:eBLBaseComponents}AirlineItineraryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedDataType", propOrder = {
    "airlineItinerary"
})
public class EnhancedDataType {

    @XmlElement(name = "AirlineItinerary")
    protected AirlineItineraryType airlineItinerary;

    /**
     * Gets the value of the airlineItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineItineraryType }
     *     
     */
    public AirlineItineraryType getAirlineItinerary() {
        return airlineItinerary;
    }

    /**
     * Sets the value of the airlineItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineItineraryType }
     *     
     */
    public void setAirlineItinerary(AirlineItineraryType value) {
        this.airlineItinerary = value;
    }

}
