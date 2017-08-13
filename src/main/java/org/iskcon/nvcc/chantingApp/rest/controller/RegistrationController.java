package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;
import org.iskcon.nvcc.chantingApp.rest.model.RegistrationResponse;
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
 * Handles requests for the ChantingApp
 */
@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory
			.getLogger(RegistrationController.class);

	@RequestMapping(value = RestURIConstants.REGISTER_USER, method = RequestMethod.POST)
	@ResponseBody
	public RegistrationResponse registerUser(@RequestBody UserDTO input) {
		logger.info("Start getDummyEmployee");
		RegistrationResponse registrationResponse = new RegistrationResponse();
		try {
			UserDTO output = userService.registerUser(input);
			registrationResponse.setUserDto(output);
			if (null != output) {
				if(null != output.getUserId()){
					registrationResponse
					.setResponseCode(RestResponseCode.REGISTRATION_SUCCESS);	
				} else{
					//if userId is null that means userInput is returned as it is from dao and hence the data sent in request is not complete
					registrationResponse
					.setResponseCode(RestResponseCode.REGISTRATION_FAIL_INCOMPLETE_USER_DATA);
				}

			} else {
				registrationResponse
						.setResponseCode(RestResponseCode.REGISTRATION_FAIL_DUPLICATE_EMAIL);
			}
			registrationResponse.setTechnicalStatus(TechnicalStatus.SUCCESS);
		} catch (Exception e) {
			logger.error("Exception in registerUser ", e);
			registrationResponse.setTechnicalStatus(TechnicalStatus.FAIL);
			registrationResponse
					.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
		}
		return registrationResponse;
	}

}
