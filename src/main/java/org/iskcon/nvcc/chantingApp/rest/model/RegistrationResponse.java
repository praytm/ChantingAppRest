/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

import java.io.Serializable;

/**
 * @author aditya.anand
 *
 */
public class RegistrationResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5197876992759939872L;
	
	private String errorCode;
	private String errorMessage;
	private User user;
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
