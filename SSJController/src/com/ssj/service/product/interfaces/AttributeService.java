package com.ssj.service.product.interfaces;

/**
 * Service Attributes to be handle the products on the System
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */

import java.util.List;

import com.ssj.persistence.product.entity.Attribute;
import com.ssj.service.Service;
import com.ssj.service.product.bean.AttributeBean;

public interface AttributeService extends Service<AttributeBean>{

	/**
	 * Method to get all attributes
	 * @return List
	 * @throws Exception
	 * */
	public List<Attribute> listAll() throws Exception;
}
