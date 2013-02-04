package com.ssj.service.account.address.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.address.dao.AddressDao;
import com.ssj.persistence.account.address.entity.Address;
import com.ssj.service.account.address.interfaces.AddressService;
import com.ssj.service.bean.account.address.AddressBean;

/**
 * 
 * Class responsible to create the address and handle eventuals business rules
 * @see AbstractService
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 */
@Service("AddressServiceImpl")
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressDao addressDao;

	@Override
	public void create(AddressBean bean) throws Exception {
		this.addressDao.create(bean.getAddress());
	}

	@Override
	public AddressBean read(AddressBean bean) throws Exception {
		bean.setAddress(this.addressDao.read(
							Address.class, bean.getId()));
		return bean;
	}

	@Override
	public void delete(AddressBean bean) throws Exception {
		this.addressDao.delete(bean.getAddress());
	
	}

	@Override
	public void update(AddressBean bean) throws Exception {
		this.addressDao.update(bean.getAddress());
	}

	@Override
	public AddressBean load(AddressBean t) throws Exception {
		Address address = this.addressDao.load(Address.class, t.getId());
		t.setAddress(address);
		
		return t;
	}
}
