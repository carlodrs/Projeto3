package com.projetocrud.tier.dao.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/** 
 * Class to recover persistence EntityManagerFactory
 * @author Carlos  
 * */
public class PersistenceManagerFactory {
	
	private static PersistenceManagerFactory factory = null;
	
	public static synchronized PersistenceManagerFactory getInstance(){

		if (factory == null){
			factory = new PersistenceManagerFactory();
			
			System.out.println("nome da fabrica = " + factory.toString());
		}
		
		return factory;
	}
	
	private static EntityManagerFactory getEntitityManagerFactory(String persistenceUnitName){
		return Persistence.createEntityManagerFactory(persistenceUnitName);
	}

	public EntityManager createEntityManager () {
	
		EntityManagerFactory entityManagerFactory = PersistenceManagerFactory.getEntitityManagerFactory("projetoCrud");
		return entityManagerFactory.createEntityManager();
	}
}

