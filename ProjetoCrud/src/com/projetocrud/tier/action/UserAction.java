package com.projetocrud.tier.action;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import com.projetocrud.enums.Country;
import com.projetocrud.enums.State;
import com.projetocrud.tier.model.User;
import com.projetocrud.tier.service.UserService;

public class UserAction extends ActionSupport implements ValidationAware {
	
	Logger LOGGER = LoggerFactory.getLogger(UserAction.class);
	
	private static final long serialVersionUID = -7143131208593790938L;
	
	private User user;
	private List<Country> countries;
	private List<State> states;
	
	public UserAction (){
		this.countries = new ArrayList<Country>(EnumSet.allOf(Country.class));
		this.states = new ArrayList<State>(EnumSet.allOf(State.class));
		 
	}
	
	/**
	 * Retorna a lista de paises do combo
	 * @return Lista de paises
	 * */
	public List<Country> getCountries() {
		return countries;
	}

	/**
	 * Retorna a lista de estados do combo
	 * @return Lista de paises
	 * */
	public List<State> getStates() {
		return states;
	}
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * Method to createe user
	 * @return String forward representing success or error 
	 * @throws Exception
	 * */
	@Action(value="/user/create", results = {
		@Result(name = "success", type = "redirectAction", params = {"namespace", "/user", "actionName", "success"}),
		@Result(name = "input", type = "chain"),
		@Result(name = "error", type = "redirectAction", params = {"namespace", "/user", "actionName", "prepareCreate"}),
		@Result(name="exception", location="/error.jsp"),
	},
	exceptionMappings = @ExceptionMapping(exception = "java.lang.Exception",   result = "exception"))
	
	public String create() throws Exception{
		
		String forwardName = SUCCESS;
	
		try {
		
			UserService userService = new UserService();
			userService.create(user);
		
		} catch (Exception e) {
			
			LOGGER.info("Falha ao criar o usuário", e, new String[0]);
			throw e;
		}
		
		return forwardName;
	}
	
	/**
	 * Prepare create page to insert data 
	 * @return String forward representing input
	 * @throws Exception
	 */
	@Action(value="/user/prepareCreate", results = {
		@Result(name="input", location="/WEB-INF/content/createUser.jsp")
	})
	public String prepareCreate() throws Exception{
		return INPUT;
	}

	
	/**
	 * Prepare read page data
	 * @return String forward representing input
	 */	
	@Action(value="/user/prepareRead", results = {
		@Result(name="input", location="/WEB-INF/content/readUser.jsp")
	})
	public String prepareRead() throws Exception{
		return INPUT;
	}
	
	
	/**
	 * Success forward page
	 * @return String success
	 * */
	@Action(value="/user/success", results = {
		@Result(name="success", location="/WEB-INF/content/success.jsp")
	})
	public String success() {
		return SUCCESS;
	}
	
	/**
	 * Read user by typed data from jsp view
	 * @return String forwarding representation
	 * @throw Exception
	 * */
	@Action(value="/user/readUser", results = {
		@Result(name="success", location="/WEB-INF/content/readUser.jsp"),
	    @Result(name = "error", type = "redirectAction", params = {"namespace", "/user", "actionName", "prepareRead"}),
	})
	
	public String readUser() throws Exception{
		
		String forward = ERROR;
		
		try{
			UserService userService = new UserService();
			user = userService.load(user);
			
			forward = SUCCESS;
			
		}catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Fail to read user data", e.getMessage());
		}
		
		return forward;
	}

	@Action(value="/user/readUserForDelete", results = {
		@Result(name="success", location="/WEB-INF/content/prepareDelete.jsp"),
		@Result(name="error", location="/WEB-INF/content/prepareDelete.jsp"),
	})
	public String readUserForDelete() throws Exception{
		return this.readUser();
	}
	
	@Action(value="/user/prepareUpdate", results = {
		@Result(name="success", location="/WEB-INF/content/updateUser.jsp"),
		@Result(name = "error", type = "redirectAction", params = {"namespace", "/user", "actionName", "prepareRead"})
	})
	public String prepareUpdate() throws Exception{
		return this.readUser();
	}
	
	@Action(value="/user/update", results = {
		@Result(name = "success", type = "redirectAction", params = {"namespace", "/user", "actionName", "success"}),
		@Result(name = "error", type = "redirectAction", params = {"namespace", "/user", "actionName", "prepareUpdate"}),
		@Result(name = "input", type = "chain"),
		@Result(name="exception", location="/error.jsp")
	},
	exceptionMappings = @ExceptionMapping(exception = "java.lang.Exception",   result = "exception"))
	public String update() throws Exception{
		
		String forward = SUCCESS;
		try {
			UserService service = new UserService();
			service.update(this.user);
		} catch (Exception e) {
			LOGGER.error("Problemas ao executar o update", e, new String[] {user.getName()});
			forward = ERROR;
		}
		
		return forward;
	}

	
	
	
	@Action(value="/user/confirmDelete", results = {
		@Result(name = "success", type = "redirectAction", params = {"namespace", "/user", "actionName", "success"}),
		@Result(name="error", location="/user/prepareDelete"),
		@Result(name="input", location="/WEB-INF/content/deleteUser.jsp")
	})
	public String confirmDelet() throws Exception{
		this.readUserForDelete();
		return INPUT;
	}
	
	@Action(value="/user/delete", results = {
		@Result(name = "success", type = "redirectAction", params = {"namespace", "/user", "actionName", "success"}),
		@Result(name="error", location="/user/prepareDelete")
	})
	public String delete() throws Exception{
	
		UserService userService = new UserService();
		userService.delete(user);
		
		return SUCCESS;
	}
	
	@Action(value="/user/prepareDelete", results = {
		@Result(name="success", location="/WEB-INF/content/prepareDelete.jsp"),
	})
	public String prepareDelete() throws Exception{
		System.out.println("prepare to delete user");
		return SUCCESS;
	}
	

	@Action("/user/list")
	public String list() throws Exception{
		
		System.out.println("list user");
		return SUCCESS;
	}
}
