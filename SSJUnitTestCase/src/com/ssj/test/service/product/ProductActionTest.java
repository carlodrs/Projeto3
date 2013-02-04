package com.ssj.test.service.product;

import java.util.HashSet;
import java.util.Set;

import com.ssj.persistence.product.entity.Attribute;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.ProductService;
import com.ssj.service.product.interfaces.impl.ProductServicesImpl;
import com.ssj.test.SSJGenericSpringTest;

public class ProductActionTest extends SSJGenericSpringTest{
	
	private  ProductService productService;
	
	public ProductActionTest(){
		this.productService = 
				(ProductService) getSpringApplicationContext()
						.getBean(ProductServicesImpl.class.getSimpleName());
	}
	
	public static void main(String[] args) throws Exception {
		ProductActionTest actionTest = new ProductActionTest();
		actionTest.createProduct();
		actionTest.insertAttr();
		
	}

	private void insertAttr() throws Exception {
		
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

	public void createProduct() throws Exception {

		
		
		Product product = new Product();
		
		product.setName("Hair Top 10 App Hair");
		product.setShortName("Hair 10");
		product.setDescription("Esse produto alisa cabelo crespo mesmo!!!");
		product.setPrice(110.00);
		product.setOfferPrice(110.00);
		product.setPercentDiscount(0d);
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		

		productService.create(productBean);
	}
		
}
