package com.ssj.persistence.product.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String shortName;
	private String description;
	private Double price;
	private Double offerPrice;
	private Double percentDiscount;
	private String image;
	private String thumb1;
	private String thumb2;
	private String thumb3;
	private String thumb4;
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY) 
	private Set<Attribute> attributes;
	
	@OneToOne
	private Category category;
	
	private static final long serialVersionUID = 1L;

	public Product() {
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
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}   
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}   
	public Double getOfferPrice() {
		return this.offerPrice;
	}

	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}   
	public Double getPercentDiscount() {
		return this.percentDiscount;
	}

	public void setPercentDiscount(Double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}   
	public Set<Attribute> getAttributes() {
		return this.attributes;
	}

	public void setAttributeList(Set<Attribute> attributeList) {
		this.attributes = attributeList;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the thumb1
	 */
	public String getThumb1() {
		return thumb1;
	}
	/**
	 * @param thumb1 the thumb1 to set
	 */
	public void setThumb1(String thumb1) {
		this.thumb1 = thumb1;
	}
	/**
	 * @return the thumb2
	 */
	public String getThumb2() {
		return thumb2;
	}
	/**
	 * @param thumb2 the thumb2 to set
	 */
	public void setThumb2(String thumb2) {
		this.thumb2 = thumb2;
	}
	/**
	 * @return the thumb3
	 */
	public String getThumb3() {
		return thumb3;
	}
	/**
	 * @param thumb3 the thumb3 to set
	 */
	public void setThumb3(String thumb3) {
		this.thumb3 = thumb3;
	}
	/**
	 * @return the thumb4
	 */
	public String getThumb4() {
		return thumb4;
	}
	/**
	 * @param thumb4 the thumb4 to set
	 */
	public void setThumb4(String thumb4) {
		this.thumb4 = thumb4;
	}
   
	
	
}
