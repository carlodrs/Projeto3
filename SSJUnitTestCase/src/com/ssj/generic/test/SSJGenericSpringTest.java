package com.ssj.generic.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class SSJGenericSpringTest {
	protected ApplicationContext getSpringApplicationContext(){
		return new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
	}
}
