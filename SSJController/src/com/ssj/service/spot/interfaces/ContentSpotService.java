package com.ssj.service.spot.interfaces;

import java.util.List;

import com.ssj.persistence.spot.entity.ContentSpot;
import com.ssj.service.Service;
import com.ssj.service.spot.bean.SpotBean;


/**
 * 
 * Service to handle the content spots work services on the sistem
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * */
public interface ContentSpotService extends Service<SpotBean>{
	
	/**
	 * 
	 * List all the spots
	 * @return List
	 * @throws Exception
	 * */
	public List<ContentSpot> listAll() throws Exception;
}
