package com.ssj.service.bean.account.address;

import java.io.Serializable;

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
	private User user;
	
	/**
	 * @return the idAddress
	 */
	public Long getIdAddress() {
		return idAddress;
	}
	/**
	 * @param idAddress the idAddress to set
	 */
	public void setIdAddress(Long idAddress) {
		this.idAddress = idAddress;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the number
	 */
	public long getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(long number) {
		this.number = number;
	}
	/**
	 * @return the neighborhood
	 */
	public String getNeighborhood() {
		return neighborhood;
	}
	/**
	 * @param neighborhood the neighborhood to set
	 */
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the complements
	 */
	public String getComplements() {
		return complements;
	}
	/**
	 * @param complements the complements to set
	 */
	public void setComplements(String complements) {
		this.complements = complements;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the cellphone1
	 */
	public String getCellphone1() {
		return cellphone1;
	}
	/**
	 * @param cellphone1 the cellphone1 to set
	 */
	public void setCellphone1(String cellphone1) {
		this.cellphone1 = cellphone1;
	}
	/**
	 * @return the cellphone2
	 */
	public String getCellphone2() {
		return cellphone2;
	}
	/**
	 * @param cellphone2 the cellphone2 to set
	 */
	public void setCellphone2(String cellphone2) {
		this.cellphone2 = cellphone2;
	}
	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}
	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	/**
	 * @return the businessNumber
	 */
	public String getBusinessNumber() {
		return businessNumber;
	}
	/**
	 * @param businessNumber the businessNumber to set
	 */
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * @param the User
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * @return the User
	 */
	public User getUser() {
		return this.user;
	}
}
