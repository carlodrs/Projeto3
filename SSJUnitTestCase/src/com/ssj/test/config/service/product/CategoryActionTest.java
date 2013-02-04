package com.ssj.test.config.service.product;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.ssj.persistence.product.entity.Category;
import com.ssj.service.product.bean.CategoryBean;
import com.ssj.service.product.interfaces.CategoryService;
import com.ssj.service.product.interfaces.impl.CategoryServiceImpl;
import com.ssj.test.config.SSJGenericSpringTest;

public class CategoryActionTest extends SSJGenericSpringTest {
	
	private static Logger logger = Logger.getLogger(CategoryActionTest.class.getName());
	
	private  CategoryService service;
	
	public CategoryActionTest(){
		this.service = 
				(CategoryService) getSpringApplicationContext()
						.getBean(CategoryServiceImpl.class.getSimpleName());
	}
	
	public static void main(String[] args) throws Exception {
		CategoryActionTest actionTest = new CategoryActionTest();
		
		actionTest.createCategory();
		actionTest.updateCategory();
		actionTest.loadCategory();
		
	}
	
	private void loadCategory() {

		CategoryBean categoryBean = new CategoryBean();
		categoryBean.setId(1l);
		
		try {
			categoryBean = this.service.load(categoryBean);
			Category category = categoryBean.getCategory();
			
			System.out.println("UUUOUUUU - " + category.getName());
		
		} catch (Exception e) {
			logger.log(Level.SEVERE, "*** Fail servere  *** " + e.getMessage());
			e.printStackTrace();
		}
	}

	private void updateCategory() throws Exception {
		
		Category category = new Category();
		category.setId(1L);
		category.setName("Blonde hair cabelos");
		
		CategoryBean categoryBean = new CategoryBean();
		categoryBean.setCategory(category);	
		
		try {
			this.service.update(categoryBean);
		} catch (Exception e) {
			logger.info("*** Erro na execucao do categorytest : " 
					+ e.getMessage() + " ***");
			
			e.printStackTrace();
		}
		
	}

	private void createCategory() throws Exception {
		
		Category category = new Category();
		category.setName("codicionador");
		
		CategoryBean categoryBean = new CategoryBean();
		categoryBean.setCategory(category);
		
		this.service.create(categoryBean);
	
	
	}
	
}
