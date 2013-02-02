package com.ssj.persistence.product.entity;

import java.io.Serializable;
import java.lang.Long;
import java.util.Calendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: StockHistory
 *
 */
@Entity

public class StockHistory implements Serializable {

	@Id
	private Long idStockHistory;
	private Calendar registryDate;
	private Long idSupplier;
	private Long quantity;
	
	@OneToOne
	private Stock stock;
	private static final long serialVersionUID = 1L;

	public StockHistory() {
		super();
	}   
	public Long getIdStockHistory() {
		return this.idStockHistory;
	}

	public void setIdStockHistory(Long idStockHistory) {
		this.idStockHistory = idStockHistory;
	}   
	public Calendar getRegistryDate() {
		return this.registryDate;
	}

	public void setRegistryDate(Calendar registryDate) {
		this.registryDate = registryDate;
	}   
	public Long getIdSupplier() {
		return this.idSupplier;
	}

	public void setIdSupplier(Long idSupplier) {
		this.idSupplier = idSupplier;
	}   
	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
   
}
