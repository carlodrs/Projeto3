/**
 * 
 */
package com.ssj.service.spot.interfaces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.persistence.spot.dao.SpotDao;
import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.spot.bean.SpotBean;
import com.ssj.service.spot.interfaces.SpotService;

/**
 * Implementation spot service
 * @author Carlos Silva
 * @see SpotService
 * @version 1.0
 * @since 2013
 * 
 */
@Service("SpotServiceImpl")
public class SpotServiceImpl implements SpotService {

	@Autowired
	private SpotDao spotDao;
	
	/** 
	 * @see com.ssj.service.Service#create(java.io.Serializable)
	 */
	@Override
	public void create(SpotBean bean) throws Exception {
		this.spotDao.create(bean.getSpot());
	}

	/**
	 * @see com.ssj.service.Service#read(java.io.Serializable)
	 */
	@Override
	public SpotBean read(SpotBean bean) throws Exception {
		
		bean.setSpot(
				this.spotDao.read(Spot.class, bean.getId()));
		
		return bean;
	}

	/**
	 * @see com.ssj.service.Service#delete(java.io.Serializable)
	 */
	@Override
	public void delete(SpotBean bean) throws Exception {
		this.spotDao.delete(bean.getSpot());
	}

	/**
	 * @see com.ssj.service.Service#update(java.io.Serializable)
	 */
	@Override
	public void update(SpotBean bean) throws Exception {
		this.spotDao.update(bean.getSpot());
	}


	@Override
	public SpotBean load(SpotBean t) throws Exception {
		Spot Spot = this.spotDao.load(Spot.class, t.getId());
		t.setSpot(Spot);
		
		return t;
	}

	

	/**
	 * @see com.ssj.service.spot.interfaces.SpotService#listAll()
	 */
	@Override
	public List<Spot> listAll() throws Exception {
		return this.spotDao.listAllSpots();
	}
}
