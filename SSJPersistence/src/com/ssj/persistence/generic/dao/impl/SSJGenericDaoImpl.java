package com.ssj.persistence.generic.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.ssj.persistence.generic.dao.SSJGenericDao;

/**
 * 
 * Class for utility CRUD operations to the persistent object
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2012
 * @copyright  Shopping São João 
 * */
@Component("SSJGenericDaoImpl")
public abstract class SSJGenericDaoImpl <T extends Serializable> implements SSJGenericDao  <T>{
	
	/* The entity manager for SSJ */	
	@PersistenceContext
	private EntityManager entityManager;

	public SSJGenericDaoImpl(){
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

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
	