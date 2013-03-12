/**
 * 
 */
package com.ssj.persistence.product.dao;

import java.util.List;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.product.entity.Attribute;

/**
 * 
 * Interface responsible to offer products characteristics and keep the specific
 * information about the product. 
 * @author Carlos Silva
 * @see Attribute, SSJGenericDao
 * @since 2013
 * @version 1.0
 */
public interface AttributeDao extends SSJGenericDao<Attribute> {

	/**
	 * List all attributes registered on database
	 * @return List of attributes
	 * @throws Exception
	 * */
	public List<Attribute> listAll() throws Exception;

	/**
	 * Return specific attribute registered on database
	 * @param name
	 * @return Attribute
	 * @throws Exception
	 * */
	public Attribute getAttributeByName(String name) throws Exception;

}
