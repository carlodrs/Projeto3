/**
 * 
 */
package br.com.store.site.catetory.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.interfaces.CategoryService;
import com.ssj.service.product.interfaces.ProductService;

/**
 * Class to handle actions category 
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 */
public class CategoryAction extends ActionSupport {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	private Category category;
	private List<Product> products;
	
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 * Presents categoory page
	 * @return String
	 * @throws Exception
	 * */
	public String execute() throws Exception{
		
		Category category =
			this.categoryService.findCategoryByName(this.category);
		
		this.setProducts(this.productService.listByCategory(category));
		if (getProducts() != null){
			this.setCategory(getProducts().get(0).getCategory());
		}
		return SUCCESS;
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
	
	
	
}
