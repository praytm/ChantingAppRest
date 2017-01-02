package org.iskcon.nvcc.chantingApp.rest.controller;

import java.util.Date;

import org.iskcon.nvcc.chantingApp.rest.model.RegistrationResponse;
import org.iskcon.nvcc.chantingApp.rest.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the ChantingApp
 */
@Controller
public class ChantingRestController {

	private static final Logger logger = LoggerFactory
			.getLogger(ChantingRestController.class);

	@RequestMapping(value = RestURIConstants.REGISTER_USER, method = RequestMethod.POST)	
	public @ResponseBody RegistrationResponse registerUser(@RequestBody User input) {
		logger.info("Start getDummyEmployee");
		User user = new User();
		user.setUserId(input.getUserId());
		user.setName(input.getName());
		user.setCreatedDate(new Date());
		RegistrationResponse registrationResponse = new RegistrationResponse();
		registrationResponse.setErrorCode("false");
		registrationResponse.setErrorMessage("Registration done");
		registrationResponse.setUser(user);
		return registrationResponse;
	}

}
