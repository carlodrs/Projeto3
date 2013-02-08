package com.ssj.tests.run;

import com.ssj.test.actions.ProductAction;
import com.ssj.test.config.SSJGenericSpringTest;

/**
 * Test case action suppport test
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * */
public class ProductActionTest extends SSJGenericSpringTest {
	
	public static void main(String[] args) throws Exception {
		new ProductActionTest().test();
	}

	private void test() throws Exception {
		/* Load bean UserAction from beans configurations */ 
		ProductAction productAction = (ProductAction)
		 		this.getSpringApplicationContext().getBean("ProductAction");
		
		
		///////////////////////Set of test case o the users possibilites/////////////////////////////////
		productAction.testCreateProduct(); 
		productAction.testUpdateteProduct();
		productAction.testDeleteProduct();
	}
}

