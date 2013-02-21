package com.ssj.persistence.generic.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	 * 
	 * Load/get the object persistent from database (recharged the entity properties)
	  @param T object persistent
	 * @return T
	 * @throws Exception Problems in the method
	 * */
	
	public T load(Class<T> className, Object o) throws Exception;

}