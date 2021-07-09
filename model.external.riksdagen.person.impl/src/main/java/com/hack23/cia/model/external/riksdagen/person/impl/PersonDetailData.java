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
// Generated on: 2019.02.24 at 11:39:56 PM CET
//


package com.hack23.cia.model.external.riksdagen.person.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class PersonDetailData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonDetailData", propOrder = {
    "detailList"
})
@Entity(name = "PersonDetailData")
@Table(name = "PERSON_DETAIL_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonDetailData
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** The detail list. */
    @XmlElement(name = "uppgift", required = true)
    protected List<DetailData> detailList = new ArrayList<>();

    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the detail list.
	 *
	 * @return the detail list
	 */
    @OneToMany(targetEntity = DetailData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DETAIL_LIST_PERSON_DETAIL_DA_0")
    public List<DetailData> getDetailList() {
        return this.detailList;
    }

    /**
	 * Sets the detail list.
	 *
	 * @param detailList the new detail list
	 */
    public void setDetailList(final List<DetailData> detailList) {
        this.detailList = detailList;
    }

    /**
	 * With detail list.
	 *
	 * @param detailList the detail list
	 * @return the person detail data
	 */
    public PersonDetailData withDetailList(final List<DetailData> detailList) {
        setDetailList(detailList);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


    /**
	 * Gets the hjid.
	 *
	 * @return the hjid
	 */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
	 * Sets the hjid.
	 *
	 * @param value the new hjid
	 */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
	public boolean equals(final Object object) {
    	return EqualsBuilder.reflectionEquals(this,object,"hjid");
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
