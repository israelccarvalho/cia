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
 * The Enum IncomeLevelCategory.
 */
@XmlType(name = "IncomeLevelCategory")
@XmlEnum
public enum IncomeLevelCategory {

    /** The low income. */
    @XmlEnumValue("Low income")
    LOW_INCOME("Low income"),
    
    /** The lower middle income. */
    @XmlEnumValue("Lower middle income")
    LOWER_MIDDLE_INCOME("Lower middle income"),
    
    /** The aggregates. */
    @XmlEnumValue("Aggregates")
    AGGREGATES("Aggregates"),
    
    /** The high income non oecd. */
    @XmlEnumValue("High income: nonOECD")
    HIGH_INCOME_NON_OECD("High income: nonOECD"),
    
    /** The na. */
    NA("NA"),
    
    /** The high income oecd. */
    @XmlEnumValue("High income: OECD")
    HIGH_INCOME_OECD("High income: OECD"),
    
    /** The upper middle income. */
    @XmlEnumValue("Upper middle income")
    UPPER_MIDDLE_INCOME("Upper middle income");
    
    /** The value. */
    private final String value;

    /**
	 * Instantiates a new income level category.
	 *
	 * @param v the v
	 */
    IncomeLevelCategory(final String v) {
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
	 * @return the income level category
	 */
    public static IncomeLevelCategory fromValue(final String v) {
        for (final IncomeLevelCategory c: IncomeLevelCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
