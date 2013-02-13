package com.ssj.test.actions;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.order.entity.OrderItem;
import com.ssj.persistence.order.entity.OrderShop;
import com.ssj.persistence.product.entity.Product;
import com.ssj.service.order.bean.OrderBean;
import com.ssj.service.order.interfaces.OrderService;

@Component("OrderAction")
public class OrderAction {
	
	@Autowired
	private OrderService orderService;
	public void testCreateOrder() {
		
		Product product1 = new Product();
		product1.setId(2L);
		
		OrderItem orderItem = new OrderItem();
		orderItem.setProduct(product1);
		
		Product product2 = new Product();
		product2.setId(4L);
		
		OrderItem orderItem2 = new OrderItem();
		orderItem2.setProduct(product2);
		
		OrderShop order = new OrderShop();
		orderItem.setOrder(order);
		orderItem2.setOrder(order);
		
		Set<OrderItem> ordersItems = new HashSet<OrderItem>();
		ordersItems.add(orderItem);
		ordersItems.add(orderItem2);
		
		order.setOrderItems(ordersItems);
		
		OrderBean orderBean = new OrderBean();
		orderBean.setOrder(order);
	
		try {
			this.orderService.create(orderBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public void testRemoveItems() {
		
		OrderShop orderShop = new  OrderShop();
		orderShop.setId(3L);
	
		OrderItem orderItem = new OrderItem();
		orderItem.setId(6L);
		
		Set<OrderItem> items = new HashSet<OrderItem>();
		items.add(orderItem);
		
		OrderBean orderBean = new OrderBean();
		orderBean.setOrder(orderShop);
		orderBean.setOrderItem(items);
		
		try {
			orderService.deleteOrderItem(orderBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
