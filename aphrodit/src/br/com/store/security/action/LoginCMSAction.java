package br.com.store.security.action;

import org.apache.struts2.interceptor.SessionAware;

import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.security.login.bean.LoginBean;
import com.ssj.service.security.login.interfaces.LoginService;

/** 
 * Action used to make a login of the user system
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * @see SessionAware
 * 
 * */
public class LoginCMSAction extends LoginPreparedCMSAction{
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	

	/**
	 * Method execute from struts to handle the loin
	 * @return String name of operation identifier 
	 * @throws Exception
	 * @see LoginService
	 *
	 * */
	public String doLogin() throws Exception{
		
		UserEmail userEmail = new UserEmail();
		userEmail.setEmail(this.getEmail());
		userEmail.setPassword(this.getPassword());
		
		LoginBean loginBean = new LoginBean();
		loginBean.setUserEmail(userEmail);
		
		try {
			boolean logged = this.loginService.checkUser(loginBean);
			
			if (logged == true)
				return SUCCESS;
			else
				return ERROR;

		} catch (Exception e) {
			e.printStackTrace();
			addActionError(getText("error.login"));
			return ERROR;
		}
	}
}
