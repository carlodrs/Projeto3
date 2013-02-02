package com.ssj.persistence.account.address.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.address.entity.Address;
import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;



@Service("AddressDaoImpl")
@Qualifier("AddressDaoImpl")
/**
 * Implemtentation to create the Address Entity on database
 * @author Carlos Silva
 * */
public class AddressDaoImpl 
	extends SSJGenericDaoImpl<Address> implements AddressDao {}
