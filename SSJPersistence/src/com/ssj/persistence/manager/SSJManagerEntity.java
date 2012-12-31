package com.ssj.persistence.manager;

import javax.persistence.EntityManager;

import com.ssj.persistence.util.JPAUtil;

/**
 * 
 * Class for utility CRUD operations to the persistent object
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2012
 * @copyright  Shopping São João 
 * */
public class SSJManagerEntity <T> {
	
	/* The entity manager for SSJ */
	private EntityManager entityManager;

	public SSJManagerEntity(){
	
		/* Recover the entity manager for the */
		this.entityManager = JPAUtil.getEntityManager();
	}
	
	/**
	 * 
	 * Insert the object persistent from database
	 * @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	public void create(T t) throws Exception{
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(t);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			if ( entityManager.getTransaction().isActive()){
				entityManager.getTransaction().rollback();
			}
			throw e;
		}
	}


	/**
	 * 
	 * Update the object persistent from database
	 * @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	public void update(T t) throws Exception{
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(t);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			if ( entityManager.getTransaction().isActive()){
				entityManager.getTransaction().rollback();
			}
			throw e;
		}
	}


	/**
	 * 
	 * Delete the object persistent from database
	 @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	public void delete(T t) throws Exception{
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(entityManager.merge(t));
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			if ( entityManager.getTransaction().isActive()){
				entityManager.getTransaction().rollback();
			}
			throw e;
		}
	}
	

	/**
	 * 
	 * Read/get the object persistent from database
	  @param T object persistent
	 * @return T
	 * @throws Exception Problems in the method
	 * */
	@SuppressWarnings("unchecked")
	public T read(T t, Object o) throws Exception{
		try {
			return (T) entityManager.find(t.getClass(), o);
			
		} catch (Exception e) {
			throw e;
		}
	}


	/**
	 * 
	 * Finalize operations of the entity manager (close it)
	 * @param no parameters
	 * @return void
	 * */
	public void end() {
		entityManager.close();
	}
}
	