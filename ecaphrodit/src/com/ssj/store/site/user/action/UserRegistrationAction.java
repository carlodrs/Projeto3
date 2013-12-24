package com.ssj.store.site.user.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.ssj.service.account.user.interfaces.ClientService;

public class UserRegistrationAction extends ActionSupport {

	@SuppressWarnings({ "rawtypes", "unused" })
	@Autowired
	private ClientService clientService;
	
	//Fields
	private String email;
	private String password;	
	public String name;
	public String nickName;
	public String cpf;
	public String rg;
	public String birthday;
	public String gender;
	public String occupation ;
	public String literacy ;
	public String preferencialMusic; 
	public String preferencialFood; 
	public String facebookId; 
	public String twitterId; 
	public String linkedInId;
	public String religion;
	
	public char optIn;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String execute() throws Exception {
	
		
		//Populate Bean
		/*
		UserBean userBean = new UserBean();
		userBean.setEmail(this.getEmail());
		userBean.setPassword(this.getPassword());
		userBean.setName(this.getName());
		userBean.setCpf(this.getCpf());
		userBean.setGender(this.getGender());
		userBean.setNickName(this.getNickName());
		userBean.setOptIn(this.getOptIn());
		userBean.setOccupation(this.getOccupation());
		userBean.setLiteracy(this.getLiteracy());
		userBean.setReligion(this.getReligion());
		userBean.setPreferencialMusic(this.getPreferencialMusic());
		userBean.setPreferencialFood(this.getPreferencialFood());
		userBean.setFacebookId(this.getFacebookId());
		userBean.setTwitterId(this.getTwitterId());
		userBean.setLinkedInId(this.getLinkedInId());
		userBean.setRg(this.getRg());
		userBean.setBirthday(Calendar.getInstance());
		
		//Create user on database
		clientService.create(userBean);
		*/
		return super.execute();
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
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the literacy
	 */
	public String getLiteracy() {
		return literacy;
	}

	/**
	 * @param literacy the literacy to set
	 */
	public void setLiteracy(String literacy) {
		this.literacy = literacy;
	}

	/**
	 * @return the musicPrefs
	 */
	public String getPreferencialMusic() {
		return preferencialMusic;
	}

	/**
	 * @param musicPrefs the musicPrefs to set
	 */
	public void setPreferencialMusic(String musicPrefs) {
		this.preferencialMusic = musicPrefs;
	}

	/**
	 * @return the foodPrefs
	 */
	public String getPreferencialFood() {
		return preferencialFood;
	}

	/**
	 * @param foodPrefs the foodPrefs to set
	 */
	public void setPreferencialFood(String foodPrefs) {
		this.preferencialFood = foodPrefs;
	}

	/**
	 * @return the facebookId
	 */
	public String getFacebookId() {
		return facebookId;
	}

	/**
	 * @param facebookId the facebookId to set
	 */
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	/**
	 * @return the twitterId
	 */
	public String getTwitterId() {
		return twitterId;
	}

	/**
	 * @param twitterId the twitterId to set
	 */
	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}

	/**
	 * @return the linkedInId
	 */
	public String getLinkedInId() {
		return linkedInId;
	}

	/**
	 * @param linkedInId the linkedInId to set
	 */
	public void setLinkedInId(String linkedInId) {
		this.linkedInId = linkedInId;
	}

	/**
	 * @return the optIn
	 */
	public char getOptIn() {
		return optIn;
	}

	/**
	 * @param optIn the optIn to set
	 */
	public void setOptIn(char optIn) {
		this.optIn = optIn;
	}

	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * @param religion the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}
}
