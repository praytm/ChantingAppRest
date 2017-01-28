/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;
import org.iskcon.nvcc.chantingApp.rest.model.LoginResponse;
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
public class LoginController {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * @param input
	 * @return
	 */
	@RequestMapping(value = RestURIConstants.LOGIN_USER, method = RequestMethod.POST)
	@ResponseBody
	public LoginResponse registerUser(@RequestBody UserDTO input) {
		LoginResponse loginResponse = new LoginResponse();
		try {
			UserDTO outputuserDTO = userService.loginUser(input);
			if (null == outputuserDTO) {
				// matching record found but password didnot match
				loginResponse
						.setResponseCode(RestResponseCode.LOGIN_FAILURE_WRONG_CREDENTIALS);
			} else {
				if (null != outputuserDTO.getUserId()) {
					// successful login case
					loginResponse.setUserDto(outputuserDTO);
					loginResponse
					.setResponseCode(RestResponseCode.LOGIN_SUCCESS);
				} else {
					// no matching record found in db ,email id does not exist
					loginResponse
							.setResponseCode(RestResponseCode.LOGIN_FAILURE_EMAIL_NOT_FOUND);
				}
			}
			loginResponse.setTechnicalStatus(TechnicalStatus.SUCCESS);
		} catch (Exception e) {
			logger.error("exception ocured in login :", e);
			loginResponse.setTechnicalStatus(TechnicalStatus.FAIL);
			loginResponse.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
		}
		return loginResponse;
	}
}
