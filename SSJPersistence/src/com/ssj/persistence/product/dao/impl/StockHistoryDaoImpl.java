/**
 * 
 */
package com.ssj.persistence.product.dao.impl;

import org.springframework.beans.factory.annotation.Qualifier;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.product.dao.StockHistoryDao;
import com.ssj.persistence.product.entity.StockHistory;

/**
 * Implementation StockHistoryDao to keep inventory situations history for the 
 * better controller for the quantity , supplier and dispatch
 * @author Carlos Silva
 * @see StockHistoryDao , SSJGenericDaoImpl, SSJGenericDao
 * @since 2013
 * @version 1.0
 */
@Qualifier("StockHistoryDaoImpl")
public class StockHistoryDaoImpl extends 
	SSJGenericDaoImpl<StockHistory> implements StockHistoryDao {

}
