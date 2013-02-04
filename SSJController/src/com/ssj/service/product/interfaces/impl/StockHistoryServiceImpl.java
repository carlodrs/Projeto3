package com.ssj.service.product.interfaces.impl;

/**
 * Service Product to be handle the products on the System
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */

import org.springframework.beans.factory.annotation.Autowired;

import com.ssj.persistence.product.dao.StockHistoryDao;
import com.ssj.persistence.product.entity.StockHistory;
import com.ssj.service.Service;
import com.ssj.service.product.bean.StockHistoryBean;
import com.ssj.service.product.interfaces.StockHistoryService;


/**
 * Service Stock to be handle the inventory on the System
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */
public class StockHistoryServiceImpl implements StockHistoryService{
	
	@Autowired
	private StockHistoryDao stockHistoryDao;
	

	@Override
	public void create(StockHistoryBean t) throws Exception {
		this.stockHistoryDao.create(t.getStockHistory());
		
	}

	@Override
	public StockHistoryBean read(StockHistoryBean t) throws Exception {
		
		StockHistory stockHistory = this.stockHistoryDao.read(StockHistory.class, t.getId());
		t.setStockHistory(stockHistory);
	
		return t;
		
	}

	@Override
	public void delete(StockHistoryBean t) throws Exception {
		this.stockHistoryDao.delete(t.getStockHistory());
		
	}

	@Override
	public void update(StockHistoryBean t) throws Exception {
		this.stockHistoryDao.update(t.getStockHistory());
		
	}

	@Override
	public StockHistoryBean load(StockHistoryBean t) throws Exception {
		StockHistory stockHistory =  this.stockHistoryDao.load(StockHistory.class, t.getId());
		t.setStockHistory(stockHistory);
		return t;
	}
}
