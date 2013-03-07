package com.ssj.test.actions;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.product.entity.Attribute;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.AttributeBean;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.AttributeService;
import com.ssj.service.product.interfaces.ProductService;

@Component("AttributeAction")
public class AttributeAction {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
    private AttributeService attributeService;
	
	/****************** Method test to create attributes *******************************/
	/***********************************************************************************/
	
	public void testCreateAttributes() throws Exception{
		

		Attribute attribute = new Attribute();
		//attribute.setId(1L);
		attribute.setName("Lama negra");
		
		AttributeBean attributeBean = new AttributeBean();
		attributeBean.setAttribute(attribute);
		
		this.attributeService.create(attributeBean);
		
		Attribute attribute2 = new Attribute();
		//attribute2.setId(2L);
		attribute2.setName("Crespo");
		
		attributeBean.setAttribute(attribute2);
		this.attributeService.create(attributeBean);
		
		
		Set<Attribute> attributeList = new HashSet<Attribute>();
		attributeList.add(attribute);
		attributeList.add(attribute2);
		
		Product product = new Product();
		product.setAttributeList(attributeList);
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		
		this.productService.create(productBean);
	}

	public void testDeleteAttributes() throws Exception{
		
		Attribute attribute = new Attribute();
		attribute.setId(1L);
		
		AttributeBean attributeBean = new AttributeBean();
		attributeBean.setAttribute(attribute);
		
		this.attributeService.delete(attributeBean);
	}
}
