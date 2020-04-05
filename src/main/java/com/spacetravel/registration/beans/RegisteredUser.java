package com.spacetravel.registration.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisteredUser {

	private String firstName;
	private String lastName;
	private String emailAddress;
	
	
}
