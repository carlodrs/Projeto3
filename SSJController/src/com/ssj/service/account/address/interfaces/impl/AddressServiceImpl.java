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
@Qualifier("AddressServiceImpl")
public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressDao addressDao;
	Address address;
	
	public AddressServiceImpl(){
		this.address = new Address();
	}
	
	@Override
	public void create(AddressBean bean) throws Exception {
		BeanUtils.copyProperties(bean, address);
		this.addressDao.create(address);
	}

	@Override
	public AddressBean read(AddressBean bean) throws Exception {
		bean.setAddress(this.addressDao.read(
							Address.class, bean.getId()));
		return bean;
	}

	@Override
	public void delete(AddressBean bean) throws Exception {
		BeanUtils.copyProperties(address, bean);
		this.addressDao.delete(address);
	
	}

	@Override
	public void update(AddressBean bean) throws Exception {
		BeanUtils.copyProperties(address, bean);
		this.addressDao.update(address);
	
	}
}
