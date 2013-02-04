package com.ssj.test.action.account.user;

import com.ssj.test.SSJGenericSpringTest;

/**
 * Test case action suppport test
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * */
public class UserActionTest extends SSJGenericSpringTest {
	
	public static void main(String[] args) {
		new UserActionTest().init();
	}

	/**
	 * Method init 
	 **/
	private void init() {
		 
		// Info
		System.out.println("My Beans Load from Spring : \n" 
				+ this.getSpringApplicationContext()
							.getBeanDefinitionCount());
	        
		/* Load bean UserAction from beans configurations */ 
		UserAction userAction = (UserAction)
		 		this.getSpringApplicationContext().getBean("UserAction");
		
		/* Execute Action */
		try {
			userAction.execute(); 
			System.out.println("****** Success!!! *******");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("****** Fatal Error!!! *******");
		}
	}
}

