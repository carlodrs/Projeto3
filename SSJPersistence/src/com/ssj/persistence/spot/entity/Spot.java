package com.ssj.persistence.spot.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: SpotProduct
 *
 */
@Entity

public class Spot implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String spotName;
	private String spotDescription;
	private boolean active;
	
	
	
	/**
	 * @return the spotDescription
	 */
	public String getSpotDescription() {
		return spotDescription;
	}
	/**
	 * @param spotDescription the spotDescription to set
	 */
	public void setSpotDescription(String spotDescription) {
		this.spotDescription = spotDescription;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	@OneToOne(mappedBy="spot", cascade=CascadeType.ALL)
	private ContentSpot contentSpot;
	
	private static final long serialVersionUID = 1L;

	public Spot() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getSpotName() {
		return this.spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}
	/**
	 * @return the contentSpot
	 */
	public ContentSpot getContentSpot() {
		return contentSpot;
	}
	/**
	 * @param contentSpot the contentSpot to set
	 */
	public void setContentSpot(ContentSpot contentSpot) {
		this.contentSpot = contentSpot;
	}
	
}
