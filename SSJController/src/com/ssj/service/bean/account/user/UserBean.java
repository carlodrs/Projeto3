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
	private Calendar birthDay;
	private String cpf;
	private String cnpj;
	private String gender;
	private char optIn;
	private String rg;
	private String email;
	private String password;
	private UserEmailBean userEmail;
	
	
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
	 * @return the birthDay
	 */
	public Calendar getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Calendar birthDay) {
		this.birthDay = birthDay;
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
	public UserEmailBean getUserEmail() {
		return this.userEmail;
	}
	/**
	 * @param emailBean the emailBean to set
	 */
	public void setUserEmail(UserEmailBean userEmail) {
		this.userEmail = userEmail;
	}
}
