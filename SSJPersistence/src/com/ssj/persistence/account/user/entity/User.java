package com.ssj.persistence.account.user.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: User
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long userId;
	private String name;
	private String nickName;
	private char optIn;
	private String gender;
	private String docNumber;
	private String rg;
	private Calendar birthday;
	
	@OneToOne(mappedBy="user", cascade=CascadeType.ALL)
	@NotNull
	private UserEmail userEmail;
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}  
	
		
	/**
	 * @return the id
	 */
	public Long getUserId() {
		return userId;
	}


	/**
	 * @param id the id to set
	 */
	public void setUserId(Long id) {
		this.userId = id;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * @return the docNumber
	 */
	protected String getDocNumber() {
		return docNumber;
	}


	/**
	 * @param docNumber the docNumber to set
	 */
	protected void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}


	/**
	 * @return the userEmail
	 */
	public UserEmail getUserEmail() {
		return userEmail;
	}


	/**	
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(UserEmail userEmail) {
		this.userEmail = userEmail;
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
	
}
