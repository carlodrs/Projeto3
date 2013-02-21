/**
 * 
 */
package com.ssj.persistence.security.dao.impl;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;

import org.springframework.stereotype.Repository;

import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.persistence.exception.UserAuthNotMachException;
import com.ssj.persistence.generic.dao.impl.SSJGenericDaoImpl;
import com.ssj.persistence.security.dao.LoginDao;

/**
 * @see LoginDao
 * @author Carlos
 * @version 1.0
 */
@Repository("LoginDaoImpl")
public class LoginDaoImpl extends SSJGenericDaoImpl<UserEmail> implements LoginDao {

	@Override
	public UserEmail checkUser(String email, String password) throws UserAuthNotMachException{
		
		CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<UserEmail> criteriaQuery = criteriaBuilder.createQuery(UserEmail.class);
		EntityType<UserEmail> type = getEntityManager().getMetamodel().entity(UserEmail.class);
		
		Root<UserEmail> root = criteriaQuery.from(UserEmail.class);
		
			criteriaQuery.where(
					criteriaBuilder.and(
							//email	
							criteriaBuilder.equal(root.get(type.getDeclaredSingularAttribute("email", String.class)), 
									criteriaBuilder.parameter(String.class, "email")),
							//password		
							criteriaBuilder.equal(root.get(type.getDeclaredSingularAttribute("password", String.class)), 
									criteriaBuilder.parameter(String.class, "password"))));
		
		TypedQuery<UserEmail> typedQuery = getEntityManager().createQuery(criteriaQuery);
		typedQuery.setParameter("email", email);
		typedQuery.setParameter("password", password);
		
		try {
			UserEmail userEmail = typedQuery.getSingleResult();
			return userEmail;
		} catch (Exception e) {
			throw new UserAuthNotMachException("User Email not found " +
					"for auth: " + e.getMessage());
		}
    }
}
