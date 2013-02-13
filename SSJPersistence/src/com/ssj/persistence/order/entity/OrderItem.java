package com.ssj.persistence.order.entity;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.ssj.persistence.product.entity.Product;

/**
 * Entity implementation class for Entity: OrderItem
 *
 */
@Entity

public class OrderItem implements Serializable, Comparable<OrderItem> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	
	@OneToOne
	private Product product;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@NotNull
	private OrderShop order;
	
	private static final long serialVersionUID = 1L;

	public OrderItem() {
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
	 * @return the produt
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param produt the produt to set
	 */
	public void setProduct(Product product) {
		this.product = product;
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

	@Override
	public int compareTo(OrderItem o) {
		final int EQUAL = 0;
		final int NOT_EQUAL = 1;
		
		if (this.getId().equals(o.getId()) /*&&
			this.getOrder().getId().equals(o.getOrder().getId()) &&
			this.getProdut().getId().equals(o.getProdut().getId())*/
				){
			
			return EQUAL;
		}
		
		return NOT_EQUAL;
	}   

	@Override
	public boolean equals(Object obj) {
		
		 if ( this == obj ) return true;
		 
	     if ( !(obj instanceof OrderItem) ) return false;
	     
	     int result = this.compareTo((OrderItem) obj);
	     
	     return (result==0? true : false);
	}
	
	@Override
	public int hashCode() {
		if(this.getId() == null)
			return super.hashCode();
		else
			return this.getId().intValue();
	}
}
