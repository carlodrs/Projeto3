package com.ssj.test.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class SSJGenericSpringTest {
	
	private ApplicationContext context;
	
	 public SSJGenericSpringTest() {
		this.context = new ClassPathXmlApplicationContext("META-INF/applicationContext-TestCase.xml");
		
		// Info
		System.out.println("My Beans Load from Spring : \n" 
				+ this.getSpringApplicationContext()
							.getBeanDefinitionCount());
	}
	
	protected ApplicationContext getSpringApplicationContext(){
		return context;
	}
}
