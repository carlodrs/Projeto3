/**
 * 
 */
package com.ssj.tests.run;

import com.ssj.test.actions.OrderAction;
import com.ssj.test.config.SSJGenericSpringTest;

/**
 * 
 * Test the orders of the system
 * @author Carlos Silva
 * @version 2013
 */
public class OrderActionTest extends SSJGenericSpringTest{
	
	public static void main(String[] args) throws Exception {
		new OrderActionTest().test();
	}

	private void test() throws Exception {
		/* Load bean UserAction from beans configurations */ 
		OrderAction orderAction = (OrderAction)
		 		this.getSpringApplicationContext().getBean("OrderAction");
		
		
		///////////////////////Set of test case o the users possibilites/////////////////////////////////
		orderAction.testCreateOrder(); 
		orderAction.testCreateOrderItems(); 
		orderAction.testRemoveItems(); 
	}

}
