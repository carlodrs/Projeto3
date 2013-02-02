package com.ssj.service.product.interfaces.impl;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.ssj.persistence.product.dao.AttributeDao;
import com.ssj.persistence.product.entity.Attribute;
import com.ssj.service.product.interfaces.AttributeService;

/**
 * Service to create attributes on the system
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 * @see AttributeService, ProductService
 * */
@Qualifier("AttributeServiceImpl")
public class AttributeServiceImpl implements AttributeService {
	
	/** Member data acccess attribute */
	@Autowired
	private AttributeDao attributeDao;
	private Attribute attribute;
	
	public AttributeServiceImpl(){
		this.attribute = new Attribute();
	}
	
	@Override
	public void create(Serializable bean) throws Exception {
			BeanUtils.copyProperties(bean, this.attribute);
			this.attributeDao.create(this.attribute);
	}

	@Override
	public void read(Serializable bean) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Serializable bean) throws Exception {
		BeanUtils.copyProperties(bean, this.attribute);
		this.attributeDao.delete(this.attribute);


	}

	@Override
	public void update(Serializable bean) throws Exception {
		BeanUtils.copyProperties(bean, this.attribute);
		this.attributeDao.update(this.attribute);


	}

}
