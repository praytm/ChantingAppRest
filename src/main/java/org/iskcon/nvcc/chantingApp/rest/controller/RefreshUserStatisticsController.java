/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.RefreshUserStatisticsOutputDTO;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;
import org.iskcon.nvcc.chantingApp.rest.model.RefreshUserStatisticsResponse;
import org.iskcon.nvcc.chantingApp.rest.model.RestResponseCode;
import org.iskcon.nvcc.chantingApp.rest.model.TechnicalStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author MA041SH
 *
 */
@Controller
public class RefreshUserStatisticsController {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(RefreshUserStatisticsController.class);
	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * @param input
	 * @return
	 */
	@RequestMapping(value = RestURIConstants.REFRESH_USER_STATISTICS, method = RequestMethod.POST)
	@ResponseBody
	public RefreshUserStatisticsResponse refreshUserStatistics(
			@RequestBody UserDTO input) {
		RefreshUserStatisticsResponse refreshUserStatisticsResponse = new RefreshUserStatisticsResponse();
		try {
			RefreshUserStatisticsOutputDTO refreshUserStatisticsOutputDTO = userService
					.refreshUserStatistics(input);
			if (null != refreshUserStatisticsOutputDTO) {
				refreshUserStatisticsResponse
						.setResponseCode(RestResponseCode.REFRESH_HOME_SUCCESS);
				refreshUserStatisticsResponse
						.setRefreshUserStatisticsOutputDTO(refreshUserStatisticsOutputDTO);
			} else {
				// since refreshUserStatisticsOutputDTO is null ,that means the
				// call to login api in service layer was not successful due to
				// wrong credentials
				refreshUserStatisticsResponse
						.setResponseCode(RestResponseCode.REFRESH_HOME_AUTHENTICATION_FAILURE);
			}
			refreshUserStatisticsResponse
					.setTechnicalStatus(TechnicalStatus.SUCCESS);
		} catch (Exception e) {
			logger.error("exception ocured in refreshUserStatistics :", e);
			refreshUserStatisticsResponse
					.setTechnicalStatus(TechnicalStatus.FAIL);
			refreshUserStatisticsResponse
					.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
		}
		return refreshUserStatisticsResponse;
	}
	
	@RequestMapping(value = RestURIConstants.GET_TOTAL_BEADS_FOR_TODAY, method = RequestMethod.POST)
	@ResponseBody
	public Integer getTotalNumberOfBeadsForToday(){
		
	return	userService.getTotalNumberOfBeadsForToday();
		
	
	}
}
