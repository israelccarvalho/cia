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
// Generated on: 2019.02.24 at 11:40:07 PM CET
//


package com.hack23.cia.model.external.riksdagen.dokumentstatus.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * The Enum ReferenceType.
 */
@XmlType(name = "ReferenceType")
@XmlEnum
public enum ReferenceType {

    /** The protkollbeslut. */
    @XmlEnumValue("protkollbeslut")
    PROTKOLLBESLUT("protkollbeslut"),

    /** The protokolldebatt. */
    @XmlEnumValue("protokolldebatt")
    PROTOKOLLDEBATT("protokolldebatt"),

    /** The riksdagsskrivelse. */
    @XmlEnumValue("riksdagsskrivelse")
    RIKSDAGSSKRIVELSE("riksdagsskrivelse"),

    /** The behandlar. */
    @XmlEnumValue("behandlar")
    BEHANDLAR("behandlar");

    /** The value. */
    private final String value;

    /**
	 * Instantiates a new reference type.
	 *
	 * @param v the v
	 */
    ReferenceType(final String v) {
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
	 * @return the reference type
	 */
    public static ReferenceType fromValue(final String v) {
        for (final ReferenceType c: ReferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
