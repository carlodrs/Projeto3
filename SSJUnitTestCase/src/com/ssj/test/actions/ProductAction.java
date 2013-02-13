package com.ssj.test.actions;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.product.entity.Attribute;
import com.ssj.persistence.product.entity.Category;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.product.bean.ProductBean;
import com.ssj.service.product.interfaces.ProductService;

@Component("ProductAction")
public class ProductAction {
	
	private static Logger Log = 
			Logger.getLogger(ProductAction.class.getName());
	
	@Autowired
	ProductService productService;

	/****************** Method test to create product *******************************/
	/*****************************************************************************/
	public void testCreateProduct() throws Exception {

		Category category = new Category();
		category.setName("Alisamentos");
		
		Attribute peso = new Attribute();
		peso.setName("Peso");
		peso.setValue("100g");
		
		Attribute tamanho = new Attribute();
		tamanho.setName("tamanho");
		tamanho.setValue("20cm");
		
		//configuring list attr
		Set <Attribute> attributes = new HashSet<Attribute>();
		attributes.add(tamanho);
		attributes.add(peso);
		
		Product product = new Product();
		
		product.setName("Hair Top 10 App Hair");
		product.setShortName("Hair 10");
		product.setDescription("Esse produto alisa cabelo crespo mesmo!!!");
		product.setPrice(110.00);
		product.setOfferPrice(110.00);
		product.setPercentDiscount(0d);
		
		// Set category
		product.setCategory(category);
		
		//List attr list
		product.setAttributeList(attributes);
		
		
		ProductBean productBean = new ProductBean();
		productBean.setProduct(product);
		

		productService.create(productBean);

	}
	
	

	/****************** Method test to update product *******************************/
	/*****************************************************************************/
	public void testUpdateteProduct() throws Exception {
		
		ProductBean productBean = new ProductBean();
		productBean.setId(1L);
		
		productBean = this.productService.load(productBean);
		
		Product product = productBean.getProduct();
		product.setId(1L);
		product.setName("Condicionador cond perfectus");
		product.setShortName("condicionador cond");
		product.setDescription("Condiciona tudo!!!");
		product.setPrice(19.00);
		product.setOfferPrice(5.00);
		product.setPercentDiscount(5/19D);
		
		productService.update(productBean);

	}

	/****************** Method test to delete product *******************************/
	/*****************************************************************************/
	public void testDeleteProduct() {

		ProductBean productBean = new ProductBean();
		Product product = new Product();
		product.setId(3L);
		
		productBean.setProduct(product);
		
		try {
			this.productService.delete(productBean);
		} catch (Exception e) {
			Log.log(Level.SEVERE, "Falha na exclusao" +
					" do produto" + e.getMessage());
			e.printStackTrace();
		}finally{
			Log.log(Level.INFO, "Fim da execucao do programa");
		}
	}
}
