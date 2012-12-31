package com.ssj.persistence.util;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.logging.Level;

import com.ssj.persistence.account.User;


/**
 * 
 * Class to provider the session factory
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2012
 * @copyright  Shopping São João 
 * */
public class HibernateUtil {

	/** Session Factory to the singleton pattern */
	private static SessionFactory sessionFactory;
	
	/** Logger for HibernateUtil */
	private static Logger logger = Logger.getLogger(HibernateUtil.class.getName());
	private static String idStringLog =  " *** SSJErrorLog-HibernateUtil ***  ";
	
	static {
		try {
		
			/* Configurations and return of sessionFactory */
			Configuration configuration = new  Configuration();
			configuration.addAnnotatedClass(User.class);
			
			/* Load the file hibernate configuration */
			configuration.configure("META-INF/hibernate.cfg.xml");
			
			/* ServiceRegistry to get the session factory - version hibernate 4*/
			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
								applySettings(configuration.getProperties()).buildServiceRegistry();        
		    
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		} catch (Throwable ex) {
			
			/* Log error*/
			logger.log(Level.WARNING, idStringLog +  ex.getMessage(), ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	/**
	 * 
	 * Get the session factory
	 * @param void
	 * @return the static SessionFactory
	 * 	 * */
	public static SessionFactory getSessionFactory() {
		// Alternatively, you could look up in JNDI here
		return sessionFactory;
		
	}
	
	/**
	 * Close the session factory
	 */
	public static void close() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}

