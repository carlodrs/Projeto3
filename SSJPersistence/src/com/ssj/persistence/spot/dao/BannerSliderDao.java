package com.ssj.persistence.spot.dao;

import java.util.List;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.spot.entity.BannerSlider;

/**
 * 
 * Inteface Banner to handle Banner slider on database
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * @see BannerSlider
 * */
public interface BannerSliderDao extends SSJGenericDao<BannerSlider> {

	/**
	 * Get all banners sliders of database
	 * @return List
	 * @throws Exception
	 * */
	public List<BannerSlider> listAll() throws Exception;

	/**
	 * Get all banners sliders by category of database
	 * @return List
	 * @throws Exception
	 * */
	public List<BannerSlider> listAllByCategory(Category category) throws Exception;
}
