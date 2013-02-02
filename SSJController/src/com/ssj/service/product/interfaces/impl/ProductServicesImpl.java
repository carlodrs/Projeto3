/**
 * 
 */
package com.ssj.service.product.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
@Qualifier("ProductServicesImpl")
public class ProductServicesImpl implements ProductService{
	
	private Product product;
	
	@Autowired
	private ProductDao productDao;
	
	
	public ProductServicesImpl(){
		this.product = new Product();
	}
	
	/**		
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(ProductBean bean) throws Exception {
		
		BeanUtils.copyProperties(bean, this.product);
		productDao.create(product);
	}

	/* (non-Javadoc)
	 * @see com.ssj.service.Service#read(java.io.Serializable)
	 */
	@Override
	public void read(ProductBean bean) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * @see com.ssj.service.Service#delete(java.io.Serializable)
	 */
	@Override
	public void delete(ProductBean bean) throws Exception {
		BeanUtils.copyProperties(bean, this.product);
		productDao.delete(product);
	}

	/**
	 * @see com.ssj.service.Service#update(java.io.Serializable)
	 */
	@Override
	public void update(ProductBean bean) throws Exception {
		BeanUtils.copyProperties(bean, this.product);
		productDao.update(product);

	}

}
