/**
 * 
 */
package com.ssj.persistence.account;

import java.util.Calendar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 * Represents the e-client customer
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * @copyRight Shopping São João
 *
 */
@Entity
@DiscriminatorValue("EClient")
@PrimaryKeyJoinColumn(name="id") 
public class EClient extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Calendar birthday;
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return this.getDocNumber();
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.setDocNumber(cpf);
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
