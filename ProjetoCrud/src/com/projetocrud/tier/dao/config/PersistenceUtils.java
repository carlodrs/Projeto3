package com.projetocrud.tier.dao.config;

import javax.persistence.EntityManager;

public class PersistenceUtils {

	public static EntityManager getEntityManager(){
		PersistenceManagerFactory factory = PersistenceManagerFactory.getInstance();
		return factory.createEntityManager();
	}
}
