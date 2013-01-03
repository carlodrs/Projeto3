package com.ssj.service.account.user;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.ssj.persistence.account.user.dao.EclientDao;
import com.ssj.persistence.account.user.entity.Eclient;
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
@Component("ClientService")
public class EclientService {
	
	//@Autowired
	private EclientDao eClientDao;

	/**
	 * @param eClientDao the eClientDao to set
	 */
	
	
	public void create (UserBean bean) throws Exception{
		
		Eclient eclient = new Eclient();
		BeanUtils.copyProperties(bean, eclient);
		
	//	this.eClientDao.create(eclient);
	}

	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void setEClientDao(EclientDao eClientDao) {
		this.eClientDao = eClientDao;
	}
}
