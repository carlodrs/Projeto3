/**
 * 
 */
package com.ssj.service.product.interfaces;

import java.util.List;

import com.ssj.persistence.product.entity.Category;
import com.ssj.service.Service;
import com.ssj.service.product.bean.CategoryBean;

/**
 * Service Category to handle products categories
 * @author Carlos Silva
 * @since 2013
 * 
 *
 */
public interface CategoryService extends Service<CategoryBean> {

	/**
	 * 
	 * List all the categories at the system
	 * @return List Categories
	 * @throws Exception
	 * */
	public List<Category> listAll() throws Exception;

	

	/**
	 * 
	 * List all the parents categories at the system
	 * @return List Categories
	 * @throws Exception
	 * */
	public List<Category> listAllParents()  throws Exception;

}
