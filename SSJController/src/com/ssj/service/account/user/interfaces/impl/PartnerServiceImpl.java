package com.ssj.service.account.user.interfaces.impl;

import org.springframework.stereotype.Service;

import com.ssj.service.account.user.interfaces.PartnerService;
import com.ssj.service.bean.account.user.PartnerBean;

/**
 * Impementation of PartnerService
 * @see PartnerService
 * @author Carlos Domingos Silva
 * */


@Service("PartnerServiceImpl")
public class PartnerServiceImpl
	extends UserServiceImpl implements PartnerService<PartnerBean> {
}
