/**
 * 
 */
package com.ssj.persistence.spot.dao;

import java.util.List;

import com.ssj.persistence.generic.dao.SSJGenericDao;
import com.ssj.persistence.spot.entity.Spot;

/**
 * 
 * Dao to get the spot informations
 * @author Carlos Renato Silva
 * @since 2013
 * @version 1.0
 *
 */
public interface SpotDao extends SSJGenericDao<Spot> {
	
	/**
	 * Method to get all the spots of the system
	 * @return Spot List
	 * @throws Exception
	 * */
	public List<Spot> listAllSpots() throws Exception;
		
}
