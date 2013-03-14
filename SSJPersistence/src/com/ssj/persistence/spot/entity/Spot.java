package com.ssj.persistence.spot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
	
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<ContentSpot> contentSpots;
	
	/**
	 * @return the contentSpots
	 */
	public List<ContentSpot> getContentSpots() {
		return contentSpots;
	}
	/**
	 * @param contentSpots the contentSpots to set
	 */
	public void setContentSpots(List<ContentSpot> contentSpots) {
		this.contentSpots = contentSpots;
	}

	private static final long serialVersionUID = 1L;
	
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
	
	
	
	
	
}
