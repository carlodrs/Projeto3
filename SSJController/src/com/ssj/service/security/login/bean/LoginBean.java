package com.ssj.service.security.login.bean;

import java.io.Serializable;

import com.ssj.persistence.account.user.entity.UserEmail;

public class LoginBean implements Serializable {
	
	/**
	 * serial id
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserEmail userEmail;

	/**
	 * @return the userEmail
	 */
	public UserEmail getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(UserEmail userEmail) {
		this.userEmail = userEmail;
	}
	
}
