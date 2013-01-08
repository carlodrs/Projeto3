package com.ssj.action.account.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.service.account.user.interfaces.ClientService;
import com.ssj.service.bean.account.user.UserBean;

public class UserRegistration extends ActionSupport {

	@Autowired
	private ClientService clientService;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String execute() throws Exception {
	
		UserBean userBean = new UserBean();
		userBean.setEmail(this.getEmail());
		userBean.setPassword(this.getPassword());
		
		clientService.create(userBean);
		
		return super.execute();
	}
	
	private String email;
	private String password;


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
