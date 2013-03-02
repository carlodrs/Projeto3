package br.com.store.cms.attribute.action;


import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Attribute;
import com.ssj.service.product.bean.AttributeBean;

/**
 * 
 * Product Action CMS to registry product 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class AttributeCreateCMSAction extends AttributeCMSAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Method to create product
	 * @return 
	 * */
	public String create() {
		
		Attribute attribute = new Attribute();
		attribute.setListValue(this.getListValue());
		attribute.setName(this.getName());
		attribute.setValue(this.getValue());
		
		AttributeBean attributeBean = new AttributeBean();
		attributeBean.setAttribute(attribute);
		try {
			attributeService.create(attributeBean);
			addActionMessage(getText("attribute.create.success"));
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.attibute.create"));
			return ERROR;
		}
	}
	
	
}
