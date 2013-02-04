package com.ssj.tests.run;

import com.ssj.test.actions.AddressAction;
import com.ssj.test.config.SSJGenericSpringTest;

public class AddressActionTest extends SSJGenericSpringTest{

	public static void main(String[] args) throws Exception {
		new AddressActionTest().test();
	}

	private void test() throws Exception {
		/* Load bean UserAction from beans configurations */ 
		AddressAction userAction = (AddressAction)
		 		this.getSpringApplicationContext().getBean("AddressAction");
		
		
		///////////////////////Set of test case o the users possibilites/////////////////////////////////
		userAction.testCreateAddress(); 
		
	}

}
