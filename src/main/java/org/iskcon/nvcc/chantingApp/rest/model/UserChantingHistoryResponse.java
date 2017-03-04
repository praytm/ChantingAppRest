/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

/**
 * @author MA041SH
 *
 */

import org.iskcon.nvcc.chantingApp.dto.ChantingHistoryDTO;

public class UserChantingHistoryResponse extends AbstractRestResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1074196597202571682L;

	private final String tag = "user_chanting_history";

	private ChantingHistoryDTO chantingHistoryDTO;

	/**
	 * @return the chantingHistoryDTO
	 */
	public ChantingHistoryDTO getChantingHistoryDTO() {
		return chantingHistoryDTO;
	}

	/**
	 * @param chantingHistoryDTO
	 *            the chantingHistoryDTO to set
	 */
	public void setChantingHistoryDTO(ChantingHistoryDTO chantingHistoryDTO) {
		this.chantingHistoryDTO = chantingHistoryDTO;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

}
