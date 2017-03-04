package org.iskcon.nvcc.chantingApp.rest.controller;

public class RestURIConstants {


	public static final String CHANGE_USER_STATUS_NOT_ACTIVE = "/rest/user/deactivate";
	public static final String CHANGE_USER_STATUS_ACTIVE = "/rest/user/activate";
	public static final String REFRESH_USER_STATISTICS = "/rest/user/refresh_home";
	public static final String REGISTER_USER = "/rest/user/register";
	public static final String LOGIN_USER = "/rest/user/login";
	public static final String SAVE_NEW_CHANTING_SESSION = "/rest/user/save_new_chanting_session";
	public static final String DELETE_EMP = "/rest/emp/delete/{id}";
}
