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
import org.springframework.stereotype.Service;

import com.ssj.service.account.user.interfaces.ClientService;
import com.ssj.service.bean.account.user.ClientBean;


@Service("ClienteServiceImpl")
public class ClienteServiceImpl extends 
	UserServiceImpl implements ClientService<ClientBean>{

}
