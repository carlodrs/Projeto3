package com.ssj.service.account.user.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.dao.PartnerDao;
import com.ssj.persistence.account.user.entity.Partner;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.service.account.user.interfaces.PartnerService;
import com.ssj.service.bean.account.user.UserBean;

/**
 * Impementation of PartnerService
 * @see PartnerService
 * @author Carlos Domingos Silva
 * */

@Service("PartnerServiceImpl")
@Qualifier("PartnerServiceImpl")
public class PartnerServiceImpl
	extends UserServiceImpl implements PartnerService {
	
	@Autowired
	@Qualifier("PartnerDaoImpl")
	private PartnerDao<Partner> partnerDao;
	

	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void create (UserBean bean) throws Exception{
		//Configuring user email
		User user = super.populate(bean);
		
		//create on database
		this.partnerDao.create(user);
	}
}
