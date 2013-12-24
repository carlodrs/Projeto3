package br.com.store.cms.user.action;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.persistence.account.user.entity.Client;
import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.bean.account.user.ClientBean;

/**
 * 
 * Product Action CMS to handle registered users  
 * @author Carlos Silva
 * @version 1.0
 * @since 1.0
 * @see ActionSupport
 * */
public class ClientRegisteredAction extends PrepareClientRegisteredAction {


	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Client registered logger
	 */
	private static Logger logger = 
		Logger.getLogger(ClientRegisteredAction.class.getName());
	
	@Override
	public void validate() {
	
		if(!this.getPassword()
				.equalsIgnoreCase(this.getRetypedPassword())){
			
			addFieldError("retypedPassword", getText("user.not.match.password"));
		}		
	}
	/**
	 * Register users on the system
	 * @return String success or error
	 * @exception Exception
	 */
	public String create() throws Exception {
		try {
			
			// configuring email
			UserEmail userEmail = new UserEmail();
			userEmail.setEmail(this.getEmail());
			userEmail.setPassword(this.getPassword());
			
			//creating user
			Client client =  new Client();
			client.setName(this.getName());
			client.setNickName(this.getNickName());
			client.setGender(this.getGender());
			client.setRg(this.getRg());
			client.setOptIn(this.getOptIn().charAt(0));
			
			//set birthday
			Calendar calendar = Calendar.getInstance();
			
			@SuppressWarnings("deprecation")
			Date date = new Date(this.getBirthday());
			calendar.setTime(date);
			client.setBirthday(calendar);
			
			
			//set user email
			client.setUserEmail(userEmail);
			userEmail.setUser(client);
			
			//configuring UserBean object
			ClientBean clientBean = new ClientBean();
			clientBean.setUser(client);
			
			try {
				this.clientService.create(clientBean);
			} catch (Exception e) {
				
				logger.log(Level.SEVERE, " * Step 1 : " +
						"Error to create user " + e.getMessage());
				
				addActionError(getText("error.create.user.on.step1"));
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;	
			}
			
			addActionMessage(getText("user.create.success"));
			return SUCCESS;	
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.create.user.on.step2"));
			return ERROR;
		}
	}
}
