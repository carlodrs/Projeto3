package com.ssj.persistence.account;

import java.io.Serializable;
import javax.persistence.*;


/**
 * 
 * Email user of the user entity
 * @author Carlos Renato Silva
 * @version 1.0
 * @copyRight Shopping Sao Joao
 * */

/**
 * Entity implementation class for Entity: UserEmail
 *
 */
@Entity
public class UserEmail implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)  
	private Long id;
	
	@OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="userId")
    private User user;
	private String email;
	private String password;
	
	private static final long serialVersionUID = 1L;

	public UserEmail() {
		super();
	}

	/**
	 * @return the userEmail
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param userEmail the userEmail to set
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
	
	
	
	
}
