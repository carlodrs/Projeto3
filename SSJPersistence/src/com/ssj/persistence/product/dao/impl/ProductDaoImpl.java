/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import java.util.List;

import javassist.NotFoundException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.ProductDao;
import com.ssj.persistence.product.entity.Product;

/**
 * Implementation ProductDao
 * @author Carlos Silva
 * @see ProductDao , SSJGenericDaoImpl, SSJGenericDao
 * @since 2013
 * @version 1.0
 */
@Repository("ProductDaoImpl")
public class ProductDaoImpl extends 
		SSJGenericDaoImpl<Product> implements ProductDao {

	
	@Override
	public List<Product> listAll() throws Exception{
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);
		criteriaQuery.where(criteriaBuilder.notEqual(root.get("deactive"), 1));
		criteriaQuery.orderBy(criteriaBuilder.asc(root.get("name")));
		
		TypedQuery<Product> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<Product> productList = typedQuery.getResultList();
			return productList;
		} catch (Exception e) {
			throw new NotFoundException("No product found : " + e.getMessage());
		}
	}

}
