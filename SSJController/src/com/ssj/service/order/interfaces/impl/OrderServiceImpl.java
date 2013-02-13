/**
 * 
 */
package com.ssj.service.order.interfaces.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.order.dao.OrderDao;
import com.ssj.persistence.order.entity.OrderItem;
import com.ssj.persistence.order.entity.OrderShop;
import com.ssj.service.order.bean.OrderBean;
import com.ssj.service.order.interfaces.OrderService;

/**
 * Implementation from Order Interface
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 *
 */
@Service("OrderServiceImpl")
public class OrderServiceImpl implements OrderService{
	
	
	@Autowired
	private OrderDao orderDao;


	/**		
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(OrderBean bean) throws Exception {
		orderDao.create(bean.getOrder());
	}

	/* (non-Javadoc)
	 * @see com.ssj.service.Service#read(java.io.Serializable)
	 */
	@Override
	public OrderBean read(OrderBean bean) throws Exception {
		OrderShop order = orderDao.read(OrderShop.class, bean.getId());
		bean.setOrder(order);
		return bean;
	}

	/**
	 * @see com.ssj.service.Service#delete(java.io.Serializable)
	 */
	@Override
	public void delete(OrderBean bean) throws Exception {
		orderDao.delete(bean.getOrder());
	}

	/**
	 * @see com.ssj.service.Service#update(java.io.Serializable)
	 */
	@Override
	public void update(OrderBean bean) throws Exception {
		orderDao.update(bean.getOrder());

	}

	@Override
	public OrderBean load(OrderBean t) throws Exception {
		
		OrderShop orderShop = orderDao.load(
				OrderShop.class, t.getId());
		t.setOrder(orderShop);
		
		return t;
	}

	/**
	 * @see com.ssj.service.order.interfaces.OrderService#deleteOrderItem(java.io.Serializable)
	 */
	@Override
	public void deleteOrderItem(OrderBean orderBean) throws Exception {
		for (OrderItem orderItem : orderBean.getOrderItem()) {
			this.orderDao.deleteOrderItem(orderItem);
		}
	}
}
