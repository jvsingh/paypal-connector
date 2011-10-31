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
 * <p>Java class for RefundSourceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundSourceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="instant"/>
 *     &lt;enumeration value="echeck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundSourceCodeType")
@XmlEnum
public enum RefundSourceCodeType {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("instant")
    INSTANT("instant"),
    @XmlEnumValue("echeck")
    ECHECK("echeck");
    private final String value;

    RefundSourceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundSourceCodeType fromValue(String v) {
        for (RefundSourceCodeType c: RefundSourceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
