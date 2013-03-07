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
import com.ssj.persistence.spot.dao.SpotDao;
import com.ssj.persistence.spot.entity.Spot;

/**
 * @see SpotDao
 * @author Carlos
 * @version 1.0
 */
@Repository("SpotDaoImpl")
public class SpotDaoImpl extends SSJGenericDaoImpl<Spot> implements SpotDao {

	public List<Spot> listAllSpots() throws Exception{
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Spot> criteriaQuery = criteriaBuilder.createQuery(Spot.class);
		criteriaQuery.from(Spot.class);
		
		TypedQuery<Spot> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<Spot> spots = typedQuery.getResultList();
			return spots;
		} catch (Exception e) {
			throw new NotFoundException("Spots not found ", e);
		}
    }
}
