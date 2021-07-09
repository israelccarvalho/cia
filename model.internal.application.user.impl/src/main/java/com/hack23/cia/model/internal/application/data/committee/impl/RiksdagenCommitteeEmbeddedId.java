//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.25 at 12:05:09 AM CET
//


package com.hack23.cia.model.internal.application.data.committee.impl;



import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * <p>Java class for RiksdagenCommitteeEmbeddedId complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RiksdagenCommitteeEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiksdagenCommitteeEmbeddedId", propOrder = {
    "detail",
    "orgCode"
})
@Embeddable
public class RiksdagenCommitteeEmbeddedId
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected String detail;
    @XmlElement(required = true)
    protected String orgCode;

    /**
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "DETAIL")
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetail(final String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the orgCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Basic
    @Column(name = "ORG_CODE")
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgCode(final String value) {
        this.orgCode = value;
    }

    public RiksdagenCommitteeEmbeddedId withDetail(final String value) {
        setDetail(value);
        return this;
    }

    public RiksdagenCommitteeEmbeddedId withOrgCode(final String value) {
        setOrgCode(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
