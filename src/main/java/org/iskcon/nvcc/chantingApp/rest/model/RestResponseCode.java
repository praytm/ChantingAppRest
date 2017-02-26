/**
 * 
 */
package org.iskcon.nvcc.chantingApp.rest.model;

/**
 * @author ma041sh
 *
 */
public enum RestResponseCode {

	/**
	 * successful login
	 */
	LOGIN_SUCCESS(0),
	/**
	 * provided userid and password did not match
	 */
	LOGIN_FAILURE_WRONG_CREDENTIALS(1),
	/**
	 * no matching userid/email found in db 
	 */
	LOGIN_FAILURE_EMAIL_NOT_FOUND(2),	
	/**
	 * successful registration
	 */
	REGISTRATION_SUCCESS(0),
	
	/**
	 * registration failed due to duplicate email provided during registration
	 */
	REGISTRATION_FAIL_DUPLICATE_EMAIL(1),
		
	/**
	 * user status was changed successfully to active or notActive
	 */
	USER_STATUS_CHANGED(0),
	
	/**
	 * user status change service called failed due to wrong credentials provided for the user in the input
	 */
	USER_STATUS_CHANGE_FAILED_WRONG_CREDENTIALS(1),
	
	/**
	 * refresh home service call was successful
	 */
	REFRESH_HOME_SUCCESS(0),
	
	/**
	 * refresh home service call was not successful due to invalid user credentials
	 */
	REFRESH_HOME_AUTHENTICATION_FAILURE(1),
	/**
	 * A generic technical failure scenario for all usecases
	 */
	TECHNICAL_FAILURE(10);

	private final int value;

	RestResponseCode(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
