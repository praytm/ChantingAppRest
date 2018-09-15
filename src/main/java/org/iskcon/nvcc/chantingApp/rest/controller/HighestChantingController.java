package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.HighestChantingInfoDTO;
import org.iskcon.nvcc.chantingApp.rest.model.HighestChantingResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HighestChantingController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(HighestChantingController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = RestURIConstants.GET_HIGHEST_CHANTING, method = RequestMethod.POST)
	@ResponseBody
	public HighestChantingResponse getHighestChanting(
			@RequestBody HighestChantingInfoDTO highestChantingInfoDTO) {
		HighestChantingResponse highestChantingResponse = new HighestChantingResponse();
		try {
			HighestChantingInfoDTO chantingInfoDTO = userService.getHighestChanting();
			highestChantingResponse.setHighestChantingInfoDTO(chantingInfoDTO);
			
		} catch(Exception e){
			logger.error("exception ocured in highestChantingResponse :", e);
		}
		return highestChantingResponse;
	}
}
