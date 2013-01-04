package com.ssj.service.account.user.interfaces;

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
public interface UserService {
	
	/**
	 * Service method to create the eclients on the system
	 * @param bean
	 * @return void
	 * @throws Exception
	 * */
	public void create (UserBean bean) throws Exception;

	/**
	 * Service method to read the eclients on the system
	 * @param bean
	 * @return void
	 * @throws Exception
	 * */
	public void read (UserBean bean) throws Exception;

	
	/**
	 * Service method to delete the eclients on the system
	 * @param bean
	 * @return void
	 * @throws Exception
	 * */
	public void delete (UserBean bean) throws Exception;

	
	
	/**
	 * Service method to update the eclients on the system
	 * @param bean
	 * @return void
	 * @throws Exception
	 * */
	public void update (UserBean bean) throws Exception;

	
	/**
	 * Service method to create the email user
	 * @param bean
	 * @return void
	 * @throws Exception
	 * */
	public void createUserEmail(UserBean useBean) throws Exception;

}
