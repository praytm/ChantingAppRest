/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author aditya.anand
 * 
 */
public class ClientRegistrationResponseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5197876992759939872L;

	private String errorCode;
	private String errorMessage;
	private ClientUserObject clientUserObject;

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
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
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the clientUserObject
	 */
	public ClientUserObject getClientUserObject() {
		return clientUserObject;
	}

	/**
	 * @param clientUserObject
	 *            the clientUserObject to set
	 */
	@JsonSetter("user")
	public void setClientUserObject(ClientUserObject clientUserObject) {
		this.clientUserObject = clientUserObject;
	}

}
