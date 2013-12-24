package br.com.store.cms.spot.action;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Product;
import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.product.interfaces.ProductService;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.ContentSpotService;

/**
 * 
 * Content Spot Action CMS to register the spot 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class ContentSpotCMSAction extends ActionSupport {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private ContentSpot contentSpot;
	private Spot spot;
	private List<ContentSpot> contentSpots;
	private List<Product> products;
	private String[] listProduct;	
	
	//logger
	private static Logger logger = 
		Logger.getLogger(ContentSpotCMSAction.class.getName());
	
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ContentSpotService contentSpotService;
	
	public ContentSpotCMSAction(){
		this.products = new ArrayList<Product>();
		this.listProduct = new String[0];
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
	 * @return the spotListProduct
	 */
	public String[] getListProduct() {
		return this.listProduct;
	}


	/**
	 * @param spotListProduct the spotListProduct to set
	 */
	public void setListProduct(String[] listProduct) {
		this.listProduct = listProduct;
	}


	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}


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

	
	@Override
	public String execute() throws Exception {
		addActionMessage(getText("content.spot.select.option"));
		return INPUT;
	}
	
	/**
	 * List all spots registered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setContentSpots(this.contentSpotService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}

	

	/**
	 * Method to create category
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		//creating bean spot to configure the content spot
		SpotBean spotBean  = new SpotBean();
		spotBean.setContentSpot(this.contentSpot);
		
		try {
			this.contentSpotService.create(spotBean);
			addActionMessage(getText("content.spot.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.content.spot.create"));
			return ERROR;
		}
	}
	
	/**
	 * Prepare to create spot
	 * @return String
	 * @throws Exception
	 */
	public String input() throws Exception {
		return INPUT;
	}
	
	/**
	 * Prepare to show detail content spot
	 * @return String
	 * @throws Exception
	 */
	public String detail() throws Exception {
		
		try {

			SpotBean spotBean = new SpotBean();
			spotBean.setId(this.getContentSpot().getId());
			spotBean = this.contentSpotService.load(spotBean);

			this.setContentSpot(spotBean.getContentSpot());
			
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error to presents detail content spot", e);
			this.addActionError(getText("error.detail.contentspot"));
			return ERROR;
		}		
		return SUCCESS;	
	}
	
	

	/**
	 * Method to update the content spot
	 * @return 
	 * @throws Exception 
	 * */
	public String update() throws Exception {
		
		//content spot entity
		SpotBean spotBean = new SpotBean();
		spotBean.setId(this.getContentSpot().getId());
		spotBean = contentSpotService.load(spotBean);
		
		ContentSpot contentSpot = spotBean.getContentSpot();
		
		//configure product list attribute
		contentSpot.setProducts(this.extractProducts());
		contentSpot.setContentName(this.getContentSpot().getContentName());
		contentSpot.setContentDescription(this.getContentSpot().getContentDescription());
		contentSpot.setTextContent(this.getContentSpot().getTextContent());
		contentSpot.setIsContentText(this.getContentSpot().getIsContentText());
		
		return update(spotBean);
	}


	/**
	 * 
	 * Operation action to update the content spot
	 * @param spotBean
	 * @return String result action
	 */
	private String update(SpotBean spotBean) {
		try {
			this.contentSpotService.update(spotBean);
			addActionMessage(getText("content.spot.update.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.content.spot.update"));
			return ERROR;
		}
	}
		

	/**
	 * Method to add product for the content spot
	 * @return 
	 * @throws Exception 
	 * */
	public String addProduct() throws Exception {
		
		//content spot entity
		SpotBean spotBean = new SpotBean();
		spotBean.setId(this.getContentSpot().getId());
		spotBean = contentSpotService.load(spotBean);
		
		//main content spot
		ContentSpot content = spotBean.getContentSpot();
		this.products = content.getProducts();

		//configure products list attribute
		content.setProducts(extractProducts());
		
		return update(spotBean);
	}

	/**
	 * Extract products from the dropdown list
	 * @return 
	 * @return ArrayList
	 */
	private List<Product> extractProducts() {
		//load products from hidden fields
		if (this.getListProduct() != null){
			for(String p : this.getListProduct()){
				Product product = new  Product();
				product.setId(Long.valueOf(p));
				this.products.add(product);
			}
		}
		
		return this.products;
	}
	
	/**
	 * List all products regitered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAllProducts() throws Exception {
		try {
			this.setProducts(this.productService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	
	/**
	 * Delete the content spot regitered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String delete() throws Exception {
		try {
			
			SpotBean bean = new SpotBean();
			bean.setContentSpot(this.getContentSpot());
			this.contentSpotService.delete(bean);
			this.addActionMessage(getText("delete.contentspot.success"));
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error to delete content spot", e);
			this.addActionError(getText("delete.contentspot.error"));
			return ERROR;
		}
		return SUCCESS;	
	}
}
