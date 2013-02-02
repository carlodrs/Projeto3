package com.ssj.persistence.account.address.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.ssj.persistence.account.user.entity.User;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity

public class Address implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long idAddress;
	private String street;
	private long number;
	private String neighborhood;
	private String city;
	private String state;
	private String complements;
	private String postalCode;
	private String cellphone1;
	private String cellphone2;
	private String houseNumber;
	private String businessNumber;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@NotNull 
	private User user;

	public Address() {
		super();
	}   
	public Long getIdAddress() {
		return this.idAddress;
	}

	public void setIdAddress(Long idAddress) {
		this.idAddress = idAddress;
	}   
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}   
	public long getNumber() {
		return this.number;
	}

	public void setNumber(long number) {
		this.number = number;
	}   
	public String getNeighborhood() {
		return this.neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}   
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}   
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}   
	public String getComplements() {
		return this.complements;
	}

	public void setComplements(String complements) {
		this.complements = complements;
	}   
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}   
	public String getCellphone1() {
		return this.cellphone1;
	}

	public void setCellphone1(String cellphone1) {
		this.cellphone1 = cellphone1;
	}   
	public String getCellphone2() {
		return this.cellphone2;
	}

	public void setCellphone2(String cellphone2) {
		this.cellphone2 = cellphone2;
	}   
	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}   
	public String getBusinessNumber() {
		return this.businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
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
   
}
