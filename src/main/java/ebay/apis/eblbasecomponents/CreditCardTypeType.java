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
 * <p>Java class for CreditCardTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditCardTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="Switch"/>
 *     &lt;enumeration value="Solo"/>
 *     &lt;enumeration value="Maestro"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditCardTypeType")
@XmlEnum
public enum CreditCardTypeType {

    @XmlEnumValue("Visa")
    VISA("Visa"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("Amex")
    AMEX("Amex"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("Solo")
    SOLO("Solo"),
    @XmlEnumValue("Maestro")
    MAESTRO("Maestro");
    private final String value;

    CreditCardTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCardTypeType fromValue(String v) {
        for (CreditCardTypeType c: CreditCardTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
