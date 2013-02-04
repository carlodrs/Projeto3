/**
 * 
 */
package com.ssj.service.product.bean;

import java.io.Serializable;

import com.ssj.persistence.product.entity.Category;

/**
 * Represents java bean category
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 *
 */
public class CategoryBean implements Serializable {

	
	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Category category;
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
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
}
