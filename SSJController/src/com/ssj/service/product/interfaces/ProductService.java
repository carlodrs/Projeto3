package com.ssj.service.product.interfaces;

/**
 * Service Product to be handle the products on the System
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */

import java.util.List;

import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.Service;
import com.ssj.service.product.bean.ProductBean;

public interface ProductService extends Service <ProductBean>{
	
	/**
	 * Method to get all the registered products
	 * @return List list products
	 * @throws Exception;
	 * */
	public List<Product> listAll() throws Exception;

	/**
	 * List products by category
	 * @param category
	 * @return {@link List}
	 * @throws Exception
	 * */
	public List<Product> listByCategory(Category category) throws Exception;

	/**
	 * List products by category
	 * @param category
	 * @return {@link List}
	 * @throws Exception
	 * */
	public List<Product> listTop4ByCategory(Category category) throws Exception;
}
