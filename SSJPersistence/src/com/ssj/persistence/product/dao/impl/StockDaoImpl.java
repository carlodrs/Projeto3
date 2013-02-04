/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.StockDao;
import com.ssj.persistence.product.entity.Stock;

/**
 * Implementation StockDao
 * @author Carlos
 * @see StockDao , SSJGenericDaoImpl, SSJGenericDao
 * @since 2013
 * @version 1.0
 */
@Repository("StockDaoImpl")
public class StockDaoImpl extends 
	SSJGenericDaoImpl<Stock> implements StockDao {

}
