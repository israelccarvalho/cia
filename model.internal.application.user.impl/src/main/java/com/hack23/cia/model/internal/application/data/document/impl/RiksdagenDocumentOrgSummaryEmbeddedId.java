//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.document.impl;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for RiksdagenDocumentOrgSummaryEmbeddedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiksdagenDocumentOrgSummaryEmbeddedId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="public_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiksdagenDocumentOrgSummaryEmbeddedId", propOrder = {
    "publicDate",
    "org"
})
@Embeddable
public class RiksdagenDocumentOrgSummaryEmbeddedId
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "public_date", required = true)
    protected String publicDate;
    @XmlElement(required = true)
    protected String org;

    /**
     * Gets the value of the publicDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PUBLIC_DATE")
    public String getPublicDate() {
        return publicDate;
    }

    /**
     * Sets the value of the publicDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicDate(final String value) {
        this.publicDate = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(final String value) {
        this.org = value;
    }

    public RiksdagenDocumentOrgSummaryEmbeddedId withPublicDate(final String value) {
        setPublicDate(value);
        return this;
    }

    public RiksdagenDocumentOrgSummaryEmbeddedId withOrg(final String value) {
        setOrg(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}


    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RiksdagenDocumentOrgSummaryEmbeddedId that = ((RiksdagenDocumentOrgSummaryEmbeddedId) object);
        {
            String lhsPublicDate;
            lhsPublicDate = this.getPublicDate();
            String rhsPublicDate;
            rhsPublicDate = that.getPublicDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicDate", lhsPublicDate), LocatorUtils.property(thatLocator, "publicDate", rhsPublicDate), lhsPublicDate, rhsPublicDate)) {
                return false;
            }
        }
        {
            String lhsOrg;
            lhsOrg = this.getOrg();
            String rhsOrg;
            rhsOrg = that.getOrg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "org", lhsOrg), LocatorUtils.property(thatLocator, "org", rhsOrg), lhsOrg, rhsOrg)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(final Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
