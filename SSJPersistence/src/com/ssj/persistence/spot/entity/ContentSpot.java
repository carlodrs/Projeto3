package com.ssj.persistence.spot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.ssj.persistence.product.entity.Product;

/**
 * Entity implementation class for Entity: ContentSpot
 *
 */
@Entity

public class ContentSpot implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String contentName;
	private String contentDescription;
	private static final long serialVersionUID = 1L;
	private String isContentText;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Product> products;
	private String textContent;


	public ContentSpot() {
		super();
	}   
	
	/**
	 * @return the textContent
	 */
	public String getTextContent() {
		return textContent;
	}

	/**
	 * @param textContent the textContent to set
	 */
	public void setTextContent(String textContent) {
		this.textContent = textContent;
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
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getContentName() {
		return this.contentName;
	}

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	
	/**
	 * @return the contentDescription
	 */
	public String getContentDescription() {
		return contentDescription;
	}
	/**
	 * @param contentDescription the contentDescription to set
	 */
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

	/**
	 * @return the isContentText
	 */
	public String getIsContentText() {
		return isContentText;
	}

	/**
	 * @param isContentText the isContentText to set
	 */
	public void setIsContentText(String isContentText) {
		this.isContentText = isContentText;
	}
   
}
