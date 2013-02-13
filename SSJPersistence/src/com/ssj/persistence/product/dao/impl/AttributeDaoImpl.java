/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.AttributeDao;
import com.ssj.persistence.product.entity.Attribute;

/**
 * 
 * Implementation responsible to offer products characteristics and keep the specific
 * information about the product. 
 * @author Carlos Silva
 * @see Attribute, SSJGenericDaop, AttributeDao
 * @since 2013
 * @version 1.0
 */
@Repository("AttributeDaoImpl")
public class AttributeDaoImpl extends 
	SSJGenericDaoImpl<Attribute> implements AttributeDao{

}
