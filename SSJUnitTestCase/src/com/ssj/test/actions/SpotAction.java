package com.ssj.test.actions;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.product.entity.Product;
import com.ssj.persistence.spot.entity.ContentProductSpot;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.ContentSpotService;
import com.ssj.service.spot.interfaces.SpotService;

@Component("SpotAction")
public class SpotAction {

	@Autowired
	private SpotService spotService;
	
	@Autowired
	private ContentSpotService  contentSpotService;
	

	/****************** Method test to create content  spot *******************************/
	/********************************************************************************/
	public void testCreateContentSpot() throws Exception {
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		product1.setId(1L);
		product2.setId(2L);
		product3.setId(3L);
		
		Set<Product> set = new HashSet<Product>();
		set.add(product1);
		set.add(product2);
		set.add(product3);
		
		SpotBean spotBean = new SpotBean();
		spotBean.setId(2L);

		spotBean = this.spotService.read(spotBean);
		
		ContentProductSpot contentSpot = new ContentProductSpot();
		contentSpot.setProducts(set);
		contentSpot.setContentName("home2Offer");
		contentSpot.setSpot(spotBean.getSpot());
		
		
		SpotBean bean = new SpotBean();
		bean.setContentSpot(contentSpot);
		
		this.contentSpotService.update(bean);
	}
	
	/****************** Method test to create spot *******************************/
	/********************************************************************************/
	public void testCreateSpot() throws Exception {
		
		Spot spot = new Spot();
		spot.setSpotName("spot2Offers");
		
		SpotBean bean = new SpotBean();
		bean.setSpot(spot);
		
		this.spotService.create(bean);
	}
}
