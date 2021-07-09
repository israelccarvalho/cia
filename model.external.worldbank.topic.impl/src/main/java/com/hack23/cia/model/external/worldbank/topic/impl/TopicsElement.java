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
// Generated on: 2019.02.24 at 11:39:45 PM CET
//


package com.hack23.cia.model.external.worldbank.topic.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.hack23.cia.model.common.api.ModelObject;


/**
 * The Class TopicsElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topic"
})
@XmlRootElement(name = "topics")
@Entity(name = "TopicsElement")
@Table(name = "TOPICS_ELEMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class TopicsElement
    implements ModelObject
{

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** The topic. */
    @XmlElement(required = true)
    protected List<TopicElement> topic = new ArrayList<>();

    /** The page. */
    @XmlAttribute(name = "page")
    protected BigInteger page;

    /** The pages. */
    @XmlAttribute(name = "pages")
    protected BigInteger pages;

    /** The per page. */
    @XmlAttribute(name = "per_page")
    protected BigInteger perPage;

    /** The total. */
    @XmlAttribute(name = "total")
    protected BigInteger total;

    /** The hjid. */
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
	 * Gets the topic.
	 *
	 * @return the topic
	 */
    @OneToMany(targetEntity = TopicElement.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TOPIC_TOPICS_ELEMENT_HJID")
    public List<TopicElement> getTopic() {
        return this.topic;
    }

    /**
	 * Sets the topic.
	 *
	 * @param topic the new topic
	 */
    public void setTopic(final List<TopicElement> topic) {
        this.topic = topic;
    }

    /**
	 * Gets the page.
	 *
	 * @return the page
	 */
    @Basic
    @Column(name = "PAGE", precision = 20)
    public BigInteger getPage() {
        return page;
    }

    /**
	 * Sets the page.
	 *
	 * @param value the new page
	 */
    public void setPage(final BigInteger value) {
        this.page = value;
    }

    /**
	 * Gets the pages.
	 *
	 * @return the pages
	 */
    @Basic
    @Column(name = "PAGES", precision = 20)
    public BigInteger getPages() {
        return pages;
    }

    /**
	 * Sets the pages.
	 *
	 * @param value the new pages
	 */
    public void setPages(final BigInteger value) {
        this.pages = value;
    }

    /**
	 * Gets the per page.
	 *
	 * @return the per page
	 */
    @Basic
    @Column(name = "PER_PAGE", precision = 20)
    public BigInteger getPerPage() {
        return perPage;
    }

    /**
	 * Sets the per page.
	 *
	 * @param value the new per page
	 */
    public void setPerPage(final BigInteger value) {
        this.perPage = value;
    }

    /**
	 * Gets the total.
	 *
	 * @return the total
	 */
    @Basic
    @Column(name = "TOTAL", precision = 20)
    public BigInteger getTotal() {
        return total;
    }

    /**
	 * Sets the total.
	 *
	 * @param value the new total
	 */
    public void setTotal(final BigInteger value) {
        this.total = value;
    }

    /**
	 * With topic.
	 *
	 * @param topic the topic
	 * @return the topics element
	 */
    public TopicsElement withTopic(final List<TopicElement> topic) {
        setTopic(topic);
        return this;
    }

    /**
	 * With page.
	 *
	 * @param value the value
	 * @return the topics element
	 */
    public TopicsElement withPage(final BigInteger value) {
        setPage(value);
        return this;
    }

    /**
	 * With pages.
	 *
	 * @param value the value
	 * @return the topics element
	 */
    public TopicsElement withPages(final BigInteger value) {
        setPages(value);
        return this;
    }

    /**
	 * With per page.
	 *
	 * @param value the value
	 * @return the topics element
	 */
    public TopicsElement withPerPage(final BigInteger value) {
        setPerPage(value);
        return this;
    }

    /**
	 * With total.
	 *
	 * @param value the value
	 * @return the topics element
	 */
    public TopicsElement withTotal(final BigInteger value) {
        setTotal(value);
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

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		return new EqualsBuilder().append(getTopic().toArray(), ((TopicsElement) obj).getTopic().toArray()).isEquals();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
