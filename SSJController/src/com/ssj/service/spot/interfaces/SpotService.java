package com.ssj.service.spot.interfaces;

import java.util.List;

import com.ssj.persistence.spot.entity.Spot;
import com.ssj.service.Service;
import com.ssj.service.spot.bean.SpotBean;


/**
 * 
 * Service to handle the spots work services on the sistem
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * */
public interface SpotService extends Service<SpotBean>{
	
	/**
	 * 
	 * List all the spots
	 * @return List
	 * @throws Exception
	 * */
	public List<Spot> listAll() throws Exception;

	/**
	 * List spot by its name
	 * @param name
	 * @return Spot
	 * 
	 * */
	public Spot listByName(String name)throws Exception;
}
