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
public class ChangeUserStatusResponse extends AbstractRestResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2145308080532280395L;
	/**
	 * 
	 */
	private final String tag = "changeUserStatus";
	/**
	 * 
	 */
	private Boolean userStatusChanged;
	
	private String chantingQuote;

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @return the chantingQuote
	 */
	public String getChantingQuote() {
		return chantingQuote;
	}

	/**
	 * @param chantingQuote the chantingQuote to set
	 */
	public void setChantingQuote(String chantingQuote) {
		this.chantingQuote = chantingQuote;
	}

	/**
	 * @return the userStatusChanged
	 */
	public Boolean getUserStatusChanged() {
		return userStatusChanged;
	}

	/**
	 * @param userStatusChanged the userStatusChanged to set
	 */
	public void setUserStatusChanged(Boolean userStatusChanged) {
		this.userStatusChanged = userStatusChanged;
	}


}
