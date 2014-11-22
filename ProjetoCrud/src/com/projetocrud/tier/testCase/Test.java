package com.projetocrud.tier.testCase;

import java.util.Calendar;
import java.util.List;

import com.projetocrud.tier.dao.UserDAO;
import com.projetocrud.tier.dao.UserDAOImpl;
import com.projetocrud.tier.model.Address;
import com.projetocrud.tier.model.User;

public class Test  {

	private UserDAO userDao;
	
	public Test() {
		this.userDao = new UserDAOImpl();
	}

	public static void main(String[] args) {
		Test test = new Test();
		
		Address address = new Address();
		address.setCep("0986142055");
		address.setStreet("Rua peru");
		address.setNumber(231);
		address.setCity("São José do Rio Pardo âêõ");
		address.setState("sp");
		
		User user = new User();
		user.setName("Carlos Renato DOmingos da SIlva");
		user.setBirthday(Calendar.getInstance().getTime());
		user.setEmail("carlosrenato.s@gmail.com");
		user.setGender('M');
		user.setCpf("29293578867");
		user.setNationality("Brasileiro");
		user.setAddress(address);
		
		try {
			test.create(user);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		user.setEmail("csilv327@ford.com");
		
		try {
			test.update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			user = test.load(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(user.getEmail());
		
		List<User> list = null;
		try {
			list = test.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for (User user2 : list) {
			System.out.println(user2.getName());
		}
	}


	private List<User> list() throws Exception {
		return this.userDao.listAll();
	}

	private User load(User user) throws Exception {
		return this.userDao.load(user);
	}

	private void update(User user) throws Exception {
		this.userDao.update(user);
	}

	public void create ( User user) throws Exception{
		this.userDao.create(user);
	}
}
