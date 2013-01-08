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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.service.account.user.interfaces.ClientService;
import com.ssj.service.bean.account.user.UserBean;

@Service("ClienteServiceImpl")
@Qualifier("ClienteServiceImpl")
public class ClienteServiceImpl extends UserServiceImpl implements ClientService{
	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void create (UserBean bean) throws Exception{
		super.create(bean);
	}
}
