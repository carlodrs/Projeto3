package com.ssj.persistence.spot.entity;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
	
	@OneToOne
	@NotNull
	private Spot spot;

	public ContentSpot() {
		super();
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
	 * @return the spot
	 */
	public Spot getSpot() {
		return spot;
	}
	/**
	 * @param spot the spot to set
	 */
	public void setSpot(Spot spot) {
		this.spot = spot;
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
   
}
