package br.com.store.site.databean;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.spot.entity.BannerSlider;
import com.ssj.service.spot.interfaces.BannerSliderService;

/**
 * Banner slider databean to present all the banner configured on server
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 */
public class BannerSliderDataBean {

	/** Banner service */
	@Autowired
	private BannerSliderService bannerSliderService;

	/* Banner list */
	private List<BannerSlider> banner = new ArrayList<BannerSlider>();

	/* Category entity */
	private Category category;
	
	/* Logger */
	private static Logger logger = 
		Logger.getLogger(BannerSliderService.class.getName());
	
	/**
	 * @return the banners
	 */
	public List<BannerSlider> getBanners() {
		try {
			if (this.getCategory() == null){
				this.banner = this.bannerSliderService.listAll();
			}else{
				this.banner = this.bannerSliderService.listAllByCategory(category);
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error to list banners by category. " +
					"See the error log stack trace!", e);
		}
		return this.banner;
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

	
	
	
	
}
