package com.projetocrud.tier.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{

	private static final long serialVersionUID = 6118542528319929767L;

	@Action(value="/home", results = {
		@Result(name="success", location="/WEB-INF/pages/home.jsp")
	})
	public String iniciar() throws Exception {
		System.out.println("Home page Action...");
		return super.execute();
	}
}
