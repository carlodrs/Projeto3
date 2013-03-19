package com.ssj.persistence.spot.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import com.ssj.persistence.product.entity.Category;

/**
 * Entity implementation class for Entity: BannerSlider
 *
 */
@Entity

public class BannerSlider implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String link;
	private String image;
	private Integer sequence;
	
	@OneToOne
	private Category category;
	private static final long serialVersionUID = 1L;

	public BannerSlider() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}   
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
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
	/**
	 * @return the sequence
	 */
	public Integer getSequence() {
		return sequence;
	}
	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	
	
   
}
