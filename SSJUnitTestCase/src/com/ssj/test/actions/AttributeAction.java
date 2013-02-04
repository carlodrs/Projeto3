package com.ssj.test.actions;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.product.entity.Attribute;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.ProductService;

public class AttributeAction {
	
	@Autowired
	private ProductService productService;
	
	/****************** Method test to create attributes *******************************/
	/***********************************************************************************/
	
	public void testCreateAttributes() throws Exception{
		

		Attribute attribute = new Attribute();
		attribute.setId(1L);
		attribute.setName("Lama negra");
		
		Attribute attribute2 = new Attribute();
		attribute2.setId(2L);
		attribute2.setName("Crespo");
		
		
		Set<Attribute> attributeList = new HashSet<Attribute>();
		attributeList.add(attribute);
		attributeList.add(attribute2);
		
		Product product = new Product();
		product.setAttributeList(attributeList);
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		
		this.productService.create(productBean);
		
	}



}
