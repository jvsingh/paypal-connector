/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal;

import ebay.apis.eblbasecomponents.CurrencyCodeType;

/**
 * Mule-Devkit-friendly mirror of {@link CurrencyCodeType} that is not annotated with
 * Jaxb, in order to avoid code generation errors
 * 
 * @author flbulgarelli
 */
public enum CurrencyCode
{
    AFA, ALL, DZD, ADP, AOA, ARS, AMD, AWG, AZM, BSD, BHD, BDT, //
    BBD, BYR, BZD, BMD, BTN, INR, BOV, BOB, BAM, BWP, BRL, BND, //
    BGL, BGN, BIF, KHR, CAD, CVE, KYD, XAF, CLF, CLP, CNY, COP, // 
    KMF, CDF, CRC, HRK, CUP, CYP, CZK, DKK, DJF, DOP, TPE, ECV, // 
    ECS, EGP, SVC, ERN, EEK, ETB, FKP, FJD, GMD, GEL, GHC, GIP, // 
    GTQ, GNF, GWP, GYD, HTG, HNL, HKD, HUF, ISK, IDR, IRR, IQD, // 
    ILS, JMD, JPY, JOD, KZT, KES, AUD, KPW, KRW, KWD, KGS, LAK, //
    LVL, LBP, LSL, LRD, LYD, CHF, LTL, MOP, MKD, MGF, MWK, MYR, //
    MVR, MTL, EUR, MRO, MUR, MXN, MXV, MDL, MNT, XCD, MZM, MMK, //
    ZAR, NAD, NPR, ANG, XPF, NZD, NIO, NGN, NOK, OMR, PKR, PAB, // 
    PGK, PYG, PEN, PHP, PLN, USD, QAR, ROL, RUB, RUR, RWF, SHP, //
    WST, STD, SAR, SCR, SLL, SGD, SKK, SIT, SBD, SOS, LKR, SDD, //
    SRG, SZL, SEK, SYP, TWD, TJS, TZS, THB, XOF, TOP, TTD, TND, //
    TRL, TMM, UGX, UAH, AED, GBP, USS, USN, UYU, UZS, VUV, VEB, //
    VND, MAD, YER, YUM, ZMK, ZWD;

    public CurrencyCodeType toPaypalType()
    {
        return Enums.translate(this, CurrencyCodeType.class);
    }

}
