/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;
import org.iskcon.nvcc.chantingApp.rest.model.LoginResponse;
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

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	@Autowired
	private UserService userService;

	@RequestMapping(value = RestURIConstants.LOGIN_USER, method = RequestMethod.POST)
	public @ResponseBody LoginResponse registerUser(@RequestBody UserDTO input) {
		LoginResponse loginResponse = new LoginResponse();
		try {
			UserDTO outputuserDTO = userService.loginUser(input);
			if (null == outputuserDTO) {
				// matching record found but password didnot match
				loginResponse.setStatus("fail");
				loginResponse.setErrorCode("1");
				loginResponse
						.setErrorMessage("Login credentials are incorrect, please try again!");
			} else {
				if (null != outputuserDTO.getUserId()) {
					// successful login case
					loginResponse.setStatus("success");
					loginResponse.setUserDto(outputuserDTO);
				} else {
					// no matching record found in db ,email id does not exist
					loginResponse.setStatus("fail");
					loginResponse.setErrorCode("2");
					loginResponse.setErrorMessage("User with email "
							+ outputuserDTO.getEmail() + " does not exist");
				}
			}

		} catch (Exception e) {
			logger.error("exception ocured in login :" , e);
			loginResponse.setStatus("fail");
			loginResponse.setErrorCode("3");
			loginResponse
					.setErrorMessage("Unknown error occured in login ,please try after sometime");

		}

		return loginResponse;
	}
}
