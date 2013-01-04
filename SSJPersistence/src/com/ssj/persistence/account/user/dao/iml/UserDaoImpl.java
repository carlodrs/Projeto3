/**
 * 
 */
package com.ssj.persistence.account.user.dao.iml;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ssj.persistence.account.user.dao.UserDao;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;

/**
 * 
 * User data access object implementation of User entity
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 * 
 * Shopping São João
 */
@Repository
@Qualifier("UserDaoImpl")
public class UserDaoImpl extends SSJGenericDaoImpl<User> implements UserDao {
}
