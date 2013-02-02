package com.ssj.persistence.product.entity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Attribute
 *
 */
@Entity

public class Attribute implements Serializable {

	@Id
	private Long id;
	private String name;
	private String value;
	private List<String> listValue;
	private static final long serialVersionUID = 1L;

	public Attribute() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}   
	public List<String> getListValue() {
		return this.listValue;
	}

	public void setListValue(List<String> listValue) {
		this.listValue = listValue;
	}
   
}
