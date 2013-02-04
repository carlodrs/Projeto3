package com.ssj.service.bean.account.user;

import java.io.Serializable;
import java.util.Calendar;

import com.ssj.persistence.account.user.entity.Client;
import com.ssj.persistence.account.user.entity.Partner;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.persistence.account.user.entity.UserEmail;


/**
 *  Bean (pojo) to get informations the clients of the sistem
 *  @author Carlos Renato Domingos da silva
 *  @since 2013
 *  @version 1.0
 *  
 * Shopping São João
 * */
public class UserBean implements Serializable{
	
	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private UserEmail  userEmail;
	private User user;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
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
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
