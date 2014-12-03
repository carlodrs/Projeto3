package com.tlf.persistence;

import com.tlf.entity.User;

/**
 * Classe dao utilizado para realizaçao de teste
 * @author Carlos 
 * @version 1
 * */
public interface UserDao {

	/** Le o usuario */
	public User load (Integer userId);
	
	
	/** faz login com user/pwd */
	public boolean login (User user);
}
