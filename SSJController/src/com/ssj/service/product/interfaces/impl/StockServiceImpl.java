package com.ssj.service.product.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.product.dao.StockDao;
import com.ssj.persistence.product.entity.Stock;
import com.ssj.service.product.bean.StockBean;
import com.ssj.service.product.interfaces.StockService;

/**
 * Service to create Stock on the system
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 * @see Stockervice, ProductService
 * */
@Service("StockServiceImpl")
public class StockServiceImpl implements StockService {
	
	/** Member data acccess stock */
	@Autowired
	private StockDao stockDao;
	
	@Override
	public void create(StockBean t) throws Exception {
		this.stockDao.create(t.getStock());
	}

	@Override
	public StockBean read(StockBean t) throws Exception {
		Stock stock = this.stockDao.read(Stock.class, t.getId());
		t.setStock(stock);
		return t;
	}

	@Override
	public void delete(StockBean t) throws Exception {
		this.stockDao.delete(t.getStock());
	}

	@Override
	public void update(StockBean t) throws Exception {
		this.stockDao.update(t.getStock());
		
	}

	@Override
	public StockBean load(StockBean t) throws Exception {
		Stock stock = this.stockDao.load(Stock.class, t.getId());
		t.setStock(stock);
		return t;
	}
	

}
