package com.ssj.service.account.user.interfaces;

import java.util.List;

import com.ssj.persistence.account.user.entity.User;
import com.ssj.service.Service;
import com.ssj.service.bean.account.user.UserBean;


/**
 * 
 * Service to create the Users on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
public interface UserService extends Service<UserBean> {
	
	/**
	 * Service method to create the email user
	 * @param bean
	 * @return void
	 * @throws Exception
	 * */
	public void createUserEmail(UserBean useBean) throws Exception;
	
	/**
	 * Method to get all the registered users
	 * @return List list users
	 * @throws Exception;
	 * */
	public List<User> listAll() throws Exception;

}
