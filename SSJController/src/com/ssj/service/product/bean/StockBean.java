package com.ssj.service.product.bean;

import java.io.Serializable;
import java.util.List;

import com.ssj.persistence.product.entity.Product;
import com.ssj.persistence.product.entity.StockHistory;


/**
 * 
 * Java Bean to get informations of stock on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * @see Serializable, Stock
 * */
public class StockBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Product product;
	private Long quantityPosition;
	private List<StockHistory> stockHistories;
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
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the quantityPosition
	 */
	public Long getQuantityPosition() {
		return quantityPosition;
	}
	/**
	 * @param quantityPosition the quantityPosition to set
	 */
	public void setQuantityPosition(Long quantityPosition) {
		this.quantityPosition = quantityPosition;
	}
	/**
	 * @return the stockHistories
	 */
	public List<StockHistory> getStockHistories() {
		return stockHistories;
	}
	/**
	 * @param stockHistories the stockHistories to set
	 */
	public void setStockHistories(List<StockHistory> stockHistories) {
		this.stockHistories = stockHistories;
	}
	
	
	

}
