package com.ssj.test.actions;

import java.util.ArrayList;
import java.util.List;

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
		
		product1.setId(1L);
		product2.setId(2L);
		
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		
		SpotBean spotBean = new SpotBean();
		spotBean.setId(1L);

		spotBean = this.spotService.read(spotBean);
		
		ContentProductSpot contentSpot = new ContentProductSpot();
		//contentSpot.setProducts(list);
		contentSpot.setContentName("home2Offer");
		contentSpot.setSpot(spotBean.getSpot());
		
		
		SpotBean bean = new SpotBean();
		bean.setContentSpot(contentSpot);
		
		this.contentSpotService.create(bean);
	}
	
	/****************** Method test to create spot *******************************/
	/********************************************************************************/
	public void testCreateSpot() throws Exception {
		
		Spot spot = new Spot();
		spot.setSpotName("spot1Offers");
		
		SpotBean bean = new SpotBean();
		bean.setSpot(spot);
		
		this.spotService.create(bean);
	}
}
