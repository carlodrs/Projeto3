/**
 * 
 */
package com.ssj.persistence.product.dao;

import java.util.List;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.product.entity.Category;

/**
 * 
 * Interface responsible to handle categories products
 * @author Carlos Silva
 * @see Category, Product, SSJGenericDao
 * @since 2013
 * @version 1.0
 */
public interface CategoryDao extends SSJGenericDao<Category> {

	/**
	 * Dao to list all the categories
	 * @return List
	 * @throws Exception
	 * */
	public List<Category> listAll() throws Exception;

	

	/**
	 * Dao to list all the parents categories
	 * @return List
	 * @throws Exception
	 * */
	public List<Category> listAllParents() throws Exception;


	/**
	 * Dao to list all the child categories by parent category
	 * @return List
	 * @throws Exception
	 * */
	public List<Category> listAllChilds(Category category) throws Exception;


	/**
	 * Dao to list all the child categories without parent category
	 * @return List
	 * @throws Exception
	 * */
	public List<Category> listAllChilds() throws Exception;
}
