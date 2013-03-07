package br.com.store.cms.spot.action;

import java.util.List;

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
public class SpotCMSAction extends ActionSupport {

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String description;
	private String isParent;
	private Long parentId;
	private List<Category> categories;
	
	@Autowired
	protected CategoryService categoryService;
	
	
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
	 * @return the isParent
	 */
	public String getIsParent() {
		return isParent;
	}

	/**
	 * @param isParent the isParent to set
	 */
	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}

	/**
	 * @return the parentId
	 */
	public Long getParentId() {
		return parentId;
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
	 * @param parentId the parentId to set
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
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
		
		Category category = new Category();
		category.setName(this.getName());
		category.setDescription(this.getDescription());
		
		//if category have a parent
		if((Boolean.valueOf(this.getIsParent()) && this.getParentId() != -1) ||
	      (!Boolean.valueOf(this.getIsParent()) && this.getParentId() == -1)){
				addActionError(getText("category.parent.selected.incorrect"));
				this.setCategories(this.categoryService.listAllParents());
				return ERROR;
		}else{
			if(!Boolean.valueOf(this.getIsParent())){
				Category categoryParent = new Category();
				categoryParent.setId(Long.valueOf(this.getParentId()));
				category.setParentId(categoryParent);	
			}
			
		}
		
		CategoryBean categoryBean = new CategoryBean();
		categoryBean.setCategory(category);
		
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
}
