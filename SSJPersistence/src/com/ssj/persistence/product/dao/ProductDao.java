/**
 * 
 */
package com.ssj.persistence.product.dao;

import java.util.List;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;

/**
 * Dao Product to create products catalogs on database
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 */
public interface ProductDao extends SSJGenericDao<Product> {

	/**
	 * Method to get list all products
	 * @return List<Product>
	 * @throws Exception 
	 * */
	public List<Product> listAll() throws Exception;

	/**
	 * List product by category
	 * @param category
	 * @throws Exception
	 * @return {@link List} 
	 * */
	public List<Product> listByCategory(Category category) throws Exception;
}
