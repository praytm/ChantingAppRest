/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.controller;

import org.iskcon.nvcc.chantingApp.bs.UserService;
import org.iskcon.nvcc.chantingApp.dto.ChantingSessionDTO;
import org.iskcon.nvcc.chantingApp.rest.model.RestResponseCode;
import org.iskcon.nvcc.chantingApp.rest.model.SaveNewChantingSessionResponse;
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
public class ChantingSessionController {

	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ChantingSessionController.class);
	/**
	 * 
	 */
	@Autowired
	private UserService userService;

	/**
	 * @param input
	 * @return
	 */
	@RequestMapping(value = RestURIConstants.SAVE_NEW_CHANTING_SESSION, method = RequestMethod.POST)
	@ResponseBody
	public SaveNewChantingSessionResponse saveNewChantingSession(
			@RequestBody ChantingSessionDTO chantingSessionDto) {
		SaveNewChantingSessionResponse saveNewChantingSessionResponse = new SaveNewChantingSessionResponse();
		try {
			Boolean chantingSessionSaved = userService
					.saveNewChantingSession(chantingSessionDto);
			if (chantingSessionSaved) {
				// chanting session was saved successfully in database
				saveNewChantingSessionResponse
						.setResponseCode(RestResponseCode.CHANTING_SESSION_SAVE_SUCCESS);				
			} else {
				saveNewChantingSessionResponse
						.setResponseCode(RestResponseCode.CHANTING_SESSION_SAVE_AUTHENTICATION_FAILURE);
			}
			saveNewChantingSessionResponse.setChantingSessionSaved(chantingSessionSaved);
			saveNewChantingSessionResponse
					.setTechnicalStatus(TechnicalStatus.SUCCESS);
		} catch (Exception e) {
			logger.error("exception ocured in saveNewChantingSession :", e);
			saveNewChantingSessionResponse
					.setTechnicalStatus(TechnicalStatus.FAIL);
			saveNewChantingSessionResponse
					.setResponseCode(RestResponseCode.TECHNICAL_FAILURE);
			saveNewChantingSessionResponse.setChantingSessionSaved(false);
		}
		return saveNewChantingSessionResponse;
	}
}
