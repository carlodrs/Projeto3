package com.ssj.tests.run;

import com.ssj.test.actions.AttributeAction;
import com.ssj.test.config.SSJGenericSpringTest;

/**
 * Test case action support test
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * */
public class AttributeActionTest extends SSJGenericSpringTest {
	
	public static void main(String[] args) throws Exception {
		new AttributeActionTest().test();
	}

	private void test() throws Exception {
		/* Load bean UserAction from beans configurations */ 
		AttributeAction attributeAction = (AttributeAction)
		 		this.getSpringApplicationContext().getBean("AttributeAction");
		
		
		///////////////////////Set of test case o the users possibilities/////////////////////////////////
		
		attributeAction.testCreateAttributes(); 
		
	
	
	}
}

