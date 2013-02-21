/**
 * 
 */
package com.ssj.persistence.security.dao;

import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.persistence.exception.UserAuthNotMachException;
import com.ssj.persistence.generic.dao.SSJGenericDao;

/**
 * 
 * Dao to get the user informations (email and password)
 * @author Carlos Renato Silva
 * @since 2013
 * @version 1.0
 *
 */
public interface LoginDao extends SSJGenericDao<UserEmail> {
	
	/**
	 * Load the user email and password for authentication
	 * @param email
	 * @param password
	 * @return 
	 * @throws UserAuthNotMachException
	 * @see SSJGenericDao, LoginDaoImpl 
	 * */
	public UserEmail checkUser(String email, String password) throws UserAuthNotMachException;
}
