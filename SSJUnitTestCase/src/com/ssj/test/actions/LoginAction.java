package com.ssj.test.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.security.login.bean.LoginBean;
import com.ssj.service.security.login.interfaces.LoginService;

@Component("LoginAction")
public class LoginAction {
	
	@Autowired
	LoginService loginService;

	public void login() {
		
		UserEmail userEmail = new UserEmail();
		userEmail.setEmail("artemel@ssj.com.br");
		userEmail.setPassword("patchwork");
		
		LoginBean bean = new LoginBean();
		bean.setUserEmail(userEmail);
		
		try {
			boolean flagLogin = loginService.checkUser(bean);
			
			System.out.println("Status login : " + flagLogin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
