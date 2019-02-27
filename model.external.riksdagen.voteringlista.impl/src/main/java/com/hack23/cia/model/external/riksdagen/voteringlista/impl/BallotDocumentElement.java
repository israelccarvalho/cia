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
// Generated on: 2019.02.24 at 11:40:17 PM CET 
//


package com.hack23.cia.model.external.riksdagen.voteringlista.impl;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * The Class BallotDocumentElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BallotDocumentElement", propOrder = {
    "ballotId",
    "yesVotes",
    "noVotes",
    "absentVotes",
    "abstainedVotes"
})
@Entity(name = "BallotDocumentElement")
@Table(name = "BALLOT_DOCUMENT_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class BallotDocumentElement
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The ballot id. */
    @XmlElement(name = "votering_id", required = true)
    protected String ballotId;
    
    /** The yes votes. */
    @XmlElement(name = "Ja")
    protected int yesVotes;
    
    /** The no votes. */
    @XmlElement(name = "Nej")
    protected int noVotes;
    
    /** The absent votes. */
    @XmlElement(name = "Fr\u00e5nvarande")
    protected int absentVotes;
    
    /** The abstained votes. */
    @XmlElement(name = "Avst\u00e5r")
    protected int abstainedVotes;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the ballot id.
	 *
	 * @return the ballot id
	 */
    @Basic
    @Column(name = "BALLOT_ID")
    public String getBallotId() {
        return ballotId;
    }

    /**
	 * Sets the ballot id.
	 *
	 * @param value the new ballot id
	 */
    public void setBallotId(final String value) {
        this.ballotId = value;
    }

    /**
	 * Gets the yes votes.
	 *
	 * @return the yes votes
	 */
    @Basic
    @Column(name = "YES_VOTES", precision = 10, scale = 0)
    public int getYesVotes() {
        return yesVotes;
    }

    /**
	 * Sets the yes votes.
	 *
	 * @param value the new yes votes
	 */
    public void setYesVotes(final int value) {
        this.yesVotes = value;
    }

    /**
	 * Gets the no votes.
	 *
	 * @return the no votes
	 */
    @Basic
    @Column(name = "NO_VOTES", precision = 10, scale = 0)
    public int getNoVotes() {
        return noVotes;
    }

    /**
	 * Sets the no votes.
	 *
	 * @param value the new no votes
	 */
    public void setNoVotes(final int value) {
        this.noVotes = value;
    }

    /**
	 * Gets the absent votes.
	 *
	 * @return the absent votes
	 */
    @Basic
    @Column(name = "ABSENT_VOTES", precision = 10, scale = 0)
    public int getAbsentVotes() {
        return absentVotes;
    }

    /**
	 * Sets the absent votes.
	 *
	 * @param value the new absent votes
	 */
    public void setAbsentVotes(final int value) {
        this.absentVotes = value;
    }

    /**
	 * Gets the abstained votes.
	 *
	 * @return the abstained votes
	 */
    @Basic
    @Column(name = "ABSTAINED_VOTES", precision = 10, scale = 0)
    public int getAbstainedVotes() {
        return abstainedVotes;
    }

    /**
	 * Sets the abstained votes.
	 *
	 * @param value the new abstained votes
	 */
    public void setAbstainedVotes(final int value) {
        this.abstainedVotes = value;
    }

    /**
	 * With ballot id.
	 *
	 * @param value the value
	 * @return the ballot document element
	 */
    public BallotDocumentElement withBallotId(final String value) {
        setBallotId(value);
        return this;
    }

    /**
	 * With yes votes.
	 *
	 * @param value the value
	 * @return the ballot document element
	 */
    public BallotDocumentElement withYesVotes(final int value) {
        setYesVotes(value);
        return this;
    }

    /**
	 * With no votes.
	 *
	 * @param value the value
	 * @return the ballot document element
	 */
    public BallotDocumentElement withNoVotes(final int value) {
        setNoVotes(value);
        return this;
    }

    /**
	 * With absent votes.
	 *
	 * @param value the value
	 * @return the ballot document element
	 */
    public BallotDocumentElement withAbsentVotes(final int value) {
        setAbsentVotes(value);
        return this;
    }

    /**
	 * With abstained votes.
	 *
	 * @param value the value
	 * @return the ballot document element
	 */
    public BallotDocumentElement withAbstainedVotes(final int value) {
        setAbstainedVotes(value);
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
     * @see org.jvnet.jaxb2_commons.lang.Equals#equals(org.jvnet.jaxb2_commons.locator.ObjectLocator, org.jvnet.jaxb2_commons.locator.ObjectLocator, java.lang.Object, org.jvnet.jaxb2_commons.lang.EqualsStrategy)
     */
    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BallotDocumentElement that = ((BallotDocumentElement) object);
        {
            String lhsBallotId;
            lhsBallotId = this.getBallotId();
            String rhsBallotId;
            rhsBallotId = that.getBallotId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ballotId", lhsBallotId), LocatorUtils.property(thatLocator, "ballotId", rhsBallotId), lhsBallotId, rhsBallotId)) {
                return false;
            }
        }
        {
            int lhsYesVotes;
            lhsYesVotes = this.getYesVotes();
            int rhsYesVotes;
            rhsYesVotes = that.getYesVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yesVotes", lhsYesVotes), LocatorUtils.property(thatLocator, "yesVotes", rhsYesVotes), lhsYesVotes, rhsYesVotes)) {
                return false;
            }
        }
        {
            int lhsNoVotes;
            lhsNoVotes = this.getNoVotes();
            int rhsNoVotes;
            rhsNoVotes = that.getNoVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noVotes", lhsNoVotes), LocatorUtils.property(thatLocator, "noVotes", rhsNoVotes), lhsNoVotes, rhsNoVotes)) {
                return false;
            }
        }
        {
            int lhsAbsentVotes;
            lhsAbsentVotes = this.getAbsentVotes();
            int rhsAbsentVotes;
            rhsAbsentVotes = that.getAbsentVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "absentVotes", lhsAbsentVotes), LocatorUtils.property(thatLocator, "absentVotes", rhsAbsentVotes), lhsAbsentVotes, rhsAbsentVotes)) {
                return false;
            }
        }
        {
            int lhsAbstainedVotes;
            lhsAbstainedVotes = this.getAbstainedVotes();
            int rhsAbstainedVotes;
            rhsAbstainedVotes = that.getAbstainedVotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abstainedVotes", lhsAbstainedVotes), LocatorUtils.property(thatLocator, "abstainedVotes", rhsAbstainedVotes), lhsAbstainedVotes, rhsAbstainedVotes)) {
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
