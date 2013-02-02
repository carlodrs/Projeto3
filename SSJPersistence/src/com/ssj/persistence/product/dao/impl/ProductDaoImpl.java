/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import org.springframework.beans.factory.annotation.Qualifier;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.ProductDao;
import com.ssj.persistence.product.entity.Product;

/**
 * Implementation ProductDao
 * @author Carlos
 * @see ProductDao , SSJGenericDaoImpl, SSJGenericDao
 * @since 2013
 * @version 1.0
 */
@Qualifier("ProductDaoImpl")
public class ProductDaoImpl extends 
		SSJGenericDaoImpl<Product> implements ProductDao {

}
