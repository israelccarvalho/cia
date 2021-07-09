/*
 * Copyright 2010 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.24 at 11:39:59 PM CET
//


package com.hack23.cia.model.external.riksdagen.personlista.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum OrgCode.
 */
@XmlType(name = "OrgCode")
@XmlEnum
public enum OrgCode {

    /** The au. */
    AU("AU"),

    /** The cu. */
    CU("CU"),

    /** The fi u. */
    @XmlEnumValue("FiU")
    FI_U("FiU"),

    /** The F ö U. */
    @XmlEnumValue("F\u00f6U")
    FO_U("F\u00f6U"),

    /** The ju u. */
    @XmlEnumValue("JuU")
    JU_U("JuU"),

    /** The ku. */
    KU("KU"),

    /** The kr u. */
    @XmlEnumValue("KrU")
    KR_U("KrU"),

    /** The mju. */
    MJU("MJU"),

    /** The nu. */
    NU("NU"),

    /** The sk u. */
    @XmlEnumValue("SkU")
    SK_U("SkU"),

    /** The sf u. */
    @XmlEnumValue("SfU")
    SF_U("SfU"),

    /** The so u. */
    @XmlEnumValue("SoU")
    SO_U("SoU"),

    /** The tu. */
    TU("TU"),

    /** The ub u. */
    @XmlEnumValue("UbU")
    UB_U("UbU"),

    /** The uu. */
    UU("UU"),

    /** The ju so u. */
    @XmlEnumValue("JuSoU")
    JU_SO_U("JuSoU"),

    /** The kuu. */
    KUU("KUU"),

    /** The U F ö U. */
    @XmlEnumValue("UF\u00f6U")
    U_FO_U("UF\u00f6U"),

    /** The umju. */
    UMJU("UMJU"),

    /** The u so u. */
    @XmlEnumValue("USoU")
    U_SO_U("USoU"),

    /** The jo u. */
    @XmlEnumValue("JoU")
    JO_U("JoU"),

    /** The bo u. */
    @XmlEnumValue("BoU")
    BO_U("BoU"),

    /** The lu. */
    LU("LU");

    /** The value. */
    private final String value;

    /**
	 * Instantiates a new org code.
	 *
	 * @param v the v
	 */
    OrgCode(final String v) {
        value = v;
    }

    /**
	 * Value.
	 *
	 * @return the string
	 */
    public String value() {
        return value;
    }

    /**
	 * From value.
	 *
	 * @param v the v
	 * @return the org code
	 */
    public static OrgCode fromValue(final String v) {
        for (final OrgCode c: OrgCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
