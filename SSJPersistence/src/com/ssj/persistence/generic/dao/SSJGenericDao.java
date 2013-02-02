package com.ssj.persistence.generic.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssj.persistence.account.user.entity.User;

/**
 * 
 * Interface for utility CRUD operations to the persistent object
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2012
 * @copyright  Shopping São João 
 * */
@Repository
public interface SSJGenericDao < T extends Serializable > {
	
	/**
	 * 
	 * Insert the object persistent from database
	 * @param T object persistent
	 * @return void
	 * @throws Exception Problems in the method
	 * */
	@Transactional
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
	
	public T read(Class<T> className, Object o) throws Exception;

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