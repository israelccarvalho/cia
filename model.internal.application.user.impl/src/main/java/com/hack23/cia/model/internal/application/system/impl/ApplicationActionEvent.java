//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.system.impl;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
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
import com.hack23.cia.model.common.impl.xml.XmlDateTimeTypeAdapter;


/**
 * <p>Java class for ApplicationActionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationActionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="modelObjectVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="applicationOperation" type="{http://system.application.internal.model.cia.hack23.com/impl}ApplicationOperationType" minOccurs="0"/&gt;
 *         &lt;element name="eventGroup" type="{http://system.application.internal.model.cia.hack23.com/impl}ApplicationEventGroup" minOccurs="0"/&gt;
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pageMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="elementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationActionEvent", propOrder = {
    "modelObjectId",
    "modelObjectVersion",
    "applicationOperation",
    "eventGroup",
    "page",
    "pageMode",
    "elementId",
    "actionName",
    "sessionId",
    "userId",
    "errorMessage",
    "applicationMessage",
    "createdDate"
})
@Entity(name = "ApplicationActionEvent")
@Table(name = "APPLICATION_ACTION_EVENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ApplicationActionEvent
    implements Serializable, ModelObject, Equals
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Integer modelObjectId;
    protected int modelObjectVersion;
    @XmlSchemaType(name = "string")
    protected ApplicationOperationType applicationOperation;
    @XmlSchemaType(name = "string")
    protected ApplicationEventGroup eventGroup;
    protected String page;
    protected String pageMode;
    protected String elementId;
    protected String actionName;
    protected String sessionId;
    protected String userId;
    protected String errorMessage;
    protected String applicationMessage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateTimeTypeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date createdDate;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the modelObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "MODEL_OBJECT_ID", precision = 10, scale = 0)
    public Integer getModelObjectId() {
        return modelObjectId;
    }

    /**
     * Sets the value of the modelObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModelObjectId(final Integer value) {
        this.modelObjectId = value;
    }

    /**
     * Gets the value of the modelObjectVersion property.
     * 
     */
    @Version
    @Column(name = "MODEL_OBJECT_VERSION")
    public int getModelObjectVersion() {
        return modelObjectVersion;
    }

    /**
     * Sets the value of the modelObjectVersion property.
     * 
     */
    public void setModelObjectVersion(final int value) {
        this.modelObjectVersion = value;
    }

    /**
     * Gets the value of the applicationOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationOperationType }
     *     
     */
    @Basic
    @Column(name = "APPLICATION_OPERATION")
    @Enumerated(EnumType.STRING)
    public ApplicationOperationType getApplicationOperation() {
        return applicationOperation;
    }

    /**
     * Sets the value of the applicationOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationOperationType }
     *     
     */
    public void setApplicationOperation(final ApplicationOperationType value) {
        this.applicationOperation = value;
    }

    /**
     * Gets the value of the eventGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationEventGroup }
     *     
     */
    @Basic
    @Column(name = "EVENT_GROUP")
    @Enumerated(EnumType.STRING)
    public ApplicationEventGroup getEventGroup() {
        return eventGroup;
    }

    /**
     * Sets the value of the eventGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationEventGroup }
     *     
     */
    public void setEventGroup(final ApplicationEventGroup value) {
        this.eventGroup = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAGE")
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(final String value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAGE_MODE")
    public String getPageMode() {
        return pageMode;
    }

    /**
     * Sets the value of the pageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageMode(final String value) {
        this.pageMode = value;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ELEMENT_ID")
    public String getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(final String value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ACTION_NAME")
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(final String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SESSION_ID")
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(final String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(final String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ERROR_MESSAGE", length = 8192)
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(final String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the applicationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "APPLICATION_MESSAGE")
    public String getApplicationMessage() {
        return applicationMessage;
    }

    /**
     * Sets the value of the applicationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationMessage(final String value) {
        this.applicationMessage = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(final Date value) {
        this.createdDate = value;
    }

    public ApplicationActionEvent withModelObjectId(final Integer value) {
        setModelObjectId(value);
        return this;
    }

    public ApplicationActionEvent withModelObjectVersion(final int value) {
        setModelObjectVersion(value);
        return this;
    }

    public ApplicationActionEvent withApplicationOperation(final ApplicationOperationType value) {
        setApplicationOperation(value);
        return this;
    }

    public ApplicationActionEvent withEventGroup(final ApplicationEventGroup value) {
        setEventGroup(value);
        return this;
    }

    public ApplicationActionEvent withPage(final String value) {
        setPage(value);
        return this;
    }

    public ApplicationActionEvent withPageMode(final String value) {
        setPageMode(value);
        return this;
    }

    public ApplicationActionEvent withElementId(final String value) {
        setElementId(value);
        return this;
    }

    public ApplicationActionEvent withActionName(final String value) {
        setActionName(value);
        return this;
    }

    public ApplicationActionEvent withSessionId(final String value) {
        setSessionId(value);
        return this;
    }

    public ApplicationActionEvent withUserId(final String value) {
        setUserId(value);
        return this;
    }

    public ApplicationActionEvent withErrorMessage(final String value) {
        setErrorMessage(value);
        return this;
    }

    public ApplicationActionEvent withApplicationMessage(final String value) {
        setApplicationMessage(value);
        return this;
    }

    public ApplicationActionEvent withCreatedDate(final Date value) {
        setCreatedDate(value);
        return this;
    }

	@Override
	public final String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(final Long value) {
        this.hjid = value;
    }

    public boolean equals(final ObjectLocator thisLocator, final ObjectLocator thatLocator, final Object object, final EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ApplicationActionEvent that = ((ApplicationActionEvent) object);
        {
            Integer lhsModelObjectId;
            lhsModelObjectId = this.getModelObjectId();
            Integer rhsModelObjectId;
            rhsModelObjectId = that.getModelObjectId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modelObjectId", lhsModelObjectId), LocatorUtils.property(thatLocator, "modelObjectId", rhsModelObjectId), lhsModelObjectId, rhsModelObjectId)) {
                return false;
            }
        }
        {
            int lhsModelObjectVersion;
            lhsModelObjectVersion = this.getModelObjectVersion();
            int rhsModelObjectVersion;
            rhsModelObjectVersion = that.getModelObjectVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modelObjectVersion", lhsModelObjectVersion), LocatorUtils.property(thatLocator, "modelObjectVersion", rhsModelObjectVersion), lhsModelObjectVersion, rhsModelObjectVersion)) {
                return false;
            }
        }
        {
            ApplicationOperationType lhsApplicationOperation;
            lhsApplicationOperation = this.getApplicationOperation();
            ApplicationOperationType rhsApplicationOperation;
            rhsApplicationOperation = that.getApplicationOperation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicationOperation", lhsApplicationOperation), LocatorUtils.property(thatLocator, "applicationOperation", rhsApplicationOperation), lhsApplicationOperation, rhsApplicationOperation)) {
                return false;
            }
        }
        {
            ApplicationEventGroup lhsEventGroup;
            lhsEventGroup = this.getEventGroup();
            ApplicationEventGroup rhsEventGroup;
            rhsEventGroup = that.getEventGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventGroup", lhsEventGroup), LocatorUtils.property(thatLocator, "eventGroup", rhsEventGroup), lhsEventGroup, rhsEventGroup)) {
                return false;
            }
        }
        {
            String lhsPage;
            lhsPage = this.getPage();
            String rhsPage;
            rhsPage = that.getPage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "page", lhsPage), LocatorUtils.property(thatLocator, "page", rhsPage), lhsPage, rhsPage)) {
                return false;
            }
        }
        {
            String lhsPageMode;
            lhsPageMode = this.getPageMode();
            String rhsPageMode;
            rhsPageMode = that.getPageMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageMode", lhsPageMode), LocatorUtils.property(thatLocator, "pageMode", rhsPageMode), lhsPageMode, rhsPageMode)) {
                return false;
            }
        }
        {
            String lhsElementId;
            lhsElementId = this.getElementId();
            String rhsElementId;
            rhsElementId = that.getElementId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elementId", lhsElementId), LocatorUtils.property(thatLocator, "elementId", rhsElementId), lhsElementId, rhsElementId)) {
                return false;
            }
        }
        {
            String lhsActionName;
            lhsActionName = this.getActionName();
            String rhsActionName;
            rhsActionName = that.getActionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionName", lhsActionName), LocatorUtils.property(thatLocator, "actionName", rhsActionName), lhsActionName, rhsActionName)) {
                return false;
            }
        }
        {
            String lhsSessionId;
            lhsSessionId = this.getSessionId();
            String rhsSessionId;
            rhsSessionId = that.getSessionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sessionId", lhsSessionId), LocatorUtils.property(thatLocator, "sessionId", rhsSessionId), lhsSessionId, rhsSessionId)) {
                return false;
            }
        }
        {
            String lhsUserId;
            lhsUserId = this.getUserId();
            String rhsUserId;
            rhsUserId = that.getUserId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userId", lhsUserId), LocatorUtils.property(thatLocator, "userId", rhsUserId), lhsUserId, rhsUserId)) {
                return false;
            }
        }
        {
            String lhsErrorMessage;
            lhsErrorMessage = this.getErrorMessage();
            String rhsErrorMessage;
            rhsErrorMessage = that.getErrorMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "errorMessage", lhsErrorMessage), LocatorUtils.property(thatLocator, "errorMessage", rhsErrorMessage), lhsErrorMessage, rhsErrorMessage)) {
                return false;
            }
        }
        {
            String lhsApplicationMessage;
            lhsApplicationMessage = this.getApplicationMessage();
            String rhsApplicationMessage;
            rhsApplicationMessage = that.getApplicationMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicationMessage", lhsApplicationMessage), LocatorUtils.property(thatLocator, "applicationMessage", rhsApplicationMessage), lhsApplicationMessage, rhsApplicationMessage)) {
                return false;
            }
        }
        {
            Date lhsCreatedDate;
            lhsCreatedDate = this.getCreatedDate();
            Date rhsCreatedDate;
            rhsCreatedDate = that.getCreatedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdDate", lhsCreatedDate), LocatorUtils.property(thatLocator, "createdDate", rhsCreatedDate), lhsCreatedDate, rhsCreatedDate)) {
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
