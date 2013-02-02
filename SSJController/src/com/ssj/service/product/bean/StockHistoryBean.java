package com.ssj.service.product.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import com.ssj.persistence.product.entity.Product;
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
	private Long idStockHistory;
	private Calendar registryDate;
	private Long idSupplier;
	private Long quantity;
	/**
	 * @return the idStockHistory
	 */
	public Long getIdStockHistory() {
		return idStockHistory;
	}
	/**
	 * @param idStockHistory the idStockHistory to set
	 */
	public void setIdStockHistory(Long idStockHistory) {
		this.idStockHistory = idStockHistory;
	}
	/**
	 * @return the registryDate
	 */
	public Calendar getRegistryDate() {
		return registryDate;
	}
	/**
	 * @param registryDate the registryDate to set
	 */
	public void setRegistryDate(Calendar registryDate) {
		this.registryDate = registryDate;
	}
	/**
	 * @return the idSupplier
	 */
	public Long getIdSupplier() {
		return idSupplier;
	}
	/**
	 * @param idSupplier the idSupplier to set
	 */
	public void setIdSupplier(Long idSupplier) {
		this.idSupplier = idSupplier;
	}
	/**
	 * @return the quantity
	 */
	public Long getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	
}
