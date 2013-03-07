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
	private Long idContent;
	private String contentName;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@NotNull
	private Spot spot;

	public ContentSpot() {
		super();
	}   
	public Long getIdContent() {
		return this.idContent;
	}

	public void setIdContent(Long idContent) {
		this.idContent = idContent;
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
   
}
