package com.ssj.service.account.user.interfaces;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.ssj.persistence.account.user.dao.EclientSysDao;
import com.ssj.persistence.account.user.entity.EclientSys;
import com.ssj.service.bean.account.user.UserBean;


/**
 * 
 * Service to create the Eclient Sys
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Component("EclientSysService")
public class EclientSysService {
	
	
	//@Autowired
	private EclientSysDao eClientSysDao;

	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void setEClientDao(EclientSysDao eClientSysDao) {
		this.eClientSysDao = eClientSysDao;
	}
	
	public void create (UserBean bean) throws Exception{
		
		EclientSys eclientSys = new EclientSys();
		BeanUtils.copyProperties(bean, eclientSys);
		
		this.eClientSysDao.create(eclientSys);
	}
}
