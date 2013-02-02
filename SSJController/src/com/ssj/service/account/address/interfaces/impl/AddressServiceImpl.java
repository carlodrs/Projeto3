package com.ssj.service.account.address.interfaces.impl;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.address.dao.AddressDao;
import com.ssj.persistence.account.address.entity.Address;
import com.ssj.service.account.address.interfaces.AddressService;

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
	public void create(Serializable bean) throws Exception {
		BeanUtils.copyProperties(bean, address);
		this.addressDao.create(address);
	}

	@Override
	public void read(Serializable bean) throws Exception {
		BeanUtils.copyProperties(address, bean);
		this.addressDao.read(Address.class, address);
	}

	@Override
	public void delete(Serializable bean) throws Exception {
		BeanUtils.copyProperties(address, bean);
		this.addressDao.delete(address);
	
	}

	@Override
	public void update(Serializable bean) throws Exception {
		BeanUtils.copyProperties(address, bean);
		this.addressDao.update(address);
	
	}
}
