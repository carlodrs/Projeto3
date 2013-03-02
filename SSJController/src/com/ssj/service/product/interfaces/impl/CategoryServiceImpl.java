/**
 * 
 */
package com.ssj.service.product.interfaces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.product.dao.CategoryDao;
import com.ssj.persistence.product.entity.Category;
import com.ssj.service.product.bean.CategoryBean;
import com.ssj.service.product.interfaces.CategoryService;

/**
 * Implementation category service
 * @author Carlos Silva
 * @see CategoryService
 * @version 1.0
 * @since 2013
 * 
 */
@Service("CategoryServiceImpl")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	/** 
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(CategoryBean bean) throws Exception {
		this.categoryDao.create(bean.getCategory());
	}

	/**
	 * @see com.ssj.service.Service#read(java.io.Serializable)
	 */
	@Override
	public CategoryBean read(CategoryBean bean) throws Exception {
		
		bean.setCategory(
				this.categoryDao.read(Category.class, bean.getId()));
		
		return bean;
	}

	/**
	 * @see com.ssj.service.Service#delete(java.io.Serializable)
	 */
	@Override
	public void delete(CategoryBean bean) throws Exception {
		this.categoryDao.delete(bean.getCategory());
	}

	/**
	 * @see com.ssj.service.Service#update(java.io.Serializable)
	 */
	@Override
	public void update(CategoryBean bean) throws Exception {
		this.categoryDao.update(bean.getCategory());
	}


	@Override
	public CategoryBean load(CategoryBean t) throws Exception {
		Category category = this.categoryDao.load(Category.class, t.getId());
		t.setCategory(category);
		
		return t;
	}

	@Override
	public List<Category> listAll() throws Exception {
		return this.categoryDao.listAll();
	}

	@Override
	public List<Category> listAllParents() throws Exception {
		return this.categoryDao.listAllParents();
	}
}
