package com.ssj.service.product.interfaces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.product.dao.AttributeDao;
import com.ssj.persistence.product.entity.Attribute;
import com.ssj.service.product.bean.AttributeBean;
import com.ssj.service.product.interfaces.AttributeService;

/**
 * Service to create attributes on the system
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 * @see AttributeService, ProductService
 * */
@Service("AttributeServiceImpl")
public class AttributeServiceImpl implements AttributeService {
	
	/** Member data acccess attribute */
	@Autowired
	private AttributeDao attributeDao;
	
	@Override
	public void create(AttributeBean bean) throws Exception {
		this.attributeDao.create(bean.getAttribute());
	}

	@Override
	public AttributeBean read(AttributeBean bean) throws Exception {
		bean.setAttribute(
				this.attributeDao.read(
						Attribute.class, bean.getAttribute()));
		//get bean
		return bean;
	}

	@Override
	public void delete(AttributeBean bean) throws Exception {
		this.attributeDao.delete(bean.getAttribute());
	}

	@Override
	public void update(AttributeBean bean) throws Exception {
		this.attributeDao.update(bean.getAttribute());
	}

	@Override
	public AttributeBean load(AttributeBean t) throws Exception {
		Attribute attribute =  this.attributeDao.load(Attribute.class, t.getId());
		t.setAttribute(attribute);
		return t;
	}

	@Override
	public List<Attribute> listAll() throws Exception {
		return this.attributeDao.listAll();
	}

}
