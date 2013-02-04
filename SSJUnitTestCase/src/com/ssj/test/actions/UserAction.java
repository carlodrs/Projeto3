package com.ssj.test.actions;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssj.persistence.account.user.entity.Client;
import com.ssj.persistence.account.user.entity.Partner;
import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.account.user.interfaces.ClientService;
import com.ssj.service.account.user.interfaces.PartnerService;
import com.ssj.service.bean.account.user.ClientBean;
import com.ssj.service.bean.account.user.PartnerBean;
import com.ssj.service.bean.account.user.UserBean;

@Component("UserAction")
public class UserAction {

	@Autowired 
	private ClientService<ClientBean> clientService;
	
	@Autowired 
	private PartnerService<PartnerBean> partnerService;
	
	
	/****************** Method test to create user *******************************/
	/*****************************************************************************/
	public void testCreateUser() {
		
		for (int i = 0; i < 1; i++) {
			// configuring email
			UserEmail userEmail = new UserEmail();
			userEmail.setEmail(i + " caredom@zipmail.com");
			userEmail.setPassword(i + " rambito");
			
			//creating user
			Client client =  new Client();
			client.setName(i + " Carlos Renato Domingos da Silva");
			client.setCpf(i + " 29293578867");
			client.setGender(i + " M");
			client.setOptIn('y');
			
			//set birthday
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.YEAR, 1982);
			calendar.set(Calendar.MONTH, 7);
			calendar.set(Calendar.DATE, 4);
			client.setBirthday(calendar);
			
			//configuring UserBean object
			ClientBean clientBean = new ClientBean();
			clientBean.setId(10L);
			clientBean.setUser(client);
			
			try {
				this.clientService.create(clientBean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	/****************** Method test to create user email only *******************************/
	/****************************************************************************************/
	public void testCreateUserEmailOnly() {
		
		UserEmail userEmail = new UserEmail();
		userEmail.setEmail("testdoemail@gmail.com");
		userEmail.setPassword("senha do gmail");
		
		Partner partner = new Partner();
		partner.setUserEmail(userEmail);
		
		userEmail.setUser(partner);
		
		UserBean userBean = new UserBean();
		userBean.setUser(partner);
		
		try {
			this.clientService.createUserEmail(userBean);
			
			System.out.println("**** Email user created Success !!!! ******");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("**** Email User not created - Fatal error !!!! ******");
			
		}
	}


	/****************** Method test to create partner *******************************/
	/********************************************************************************/
	
	public void testCreatePartner() {
	
		
		for (int i = 0; i < 1; i++) {
			
			UserEmail userEmail = new UserEmail();
			userEmail.setEmail("artemel@ssj.com.br");
			userEmail.setPassword("patchwork");
			
			Partner partner = new Partner();
			partner.setName("Art Mel Patchworks");
			
			userEmail.setUser(partner);
			partner.setUserEmail(userEmail);
			
			PartnerBean partnerBean = new PartnerBean();
			partnerBean.setUser(partner);
			
			try {
				partnerService.create(partnerBean);
				System.out.println("**** Partner user created Success !!!! ******");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("**** Partner User not created - Fatal error !!!! ******");
				
			}
	
		}
	}
}
