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
 * <p>Java class for StatusChangeActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusChangeActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Suspend"/>
 *     &lt;enumeration value="Reactivate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusChangeActionType")
@XmlEnum
public enum StatusChangeActionType {

    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Suspend")
    SUSPEND("Suspend"),
    @XmlEnumValue("Reactivate")
    REACTIVATE("Reactivate");
    private final String value;

    StatusChangeActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusChangeActionType fromValue(String v) {
        for (StatusChangeActionType c: StatusChangeActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
