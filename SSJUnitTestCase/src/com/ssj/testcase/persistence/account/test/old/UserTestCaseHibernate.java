package com.ssj.testcase.persistence.account.test.old;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssj.persistence.account.user.entity.User;
import com.ssj.persistence.util.HibernateUtil;

public class UserTestCaseHibernate {
	
	public static void main(String[] args) {
	
		/*
		Configuration configuration = new  Configuration();
		configuration.addAnnotatedClass(User.class);
		configuration.configure("META-INF/hibernate.cfg.xml");
		new SchemaExport(configuration).create(true,  true);
		*/
		
		/*
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SSJPersistence"); 
		EntityManager manager = entityManagerFactory.createEntityManager();
		*/
		
		//create user
		User usuario = new User();
		//usuario.setId("35");
		usuario.setName("Eduardo 222 Silva");
		Session session = HibernateUtil.getSessionFactory()
								.openSession();
		
		//begin transaction
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(usuario);
			tx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			tx.rollback();
		} finally{
			session.close();	
		}
		
		
	}
}
