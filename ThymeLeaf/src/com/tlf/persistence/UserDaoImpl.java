package com.tlf.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tlf.entity.User;

public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public User load(Integer userId) {
		return entityManager.find(User.class, userId);
	}

	@Override
	public boolean login(User user) {
		
		TypedQuery<User> query = 
			entityManager.createQuery("select o from user o where " +
					"o.email=: email", User.class);
		query.setParameter("number", user.getEmail());
		User result = query.getSingleResult();
		
		return result != null ? true : false;
	}

}
