package com.ssj.service.spot.bean;

import java.io.Serializable;

import com.ssj.persistence.spot.entity.BannerSlider;

/**
 * Class to handle the banner slider
 * @author Carlos Silva
 * @since 2013
 * @see BannerSlider
 */
public class BannerSliderBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private BannerSlider bannerSlider;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the bannerSlider
	 */
	public BannerSlider getBannerSlider() {
		return bannerSlider;
	}
	/**
	 * @param bannerSlider the bannerSlider to set
	 */
	public void setBannerSlider(BannerSlider bannerSlider) {
		this.bannerSlider = bannerSlider;
	}
	
	
}
