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
// Generated on: 2019.02.24 at 11:26:40 PM CET
//


package com.hack23.cia.model.external.worldbank.countries.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum AdminRegionCategory.
 */
@XmlType(name = "AdminRegionCategory")
@XmlEnum
public enum AdminRegionCategory {

    /** The east asia pacific developing only. */
    @XmlEnumValue("East Asia & Pacific (developing only)")
    EAST_ASIA_PACIFIC_DEVELOPING_ONLY("East Asia & Pacific (developing only)"),

    /** The europe central asia developing only. */
    @XmlEnumValue("Europe & Central Asia (developing only)")
    EUROPE_CENTRAL_ASIA_DEVELOPING_ONLY("Europe & Central Asia (developing only)"),

    /** The latin america caribbean developing only. */
    @XmlEnumValue("Latin America & Caribbean (developing only)")
    LATIN_AMERICA_CARIBBEAN_DEVELOPING_ONLY("Latin America & Caribbean (developing only)"),

    /** The middle east north africa developing only. */
    @XmlEnumValue("Middle East & North Africa (developing only)")
    MIDDLE_EAST_NORTH_AFRICA_DEVELOPING_ONLY("Middle East & North Africa (developing only)"),

    /** The south asia. */
    @XmlEnumValue("South Asia")
    SOUTH_ASIA("South Asia"),

    /** The sub saharan africa developing only. */
    @XmlEnumValue("Sub-Saharan Africa (developing only)")
    SUB_SAHARAN_AFRICA_DEVELOPING_ONLY("Sub-Saharan Africa (developing only)");

    /** The value. */
    private final String value;

    /**
	 * Instantiates a new admin region category.
	 *
	 * @param v the v
	 */
    AdminRegionCategory(final String v) {
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
	 * @return the admin region category
	 */
    public static AdminRegionCategory fromValue(final String v) {
        for (final AdminRegionCategory c: AdminRegionCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
