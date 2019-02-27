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

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
 * The Class DocumentReferenceData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReferenceData", propOrder = {
    "referenceType",
    "referenceDocumentId",
    "detail"
})
@Entity(name = "DocumentReferenceData")
@Table(name = "DOCUMENT_REFERENCE_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class DocumentReferenceData
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The reference type. */
    @XmlElement(name = "referenstyp", required = true)
    @XmlSchemaType(name = "string")
    protected ReferenceType referenceType;
    
    /** The reference document id. */
    @XmlElement(name = "ref_dokid", required = true)
    protected String referenceDocumentId;
    
    /** The detail. */
    @XmlElement(name = "uppgift", required = true)
    protected String detail;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the reference type.
	 *
	 * @return the reference type
	 */
    @Basic
    @Column(name = "REFERENCE_TYPE")
    @Enumerated(EnumType.STRING)
    public ReferenceType getReferenceType() {
        return referenceType;
    }

    /**
	 * Sets the reference type.
	 *
	 * @param value the new reference type
	 */
    public void setReferenceType(final ReferenceType value) {
        this.referenceType = value;
    }

    /**
	 * Gets the reference document id.
	 *
	 * @return the reference document id
	 */
    @Basic
    @Column(name = "REFERENCE_DOCUMENT_ID")
    public String getReferenceDocumentId() {
        return referenceDocumentId;
    }

    /**
	 * Sets the reference document id.
	 *
	 * @param value the new reference document id
	 */
    public void setReferenceDocumentId(final String value) {
        this.referenceDocumentId = value;
    }

    /**
	 * Gets the detail.
	 *
	 * @return the detail
	 */
    @Basic
    @Column(name = "DETAIL", length = 65536)
    public String getDetail() {
        return detail;
    }

    /**
	 * Sets the detail.
	 *
	 * @param value the new detail
	 */
    public void setDetail(final String value) {
        this.detail = value;
    }

    /**
	 * With reference type.
	 *
	 * @param value the value
	 * @return the document reference data
	 */
    public DocumentReferenceData withReferenceType(final ReferenceType value) {
        setReferenceType(value);
        return this;
    }

    /**
	 * With reference document id.
	 *
	 * @param value the value
	 * @return the document reference data
	 */
    public DocumentReferenceData withReferenceDocumentId(final String value) {
        setReferenceDocumentId(value);
        return this;
    }

    /**
	 * With detail.
	 *
	 * @param value the value
	 * @return the document reference data
	 */
    public DocumentReferenceData withDetail(final String value) {
        setDetail(value);
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
        final DocumentReferenceData that = ((DocumentReferenceData) object);
        {
            ReferenceType lhsReferenceType;
            lhsReferenceType = this.getReferenceType();
            ReferenceType rhsReferenceType;
            rhsReferenceType = that.getReferenceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceType", lhsReferenceType), LocatorUtils.property(thatLocator, "referenceType", rhsReferenceType), lhsReferenceType, rhsReferenceType)) {
                return false;
            }
        }
        {
            String lhsReferenceDocumentId;
            lhsReferenceDocumentId = this.getReferenceDocumentId();
            String rhsReferenceDocumentId;
            rhsReferenceDocumentId = that.getReferenceDocumentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDocumentId", lhsReferenceDocumentId), LocatorUtils.property(thatLocator, "referenceDocumentId", rhsReferenceDocumentId), lhsReferenceDocumentId, rhsReferenceDocumentId)) {
                return false;
            }
        }
        {
            String lhsDetail;
            lhsDetail = this.getDetail();
            String rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail)) {
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
