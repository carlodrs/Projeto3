package com.ssj.service.product.bean;

import java.io.Serializable;

import com.ssj.persistence.product.entity.Product;

/**
 * 
 * Class to get informations to be handled catalog products on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * */
public class ProductBean implements Serializable {
	
	/* Constructor begins Product Entity*/
	public ProductBean() {
		this.product = new Product();
	}
	
	/**
	 * Serial version Id
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Product product;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
