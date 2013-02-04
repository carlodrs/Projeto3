package com.ssj.service;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * Service to create the Generic Entities on the system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Transactional
public interface Service <T extends Serializable>{
	
	/**
	 * Service method to create the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	
	public abstract void create (T t) throws Exception;

	/**
	 * Service method to read the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	
	public abstract T read (T t) throws Exception;

	
	/**
	 * Service method to delete the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	
	public abstract void delete (T t) throws Exception;

	
	
	/**
	 * Service method to update the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	
	public abstract void update (T t) throws Exception;
	

	/**
	 * Service method to load by id (recharged the properties of the object from database entity)
	 * @param t Entity Database mapped class
	 * @return T entity populated
	 * @throws Exception
	 * */
	public abstract T load (T t) throws Exception;
}
