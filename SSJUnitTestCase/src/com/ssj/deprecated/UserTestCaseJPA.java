package com.ssj.deprecated;


import java.util.ArrayList;

import com.ssj.persistence.account.user.entity.User;
import com.ssj.persistence.manager.SSJManagerEntity;

public class UserTestCaseJPA {
	
	public static void main(String[] args) {
		
		ArrayList<User> listUser  = new ArrayList<User>();
		User user;
		for (int i = 1; i <= 100; i++) {
			user = new User();
		//	user.setId(String.valueOf(i));
			user.setName("renato" + i);
			
			listUser.add(user);
		}
		// Start EntityManagerFactory
		SSJManagerEntity<User> managerEntity = new SSJManagerEntity<User>();
		try {
			for (User iterateUsers : listUser) {
				System.out.println("Nome Recupedado : " +  
						managerEntity.read(iterateUsers, iterateUsers.getUserId()));
				
				managerEntity.delete(iterateUsers);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			managerEntity.end();	
		}
	}
}
