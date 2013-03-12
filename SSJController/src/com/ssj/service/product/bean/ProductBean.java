package com.ssj.service.product.bean;

import java.io.Serializable;
import java.util.List;

import com.ssj.persistence.product.entity.Product;

/**
 * 
 * Class to get informations to be handled catalog products on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * */
/**
 * @author Carlos
 *
 */
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
	private List<Product> products;
	private String pathUpload;
	
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
	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}
	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	/**
	 * @param text path to upload
	 */
	
	public void setPathUpload(String text) {
		this.pathUpload = text;
	}
	
	/**
	 * @return String path
	 */
	public String getPathUpload() {
		return this.pathUpload;
	}
}
