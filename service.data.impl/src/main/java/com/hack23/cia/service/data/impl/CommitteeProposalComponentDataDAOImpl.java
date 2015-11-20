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
package com.hack23.cia.service.data.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.hack23.cia.model.external.riksdagen.utskottsforslag.impl.CommitteeDocumentData;
import com.hack23.cia.model.external.riksdagen.utskottsforslag.impl.CommitteeDocumentData_;
import com.hack23.cia.model.external.riksdagen.utskottsforslag.impl.CommitteeProposalComponentData;
import com.hack23.cia.model.external.riksdagen.utskottsforslag.impl.CommitteeProposalComponentData_;
import com.hack23.cia.service.data.api.CommitteeProposalComponentDataDAO;

/**
 * The Class CommitteeProposalComponentDataDAOImpl.
 */
@Repository(value = "CommitteeProposalComponentDataDAO")
public final class CommitteeProposalComponentDataDAOImpl extends
AbstractGenericDAOImpl<CommitteeProposalComponentData, Long>
implements CommitteeProposalComponentDataDAO {

	/** The entity manager. */
	@PersistenceContext(name = "ciaPersistenceUnit")
	private EntityManager entityManager;

	/**
	 * Instantiates a new committee proposal component data dao impl.
	 */
	public CommitteeProposalComponentDataDAOImpl() {
		super(CommitteeProposalComponentData.class);
	}

	/* (non-Javadoc)
	 * @see com.hack23.cia.service.data.api.CommitteeProposalComponentDataDAO#checkCommitteeDocumentData(java.lang.String)
	 */
	@Override
	public boolean checkCommitteeDocumentData(final String documentId) {
		final CriteriaQuery<CommitteeDocumentData> criteriaQuery = getCriteriaBuilder()
				.createQuery(CommitteeDocumentData.class);
		final Root<CommitteeDocumentData> root = criteriaQuery.from(CommitteeDocumentData.class);
		criteriaQuery.select(root);
		final Predicate condition = getCriteriaBuilder().equal(root.get(CommitteeDocumentData_.id), documentId);
		criteriaQuery.where(condition);
		final TypedQuery<CommitteeDocumentData> typedQuery = getEntityManager()
				.createQuery(criteriaQuery);
		addCacheHints(typedQuery, "checkCommitteeDocumentData");

		final List<CommitteeDocumentData> resultList = typedQuery.getResultList();

		if (resultList.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.hack23.cia.service.data.impl.AbstractRiksdagenDAOImpl#getEntityManager
	 * ()
	 */
	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	/* (non-Javadoc)
	 * @see com.hack23.cia.service.data.api.CommitteeProposalComponentDataDAO#getIdList()
	 */
	@Override
	public List<String> getIdList() {
		final CriteriaQuery<String> criteria = getCriteriaBuilder().createQuery(String.class);
		final Root<CommitteeDocumentData> root = criteria.from(CommitteeDocumentData.class);
		criteria.select(root.get(CommitteeDocumentData_.id));
		criteria.distinct(true);
		return getEntityManager().createQuery(criteria).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.hack23.cia.service.data.api.AbstractGenericDAO#getSize()
	 */
	@Override
	public Long getSize() {
		final CriteriaQuery<Long> cq = getCriteriaBuilder().createQuery(Long.class);
		final Root<CommitteeProposalComponentData> from = cq.from(getPersistentClass());
		cq.select(getCriteriaBuilder().count(from.get(CommitteeProposalComponentData_.hjid)));
		return getEntityManager().createQuery(cq).getSingleResult();
	}

}
