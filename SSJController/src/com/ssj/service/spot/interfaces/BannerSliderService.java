package com.ssj.service.spot.interfaces;

import java.util.List;

import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.spot.entity.BannerSlider;
import com.ssj.service.Service;
import com.ssj.service.spot.bean.BannerSliderBean;

public interface BannerSliderService extends Service<BannerSliderBean>{
	
	/**
	 * List all banners
	 * @return List list of BannerSlider
	 * @throws Exception
	 */
	public List<BannerSlider> listAll() throws Exception;

	
	/**
	 * List all banners by category
	 * @param category
	 * @return List list of BannerSlider
	 * @throws Exception
	 */
	public List<BannerSlider> listAllByCategory(Category category) throws Exception;

}
