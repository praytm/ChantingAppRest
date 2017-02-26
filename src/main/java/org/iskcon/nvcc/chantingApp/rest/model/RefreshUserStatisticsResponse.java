/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

import org.iskcon.nvcc.chantingApp.dto.RefreshUserStatisticsOutputDTO;

/**
 * @author MA041SH
 *
 */
public class RefreshUserStatisticsResponse extends AbstractRestResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7107981334295450966L;
	
	/**
	 * 
	 */
	private final String tag = "refresh_home";
	
	/**
	 * 
	 */
	private RefreshUserStatisticsOutputDTO refreshUserStatisticsOutputDTO;

	/**
	 * @return the refreshUserStatisticsOutputDTO
	 */
	public RefreshUserStatisticsOutputDTO getRefreshUserStatisticsOutputDTO() {
		return refreshUserStatisticsOutputDTO;
	}

	/**
	 * @param refreshUserStatisticsOutputDTO the refreshUserStatisticsOutputDTO to set
	 */
	public void setRefreshUserStatisticsOutputDTO(
			RefreshUserStatisticsOutputDTO refreshUserStatisticsOutputDTO) {
		this.refreshUserStatisticsOutputDTO = refreshUserStatisticsOutputDTO;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	
	
	

}
