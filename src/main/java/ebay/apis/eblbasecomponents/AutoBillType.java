/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoBillType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AutoBillType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoAutoBill"/>
 *     &lt;enumeration value="AddToNextBilling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AutoBillType")
@XmlEnum
public enum AutoBillType {

    @XmlEnumValue("NoAutoBill")
    NO_AUTO_BILL("NoAutoBill"),
    @XmlEnumValue("AddToNextBilling")
    ADD_TO_NEXT_BILLING("AddToNextBilling");
    private final String value;

    AutoBillType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoBillType fromValue(String v) {
        for (AutoBillType c: AutoBillType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
