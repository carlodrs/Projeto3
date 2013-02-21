package com.ssj.service.order.interfaces;

/**
 * Service Product to be handle the order on the System
 * @author Carlos Silva
 * @version 1.0
 * @see Service
 * @since 2013 
 * */

import com.ssj.service.Service;
import com.ssj.service.order.bean.OrderBean;

public interface OrderService extends Service <OrderBean>{
	
	/**
	 *  Method to remove order items of the sistems
	 *  @param orderBean order bean with the order and his order items configured from property
	 *  @return void
	 *  @throws Exception
	 **/
	public void deleteOrderItem(OrderBean orderBean) throws Exception;
	
	/**
	 *  Method to create order items of the sistems
	 *  @param orderBean order bean with the order and his order items configured from property
	 *  @return void
	 *  @throws Exception
	 **/
	public void createOrderItems(OrderBean orderBean) throws Exception;
}
