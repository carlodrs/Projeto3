/**
 * 
 */
package com.ssj.service.spot.bean;

import java.io.Serializable;

import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.persistence.spot.entity.Spot;

/**
 * Spot Bean to used by the system
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 *
 */
public class SpotBean implements Serializable {

	/**
	 * Version
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private Spot spot;
	private ContentSpot contentSpot;
	

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
