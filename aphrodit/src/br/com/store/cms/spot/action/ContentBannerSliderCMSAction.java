package br.com.store.cms.spot.action;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.store.site.upload.action.BaseUploadActionSupport;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.spot.entity.BannerSlider;
import com.ssj.service.product.interfaces.CategoryService;
import com.ssj.service.spot.bean.BannerSliderBean;
import com.ssj.service.spot.interfaces.BannerSliderService;

/**
 * 
 * Content Banner 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class ContentBannerSliderCMSAction extends BaseUploadActionSupport {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private BannerSlider banner;
	private BannerSlider banners;
	private List<Category> categories; 
	
	
	private File image;
	private String imageFileName;
	private String imageContentType;
	
	//logger
	private static Logger logger = 
		Logger.getLogger(ContentBannerSliderCMSAction.class.getName());
	
	@Autowired
	private BannerSliderService bannerService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * @return the image
	 */
	public File getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(File image) {
		this.image = image;
	}

	/**
	 * @return the imageFileName
	 */
	public String getImageFileName() {
		return imageFileName;
	}

	/**
	 * @param imageFileName the imageFileName to set
	 */
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * @return the imageContentType
	 */
	public String getImageContentType() {
		return imageContentType;
	}

	/**
	 * @param imageContentType the imageContentType to set
	 */
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	/**
	 * @return the banner
	 */
	public BannerSlider getBanner() {
		return banner;
	}

	/**
	 * @param banner the banner to set
	 */
	public void setBanner(BannerSlider banner) {
		this.banner = banner;
	}

	/**
	 * @return the banners
	 */
	public BannerSlider getBanners() {
		return banners;
	}

	/**
	 * @param banners the banners to set
	 */
	public void setBanners(BannerSlider banners) {
		this.banners = banners;
	}
	
	/**
	 * List all banner registered
	 * @return 
	 * @return List
	 * @throws Exception
	 */
	public List<BannerSlider> listAll() throws Exception{
		return this.bannerService.listAll();
		
	}
	
	/**
	 * List all banner registered
	 * @return String
	 * @throws Exception
	 */
	public String prepare() {
	
		try {
			this.setCategories(this.categoryService.listAllParents());
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Cannot list all parent categories. " +
					"See log error stack trace", e);
			return ERROR;
		}
		return SUCCESS;

	}
	
	/**
	 * create the banner slider
	 * @return 
	 * @return String
	 * @throws Exception
	 */
	public String create() {
		
		BannerSliderBean bean = new BannerSliderBean();
		bean.setBannerSlider(this.banner);
		try {
			this.bannerService.create(bean);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Fail to create the banner", e);
			return ERROR;
		}
		return SUCCESS;
			
		
	}
	
	/**
	 * update the banner  slider registered
	 * @return String 
	 * @throws Exception
	 */
	public String update() {
		BannerSliderBean bean = new BannerSliderBean();
		bean.setBannerSlider(this.banner);
		try {
			this.bannerService.update(bean);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Fail to update the banner", e);
			return ERROR;
		}
		return SUCCESS;

	}
	
	/**
	 * detele the banner slider registered
	 * @return String
	 * @throws Exception
	 */
	public String delete() {
		
		BannerSliderBean bean = new BannerSliderBean();
		bean.setBannerSlider(this.banner);
		try {
			this.bannerService.delete(bean);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Fail to delete the banner", e);
			return ERROR;
		}
		return SUCCESS;
	}

	
	/**
	 * Method to upload images to banner
	 * @return String
	 * @throws Exception;
	 * */
	public String updateImage() throws Exception{
		
		try {
	
			BannerSliderBean bannerSliderBean = new BannerSliderBean();
			bannerSliderBean.setId(this.banner.getId());
			bannerSliderBean = this.bannerService.load(bannerSliderBean);
			BannerSlider bannerLoaded = bannerSliderBean.getBannerSlider();
			
			//images configurations
			if (this.getImageFileName() != null && (!this.getImageFileName().equals(""))){
				bannerLoaded.setImage(this.getImageFileName());
			}
			
			//upload image
			this.uploadImageFiles(this.getServletRequest());
			
			//setting and updating banner
			bannerSliderBean.setBannerSlider(this.banner);
			this.bannerService.update(bannerSliderBean);
			
			return SUCCESS;
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error on update image banner", e);
			return ERROR;
		}
		
	}
	
	
}
