package com.ssj.service.product.bean;

import java.io.Serializable;
import java.util.List;

import com.ssj.persistence.product.entity.Attribute;

/**
 * 
 * Class to get informations to be handled catalog products on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * */
public class ProductBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String shortName;
	private String longName;
	private String description;
	private Double price;
	private Double offerPrice;
	private Double percentDiscount;
	private List<Attribute> attributes;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}
	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the offerPrice
	 */
	public Double getOfferPrice() {
		return offerPrice;
	}
	/**
	 * @param offerPrice the offerPrice to set
	 */
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}
	/**
	 * @return the percentDiscount
	 */
	public Double getPercentDiscount() {
		return percentDiscount;
	}
	/**
	 * @param percentDiscount the percentDiscount to set
	 */
	public void setPercentDiscount(Double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}
	/**
	 * @return the attributes
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	
	
	
}
