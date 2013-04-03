package com.ssj.service.security.login.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.persistence.security.dao.LoginDao;
import com.ssj.service.security.login.bean.LoginBean;
import com.ssj.service.security.login.interfaces.LoginService;

/**
 * Service validate login user on server
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 * @see LoginService
 * */
@Service("LoginServiceImpl")
public class LoginServiceImpl implements LoginService {
	
	/** Member data acccess stock */
	@Autowired
	private LoginDao loginDao;
	
	/**
	 * @return 
	 * @see LoginService#checkUser(LoginBean) 
	 */
	@Override
	public boolean checkUser(LoginBean bean) throws Exception {
		
		boolean returnValue = false;
		try {
			loginDao.checkUser(bean.getUserEmail().getEmail(), 
					bean.getUserEmail().getPassword());
			returnValue = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnValue;
	}

	@Override
	public void create(LoginBean t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LoginBean read(LoginBean t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(LoginBean t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(LoginBean t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LoginBean load(LoginBean t) throws Exception {
		t.setUserEmail(
				loginDao.load(UserEmail.class, t.getUserEmail()));
		return t;
	}
}