package com.ssj.service;

import java.io.Serializable;

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
public interface Service {
	
	/**
	 * Service method to create the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	public abstract void create (Serializable bean) throws Exception;

	/**
	 * Service method to read the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	public abstract void read (Serializable bean) throws Exception;

	
	/**
	 * Service method to delete the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	public abstract void delete (Serializable bean) throws Exception;

	
	
	/**
	 * Service method to update the entities on the system
	 * @param bean
	 * @return abstract void
	 * @throws Exception
	 * */
	public abstract void update (Serializable bean) throws Exception;
}
