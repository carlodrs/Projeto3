package br.com.store.cms.category.action;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Category;
import com.ssj.service.product.bean.CategoryBean;
import com.ssj.service.product.interfaces.CategoryService;

/**
 * 
 * Category Action CMS to registry category 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class CategoryCMSAction extends ActionSupport {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private Category category;
	private Boolean isParent;
	private List<Category> categories;
	private static Logger logger = 
		Logger.getLogger(CategoryCMSAction.class.getName());
	
	@Autowired
	protected CategoryService categoryService;
	
	public CategoryCMSAction(){
		this.categories = new ArrayList<Category>();
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
	 * @return the isParent
	 */
	public Boolean getIsParent() {
		return isParent;
	}

	/**
	 * @param isParent the isParent to set
	 */
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
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


	@Override
	public String execute() throws Exception {
		addActionMessage(getText("category.select.option"));
		return INPUT;
	}
	
	/**
	 * List all categories registered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setCategories(this.categoryService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	/**
	 * List all parent categories registered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAllParents() throws Exception {
		try {
			this.setCategories(this.categoryService.listAllParents());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	/**
	 * Prepare to create category
	 * @return String
	 * @throws Exception
	 */
	public String prepare() throws Exception {
		
		try{
			this.setCategories(this.categoryService.listAllParents());
		} catch (Exception e) {
			return ERROR;
		}
			
		return INPUT;
	}
	

	/**
	 * Method to create category
	 * @return 
	 * @throws Exception 
	 * */
	public String create() throws Exception {
		
		//if category have a parent
		if ((Boolean.valueOf(this.getIsParent()) && !this.getCategory().getParent().getId().equals(-1L)) ||
	       (!Boolean.valueOf(this.getIsParent()) && this.getCategory().getParent().getId().equals(-1L))){
				addActionError(getText("category.parent.selected.incorrect"));
				this.setCategories(this.categoryService.listAllParents());
				return ERROR;
		}
	
		//configure parent from the childs
		if(!Boolean.valueOf(this.getIsParent())){
			Category categoryParent = new Category();
			categoryParent.setId(this.getCategory().getParent().getId());
			this.category.setParent(categoryParent);	
		}else{
			this.category.setParent(null);
		}
		
		
		CategoryBean categoryBean = new CategoryBean();
		categoryBean.setCategory(this.category);
		
		try {
			this.categoryService.create(categoryBean);
			addActionMessage(getText("category.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.category.create"));
			return ERROR;
		}
	}
	
	
	/**
	 * Prepare to show category detail
	 * @return String
	 * @throws Exception
	 */
	public String detail() throws Exception {
		
		try{
			CategoryBean categoryBean = new CategoryBean();
			categoryBean.setId(this.getCategory().getId());
			
			categoryBean = this.categoryService.load(categoryBean);
			
			Category category = categoryBean.getCategory();
			if (category.getParent() == null){
				this.setIsParent(true);
			}else{
				this.setIsParent(false);
			}
			this.setCategory(category);
			this.setCategories(this.categoryService.listAll());
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.detail.spot"));
			return ERROR;
		}		
	}


	/**
	 * Update category
	 * @return String
	 * @throws Exception
	 */
	public String update() throws Exception {
		
		try{
		
			//if category have a parent
			if ((Boolean.valueOf(this.getIsParent()) && !this.getCategory().getParent().getId().equals(-1L)) ||
		       (!Boolean.valueOf(this.getIsParent()) && this.getCategory().getParent().getId().equals(-1L))){
					addActionError(getText("category.parent.selected.incorrect"));
					this.setCategories(this.categoryService.listAllParents());
					return ERROR;
			}
		
			//configure parent from the childs
			if(!Boolean.valueOf(this.getIsParent())){
				Category categoryParent = new Category();
				categoryParent.setId(this.getCategory().getParent().getId());
				this.category.setParent(categoryParent);	
			}else{
				this.category.setParent(null);
			}
			
			CategoryBean categoryBean = new CategoryBean();
			categoryBean.setCategory(category);
			this.categoryService.update(categoryBean);
			this.addActionMessage(getText("success.update.category"));
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(getText("error.update.category"));
			return ERROR;
		}		
	}
	
	/**
	 * Method to delete category
	 * @return String
	 * */
	public String delete(){
		try {
			
			CategoryBean categoryBean = new CategoryBean();
			categoryBean.setCategory(this.getCategory());
			this.categoryService.delete(categoryBean);
			this.addActionMessage(getText("delete.category.success"));
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error to delete category", e);
			this.addActionError(getText("delete.category.error"));
			return ERROR;
		}
		return SUCCESS;
	}
}
