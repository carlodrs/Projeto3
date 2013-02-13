/**
 * 
 */
package com.ssj.persistence.order.dao;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.order.entity.OrderItem;
import com.ssj.persistence.order.entity.OrderShop;

/**
 * Order dao to create the orders on database
 * @author Carlos Silva 
 * @version 1.0
 * @since 2013
 *
 */
public interface OrderDao extends SSJGenericDao<OrderShop> {
	
	/**
	 * Method to delete order items
	 * @param orderItem ordes items to delete
	 * @throws Exception
	 * */
	public void deleteOrderItem(OrderItem orderItem) throws Exception;

	/**
	 * Method to create order items
	 * @param orderItem ordes items to create
	 * @throws Exception
	 * */
	public void createOrderItems(OrderItem orderItem) throws Exception;

}
