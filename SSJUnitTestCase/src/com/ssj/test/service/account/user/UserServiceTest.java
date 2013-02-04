package com.ssj.test.service.account.user;

import com.ssj.service.account.user.interfaces.PartnerService;
import com.ssj.service.account.user.interfaces.UserService;
import com.ssj.service.account.user.interfaces.impl.PartnerServiceImpl;
import com.ssj.service.account.user.interfaces.impl.UserServiceImpl;
import com.ssj.service.bean.account.user.PartnerBean;
import com.ssj.service.bean.account.user.UserBean;
import com.ssj.test.SSJGenericSpringTest;

public class UserServiceTest extends SSJGenericSpringTest{
	
	public static void main(String[] args) {
		UserServiceTest t = new UserServiceTest();
		t.createUser();
	//	t.createUserEmailOnly();
	//	t.createPartner(); //corrigir esse erro;
	}

	@SuppressWarnings("unused")
	private void createPartner() {
		// Info
		System.out.println("My Beans Load from Spring : \n" 
				+ this.getSpringApplicationContext()
							.getBeanDefinitionCount());
		
		PartnerService partnerService = 
			(PartnerService) this.getSpringApplicationContext().
									getBean(PartnerServiceImpl.class.getSimpleName());
		

		PartnerBean partnerBean = new PartnerBean();
		partnerBean.setEmail("artemel@ssj.com.br");
		partnerBean.setPassword("patchwork");
		
		try {
			partnerService.create(partnerBean);
			System.out.println("**** Partner user created Success !!!! ******");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("**** Partner User not created - Fatal error !!!! ******");
			
		}
	}

	private void createUserEmailOnly() {
		// Info
		System.out.println("My Beans Load from Spring : \n" 
				+ this.getSpringApplicationContext()
							.getBeanDefinitionCount());
		
		UserService userService = 
			(UserService) this.getSpringApplicationContext().
									getBean(UserServiceImpl.class.getSimpleName());
		
		
		UserBean user = new UserBean();
		user.setEmail("caredom2000@yahoo.com.br");
		user.setPassword("senha do yahoo");
		
		try {
			userService.createUserEmail(user);
			System.out.println("**** Email user created Success !!!! ******");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("**** Email User not created - Fatal error !!!! ******");
			
		}
		
	}

	private void createUser() {
		
		// Info
		System.out.println("My Beans Load from Spring : \n" 
				+ this.getSpringApplicationContext()
							.getBeanDefinitionCount());
		
		UserService userService = 
			(UserService) this.getSpringApplicationContext().
									getBean(UserServiceImpl.class.getSimpleName());
		
		UserBean bean = new UserBean();
		bean.setEmail("rodrigo@tam.com.br");
		bean.setPassword("piru");
		
		try {
			userService.create(bean);
			System.out.println("**** User created Success !!!! ******");
		} catch (Exception e) {
			System.out.println("**** User not created - Fatal Error!!!! ******");
			e.printStackTrace();
		}
	}
}
