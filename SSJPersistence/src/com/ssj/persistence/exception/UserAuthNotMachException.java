/**
 * 
 */
package com.ssj.persistence.exception;

/**
 * Exception class to handle the user auth not matched on database
 * @author Carlos Silva
 * @since 2013
 * @version 1.0
 */
public class UserAuthNotMachException extends Exception {

	/**
	 * Serial Version Id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * default constructor
	 */
	public UserAuthNotMachException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UserAuthNotMachException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public UserAuthNotMachException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public UserAuthNotMachException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
