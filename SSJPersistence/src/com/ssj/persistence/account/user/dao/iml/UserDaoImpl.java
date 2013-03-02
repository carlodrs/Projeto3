/**
 * 
 */
package com.ssj.persistence.account.user.dao.iml;

import java.util.List;

import javassist.NotFoundException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

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

	@Override
	public List<User> listAll() throws Exception{
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		criteriaQuery.from(User.class);
		TypedQuery<User> typedQuery = getEntityManager().createQuery(criteriaQuery);
		
		try {
			List<User> userList = typedQuery.getResultList();
			return userList;
		} catch (Exception e) {
			throw new NotFoundException("No users found : " + e.getMessage());
		}
	}

}
