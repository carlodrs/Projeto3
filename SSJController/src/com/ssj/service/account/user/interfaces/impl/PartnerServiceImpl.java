package com.ssj.service.account.user.interfaces.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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

	/**
	 * @param eClientDao the eClientDao to set
	 */
	public void create (UserBean bean) throws Exception{
		super.create(bean);
	}
}
