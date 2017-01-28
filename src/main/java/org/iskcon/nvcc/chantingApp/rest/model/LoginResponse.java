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
public class LoginResponse extends AbstractRestResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2145308080532280395L;
	/**
	 * 
	 */
	private final String tag = "login";
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
