package com.projetocrud.tier.dao;

import java.util.List;

import com.projetocrud.tier.model.User;

public interface UserDAO {

	/**
	 * Create user
	 * @param user;
	 * @throws Exception 
	 **/
	public abstract void create(User user) throws Exception;

	/**
	 * Load user
	 * @param user
	 * @return user
	 * @throws Exception 
	 **/
	public abstract User load(User user) throws Exception;
	
	/**
	 * Load user
	 * @param user
	 * @param orClausule
	 * @return user
	 * @throws Exception 
	 **/
	public User load (User  user, boolean orClausule) throws Exception;

	/**
	 * Delete user
	 * @param user;
	 **/
	public abstract void delete(User user)  throws Exception;

	/**
	 * Update user
	 * @param user;
	 **/
	public abstract void update(User user)  throws Exception;

	/**
	 * List user
	 * @param user;
	 * @return List of users
	 **/
	public abstract List<User> listAll()  throws Exception;

}