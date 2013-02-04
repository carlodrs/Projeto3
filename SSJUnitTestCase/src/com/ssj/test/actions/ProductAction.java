package com.ssj.test.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.ProductService;

public class ProductAction {
	
	
	@Autowired
	ProductService productService;

	/****************** Method test to create product *******************************/
	/*****************************************************************************/
	public void testCreateProduct() throws Exception {

		Category category = new Category();
		category.setId(1L);
		category.setName("Alisamentos");
		
		Product product = new Product();
		
		product.setName("Hair Top 10 App Hair");
		product.setShortName("Hair 10");
		product.setDescription("Esse produto alisa cabelo crespo mesmo!!!");
		product.setPrice(110.00);
		product.setOfferPrice(110.00);
		product.setPercentDiscount(0d);
		
		// Set category
		product.setCategory(category);
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		

		productService.create(productBean);

	}
	
}
