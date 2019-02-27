//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.ministry.impl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;


/**
 * <p>Java class for ViewRiksdagenMinistry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenMinistry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAssignments" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="firstAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="lastAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="totalDaysServed" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currentMemberSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenMinistry", propOrder = {
    "nameId",
    "totalAssignments",
    "firstAssignmentDate",
    "lastAssignmentDate",
    "totalDaysServed",
    "currentMemberSize",
    "active"
})
@Entity(name = "ViewRiksdagenMinistry")
@Table(name = "VIEW_RIKSDAGEN_GOVERMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenMinistry
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required = true)
    protected String nameId;
    protected long totalAssignments;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date firstAssignmentDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date lastAssignmentDate;
    protected long totalDaysServed;
    protected long currentMemberSize;
    protected boolean active;

    /**
     * Gets the value of the nameId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "NAME_ID")
    public String getNameId() {
        return nameId;
    }

    /**
     * Sets the value of the nameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameId(final String value) {
        this.nameId = value;
    }

    /**
     * Gets the value of the totalAssignments property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_ASSIGNMENTS", precision = 20, scale = 0)
    public long getTotalAssignments() {
        return totalAssignments;
    }

    /**
     * Sets the value of the totalAssignments property.
     * 
     */
    public void setTotalAssignments(final long value) {
        this.totalAssignments = value;
    }

    /**
     * Gets the value of the firstAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_ASSIGNMENT_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFirstAssignmentDate() {
        return firstAssignmentDate;
    }

    /**
     * Sets the value of the firstAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAssignmentDate(final Date value) {
        this.firstAssignmentDate = value;
    }

    /**
     * Gets the value of the lastAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_ASSIGNMENT_DATE")
    @Temporal(TemporalType.DATE)
    public Date getLastAssignmentDate() {
        return lastAssignmentDate;
    }

    /**
     * Sets the value of the lastAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAssignmentDate(final Date value) {
        this.lastAssignmentDate = value;
    }

    /**
     * Gets the value of the totalDaysServed property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED", precision = 20, scale = 0)
    public long getTotalDaysServed() {
        return totalDaysServed;
    }

    /**
     * Sets the value of the totalDaysServed property.
     * 
     */
    public void setTotalDaysServed(final long value) {
        this.totalDaysServed = value;
    }

    /**
     * Gets the value of the currentMemberSize property.
     * 
     */
    @Basic
    @Column(name = "CURRENT_MEMBER_SIZE", precision = 20, scale = 0)
    public long getCurrentMemberSize() {
        return currentMemberSize;
    }

    /**
     * Sets the value of the currentMemberSize property.
     * 
     */
    public void setCurrentMemberSize(final long value) {
        this.currentMemberSize = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE")
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(final boolean value) {
        this.active = value;
    }

    public ViewRiksdagenMinistry withNameId(final String value) {
        setNameId(value);
        return this;
    }

    public ViewRiksdagenMinistry withTotalAssignments(final long value) {
        setTotalAssignments(value);
        return this;
    }

    public ViewRiksdagenMinistry withFirstAssignmentDate(final Date value) {
        setFirstAssignmentDate(value);
        return this;
    }

    public ViewRiksdagenMinistry withLastAssignmentDate(final Date value) {
        setLastAssignmentDate(value);
        return this;
    }

    public ViewRiksdagenMinistry withTotalDaysServed(final long value) {
        setTotalDaysServed(value);
        return this;
    }

    public ViewRiksdagenMinistry withCurrentMemberSize(final long value) {
        setCurrentMemberSize(value);
        return this;
    }

    public ViewRiksdagenMinistry withActive(final boolean value) {
        setActive(value);
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
        final ViewRiksdagenMinistry that = ((ViewRiksdagenMinistry) object);
        {
            String lhsNameId;
            lhsNameId = this.getNameId();
            String rhsNameId;
            rhsNameId = that.getNameId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameId", lhsNameId), LocatorUtils.property(thatLocator, "nameId", rhsNameId), lhsNameId, rhsNameId)) {
                return false;
            }
        }
        {
            long lhsTotalAssignments;
            lhsTotalAssignments = this.getTotalAssignments();
            long rhsTotalAssignments;
            rhsTotalAssignments = that.getTotalAssignments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAssignments", lhsTotalAssignments), LocatorUtils.property(thatLocator, "totalAssignments", rhsTotalAssignments), lhsTotalAssignments, rhsTotalAssignments)) {
                return false;
            }
        }
        {
            Date lhsFirstAssignmentDate;
            lhsFirstAssignmentDate = this.getFirstAssignmentDate();
            Date rhsFirstAssignmentDate;
            rhsFirstAssignmentDate = that.getFirstAssignmentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstAssignmentDate", lhsFirstAssignmentDate), LocatorUtils.property(thatLocator, "firstAssignmentDate", rhsFirstAssignmentDate), lhsFirstAssignmentDate, rhsFirstAssignmentDate)) {
                return false;
            }
        }
        {
            Date lhsLastAssignmentDate;
            lhsLastAssignmentDate = this.getLastAssignmentDate();
            Date rhsLastAssignmentDate;
            rhsLastAssignmentDate = that.getLastAssignmentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastAssignmentDate", lhsLastAssignmentDate), LocatorUtils.property(thatLocator, "lastAssignmentDate", rhsLastAssignmentDate), lhsLastAssignmentDate, rhsLastAssignmentDate)) {
                return false;
            }
        }
        {
            long lhsTotalDaysServed;
            lhsTotalDaysServed = this.getTotalDaysServed();
            long rhsTotalDaysServed;
            rhsTotalDaysServed = that.getTotalDaysServed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalDaysServed", lhsTotalDaysServed), LocatorUtils.property(thatLocator, "totalDaysServed", rhsTotalDaysServed), lhsTotalDaysServed, rhsTotalDaysServed)) {
                return false;
            }
        }
        {
            long lhsCurrentMemberSize;
            lhsCurrentMemberSize = this.getCurrentMemberSize();
            long rhsCurrentMemberSize;
            rhsCurrentMemberSize = that.getCurrentMemberSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentMemberSize", lhsCurrentMemberSize), LocatorUtils.property(thatLocator, "currentMemberSize", rhsCurrentMemberSize), lhsCurrentMemberSize, rhsCurrentMemberSize)) {
                return false;
            }
        }
        {
            boolean lhsActive;
            lhsActive = this.isActive();
            boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
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
