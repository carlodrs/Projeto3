/**
 * 
 */
package com.ssj.persistence.account.user.entity;

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
@DiscriminatorValue("Client")
@PrimaryKeyJoinColumn(name="id") 
public class Client extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	
	
	
}
