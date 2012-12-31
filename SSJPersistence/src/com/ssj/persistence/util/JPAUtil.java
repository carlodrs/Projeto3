package com.ssj.persistence.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * 
 * Class to provider the EntityManeger
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2012
 * @copyright  Shopping São João 
 * */
public class JPAUtil {

	/** EntityManager to the singleton pattern */
	private static EntityManager entityManager;
	
	/** Logger for HibernateUtil */
	private static Logger logger = Logger.getLogger(HibernateUtil.class.getName());

	static {
		try {
			if (entityManager == null){
				
				/* Check the object synchronization */
				synchronized(JPAUtil.class){
					
					/* test again */
					if (entityManager == null){
								// Start EntityManagerFactory
							EntityManagerFactory emf =
										Persistence.createEntityManagerFactory("SSJPersistence");
							
							//Get the entity manager
							entityManager = emf.createEntityManager();
					}
				}
			}
		}catch (Throwable ex) {
			
			/* Log error*/
			logger.log(Level.WARNING, EntityManager.class.getCanonicalName() +  ex.getMessage(), ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	/**
	 * 
	 * Get the Entity Manager
	 * @param void
	 * @return the static EntityManager
	 * 	 * */
	public static EntityManager getEntityManager() {
		// Alternatively, you could look up in JNDI here
		return entityManager;
		
	}
	
	/**
	 * Close the EntityManager
	 */
	public static void close() {
		// Close caches and connection pools
		getEntityManager().close();
	}
}
	
