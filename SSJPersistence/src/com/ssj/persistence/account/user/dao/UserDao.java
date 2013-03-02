/**
 * 
 */
package com.ssj.persistence.account.user.dao;

import java.util.List;

import com.ssj.persistence.account.user.entity.User;
import com.ssj.persistence.generic.dao.SSJGenericDao;

/**
 * Interface to handle Users
 * @author Carlos Renato Silva
 * @since 2013
 * @version 1.0
 * 
 * Shopping São João
 * 
 **/
public interface UserDao extends SSJGenericDao<User> {

	/**
	 * Method to get all the registered users
	 * @return List list users
	 * @throws Exception;
	 * */
	public List<User> listAll() throws Exception;

}
