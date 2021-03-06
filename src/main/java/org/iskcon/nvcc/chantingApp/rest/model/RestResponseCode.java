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
	 * Registration failed due to incomplete or incorrect user data input from client (check the GoogleAuthToken related data)
	 */
	REGISTRATION_FAIL_INCOMPLETE_USER_DATA(2),

	/**
	 * user status was changed successfully to active or notActive
	 */
	USER_STATUS_CHANGED(0),

	/**
	 * user status change service called failed due to wrong credentials
	 * provided for the user in the input
	 */
	USER_STATUS_CHANGE_FAILED_WRONG_CREDENTIALS(1),

	/**
	 * refresh home service call was successful
	 */
	REFRESH_HOME_SUCCESS(0),

	/**
	 * refresh home service call was not successful due to invalid user
	 * credentials
	 */
	REFRESH_HOME_AUTHENTICATION_FAILURE(1),

	/**
	 * New chanting session for the user was saved successfully in the database
	 * and the user status was reset back to NotActive
	 */
	CHANTING_SESSION_SAVE_SUCCESS(0),

	/**
	 * New chanting session for the user could not be saved due to wrong
	 * credentials provided in the input
	 */
	CHANTING_SESSION_SAVE_AUTHENTICATION_FAILURE(1),

	/**
	 * The chanting history for the specified user in the request was
	 * successfully fetched from database for 30 days from input date or current
	 * date if input date is null
	 */
	GET_CHANTING_HISTORY_SUCCESS(0),
	
	/**
	 * The chanting history for specified user was not fetched due to wrong credentials provided in the input
	 */
	GET_CHANTING_HISTORY_AUTHENTICATION_FAILURE(1),
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
