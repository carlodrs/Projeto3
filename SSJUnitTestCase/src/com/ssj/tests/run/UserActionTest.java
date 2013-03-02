package com.ssj.tests.run;

import com.ssj.test.actions.UserAction;
import com.ssj.test.config.SSJGenericSpringTest;

/**
 * Test case action suppport test
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * */
public class UserActionTest extends SSJGenericSpringTest {
	
	public static void main(String[] args) {
		new UserActionTest().test();
	}

	private void test() {
		/* Load bean UserAction from beans configurations */ 
		UserAction userAction = (UserAction)
		 		this.getSpringApplicationContext().getBean("UserAction");
		
		
		///////////////////////Set of test case o the users possibilites/////////////////////////////////
		
		userAction.testCreateUser(); 
		//userAction.testCreatePartner();
		//userAction.testCreateUserEmailOnly();
	
	
	}
}

