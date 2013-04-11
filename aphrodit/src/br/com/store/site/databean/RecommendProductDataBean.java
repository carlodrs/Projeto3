package br.com.store.site.databean;

import java.util.List;

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
	private Category category;
	private List<Product> products;
	
	@Autowired
	private ProductService service;

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		this.setProducts(
				this.service.listTop4ByCategory(this.category));
		
		return this.products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
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
