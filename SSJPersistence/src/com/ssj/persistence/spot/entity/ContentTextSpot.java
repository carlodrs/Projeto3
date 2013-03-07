package com.ssj.persistence.spot.entity;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: ContentSpot
 *
 */
@Entity

public class ContentTextSpot extends ContentSpot  {
   
	/**
	 * Version ID
	 */
	private static final long serialVersionUID = 1L;
	private String textContent;

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
	
	
	
}
