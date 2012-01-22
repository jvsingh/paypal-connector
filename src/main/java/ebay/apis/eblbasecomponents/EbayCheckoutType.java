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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EbayCheckoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EbayCheckoutType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="Auction"/>
 *     &lt;enumeration value="BuyItNow"/>
 *     &lt;enumeration value="FixedPriceItem"/>
 *     &lt;enumeration value="Autopay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EbayCheckoutType")
@XmlEnum
public enum EbayCheckoutType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("Auction")
    AUCTION("Auction"),
    @XmlEnumValue("BuyItNow")
    BUY_IT_NOW("BuyItNow"),
    @XmlEnumValue("FixedPriceItem")
    FIXED_PRICE_ITEM("FixedPriceItem"),
    @XmlEnumValue("Autopay")
    AUTOPAY("Autopay");
    private final String value;

    EbayCheckoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EbayCheckoutType fromValue(String v) {
        for (EbayCheckoutType c: EbayCheckoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}