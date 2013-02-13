/**
 * 
 */
package com.ssj.service.order.bean;

import java.io.Serializable;
import java.util.Set;

import org.springframework.core.annotation.Order;

import com.ssj.persistence.order.entity.OrderItem;
import com.ssj.persistence.order.entity.OrderShop;

/**
 * 
 * Contains order bean serialization object
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * @see Order 
 *
 */
public class OrderBean implements Serializable {

	/**
	 *  Serial version
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private OrderShop order;
	private Set<OrderItem> orderItem;
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
	 * @return the order
	 */
	public OrderShop getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(OrderShop order) {
		this.order = order;
	}
	/**
	 * @return the orderItem
	 */
	public Set<OrderItem> getOrderItem() {
		return orderItem;
	}
	/**
	 * @param orderItem the orderItem to set
	 */
	public void setOrderItem(Set<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	
	
}
