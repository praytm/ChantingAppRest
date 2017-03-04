/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.ChantingHistoryDTO;
import org.iskcon.nvcc.chantingApp.dto.GetChantingHistoryRequestDTO;
import org.iskcon.nvcc.chantingApp.rest.model.RestResponseCode;
import org.iskcon.nvcc.chantingApp.rest.model.TechnicalStatus;
import org.iskcon.nvcc.chantingApp.rest.model.UserChantingHistoryResponse;
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
public class GetSessionHistoryController {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(GetSessionHistoryController.class);
	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * @param input
	 * @return
	 */
	@RequestMapping(value = RestURIConstants.GET_USER_CHANTING_HISTORY, method = RequestMethod.POST)
	@ResponseBody
	public UserChantingHistoryResponse getChantingHistoryForUser(
			@RequestBody GetChantingHistoryRequestDTO getChantingHistoryRequestDTO) {
		UserChantingHistoryResponse userChantingHistoryResponse = new UserChantingHistoryResponse();
		try {
			ChantingHistoryDTO chantingHistoryDTO = userService
					.getChantingHistoryForUser(getChantingHistoryRequestDTO);

			userChantingHistoryResponse
					.setChantingHistoryDTO(chantingHistoryDTO);
			userChantingHistoryResponse
					.setTechnicalStatus(TechnicalStatus.SUCCESS);
			if (null != chantingHistoryDTO) {
				userChantingHistoryResponse
						.setResponseCode(RestResponseCode.GET_CHANTING_HISTORY_SUCCESS);
			} else {
				userChantingHistoryResponse
						.setResponseCode(RestResponseCode.GET_CHANTING_HISTORY_AUTHENTICATION_FAILURE);
			}

		} catch (Exception e) {
			logger.error("exception ocured in getChantingHistoryForUser :", e);
			userChantingHistoryResponse
					.setTechnicalStatus(TechnicalStatus.FAIL);
			userChantingHistoryResponse
					.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
		}
		return userChantingHistoryResponse;
	}
}
