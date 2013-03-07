package com.ssj.persistence.spot.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.ssj.persistence.product.entity.Product;

/**
 * Entity implementation class for Entity: ContentSpot
 *
 */
@Entity

public class ContentProductSpot extends ContentSpot {

	/**
	 * Version ID
	 */
	private static final long serialVersionUID = 1L;
   
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Product> products;

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
	
}
