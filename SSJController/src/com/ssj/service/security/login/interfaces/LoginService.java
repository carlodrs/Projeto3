package com.ssj.service.security.login.interfaces;

import org.springframework.transaction.annotation.Transactional;

import com.ssj.service.Service;
import com.ssj.service.security.login.bean.LoginBean;

/**
 * Service Validator on server the input login user  
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */

@Transactional
public interface LoginService extends Service<LoginBean>{

	/**
	 * Check the user system
	 * @param bean Bean of data users
	 * @return void
	 * @throws Exception
	 */
	public boolean checkUser(LoginBean bean) throws Exception;
}
