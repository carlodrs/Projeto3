/**
 * 
 */
package com.ssj.service.product.interfaces;

import java.util.List;
import java.util.Map;

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



	/**
	 * 
	 * List all the parents categories structured by child itself 
	 * @return Map Category and List categories
	 * @throws Exception
	 * */
	public Map<Category, List<Category>> listStructuredCategories() throws Exception;



	/**
	 * 
	 * List all the child categories by parent 
	 * @return List<Category>
	 * @throws Exception
	 * */
	public List<Category> listAllChilds(Category category) throws Exception;

}
