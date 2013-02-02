package com.ssj.service.account.user.interfaces.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ssj.persistence.account.user.dao.ClientDao;
import com.ssj.persistence.account.user.entity.Client;
import com.ssj.persistence.account.user.entity.Partner;
import com.ssj.persistence.account.user.entity.User;
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
	private Client client;
	
	public UserServiceImpl(){
		this.client = new Client();
 	}

	/**
	 * @param eClientDao the clientDao to set
	 */
	public void create (UserBean bean) throws Exception{
		
		//Configuring user email
		User user = this.populate(bean);
		
		//create on database
		this.clientDao.create(user);
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
	
	/**
	 * 
	 * Populate Method to get the user ready to be handled
	 * @param bean Bean of the user
	 * @return User
	 * */	
	protected User populate(UserBean bean) {
		
		UserEmail userEmail = this.extractEmailData(bean);
		User userReference = null;
		
		//recover the Partner Entity reference
		if (bean instanceof PartnerBean){
			userReference = new Partner();
		}else 
			//Recover the User Entity reference
			if (bean instanceof UserBean){
			userReference = new Client();
		}
		
		//configure relationship
		userReference.setUserEmail(userEmail);
		userEmail.setUser(userReference);
		
		//copy properties datas
		BeanUtils.copyProperties(bean, userReference);
		
		//user populated
		return userReference;
	}
	
	@Override
	public User read(UserBean bean) throws Exception {
		return clientDao.read(User.class, bean.getId());
	}

	@Override
	public void delete(UserBean bean) throws Exception {
		BeanUtils.copyProperties(bean, client);	
		clientDao.delete(client);
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
}