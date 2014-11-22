package com.projetocrud.tier.dao;

import java.util.List;

import javassist.NotFoundException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import com.projetocrud.tier.dao.config.PersistenceUtils;
import com.projetocrud.tier.model.User;

/**
 * 
 * Simples BO para cadastro das entities
 * @author Carlos Renato
 * @version 1.0
 * */
public class UserDAOImpl implements UserDAO {
	
	private EntityManager entityManager;
	
	public UserDAOImpl() {
		this.entityManager = PersistenceUtils.getEntityManager();
	}

	/* (non-Javadoc)
	 * @see com.projetocrud.tier.dao.UserDAO#create(com.projetocrud.tier.model.User)
	 */
	@Override
	public void create (User user) throws Exception{
		
		EntityTransaction transaction = this.entityManager.getTransaction();
		
		try {
			transaction.begin();
			entityManager.persist(user);
			transaction.commit();
				
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive())
				transaction.rollback();
			
			throw e;
		}
		
	}
	
	@Override
	public User load (User  user) throws Exception {
		return this.load(user, false);
	}
	
	/* (non-Javadoc)
	 * @see com.projetocrud.tier.dao.UserDAO#load(java.lang.Long)
	 */
	@Override
	public User load (User  user, boolean orClausule) throws Exception {
		//return entityManager.find(User.class, userId);
		
		CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		
		Expression<String> expression1 = root.get("name");
		Expression<String> expression2 = criteriaBuilder.parameter(String.class, "name");
		
		if (orClausule){
			
			criteriaQuery.where(
					criteriaBuilder.or(
						criteriaBuilder.equal(root.get("id"), user.getId()),
						criteriaBuilder.like(expression1, expression2)
					)
				);
				
		}else
			criteriaQuery.where(
				criteriaBuilder.and(
					criteriaBuilder.equal(root.get("id"), user.getId()),
					criteriaBuilder.like(expression1, expression2)
				)
			);
		
		criteriaQuery.orderBy(criteriaBuilder.asc(root.get("name")));
	
		TypedQuery<User> typedQuery = this.entityManager.createQuery(criteriaQuery);
		typedQuery.setParameter("name", user.getName());
		
		try {
			return typedQuery.getSingleResult();
		} catch (Exception e) {
			throw new NotFoundException("Erro na busca de um usuário : " + e.getMessage());
		}
	}
	
	
	/* (non-Javadoc)
	 * @see com.projetocrud.tier.dao.UserDAO#delete(com.projetocrud.tier.model.User)
	 */
	@Override
	public void delete (User user)  throws Exception {
		
		EntityTransaction transaction = this.entityManager.getTransaction();
		
		try {
			transaction.begin();
			entityManager.remove(user);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive())
				transaction.rollback();
			
			throw e;
		}
	
	}

	/* (non-Javadoc)
	 * @see com.projetocrud.tier.dao.UserDAO#update(com.projetocrud.tier.model.User)
	 */
	@Override
	public void update (User user)  throws Exception{

		EntityTransaction transaction = this.entityManager.getTransaction();
		
		try {
			transaction.begin();
			entityManager.merge(user);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive())
				transaction.rollback();
			
			throw e;
		}
		
	}

	
	/* (non-Javadoc)
	 * @see com.projetocrud.tier.dao.UserDAO#listAll()
	 */
	@Override
	public List<User> listAll() throws Exception {
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> rootQuery= criteriaQuery.from(User.class);
		criteriaQuery.select(rootQuery);
		
		TypedQuery<User> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}
}
