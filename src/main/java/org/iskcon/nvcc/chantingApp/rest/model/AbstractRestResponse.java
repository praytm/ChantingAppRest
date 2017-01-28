/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author ma041sh
 *
 */
public abstract class AbstractRestResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8468671651679621378L;

	/**
	 * 
	 */
	private TechnicalStatus technicalStatus;
	
	/**
	 * 
	 */
	private RestResponseCode responseCode;

	/**
	 * @return the technicalStatus
	 */
	@JsonSerialize(using = TechnicalStatusSerializer.class)
	public TechnicalStatus getTechnicalStatus() {
		return technicalStatus;
	}

	/**
	 * @param technicalStatus the technicalStatus to set
	 */
	public void setTechnicalStatus(TechnicalStatus technicalStatus) {
		this.technicalStatus = technicalStatus;
	}

	/**
	 * @return the responseCode
	 */
	@JsonSerialize(using = RestResponseCodeSerializer.class)
	public RestResponseCode getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(RestResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	
	
}
