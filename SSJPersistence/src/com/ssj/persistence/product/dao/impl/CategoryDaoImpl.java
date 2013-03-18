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
import com.ssj.persistence.product.dao.CategoryDao;
import com.ssj.persistence.product.entity.Category;

/**
 * 
 * Implementation Data access object from CategoryDao interface
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 *
 */
@Repository("CategoryDaoImpl")
public class CategoryDaoImpl extends SSJGenericDaoImpl<Category> 
		implements CategoryDao {



	@Override
	public List<Category> listAll() throws Exception{
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);
		criteriaQuery.from(Category.class);
		TypedQuery<Category> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<Category> categoryList = typedQuery.getResultList();
			return categoryList;
		} catch (Exception e) {
			throw new NotFoundException("No Categories found : " + e.getMessage());
		}
	}

	
	@Override
	public List<Category> listAllParents() throws Exception{
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);
			
		Root<Category> root = criteriaQuery.from(Category.class);
			
			criteriaQuery.where(
					criteriaBuilder.and(
							//parent not null
							criteriaBuilder.isNull(
									root.get("parent"))));
									
			criteriaQuery.orderBy(
					criteriaBuilder.asc(root.get("showSequence")));						;
						
		TypedQuery<Category> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<Category> categoryList = typedQuery.getResultList();
			return categoryList;
		} catch (Exception e) {
			throw new NotFoundException("No Categories found : " + e.getMessage());
		}
	}


	@Override
	public List<Category> listAllChilds(Category category) throws Exception{
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);
			
		Root<Category> root = criteriaQuery.from(Category.class);
			
			criteriaQuery.where(
						criteriaBuilder.equal(root.get("parent"), category));
			criteriaQuery.orderBy(criteriaBuilder.asc(root.get("showSequence")));
			
		TypedQuery<Category> typedQuery = getEntityManager().createQuery(criteriaQuery);
			
		try {
			List<Category> categoryList = typedQuery.getResultList();
			return categoryList;
		} catch (Exception e) {
			throw new NotFoundException("No Categories found : " + e.getMessage());
		}
	}
	
	
	@Override
	public List<Category> listAllChilds() throws Exception{
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Category> criteriaQuery = criteriaBuilder.createQuery(Category.class);
			
		Root<Category> root = criteriaQuery.from(Category.class);
			
			criteriaQuery.where(
						criteriaBuilder.isNotNull(root.get("parent")));
			criteriaQuery.orderBy(criteriaBuilder.asc(root.get("showSequence")));
			
		TypedQuery<Category> typedQuery = getEntityManager().createQuery(criteriaQuery);
			
		try {
			List<Category> categoryList = typedQuery.getResultList();
			return categoryList;
		} catch (Exception e) {
			throw new NotFoundException("No Categories found : " + e.getMessage());
		}
	}
}
