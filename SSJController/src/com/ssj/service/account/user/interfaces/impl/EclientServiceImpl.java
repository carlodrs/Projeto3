package com.ssj.service.account.user.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.dao.EclientDao;
import com.ssj.persistence.account.user.entity.Eclient;
import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.account.user.interfaces.EclientService;
import com.ssj.service.bean.account.user.UserBean;


/**
 * 
 * Service to create the Eclient
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Service
public class EclientServiceImpl implements EclientService {
	
	@Autowired
	private EclientDao eClientDao;

	/**
	 * @param eClientDao the eClientDao to set
	 */
	
	
	public void create (UserBean bean) throws Exception{
		
		UserEmail userEmail = new UserEmail();
		userEmail.setEmail(bean.getEmail());
		userEmail.setPassword(bean.getPassword());
		
		Eclient eclient = new Eclient();
		BeanUtils.copyProperties(bean, eclient);
		eclient.setUserEmail(userEmail);
		
		this.eClientDao.create(eclient);
	}

	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void setEClientDao(EclientDao eClientDao) {
		this.eClientDao = eClientDao;
	}

	@Override
	public void read(UserBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
