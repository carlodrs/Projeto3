/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import java.util.List;

import javassist.NotFoundException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.AttributeDao;
import com.ssj.persistence.product.entity.Attribute;

/**
 * 
 * Implementation responsible to offer products characteristics and keep the specific
 * information about the product. 
 * @author Carlos Silva
 * @see Attribute, SSJGenericDaop, AttributeDao
 * @since 2013
 * @version 1.0
 */
@Repository("AttributeDaoImpl")
public class AttributeDaoImpl extends 
	SSJGenericDaoImpl<Attribute> implements AttributeDao{

	
	@Override
	public List<Attribute> listAll() throws Exception{
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Attribute> criteriaQuery = criteriaBuilder.createQuery(Attribute.class);
		criteriaQuery.from(Attribute.class);
		TypedQuery<Attribute> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<Attribute> attributeList = typedQuery.getResultList();
			return attributeList;
		} catch (Exception e) {
			throw new NotFoundException("No Attributes found : " + e.getMessage());
		}
	}

}
