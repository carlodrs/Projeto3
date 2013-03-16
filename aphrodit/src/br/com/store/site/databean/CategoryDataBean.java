package br.com.store.site.databean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.product.entity.Category;
import com.ssj.service.product.interfaces.CategoryService;

/**
 * Databean specific to presents categories at menu
 * @author Carlos Silva
 * @version 1.0
 * @see Category
 * */
public class CategoryDataBean {

	private Map<Category, List<Category>> mapCategories;
	
	private Category category;
	
	private List<Category> categories;
	
	private List<CategoryDataBean> categoriesDataBean;
	
	@Autowired
	private CategoryService categoryService;

	public CategoryDataBean(){
	}


	/**
	 * @return the categories
	 */
	private Map<Category, List<Category>> getMapCategories() {
		try {
			return this.categoryService.listStructuredCategories();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapCategories;
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
	 * @return the categoryDataBean
	 */
	public List<CategoryDataBean> getCategoriesDataBean() {
		return categoriesDataBean;
	}


	/**
	 * @param categoryDataBean the categoryDataBean to set
	 */
	public void setCategoriesDataBean(List<CategoryDataBean> categoriesDataBean) {
		this.categoriesDataBean = categoriesDataBean;
	}

	
	/**
	 * Method to get child and parente structure for the use from menu system app
	 * @return  List<CategoryDataBean> 
	 */
	public List<CategoryDataBean> getStructure(){
		
		ArrayList<CategoryDataBean> categoryDataBeans = new  ArrayList<CategoryDataBean>();
		
		for (Map.Entry<Category, List<Category>> entry : getMapCategories().entrySet())	{
			
			CategoryDataBean categoryDataBean = new CategoryDataBean();
			categoryDataBean.setCategory(entry.getKey());
			categoryDataBean.setCategories(entry.getValue());
			
			categoryDataBeans.add(categoryDataBean);
		
		}
		
		//order the category
		Collections.sort(categoryDataBeans, new Comparator<CategoryDataBean>() {
			public int compare(CategoryDataBean o1, CategoryDataBean o2) {
	            return o1.getCategory().getShowSequence() - o2.getCategory().getShowSequence();
	        }
	    });
		
		return categoryDataBeans;
	}
	

}