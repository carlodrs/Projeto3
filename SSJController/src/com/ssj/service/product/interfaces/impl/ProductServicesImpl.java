/**
 * 
 */
package com.ssj.service.product.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.product.dao.ProductDao;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.ProductService;

/**
 * Implementation from ProductService class
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 *
 */
@Service("ProductServicesImpl")
public class ProductServicesImpl implements ProductService{
	
	
	@Autowired
	private ProductDao productDao;

	/**		
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(ProductBean bean) throws Exception {
		productDao.create(bean.getProduct());
	}

	/* (non-Javadoc)
	 * @see com.ssj.service.Service#read(java.io.Serializable)
	 */
	@Override
	public ProductBean read(ProductBean bean) throws Exception {
		Product product = productDao.read(Product.class, bean.getId());
		bean.setProduct(product);
		return bean;
	}

	/**
	 * @see com.ssj.service.Service#delete(java.io.Serializable)
	 */
	@Override
	public void delete(ProductBean bean) throws Exception {
		productDao.delete(bean.getProduct());
	}

	/**
	 * @see com.ssj.service.Service#update(java.io.Serializable)
	 */
	@Override
	public void update(ProductBean bean) throws Exception {
		productDao.update(bean.getProduct());

	}

}
