package com.ssj.service.bean.account.user;

import java.io.Serializable;
import java.util.Calendar;


/**
 *  Bean (pojo) to get informations the clients of the sistem
 *  @author Carlos Renato Domingos da silva
 *  @since 2013
 *  @version 1.0
 *  
 * Shopping São João
 * */
public class UserBean implements Serializable{
	
	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String nickName;
	private Calendar birthday;
	private String cpf;
	private String cnpj;
	private String gender;
	private char optIn;
	private String rg;
	private String email;
	private String password;
	private UserEmailBean userEmail;
	private String occupation;
	private String literacy;
	private String preferencialMusic;
	private String preferencialFood;
	private String religion;
	private String facebookId;
	private String twitterId;
	private String linkedInId;
	
	
	
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
	 * @return the birthday
	 */
	public Calendar getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
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
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the emailBean
	 */
	protected UserEmailBean getUserEmail() {
		return this.userEmail;
	}
	/**
	 * @param emailBean the emailBean to set
	 */
	protected void setUserEmail(UserEmailBean userEmail) {
		this.userEmail = userEmail;
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
	 * @return the preferencialMusic
	 */
	public String getPreferencialMusic() {
		return preferencialMusic;
	}
	/**
	 * @param preferencialMusic the preferencialMusic to set
	 */
	public void setPreferencialMusic(String preferencialMusic) {
		this.preferencialMusic = preferencialMusic;
	}
	/**
	 * @return the preferencialFood
	 */
	public String getPreferencialFood() {
		return preferencialFood;
	}
	/**
	 * @param preferencialFood the preferencialFood to set
	 */
	public void setPreferencialFood(String preferencialFood) {
		this.preferencialFood = preferencialFood;
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
	public void setFoodPrefs(String foodPrefs) {
		// TODO Auto-generated method stub
		
	}
	
}
