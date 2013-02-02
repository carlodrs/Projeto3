package com.ssj.service.product.interfaces.impl;

/**
 * Service Product to be handle the products on the System
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */

import org.springframework.beans.BeanUtils;
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
	
	/** Member stock history entity */
	private StockHistory history;
	
	@Autowired
	private StockHistoryDao stockHistoryDao;
	
	public StockHistoryServiceImpl(){
		this.history = new StockHistory();
	}

	@Override
	public void create(StockHistoryBean t) throws Exception {
		BeanUtils.copyProperties(t, this.history);
		this.stockHistoryDao.create(this.history);
		
	}

	@Override
	public void read(StockHistoryBean t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(StockHistoryBean t) throws Exception {
		BeanUtils.copyProperties(t, this.history);
		this.stockHistoryDao.delete(this.history);
		
	}

	@Override
	public void update(StockHistoryBean t) throws Exception {
		BeanUtils.copyProperties(t, this.history);
		this.stockHistoryDao.update(this.history);
		
	}
}
