/**
 * 
 */
package com.ssj.persistence.spot.dao;

import java.util.List;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.spot.entity.ContentSpot;

/**
 * 
 * Dao to get the content spot informations
 * @author Carlos Renato Silva
 * @since 2013
 * @version 1.0
 *
 */
public interface ContentSpotDao extends SSJGenericDao<ContentSpot> {
	
	
	/**
	 * Method to get all the content spots of the system
	 * @return Spot List
	 * @throws Exception
	 * */
	public List<ContentSpot> listAllContentSpots() throws Exception;
	
}
