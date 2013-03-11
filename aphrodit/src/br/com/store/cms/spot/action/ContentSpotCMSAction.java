package br.com.store.cms.spot.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Product;
import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.product.interfaces.ProductService;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.ContentSpotService;
import com.ssj.service.spot.interfaces.SpotService;

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
	private String contentName;
	private String contentDescription;
	private List<Spot> spots;
	private List<ContentSpot> contentSpots;
	private Long spotId;
	private Long id;
	private List<Product> products;
	private String[] spotListProduct;
	
	@Autowired
	private SpotService spotService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ContentSpotService contentSpotService;
	
	public ContentSpotCMSAction(){
		this.products = new ArrayList<Product>();
		this.spots = new ArrayList<Spot>();
		this.spotListProduct = new String[0];
	}

	
	/**
	 * @return the spotListProduct
	 */
	public String[] getSpotListProduct() {
		return spotListProduct;
	}


	/**
	 * @param spotListProduct the spotListProduct to set
	 */
	public void setSpotListProduct(String[] spotListProduct) {
		this.spotListProduct = spotListProduct;
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


	/**
	 * @return the spotId
	 */
	public Long getSpotId() {
		return spotId;
	}


	/**
	 * @param spotId the spotId to set
	 */
	public void setSpotId(Long spotId) {
		this.spotId = spotId;
	}


	/**
	 * @return the spots
	 */
	public List<Spot> getSpots() {
		return spots;
	}

	/**
	 * @param spots the spots to set
	 */
	public void setSpots(List<Spot> spots) {
		this.spots = spots;
	}

	


	/**
	 * @return the contentDescription
	 */
	public String getContentDescription() {
		return contentDescription;
	}


	/**
	 * @param contentDescription the contentDescription to set
	 */
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}


	/**
	 * @return the contentName
	 */
	public String getContentName() {
		return contentName;
	}


	/**
	 * @param contentName the contentName to set
	 */
	public void setContentName(String contentName) {
		this.contentName = contentName;
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
		
		//content spot entity
		ContentSpot contentSpot  = new ContentSpot();
		contentSpot.setContentName(this.contentName);
		contentSpot.setContentDescription(this.contentDescription);
		
		//creating bean spot
		SpotBean spotBean  = new SpotBean();
		spotBean.setId(this.getSpotId());
		
		//load the spot
		spotBean = this.spotService.load(spotBean);
		contentSpot.setSpot(spotBean.getSpot());
		
		//contet spot configured 
		spotBean.setContentSpot(contentSpot);
		
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
		this.setSpots(this.spotService.listAll());
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
			spotBean.setId(this.getId());
			spotBean = this.contentSpotService.load(spotBean);

			ContentSpot contentSpot = spotBean.getContentSpot();
			
			this.setContentName(contentSpot.getContentName());
			this.setContentDescription(contentSpot.getContentDescription());
			this.setProducts(contentSpot.getProducts());
			this.spots.add(contentSpot.getSpot());
	
		} catch (Exception e) {
			e.printStackTrace();
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
		spotBean.setId(this.id);
		spotBean = contentSpotService.load(spotBean);
		
		ContentSpot contentSpot = spotBean.getContentSpot();
		Spot spot = contentSpot.getSpot();
		spot.setId(this.spotId);
		
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
		
		//load products from hidden fields
		ArrayList<Product> arrProduct = new ArrayList<Product>();
		if (this.getSpotListProduct() != null){
			for(String p : this.getSpotListProduct()){
				Product product = new  Product();
				product.setId(Long.valueOf(p));
				arrProduct.add(product);
			}
		}
		//configure the property
		this.products = arrProduct;
		
		//content spot entity
		SpotBean spotBean = new SpotBean();
		spotBean.setId(this.id);
		spotBean = contentSpotService.load(spotBean);
		
		//main content spot
		ContentSpot content = spotBean.getContentSpot();
		content.setProducts(this.products);
		
		return update(spotBean);
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

}
