package com.ssj.persistence.generic.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
			entityManager.persist(t);
		} catch (Exception e) {
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
			entityManager.merge(t);
			entityManager.flush();
		} catch (Exception e) {
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
			entityManager.remove(entityManager.merge(t));
			
		} catch (Exception e) {
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
	public T read(Class<T> className, Object o) throws Exception{
		try {
			return (T) entityManager.getReference(className, o);
			
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
	 * 
	 * Load/get the object persistent from database (recharged the entity properties)
	  @param T object persistent
	 * @return T
	 * @throws Exception Problems in the method
	 * */
	
	public T load(Class<T> className, Object o) throws Exception {
		try {
			return (T) entityManager.find(className, o);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
	