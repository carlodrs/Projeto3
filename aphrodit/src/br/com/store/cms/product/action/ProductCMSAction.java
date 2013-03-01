package br.com.store.cms.product.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Product;
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
	private List<Product> products;
	

	@Autowired
	protected ProductService productService;
	
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
	 * Serial version UId
	 */
	private static final long serialVersionUID = 1;
	
	@Override
	public String execute() throws Exception {
		addActionMessage(getText("product.select.option"));
		return INPUT;
	}
	
	/**
	 * List all products regitered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setProducts(this.productService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	/**
	 * Prepare to create product
	 * @return String
	 * @throws Exception
	 */
	public String prepare() throws Exception {
		return INPUT;
	}
}
