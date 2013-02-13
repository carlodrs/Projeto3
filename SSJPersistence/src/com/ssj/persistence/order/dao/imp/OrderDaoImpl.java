/**
 * 
 */
package com.ssj.persistence.order.dao.imp;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.order.dao.OrderDao;
import com.ssj.persistence.order.entity.OrderItem;
import com.ssj.persistence.order.entity.OrderShop;

/**
 * Implementation code of order dao
 * @author Carlos Silva
 * @see OrderDao interface
 */
@Repository("OrderDaoImpl")
public class OrderDaoImpl 
	extends SSJGenericDaoImpl<OrderShop>  implements OrderDao {

	@Override
	public void deleteOrderItem(OrderItem orderItem) throws Exception {
		orderItem = getEntityManager().getReference(OrderItem.class, orderItem.getId());
		getEntityManager().remove(orderItem);
	}
}
