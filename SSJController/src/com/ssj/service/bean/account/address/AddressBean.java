package com.ssj.service.bean.account.address;

import java.io.Serializable;

import com.ssj.persistence.account.address.entity.Address;
import com.ssj.persistence.account.user.entity.User;

/**
 *  Bean (pojo) to get informations the address of the sistem
 *  @author Carlos Renato Domingos da silva
 *  @since 2013
 *  @version 1.0
 *  
 * Shopping São João
 * */
public class AddressBean implements Serializable{
	
	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private User user;
	private Address address;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
