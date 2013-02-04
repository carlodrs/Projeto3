package com.ssj.service.account.user.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.dao.UserDao;
import com.ssj.persistence.account.user.entity.Client;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.account.user.interfaces.UserService;
import com.ssj.service.bean.account.user.UserBean;


/**
 * 
 * Service to create the User
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("UserDaoImpl")
	private UserDao userDao;
	
	/**
	 * @param userBean
	 */
	public void create (UserBean bean) throws Exception{
		userDao.create(bean.getUser());
	}
	
	@Override
	public UserBean read(UserBean bean) throws Exception {
		User user =  userDao.read(User.class, bean.getId());
		bean.setUser(user);
		return bean;
	}
	

	@Override
	public void delete(UserBean bean) throws Exception {
		this.userDao.delete(bean.getUser());
	}

	@Override
	public void update(UserBean bean) throws Exception {
		this.userDao.update(bean.getUser());
	}

	@Override
	public void createUserEmail(UserBean userBean) throws Exception {
		
		//store on database
		this.userDao.create(userBean.getUser());
	}

	@Override
	public UserBean load(UserBean t) throws Exception {
		User user = this.userDao.load(User.class, t.getId());
		t.setUser(user);
		return t;
	}
}