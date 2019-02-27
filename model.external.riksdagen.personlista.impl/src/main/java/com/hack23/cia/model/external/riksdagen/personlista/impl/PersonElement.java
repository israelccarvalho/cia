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

import java.io.Serializable;

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

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

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
    implements Serializable, ModelObject, Equals
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
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.EqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PersonElement that = ((PersonElement) object);
        {
            String lhsHangarGuid;
            lhsHangarGuid = this.getHangarGuid();
            String rhsHangarGuid;
            rhsHangarGuid = that.getHangarGuid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hangarGuid", lhsHangarGuid), LocatorUtils.property(thatLocator, "hangarGuid", rhsHangarGuid), lhsHangarGuid, rhsHangarGuid)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsBornYear;
            lhsBornYear = this.getBornYear();
            String rhsBornYear;
            rhsBornYear = that.getBornYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bornYear", lhsBornYear), LocatorUtils.property(thatLocator, "bornYear", rhsBornYear), lhsBornYear, rhsBornYear)) {
                return false;
            }
        }
        {
            SexType lhsGender;
            lhsGender = this.getGender();
            SexType rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsPlace;
            lhsPlace = this.getPlace();
            String rhsPlace;
            rhsPlace = that.getPlace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "place", lhsPlace), LocatorUtils.property(thatLocator, "place", rhsPlace), lhsPlace, rhsPlace)) {
                return false;
            }
        }
        {
            String lhsParty;
            lhsParty = this.getParty();
            String rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty)) {
                return false;
            }
        }
        {
            String lhsElectionRegion;
            lhsElectionRegion = this.getElectionRegion();
            String rhsElectionRegion;
            rhsElectionRegion = that.getElectionRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electionRegion", lhsElectionRegion), LocatorUtils.property(thatLocator, "electionRegion", rhsElectionRegion), lhsElectionRegion, rhsElectionRegion)) {
                return false;
            }
        }
        {
            RoleStatus lhsStatus;
            lhsStatus = this.getStatus();
            RoleStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            String lhsImageUrl192;
            lhsImageUrl192 = this.getImageUrl192();
            String rhsImageUrl192;
            rhsImageUrl192 = that.getImageUrl192();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageUrl192", lhsImageUrl192), LocatorUtils.property(thatLocator, "imageUrl192", rhsImageUrl192), lhsImageUrl192, rhsImageUrl192)) {
                return false;
            }
        }
        {
            String lhsImageUrlMax;
            lhsImageUrlMax = this.getImageUrlMax();
            String rhsImageUrlMax;
            rhsImageUrlMax = that.getImageUrlMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageUrlMax", lhsImageUrlMax), LocatorUtils.property(thatLocator, "imageUrlMax", rhsImageUrlMax), lhsImageUrlMax, rhsImageUrlMax)) {
                return false;
            }
        }
        {
            String lhsImageUrl80;
            lhsImageUrl80 = this.getImageUrl80();
            String rhsImageUrl80;
            rhsImageUrl80 = that.getImageUrl80();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imageUrl80", lhsImageUrl80), LocatorUtils.property(thatLocator, "imageUrl80", rhsImageUrl80), lhsImageUrl80, rhsImageUrl80)) {
                return false;
            }
        }
        {
            String lhsPersonUrlXml;
            lhsPersonUrlXml = this.getPersonUrlXml();
            String rhsPersonUrlXml;
            rhsPersonUrlXml = that.getPersonUrlXml();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personUrlXml", lhsPersonUrlXml), LocatorUtils.property(thatLocator, "personUrlXml", rhsPersonUrlXml), lhsPersonUrlXml, rhsPersonUrlXml)) {
                return false;
            }
        }
        {
            PersonAssignmentElement lhsPersonAssignmentElement;
            lhsPersonAssignmentElement = this.getPersonAssignmentElement();
            PersonAssignmentElement rhsPersonAssignmentElement;
            rhsPersonAssignmentElement = that.getPersonAssignmentElement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personAssignmentElement", lhsPersonAssignmentElement), LocatorUtils.property(thatLocator, "personAssignmentElement", rhsPersonAssignmentElement), lhsPersonAssignmentElement, rhsPersonAssignmentElement)) {
                return false;
            }
        }
        {
            PersonDetailElement lhsPersonDetailElement;
            lhsPersonDetailElement = this.getPersonDetailElement();
            PersonDetailElement rhsPersonDetailElement;
            rhsPersonDetailElement = that.getPersonDetailElement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personDetailElement", lhsPersonDetailElement), LocatorUtils.property(thatLocator, "personDetailElement", rhsPersonDetailElement), lhsPersonDetailElement, rhsPersonDetailElement)) {
                return false;
            }
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
