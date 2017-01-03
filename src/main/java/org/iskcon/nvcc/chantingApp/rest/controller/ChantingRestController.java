package org.iskcon.nvcc.chantingApp.rest.controller;

import java.util.Date;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;
import org.iskcon.nvcc.chantingApp.rest.model.RegistrationResponse;
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
public class ChantingRestController {
	
	@Autowired 
	private UserService userService;

	private static final Logger logger = LoggerFactory
			.getLogger(ChantingRestController.class);

	@RequestMapping(value = RestURIConstants.REGISTER_USER, method = RequestMethod.POST)	
	public @ResponseBody RegistrationResponse registerUser(@RequestBody UserDTO input) {
		logger.info("Start getDummyEmployee");
		UserDTO output = userService.registerUser(input);
		
		RegistrationResponse registrationResponse = new RegistrationResponse();
		registrationResponse.setErrorCode("false");
		registrationResponse.setErrorMessage("Registration done");	
		registrationResponse.setUserDto(output);
		
		return registrationResponse;
	}

}
