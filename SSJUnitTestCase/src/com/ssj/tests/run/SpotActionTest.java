package com.ssj.tests.run;

import com.ssj.test.actions.SpotAction;
import com.ssj.test.config.SSJGenericSpringTest;

/**
 * Test case action suppport test of spots
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * */

public class SpotActionTest extends SSJGenericSpringTest {
	
	public static void main(String[] args) throws Exception {
		new SpotActionTest().test();
	}
	
	private void test() throws Exception {
		/* Load bean spotAction from beans configurations */ 
		SpotAction action = (SpotAction)
		 		this.getSpringApplicationContext().getBean("SpotAction");
		
		
		///////////////////////Set of test case o the create spot possibilites/////////////////////////////////
		//action.testCreateSpot();
		action.testCreateContentSpot();
	
	}
}
