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
 * <p>Java class for DepositTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OtherMethod"/>
 *     &lt;enumeration value="FastDeposit"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositTypeCodeType")
@XmlEnum
public enum DepositTypeCodeType {


    /**
     * None
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 					   Other Method
     * 					
     * 
     */
    @XmlEnumValue("OtherMethod")
    OTHER_METHOD("OtherMethod"),

    /**
     *  
     * 					   Fast Deposit.																			
     * 
     */
    @XmlEnumValue("FastDeposit")
    FAST_DEPOSIT("FastDeposit"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DepositTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositTypeCodeType fromValue(String v) {
        for (DepositTypeCodeType c: DepositTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}