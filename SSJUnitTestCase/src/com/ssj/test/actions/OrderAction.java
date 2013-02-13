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
		
		OrderShop order = new OrderShop();
		
		Product product1 = new Product();
		product1.setId(1L);
		
		Product product4 = new Product();
		product4.setId(4L);
		
		
		OrderItem item1  = new OrderItem();
		item1.setOrder(order);
		item1.setProduct(product1);
		
		OrderItem item4  = new OrderItem();
		item4.setOrder(order);
		item4.setProduct(product4);
		
		Set<OrderItem> orderItems = new HashSet<OrderItem>();
		orderItems.add(item1);
		orderItems.add(item4);
		
		//configure an order
		order.setOrderItems(orderItems);
		
		OrderBean orderBean = new OrderBean();
		orderBean.setOrder(order);
		
		try {
			this.orderService.create(orderBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public void testCreateOrderItems() {
		
		OrderShop orderShop = new OrderShop();
		
		Product product1 = new Product();
		product1.setId(1L);
		
		OrderItem orderItem = new OrderItem();
		orderItem.setProduct(product1);
		orderItem.setOrder(orderShop);
		
		Product product2 = new Product();
		product2.setId(4L);
		
		OrderItem orderItem2 = new OrderItem();
		orderItem2.setProduct(product2);
		orderItem2.setOrder(orderShop);
		
		Set<OrderItem> ordersItems = new HashSet<OrderItem>();
		ordersItems.add(orderItem);
		ordersItems.add(orderItem2);
		
		//order.setOrderItems(ordersItems);
		
		OrderBean orderBean = new OrderBean();
		orderBean.setOrderItem(ordersItems);
	
		try {
			this.orderService.createOrderItems(orderBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public void testRemoveItems() throws Exception {
		
		OrderBean bean = new OrderBean();
		bean.setId(4L);
		
		bean = this.orderService.load(bean);
		
		
		OrderShop orderShop = new OrderShop();
		orderShop.setId(bean.getOrder().getId());
		
		OrderItem orderItem = new OrderItem();
		orderItem.setId(7L);
		orderItem.setOrder(orderShop);
		
		OrderItem orderItem4 = new OrderItem();
		orderItem4.setId(8L);
		orderItem4.setOrder(orderShop);
		
		Set<OrderItem> items = new HashSet<OrderItem>();
		//items.add(orderItem);
		items.add(orderItem4);
		
		OrderBean orderBean = new OrderBean();
		orderBean.setOrder(bean.getOrder());
		orderBean.setOrderItem(items);
		
		try {
			orderService.deleteOrderItem(orderBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
