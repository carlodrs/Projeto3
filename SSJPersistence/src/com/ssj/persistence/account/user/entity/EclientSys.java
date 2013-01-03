/**
 * 
 */
package com.ssj.persistence.account.user.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * 
 * Represents the company partner of Shopping São João
 * 
 * @author Carlos Renato Silva
 * @version 1.0
 * @since 2013
 * @copyright Shopping São Joao
 */
@DiscriminatorValue("EclientSys")
@Entity
@PrimaryKeyJoinColumn(name="id")
public class EclientSys extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj;
	private String companyName;
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
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}