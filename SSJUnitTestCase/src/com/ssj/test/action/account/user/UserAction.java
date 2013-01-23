package com.ssj.test.action.account.user;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ssj.service.account.user.interfaces.UserService;
import com.ssj.service.bean.account.user.UserBean;

@Component("UserAction")
public class UserAction {

	@Autowired 
	@Qualifier("UserServiceImpl")
	private UserService clientService;
	
	public void execute() {
		
		UserBean userBean = new UserBean();
		
		userBean.setName("Carlos Renato Domingos da Silva");
		userBean.setCpf("29293578867");
		userBean.setGender("M");
		userBean.setOptIn('y');
		userBean.setEmail("caredom@zipmail.com");
		userBean.setPassword("rambito01");
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1982);
		calendar.set(Calendar.MONTH, 7);
		calendar.set(Calendar.DATE, 4);
		
		userBean.setBirthday(calendar);
		
		
		try {
			this.clientService.create(userBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * @param eclientService the eclientService to set
	 */
	public void setEclientService(UserService eclientService) {
		this.clientService = eclientService;
	}
	
	
	
	
}
