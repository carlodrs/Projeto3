/**
 * 
 */
package com.ssj.persistence.spot.dao.impl;

import java.util.List;

import javassist.NotFoundException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.spot.dao.ContentSpotDao;
import com.ssj.persistence.spot.entity.ContentSpot;

/**
 * @see ContentSpotDao
 * @author Carlos
 * @version 1.0
 */
@Repository("ContentSpotDaoImpl")
public class ContentSpotDaoImpl extends SSJGenericDaoImpl<ContentSpot> implements ContentSpotDao {

	public List<ContentSpot> listAllContentSpots() throws Exception{
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<ContentSpot> criteriaQuery = criteriaBuilder.createQuery(ContentSpot.class);
		criteriaQuery.from(ContentSpot.class);
		
		TypedQuery<ContentSpot> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<ContentSpot> contentSpots = typedQuery.getResultList();
			return contentSpots;
		} catch (Exception e) {
			throw new NotFoundException("Content Spots not found ", e);
		}
    }
}
