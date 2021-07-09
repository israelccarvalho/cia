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

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class PersonElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonElement", propOrder = {
    "hangarGuid",
    "id",
    "bornYear",
    "gender",
    "lastName",
    "firstName",
    "place",
    "party",
    "electionRegion",
    "status",
    "imageUrl192",
    "imageUrlMax",
    "imageUrl80",
    "personUrlXml",
    "personAssignmentElement",
    "personDetailElement"
})
@Entity(name = "PersonElement")
@Table(name = "PERSON_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonElement
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** The hangar guid. */
    @XmlElement(name = "hangar_guid", required = true)
    protected String hangarGuid;

    /** The id. */
    @XmlElement(name = "intressent_id", required = true)
    protected String id;

    /** The born year. */
    @XmlElement(name = "fodd_ar", required = true)
    protected String bornYear;

    /** The gender. */
    @XmlElement(name = "kon", required = true)
    @XmlSchemaType(name = "string")
    protected SexType gender;

    /** The last name. */
    @XmlElement(name = "efternamn", required = true)
    protected String lastName;

    /** The first name. */
    @XmlElement(name = "tilltalsnamn", required = true)
    protected String firstName;

    /** The place. */
    @XmlElement(name = "iort", required = true)
    protected String place;

    /** The party. */
    @XmlElement(name = "parti", required = true)
    protected String party;

    /** The election region. */
    @XmlElement(name = "valkrets", required = true)
    protected String electionRegion;

    /** The status. */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoleStatus status;

    /** The image url 192. */
    @XmlElement(name = "bild_url_192", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imageUrl192;

    /** The image url max. */
    @XmlElement(name = "bild_url_max", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imageUrlMax;

    /** The image url 80. */
    @XmlElement(name = "bild_url_80", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imageUrl80;

    /** The person url xml. */
    @XmlElement(name = "person_url_xml", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String personUrlXml;

    /** The person assignment element. */
    @XmlElement(name = "personuppdrag", required = true)
    protected PersonAssignmentElement personAssignmentElement;

    /** The person detail element. */
    @XmlElement(name = "personuppgift", required = true)
    protected PersonDetailElement personDetailElement;

    /**
	 * Gets the hangar guid.
	 *
	 * @return the hangar guid
	 */
    @Basic
    @Column(name = "HANGAR_GUID")
    public String getHangarGuid() {
        return hangarGuid;
    }

    /**
	 * Sets the hangar guid.
	 *
	 * @param value the new hangar guid
	 */
    public void setHangarGuid(final String value) {
        this.hangarGuid = value;
    }

    /**
	 * Gets the id.
	 *
	 * @return the id
	 */
    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    /**
	 * Sets the id.
	 *
	 * @param value the new id
	 */
    public void setId(final String value) {
        this.id = value;
    }

    /**
	 * Gets the born year.
	 *
	 * @return the born year
	 */
    @Basic
    @Column(name = "BORN_YEAR")
    public String getBornYear() {
        return bornYear;
    }

    /**
	 * Sets the born year.
	 *
	 * @param value the new born year
	 */
    public void setBornYear(final String value) {
        this.bornYear = value;
    }

    /**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
    @Basic
    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    public SexType getGender() {
        return gender;
    }

    /**
	 * Sets the gender.
	 *
	 * @param value the new gender
	 */
    public void setGender(final SexType value) {
        this.gender = value;
    }

    /**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
    @Basic
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    /**
	 * Sets the last name.
	 *
	 * @param value the new last name
	 */
    public void setLastName(final String value) {
        this.lastName = value;
    }

    /**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    /**
	 * Sets the first name.
	 *
	 * @param value the new first name
	 */
    public void setFirstName(final String value) {
        this.firstName = value;
    }

    /**
	 * Gets the place.
	 *
	 * @return the place
	 */
    @Basic
    @Column(name = "PLACE")
    public String getPlace() {
        return place;
    }

    /**
	 * Sets the place.
	 *
	 * @param value the new place
	 */
    public void setPlace(final String value) {
        this.place = value;
    }

    /**
	 * Gets the party.
	 *
	 * @return the party
	 */
    @Basic
    @Column(name = "PARTY")
    public String getParty() {
        return party;
    }

    /**
	 * Sets the party.
	 *
	 * @param value the new party
	 */
    public void setParty(final String value) {
        this.party = value;
    }

    /**
	 * Gets the election region.
	 *
	 * @return the election region
	 */
    @Basic
    @Column(name = "ELECTION_REGION")
    public String getElectionRegion() {
        return electionRegion;
    }

    /**
	 * Sets the election region.
	 *
	 * @param value the new election region
	 */
    public void setElectionRegion(final String value) {
        this.electionRegion = value;
    }

    /**
	 * Gets the status.
	 *
	 * @return the status
	 */
    @Basic
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    public RoleStatus getStatus() {
        return status;
    }

    /**
	 * Sets the status.
	 *
	 * @param value the new status
	 */
    public void setStatus(final RoleStatus value) {
        this.status = value;
    }

    /**
	 * Gets the image url 192.
	 *
	 * @return the image url 192
	 */
    @Basic
    @Column(name = "IMAGE_URL_192")
    public String getImageUrl192() {
        return imageUrl192;
    }

    /**
	 * Sets the image url 192.
	 *
	 * @param value the new image url 192
	 */
    public void setImageUrl192(final String value) {
        this.imageUrl192 = value;
    }

    /**
	 * Gets the image url max.
	 *
	 * @return the image url max
	 */
    @Basic
    @Column(name = "IMAGE_URL_MAX")
    public String getImageUrlMax() {
        return imageUrlMax;
    }

    /**
	 * Sets the image url max.
	 *
	 * @param value the new image url max
	 */
    public void setImageUrlMax(final String value) {
        this.imageUrlMax = value;
    }

    /**
	 * Gets the image url 80.
	 *
	 * @return the image url 80
	 */
    @Basic
    @Column(name = "IMAGE_URL_80")
    public String getImageUrl80() {
        return imageUrl80;
    }

    /**
	 * Sets the image url 80.
	 *
	 * @param value the new image url 80
	 */
    public void setImageUrl80(final String value) {
        this.imageUrl80 = value;
    }

    /**
	 * Gets the person url xml.
	 *
	 * @return the person url xml
	 */
    @Basic
    @Column(name = "PERSON_URL_XML")
    public String getPersonUrlXml() {
        return personUrlXml;
    }

    /**
	 * Sets the person url xml.
	 *
	 * @param value the new person url xml
	 */
    public void setPersonUrlXml(final String value) {
        this.personUrlXml = value;
    }

    /**
	 * Gets the person assignment element.
	 *
	 * @return the person assignment element
	 */
    @ManyToOne(targetEntity = PersonAssignmentElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERSON_ASSIGNMENT_ELEMENT_PE_0")
    public PersonAssignmentElement getPersonAssignmentElement() {
        return personAssignmentElement;
    }

    /**
	 * Sets the person assignment element.
	 *
	 * @param value the new person assignment element
	 */
    public void setPersonAssignmentElement(final PersonAssignmentElement value) {
        this.personAssignmentElement = value;
    }

    /**
	 * Gets the person detail element.
	 *
	 * @return the person detail element
	 */
    @ManyToOne(targetEntity = PersonDetailElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERSON_DETAIL_ELEMENT_PERSON_0")
    public PersonDetailElement getPersonDetailElement() {
        return personDetailElement;
    }

    /**
	 * Sets the person detail element.
	 *
	 * @param value the new person detail element
	 */
    public void setPersonDetailElement(final PersonDetailElement value) {
        this.personDetailElement = value;
    }

    /**
	 * With hangar guid.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withHangarGuid(final String value) {
        setHangarGuid(value);
        return this;
    }

    /**
	 * With id.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withId(final String value) {
        setId(value);
        return this;
    }

    /**
	 * With born year.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withBornYear(final String value) {
        setBornYear(value);
        return this;
    }

    /**
	 * With gender.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withGender(final SexType value) {
        setGender(value);
        return this;
    }

    /**
	 * With last name.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withLastName(final String value) {
        setLastName(value);
        return this;
    }

    /**
	 * With first name.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withFirstName(final String value) {
        setFirstName(value);
        return this;
    }

    /**
	 * With place.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withPlace(final String value) {
        setPlace(value);
        return this;
    }

    /**
	 * With party.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withParty(final String value) {
        setParty(value);
        return this;
    }

    /**
	 * With election region.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withElectionRegion(final String value) {
        setElectionRegion(value);
        return this;
    }

    /**
	 * With status.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withStatus(final RoleStatus value) {
        setStatus(value);
        return this;
    }

    /**
	 * With image url 192.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withImageUrl192(final String value) {
        setImageUrl192(value);
        return this;
    }

    /**
	 * With image url max.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withImageUrlMax(final String value) {
        setImageUrlMax(value);
        return this;
    }

    /**
	 * With image url 80.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withImageUrl80(final String value) {
        setImageUrl80(value);
        return this;
    }

    /**
	 * With person url xml.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withPersonUrlXml(final String value) {
        setPersonUrlXml(value);
        return this;
    }

    /**
	 * With person assignment element.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withPersonAssignmentElement(final PersonAssignmentElement value) {
        setPersonAssignmentElement(value);
        return this;
    }

    /**
	 * With person detail element.
	 *
	 * @param value the value
	 * @return the person element
	 */
    public PersonElement withPersonDetailElement(final PersonDetailElement value) {
        setPersonDetailElement(value);
        return this;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
	public boolean equals(final Object object) {
    	return EqualsBuilder.reflectionEquals(this,object);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
