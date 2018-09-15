package org.iskcon.nvcc.chantingApp.rest.model;

import java.io.Serializable;

import org.iskcon.nvcc.chantingApp.dto.HighestChantingInfoDTO;

import com.fasterxml.jackson.annotation.JsonGetter;

public class HighestChantingResponse extends AbstractRestResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3104362139379457242L;
	private final String tag = "highestChants";

	public String getTag() {
		return tag;
	}

	private HighestChantingInfoDTO highestChantingInfoDTO;

	/**
	 * @return the highestChantingInfoDTO
	 */
	@JsonGetter("highestChantingInfo")
	public HighestChantingInfoDTO getHighestChantingInfoDTO() {
		return highestChantingInfoDTO;
	}

	/**
	 * @param highestChantingInfoDTO the highestChantingInfoDTO to set
	 */
	public void setHighestChantingInfoDTO(HighestChantingInfoDTO highestChantingInfoDTO) {
		this.highestChantingInfoDTO = highestChantingInfoDTO;
	}

}
