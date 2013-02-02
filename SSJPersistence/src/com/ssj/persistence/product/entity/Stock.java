package com.ssj.persistence.product.entity;

import java.io.Serializable;
import java.lang.Long;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: StockDao
 *
 */
@Entity

public class Stock implements Serializable {

	@Id
	private Long id;
	
	@OneToOne()
	private Product product;
	private Long quantityPosition;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<StockHistory> stockHistories;
	private static final long serialVersionUID = 1L;

	public Stock() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}   
	public Long getQuantityPosition() {
		return this.quantityPosition;
	}

	public void setQuantityPosition(Long quantityPosition) {
		this.quantityPosition = quantityPosition;
	}   
	public List<StockHistory> getStockHistories() {
		return this.stockHistories;
	}

	public void setIdStockHistory(List<StockHistory> stockHistories) {
		this.stockHistories = stockHistories;
	}
}
