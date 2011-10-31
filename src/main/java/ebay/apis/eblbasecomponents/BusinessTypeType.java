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
 * <p>Java class for BusinessTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Proprietorship"/>
 *     &lt;enumeration value="Partnership"/>
 *     &lt;enumeration value="Corporation"/>
 *     &lt;enumeration value="Nonprofit"/>
 *     &lt;enumeration value="Government"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessTypeType")
@XmlEnum
public enum BusinessTypeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Proprietorship")
    PROPRIETORSHIP("Proprietorship"),
    @XmlEnumValue("Partnership")
    PARTNERSHIP("Partnership"),
    @XmlEnumValue("Corporation")
    CORPORATION("Corporation"),
    @XmlEnumValue("Nonprofit")
    NONPROFIT("Nonprofit"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government");
    private final String value;

    BusinessTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessTypeType fromValue(String v) {
        for (BusinessTypeType c: BusinessTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
