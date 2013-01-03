package com.ssj.persistence.generic.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 
 * Interface for utility CRUD operations to the persistent object
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2012
 * @copyright  Shopping São João 
 * */
@Component("SSJGenericDao")
public interface SSJGenericDao < T extends Serializable > {
	
	/**
	 * 
	 * Insert the object persistent from database
	 * @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	public void create(T t) throws Exception;

	/**
	 * 
	 * Update the object persistent from database
	 * @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	public void update(T t) throws Exception;

	/**
	 * 
	 * Delete the object persistent from database
	 @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	public void delete(T t) throws Exception;
	
	/**
	 * 
	 * Read/get the object persistent from database
	  @param T object persistent
	 * @return T
	 * @throws Exception Problems in the method
	 * */
	
	public T read(T t, Object o) throws Exception;

	/**
	 * 
	 * Finalize operations of the entity manager (close it)
	 * @param no parameters
	 * @return void
	 * */
	public void end();
	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager();
}