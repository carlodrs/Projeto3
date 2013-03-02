package br.com.store.cms.category.action;


import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Category;
import com.ssj.service.product.bean.CategoryBean;

/**
 * 
 * Product Action CMS to category 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class CategoryCreateCMSAction extends CategoryCMSAction {

	/**
	 * Version id
	 */
	private static final long serialVersionUID = 1L;



	/**
	 * Method to create category
	 * @return 
	 * */
	public String create() {
		
		Category category = new Category();
		category.setName(this.getName());
		category.setDescription(this.getDescription());
		
		//if category have a parent
		if((Boolean.valueOf(this.getIsParent()) && this.getParentId() != -1) ||
	      (!Boolean.valueOf(this.getIsParent()) && this.getParentId() == -1)){
				addActionMessage(getText("category.parent.selected.incorrect"));
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
