package com.ssj.service.account.user.interfaces.impl;

/**
 * 
 * Client services implementation to handle e-client users
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 * Shopping São João
 * 
 * */
import com.ssj.service.account.user.interfaces.ClientService;
import com.ssj.service.bean.account.user.UserBean;

public class ClienteServiceImpl extends UserServiceImpl implements ClientService{
	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void create (UserBean bean) throws Exception{
		super.create(bean);
	}
}
