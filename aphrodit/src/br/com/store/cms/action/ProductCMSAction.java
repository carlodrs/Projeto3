package br.com.store.cms.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.ProductService;

/**
 * 
 * Product Action CMS to registry product 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class ProductCMSAction extends ActionSupport {

	private String name;
	private String shortName;
	private String description;
	private Double price;
	private Double offerPrice;
	private String picture;
	private Double discount;

	@Autowired
	ProductService productService;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * @return the offerPrice
	 */
	public Double getOfferPrice() {
		return offerPrice;
	}

	/**
	 * @param offerPrice the offerPrice to set
	 */
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}



	/**
	 * Serial version UId
	 */
	private static final long serialVersionUID = 1;
	
	@Override
	public String execute() throws Exception {
		addActionMessage(getText("product.select.option"));
		return INPUT;
	}
	
	/**
	 * Prepare to create product
	 * @return String
	 * @throws Exception
	 */
	public String prepare() throws Exception {
		return INPUT;
	}
	
	/**
	 * Method to create product
	 * @return 
	 * */
	public String create() {
		
		Product product = new Product();
		product.setName(this.name);
		product.setDescription(this.description);
		product.setOfferPrice(this.offerPrice);
		product.setPrice(this.price);
		product.setShortName(this.shortName);
		product.setPercentDiscount(this.discount);
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		try {
			productService.create(productBean);
			addActionMessage(getText("product.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.product.create"));
			return ERROR;
		}
	}
	
	
}
