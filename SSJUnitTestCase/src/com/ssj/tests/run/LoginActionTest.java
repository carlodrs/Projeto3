package com.ssj.tests.run;

import com.ssj.test.actions.LoginAction;
import com.ssj.test.config.SSJGenericSpringTest;

public class LoginActionTest extends SSJGenericSpringTest{

	public static void main(String[] args) throws Exception {
		new LoginActionTest().test();
	}

	private void test() throws Exception {
		/* Load bean UserAction from beans configurations */ 
		LoginAction loginAction = (LoginAction)
		 		this.getSpringApplicationContext().getBean("LoginAction");
		
		
		///////////////////////Set of test case o the users possibilites/////////////////////////////////
		loginAction.login(); 
	}
}
