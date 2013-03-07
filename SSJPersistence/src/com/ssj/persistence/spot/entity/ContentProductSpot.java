package com.ssj.persistence.spot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
   
	@OneToMany
	private Set<Product> products;

	/**
	 * @return the products
	 */
	public Set<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
