package com.ssj.service.account.user.interfaces;

import com.ssj.service.bean.account.user.UserBean;


/**
 * 
 * Service to create the Eclients on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
public interface EclientService {
	
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

}
