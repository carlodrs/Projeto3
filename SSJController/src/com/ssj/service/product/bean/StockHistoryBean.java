package com.ssj.service.product.bean;

import java.io.Serializable;

import com.ssj.persistence.product.entity.StockHistory;


/**
 * 
 * Java Bean to get informations from historic stock on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * @see Serializable, Stock, StockHistory
 * */
public class StockHistoryBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *  Entity StockHistory
	 *  @see StockHistory
	 */
	private StockHistory stockHistory;
	
	private Long id;

	/**
	 * @return the stockHistory
	 */
	public StockHistory getStockHistory() {
		return stockHistory;
	}

	/**
	 * @param stockHistory the stockHistory to set
	 */
	public void setStockHistory(StockHistory stockHistory) {
		this.stockHistory = stockHistory;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
