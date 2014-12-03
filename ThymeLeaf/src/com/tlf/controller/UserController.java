package com.tlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tlf.entity.User;
import com.tlf.persistence.UserDao;



@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("login")
	public String login (User user){
		
		boolean logged = this.userDao.login(user);
		
		if (logged)
			return "WEB-INF/pages/template";


		/** TODO validar esse retorno em caso de erro **/
		return "WEB-INF/pages/login";
	}
}
