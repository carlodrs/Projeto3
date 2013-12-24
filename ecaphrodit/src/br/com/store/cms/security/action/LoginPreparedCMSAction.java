package br.com.store.cms.security.action;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.service.security.login.interfaces.LoginService;

/** 
 * Action used to make a login of the user system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * @see SessionAware
 * 
 * */
public class LoginPreparedCMSAction extends ActionSupport{
	
	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 1L;

	/* email user */
	private String email;
	
	/* password user */
	private String password;

	/* Session map */
	//private SessionMap<String,String> sessionmap;
	
	@Autowired
	protected LoginService loginService;
	
	/**
	 * Prepare form to make the login for the user
	 * @return String
	 * @see ActionSupport
	 * */
	public String prepare() {
		return INPUT;
	}
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
	/*
	public void validate() {
		
		if (this.getEmail().trim().length() == 0) {
			addFieldError("userName", "Email is required");
		}
			
		if (this.getPassword().trim().length() == 0) {
			addFieldError("password", "Password is required");
		}
	}*/	
	
	
/*	
	public void setSession(Map map) {
		sessionmap=(SessionMap)map;
		sessionmap.put("login","true");
	}
	
	public String logout(){
		sessionmap.invalidate();
		return "success";
	}
		
*/	

}
