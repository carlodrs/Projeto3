package com.ssj.service.product.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
@Qualifier("StockServiceImpl")
public class StockServiceImpl implements StockService {
	
	/** Member data acccess stock */
	@Autowired
	private StockDao stockDao;
	private Stock stock;
	
	public StockServiceImpl(){
		this.stock = new Stock();
	}

	@Override
	public void create(StockBean t) throws Exception {
		BeanUtils.copyProperties(t, this.stock);
		this.stockDao.create(this.stock);
	}

	@Override
	public StockBean read(StockBean t) throws Exception {
		Stock stock = this.stockDao.read(Stock.class, t.getId());
		t.setStock(stock);
		return t;
	}

	@Override
	public void delete(StockBean t) throws Exception {
		BeanUtils.copyProperties(t, this.stock);
		this.stockDao.delete(this.stock);
		
	}

	@Override
	public void update(StockBean t) throws Exception {
		BeanUtils.copyProperties(t, this.stock);
		this.stockDao.update(this.stock);
		
	}
	

}
