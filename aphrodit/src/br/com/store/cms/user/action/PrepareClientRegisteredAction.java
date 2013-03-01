package br.com.store.cms.user.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.account.user.entity.User;
import com.ssj.service.account.user.interfaces.ClientService;

/**
 * 
 * Product Action CMS to handle registered users  
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class PrepareClientRegisteredAction extends ActionSupport {

	
	private String name;	
	private String nickName;
	private String birthday;
	private String gender;
	private String optIn;
	private String email;
	private String password;
	private String retypedPassword;
	private String rg;
	private List<User> clients;
	private List<String> genders;
	
	
	public PrepareClientRegisteredAction(){
		
		this.genders = new ArrayList<String>();
	
		this.genders.add(getText("gender.male"));
		this.genders.add(getText("gender.female"));
	}
	
	@Autowired
	protected ClientService<User> clientService;

	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nickNamerg
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickNamerg the nickNamerg to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the optIn
	 */
	public String getOptIn() {
		return optIn;
	}

	/**
	 * @param optIn the optIn to set
	 */
	public void setOptIn(String optIn) {
		this.optIn = optIn;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the retypedPassword
	 */
	public String getRetypedPassword() {
		return retypedPassword;
	}

	/**
	 * @param retypedPassword the retypedPassword to set
	 */
	public void setRetypedPassword(String retypedPassword) {
		this.retypedPassword = retypedPassword;
	}

	/**
	 * @return the clients
	 */
	public List<User> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(List<User> clients) {
		this.clients = clients;
	}

	/**
	 * Serial version UId
	 */
	private static final long serialVersionUID = 1;
	
	@Override
	public String execute() throws Exception {
		addActionMessage(getText("user.select.option"));
		return INPUT;
	}
	
	/**
	 * List all users regitered on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String listAll() throws Exception {
		try {
			this.setClients(this.clientService.listAll());
			return SUCCESS;	
		} catch (Exception e) {
			return ERROR;
		}
	}
	
	/**
	 * Prepare to create product
	 * @return String
	 * @throws Exception
	 */
	public String prepare() throws Exception {
		return INPUT;
	}


	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * @return the genders
	 */
	public List<String> getGenders() {
		return genders;
	}

	/**
	 * @param genders the genders to set
	 */
	public void setGenders(List<String> genders) {
		this.genders = genders;
	}
	
	
}
