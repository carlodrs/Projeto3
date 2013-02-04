/**
 * 
 */
package com.ssj.service.product.bean;

import java.io.Serializable;

import com.ssj.persistence.product.entity.Attribute;

/**
 * 
 * Atrribute java bean to handled by AttributeService
 * @author Carlos Silva
 * @version 1.0
 * 
 */
public class AttributeBean implements Serializable {
	
	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Attribute attribute;
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
	 * @return the attribute
	 */
	public Attribute getAttribute() {
		return attribute;
	}
	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	
	
}
