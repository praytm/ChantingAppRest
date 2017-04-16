/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;
import org.iskcon.nvcc.chantingApp.rest.model.ChangeUserStatusResponse;
import org.iskcon.nvcc.chantingApp.rest.model.ChantingQuotesGenerator;
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
public class UserStatusController {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(UserStatusController.class);
	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * @param input
	 * @return
	 */
	@RequestMapping(value = RestURIConstants.CHANGE_USER_STATUS_ACTIVE, method = RequestMethod.POST)
	@ResponseBody
	public ChangeUserStatusResponse changeUserStatusToActive(
			@RequestBody UserDTO input) {
		ChangeUserStatusResponse changeUserStatusResponse = new ChangeUserStatusResponse();
		try {
			Boolean statusChanged = userService.changeUserStatusToActive(input);
			if (statusChanged) {
				changeUserStatusResponse
						.setResponseCode(RestResponseCode.USER_STATUS_CHANGED);
			} else {
				changeUserStatusResponse
						.setResponseCode(RestResponseCode.USER_STATUS_CHANGE_FAILED_WRONG_CREDENTIALS);
			}
			changeUserStatusResponse.setUserStatusChanged(statusChanged);
			changeUserStatusResponse
					.setTechnicalStatus(TechnicalStatus.SUCCESS);
			changeUserStatusResponse.setChantingQuote(ChantingQuotesGenerator.getQuote());
		} catch (Exception e) {
			logger.error("exception ocured in changeUserStatusToActive :", e);
			changeUserStatusResponse.setTechnicalStatus(TechnicalStatus.FAIL);
			changeUserStatusResponse
					.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
		}
		return changeUserStatusResponse;
	}

	@RequestMapping(value = RestURIConstants.CHANGE_USER_STATUS_NOT_ACTIVE, method = RequestMethod.POST)
	@ResponseBody
	public ChangeUserStatusResponse changeUserStatusToNotActive(
			@RequestBody UserDTO input) {
		ChangeUserStatusResponse changeUserStatusResponse = new ChangeUserStatusResponse();
		try {
			Boolean statusChanged = userService
					.changeUserStatusToNotActive(input);
			if (statusChanged) {
				changeUserStatusResponse
						.setResponseCode(RestResponseCode.USER_STATUS_CHANGED);
			} else {
				changeUserStatusResponse
						.setResponseCode(RestResponseCode.USER_STATUS_CHANGE_FAILED_WRONG_CREDENTIALS);
			}
			changeUserStatusResponse.setUserStatusChanged(statusChanged);
			changeUserStatusResponse
					.setTechnicalStatus(TechnicalStatus.SUCCESS);
		} catch (Exception e) {
			logger.error("exception ocured in changeUserStatusToNotActive :", e);
			changeUserStatusResponse.setTechnicalStatus(TechnicalStatus.FAIL);
			changeUserStatusResponse
					.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
		}
		return changeUserStatusResponse;
	}
}
