/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal;

public enum LocaleCode {

	AU("AU"),
	AT("AT"),
	BE("BE"),
	BR("BR"),
	CA("CA"),
	CH("CH"),
	CN("CN"),
	DE("DE"),
	ES("ES"),
	GB("GB"),
	FR("FR"),
	IT("IT"),
	NL("NL"),
	PL("PL"),
	PT("PT"),
	RU("RU"),
	US("US"),
	da_DK("da_DK"),
	he_IL("he_IL"),
	id_ID("id_ID"),
	jp_JP("jp_JP"),
	no_NO("no_NO"),
	pt_BR("pt_BR"),
	ru_RU("ru_RU"),
	sv_SE("sv_SE"),
	th_TH("th_TH"),
	tr_TR("tr_TR"),
	zh_CN("zh_CN"),
	zh_HK("zh_HK"),
	zh_TW("zh_TW");
	
    private final String value;

    LocaleCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocaleCode fromValue(String v) {
        for (LocaleCode c: LocaleCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
