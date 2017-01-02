package org.iskcon.nvcc.chantingApp.rest.controller;

import org.springframework.web.client.RestTemplate;

public class TestSpringRestExample {

	public static final String SERVER_URI = "http://localhost:8080/chantingapprest-0.0.1-SNAPSHOT";

	public static void main(String args[]) {

		testRegisterUser();
		System.out.println("*****");

	}

	private static void testRegisterUser() {
		RestTemplate restTemplate = new RestTemplate();
		ClientUserObject clientUserObject = new ClientUserObject();
		clientUserObject.setUserId("testuserid");
		clientUserObject.setEmail("test@test.com");
		clientUserObject.setName("testUser");
		ClientRegistrationResponseObject response = restTemplate.postForObject(
				SERVER_URI + RestURIConstants.REGISTER_USER, clientUserObject,
				ClientRegistrationResponseObject.class);
		printRegisteredUserData(response.getClientUserObject());
	}

	public static void printRegisteredUserData(ClientUserObject clientUserObject) {
		System.out.println("ID=" + clientUserObject.getUserId() + ",Name="
				+ clientUserObject.getName() + ",CreatedDate="
				+ clientUserObject.getCreatedDate());
	}
}
