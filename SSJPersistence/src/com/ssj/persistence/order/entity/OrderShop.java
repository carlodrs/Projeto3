package com.ssj.persistence.order.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Order
 *
 */
@Entity

public class OrderShop implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	private Double orderNumber;
	private Calendar date;
	private Double orderValue;
	
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
	//@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, targetEntity=OrderItem.class)
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
	private Set<OrderItem> orderItems;
	
	private static final long serialVersionUID = 1L;

	public OrderShop() {
		super();
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

	/**
	 * @return the orderNumber
	 */
	public Double getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(Double orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	

	/**
	 * @return the orderValue
	 */
	public Double getOrderValue() {
		return orderValue;
	}

	/**
	 * @param orderValue the orderValue to set
	 */
	public void setOrderValue(Double orderValue) {
		this.orderValue = orderValue;
	}

	/**
	 * @return the orderItems
	 */
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}   
	
	
}
