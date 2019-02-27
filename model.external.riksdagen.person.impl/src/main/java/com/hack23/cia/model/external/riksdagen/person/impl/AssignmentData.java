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

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * The Class AssignmentData.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentData", propOrder = {
    "orgCode",
    "roleCode",
    "orderNumber",
    "status",
    "assignmentType",
    "fromDate",
    "toDate",
    "detail",
    "intressentId"
})
@Entity(name = "AssignmentData")
@Table(name = "ASSIGNMENT_DATA")
@Inheritance(strategy = InheritanceType.JOINED)
public class AssignmentData
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The org code. */
    @XmlElement(name = "organ_kod", required = true)
    protected String orgCode;
    
    /** The role code. */
    @XmlElement(name = "roll_kod", required = true)
    protected String roleCode;
    
    /** The order number. */
    @XmlElement(name = "ordningsnummer", required = true)
    protected String orderNumber;
    
    /** The status. */
    @XmlElement(required = true)
    protected String status;
    
    /** The assignment type. */
    @XmlElement(name = "typ", required = true)
    protected String assignmentType;
    
    /** The from date. */
    @XmlElement(name = "from", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    
    /** The to date. */
    @XmlElement(name = "tom", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date toDate;
    
    /** The detail. */
    @XmlElement(name = "uppgift", required = true)
    protected String detail;
    
    /** The intressent id. */
    @XmlElement(name = "intressent_id", required = true)
    protected String intressentId;
    
    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the org code.
	 *
	 * @return the org code
	 */
    @Basic
    @Column(name = "ORG_CODE")
    public String getOrgCode() {
        return orgCode;
    }

    /**
	 * Sets the org code.
	 *
	 * @param value the new org code
	 */
    public void setOrgCode(final String value) {
        this.orgCode = value;
    }

    /**
	 * Gets the role code.
	 *
	 * @return the role code
	 */
    @Basic
    @Column(name = "ROLE_CODE")
    public String getRoleCode() {
        return roleCode;
    }

    /**
	 * Sets the role code.
	 *
	 * @param value the new role code
	 */
    public void setRoleCode(final String value) {
        this.roleCode = value;
    }

    /**
	 * Gets the order number.
	 *
	 * @return the order number
	 */
    @Basic
    @Column(name = "ORDER_NUMBER")
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
	 * Sets the order number.
	 *
	 * @param value the new order number
	 */
    public void setOrderNumber(final String value) {
        this.orderNumber = value;
    }

    /**
	 * Gets the status.
	 *
	 * @return the status
	 */
    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    /**
	 * Sets the status.
	 *
	 * @param value the new status
	 */
    public void setStatus(final String value) {
        this.status = value;
    }

    /**
	 * Gets the assignment type.
	 *
	 * @return the assignment type
	 */
    @Basic
    @Column(name = "ASSIGNMENT_TYPE")
    public String getAssignmentType() {
        return assignmentType;
    }

    /**
	 * Sets the assignment type.
	 *
	 * @param value the new assignment type
	 */
    public void setAssignmentType(final String value) {
        this.assignmentType = value;
    }

    /**
	 * Gets the from date.
	 *
	 * @return the from date
	 */
    @Basic
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFromDate() {
        return fromDate;
    }

    /**
	 * Sets the from date.
	 *
	 * @param value the new from date
	 */
    public void setFromDate(final Date value) {
        this.fromDate = value;
    }

    /**
	 * Gets the to date.
	 *
	 * @return the to date
	 */
    @Basic
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    public Date getToDate() {
        return toDate;
    }

    /**
	 * Sets the to date.
	 *
	 * @param value the new to date
	 */
    public void setToDate(final Date value) {
        this.toDate = value;
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
	 * Gets the intressent id.
	 *
	 * @return the intressent id
	 */
    @Basic
    @Column(name = "INTRESSENT_ID")
    public String getIntressentId() {
        return intressentId;
    }

    /**
	 * Sets the intressent id.
	 *
	 * @param value the new intressent id
	 */
    public void setIntressentId(final String value) {
        this.intressentId = value;
    }

    /**
	 * With org code.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withOrgCode(final String value) {
        setOrgCode(value);
        return this;
    }

    /**
	 * With role code.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withRoleCode(final String value) {
        setRoleCode(value);
        return this;
    }

    /**
	 * With order number.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withOrderNumber(final String value) {
        setOrderNumber(value);
        return this;
    }

    /**
	 * With status.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withStatus(final String value) {
        setStatus(value);
        return this;
    }

    /**
	 * With assignment type.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withAssignmentType(final String value) {
        setAssignmentType(value);
        return this;
    }

    /**
	 * With from date.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withFromDate(final Date value) {
        setFromDate(value);
        return this;
    }

    /**
	 * With to date.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withToDate(final Date value) {
        setToDate(value);
        return this;
    }

    /**
	 * With detail.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withDetail(final String value) {
        setDetail(value);
        return this;
    }

    /**
	 * With intressent id.
	 *
	 * @param value the value
	 * @return the assignment data
	 */
    public AssignmentData withIntressentId(final String value) {
        setIntressentId(value);
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
        final AssignmentData that = ((AssignmentData) object);
        {
            String lhsOrgCode;
            lhsOrgCode = this.getOrgCode();
            String rhsOrgCode;
            rhsOrgCode = that.getOrgCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgCode", lhsOrgCode), LocatorUtils.property(thatLocator, "orgCode", rhsOrgCode), lhsOrgCode, rhsOrgCode)) {
                return false;
            }
        }
        {
            String lhsRoleCode;
            lhsRoleCode = this.getRoleCode();
            String rhsRoleCode;
            rhsRoleCode = that.getRoleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleCode", lhsRoleCode), LocatorUtils.property(thatLocator, "roleCode", rhsRoleCode), lhsRoleCode, rhsRoleCode)) {
                return false;
            }
        }
        {
            String lhsOrderNumber;
            lhsOrderNumber = this.getOrderNumber();
            String rhsOrderNumber;
            rhsOrderNumber = that.getOrderNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderNumber", lhsOrderNumber), LocatorUtils.property(thatLocator, "orderNumber", rhsOrderNumber), lhsOrderNumber, rhsOrderNumber)) {
                return false;
            }
        }
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            String lhsAssignmentType;
            lhsAssignmentType = this.getAssignmentType();
            String rhsAssignmentType;
            rhsAssignmentType = that.getAssignmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assignmentType", lhsAssignmentType), LocatorUtils.property(thatLocator, "assignmentType", rhsAssignmentType), lhsAssignmentType, rhsAssignmentType)) {
                return false;
            }
        }
        {
            Date lhsFromDate;
            lhsFromDate = this.getFromDate();
            Date rhsFromDate;
            rhsFromDate = that.getFromDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromDate", lhsFromDate), LocatorUtils.property(thatLocator, "fromDate", rhsFromDate), lhsFromDate, rhsFromDate)) {
                return false;
            }
        }
        {
            Date lhsToDate;
            lhsToDate = this.getToDate();
            Date rhsToDate;
            rhsToDate = that.getToDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toDate", lhsToDate), LocatorUtils.property(thatLocator, "toDate", rhsToDate), lhsToDate, rhsToDate)) {
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
        {
            String lhsIntressentId;
            lhsIntressentId = this.getIntressentId();
            String rhsIntressentId;
            rhsIntressentId = that.getIntressentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intressentId", lhsIntressentId), LocatorUtils.property(thatLocator, "intressentId", rhsIntressentId), lhsIntressentId, rhsIntressentId)) {
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
