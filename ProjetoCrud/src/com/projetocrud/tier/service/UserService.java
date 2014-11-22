package com.projetocrud.tier.service;

import java.util.List;

import com.projetocrud.tier.dao.UserDAO;
import com.projetocrud.tier.dao.UserDAOImpl;
import com.projetocrud.tier.model.User;

public  class UserService {
	
		private UserDAO userDAO;
		
		public UserService() {
			this.userDAO = new UserDAOImpl();
		}

		/**
		 * Create user
		 * @param user;
		 * @throws Exception 
		 **/
		public void create(User user) throws Exception{
			this.userDAO.create(user);
		}

		/**
		 * Load user
		 * @param user;
		 * @return user;
		 * @throws Exception 
		 **/
		public User load(User user) throws Exception {
			return this.userDAO.load(user);
		}

		/**
		 * Delete user
		 * @param user;
		 * @throws Exception 
		 **/
		public  void delete(User user) throws Exception {
			User userLoad = this.load(user);
			this.userDAO.delete(userLoad);
		}

		/**
		 * Update user
		 * @param user;
		 * @throws Exception 
		 **/
		public  void update(User user) throws Exception {
			this.userDAO.update(user);
		}

		/**
		 * List user
		 * @param user;
		 * @return List of users
		 * @throws Exception 
		 **/
		public  List<User> listAll() throws Exception {
			return this.userDAO.listAll();
		}

}
