package br.com.store.cms.attribute.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.product.entity.Attribute;
import com.ssj.service.product.bean.AttributeBean;
import com.ssj.service.product.interfaces.AttributeService;

/**
 * 
 * Product Action CMS to registry attribute 
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class AttributeCMSAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String value;
	private String listValue;
	private List<Attribute> attributes;
	

	@Autowired
	protected AttributeService attributeService;
	
	

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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the listValue
	 */
	public String getListValue() {
		return listValue;
	}

	/**
	 * @param listValue the listValue to set
	 */
	public void setListValue(String listValue) {
		this.listValue = listValue;
	}
	
	

	/**
	 * @return the attributes
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}


	@Override
	public String execute() throws Exception {
		addActionMessage(getText("attribute.select.option"));
		return INPUT;
	}
	
	/**
	 * List all attributes regitered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setAttributes(this.attributeService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	/**
	 * Prepare to create attribute
	 * @return String
	 * @throws Exception
	 */
	public String prepare() throws Exception {
		return INPUT;
	}
	
	
	/**
	 * Method to create attribute
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
