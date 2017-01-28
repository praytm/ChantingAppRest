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
public class RegistrationResponse extends AbstractRestResponse implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5197876992759939872L;
	/**
	 * 
	 */
	private final String tag = "registration";
	/**
	 * 
	 */
	private UserDTO userDto;

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @return the user
	 */
	@JsonGetter("user")
	public UserDTO getUserDto() {
		return userDto;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}

}
