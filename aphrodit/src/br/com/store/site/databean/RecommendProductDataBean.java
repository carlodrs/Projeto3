package br.com.store.site.databean;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.product.interfaces.ProductService;

/**
 * Databean specific to presents others products recommendations
 * @author Carlos Silva
 * @version 1.0
 * @see Spot
 * */
public class RecommendProductDataBean {

	
	public RecommendProductDataBean(){
	}
	
	private List<Product> products;
	private Category category;
	private long categoryId;
	
	private static Logger logger = 
		Logger.getLogger(RecommendProductDataBean.class.getName());
	@Autowired
	
	private ProductService service;

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		this.category = new Category();
		this.category.setId(this.categoryId);
		try {
			this.products = this.service.listTop4ByCategory(this.category);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error to list at least 4 products recommendations", e);
		}
		return this.products;
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

	/**
	 * @return the categoryId
	 */
	public long getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	

	
}
