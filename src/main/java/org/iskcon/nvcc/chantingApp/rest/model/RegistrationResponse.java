/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

import java.io.Serializable;

import org.iskcon.nvcc.chantingApp.dto.UserDTO;

import com.fasterxml.jackson.annotation.JsonGetter;

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
	private  final  String tag = "registration";
	private String status;
	private String errorMessage;
	private UserDTO userDto;
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the user
	 */
	@JsonGetter("user")
	public UserDTO getUserDto() {
		return userDto;
	}
	/**
	 * @param user the user to set
	 */
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}
	

}
