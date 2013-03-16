package com.ssj.persistence.product.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 * 
 */
@Entity

public class Category implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String url;
	private Integer showSequence;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name = "parentId", insertable = true, updatable = true, nullable = true) 
	private Category parent;
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
	 * @return the parentId
	 */
	public Category getParent() {
		return parent;
	}
	/**
	 * @param parentId the parentId to set
	 */
	public void setParent(Category parent) {
		this.parent = parent;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the showSequence
	 */
	public Integer getShowSequence() {
		return showSequence;
	}
	/**
	 * @param showSequence the showSequence to set
	 */
	public void setShowSequence(Integer showSequence) {
		this.showSequence = showSequence;
	}
}
