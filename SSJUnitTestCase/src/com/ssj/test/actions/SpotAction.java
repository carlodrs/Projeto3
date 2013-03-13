package com.ssj.test.actions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.product.entity.Product;
import com.ssj.persistence.spot.entity.ContentSpot;
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
		
		//SpotBean spotBean = new SpotBean();
		//spotBean.setId(1L);
		//spotBean = this.spotService.read(spotBean);
		
		ContentSpot contentSpot = new ContentSpot();
		//contentSpot.setProducts(list);
		contentSpot.setContentName("content3");
		//contentSpot.setSpot(spotBean.getSpot());
		
		
		SpotBean bean = new SpotBean();
		bean.setContentSpot(contentSpot);
		
		this.contentSpotService.create(bean);
	}
	
	/****************** Method test to create spot *******************************/
	/********************************************************************************/
	public void testCreateSpot() throws Exception {
		
		
		/*
		
		bean.setId(2L);
		bean = this.contentSpotService.load(bean);
		*/
		ContentSpot contentSpotT = new ContentSpot();
		contentSpotT.setId(2L);
		
		ArrayList<ContentSpot> list = new ArrayList<ContentSpot>();
		list.add(contentSpotT);
		
		Spot spot = new Spot();
		spot.setContentSpots(list);
		
		SpotBean bean = new SpotBean();
		bean.setSpot(spot);
		
		this.spotService.create(bean);
	}
	

	/****************** Method test to create spot *******************************/
	/********************************************************************************/
	public void testUpdateSpot() throws Exception {
		
		SpotBean bean = new SpotBean();
		bean.setId(1L);
		bean = this.contentSpotService.load(bean);
		
		ArrayList<ContentSpot> list = new ArrayList<ContentSpot>();
		list.add(bean.getContentSpot());
		
		bean.setId(2L);
		bean = this.spotService.load(bean);
		
		Spot spot = bean.getSpot();
		spot.setContentSpots(list);
		bean.setSpot(spot);
		
		this.spotService.update(bean);
	}
}
