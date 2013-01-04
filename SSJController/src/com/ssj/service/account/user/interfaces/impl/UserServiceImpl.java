package com.ssj.service.account.user.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.dao.ClientDao;
import com.ssj.persistence.account.user.dao.PartnerDao;
import com.ssj.persistence.account.user.entity.Client;
import com.ssj.persistence.account.user.entity.Partner;
import com.ssj.persistence.account.user.entity.UserEmail;
import com.ssj.service.account.user.interfaces.UserService;
import com.ssj.service.bean.account.user.PartnerBean;
import com.ssj.service.bean.account.user.UserBean;


/**
 * 
 * Service to create the User
 * @author Carlos Silva
 * @version 1.0
 * @since 2013
 * 
 * Shopping São João
 * 
 * */
@Service("UserServiceImpl")
@Qualifier("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("ClientDaoImpl")
	private ClientDao<Client> clientDao;

	@Autowired
	@Qualifier("PartnerDaoImpl")
	private PartnerDao<Partner> partnerDao;
	
	/**
	 * @param eClientDao the clientDao to set
	 */
	public void create (UserBean bean) throws Exception{
		
		//Configuring user email
		UserEmail userEmail = extractEmailData(bean);
		
		if (bean instanceof PartnerBean){

			//Configuring user's data
			Partner partner = new Partner();
			BeanUtils.copyProperties(bean, partner);
			partner.setUserEmail(userEmail);
			
			//create on database
			this.partnerDao.create(partner);
			 
		}else{
			
			//Configuring user's data
			Client client = new Client();
			BeanUtils.copyProperties(bean, client);
			client.setUserEmail(userEmail);
			
			//create on database
			this.clientDao.create(client);
		}
		
	}

	/**
	 * 
	 * Method to extract the email information of the UserBean
	 * @param bean Bean of the user
	 * @return UserEmail
	 * 
	 * */	
	protected UserEmail extractEmailData(UserBean bean) {
		UserEmail userEmail = new UserEmail();
		userEmail.setEmail(bean.getEmail());
		userEmail.setPassword(bean.getPassword());
		return userEmail;
	}
	

	@Override
	public void read(UserBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserBean bean) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createUserEmail(UserBean userEmailBean) throws Exception {
		
		//Configuring user email
		UserEmail userEmail = this.extractEmailData(userEmailBean);
		Client client = new Client();
		client.setUserEmail(userEmail);
		this.clientDao.create(client);
	}

	/**
	 * @param clientDao the clientDao to set
	 */
	public void setClientDao(ClientDao<Client> clientDao) {
		this.clientDao = clientDao;
	}

	/**
	 * @param partnerDao the partnerDao to set
	 */
	public void setPartnerDao(PartnerDao<Partner> partnerDao) {
		this.partnerDao = partnerDao;
	}
	
	
}
