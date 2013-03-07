/**
 * 
 */
package com.ssj.service.spot.interfaces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.spot.dao.ContentSpotDao;
import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.ContentSpotService;
import com.ssj.service.spot.interfaces.SpotService;

/**
 * Implementation spot service
 * @author Carlos Silva
 * @see SpotService
 * @version 1.0
 * @since 2013
 * 
 */
@Service("ContentSpotServiceImpl")
public class ContentSpotServiceImpl implements ContentSpotService {

	@Autowired
	private ContentSpotDao contentSpotDao;
	
	/** 
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(SpotBean bean) throws Exception {
		this.contentSpotDao.create(bean.getContentSpot());
	}

	/**
	 * @see com.ssj.service.Service#read(java.io.Serializable)
	 */
	@Override
	public SpotBean read(SpotBean bean) throws Exception {
		
		bean.setContentSpot(
				this.contentSpotDao.read(ContentSpot.class, bean.getId()));
		
		return bean;
	}

	/**
	 * @see com.ssj.service.Service#delete(java.io.Serializable)
	 */
	@Override
	public void delete(SpotBean bean) throws Exception {
		this.contentSpotDao.delete(bean.getContentSpot());
	}

	/**
	 * @see com.ssj.service.Service#update(java.io.Serializable)
	 */
	@Override
	public void update(SpotBean bean) throws Exception {
		this.contentSpotDao.update(bean.getContentSpot());
	}


	@Override
	public SpotBean load(SpotBean t) throws Exception {
		ContentSpot contentSpot = this.contentSpotDao.load(ContentSpot.class, t.getId());
		t.setContentSpot(contentSpot);
		
		return t;
	}

	

	/**
	 * @see com.ssj.service.spot.interfaces.SpotService#listAll()
	 */
	@Override
	public List<ContentSpot> listAll() throws Exception {
		return this.contentSpotDao.listAllContentSpots();
	}
}
