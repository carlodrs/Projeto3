package com.ssj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class SSJGenericSpringTest {
	
	private ApplicationContext context;
	
	 public SSJGenericSpringTest() {
		this.context = new ClassPathXmlApplicationContext("META-INF/applicationContext-TestCase.xml");
	}
	
	protected ApplicationContext getSpringApplicationContext(){
		return context;
	}
}
