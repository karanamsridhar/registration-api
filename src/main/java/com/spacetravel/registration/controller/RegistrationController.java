package com.spacetravel.registration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spacetravel.registration.beans.RegisteredUser;

@RestController
@RequestMapping("registration")
public class RegistrationController {

	private List<RegisteredUser> allUsersList = new ArrayList<RegisteredUser>();
	
	@GetMapping("/allUsers")
	public RegisteredUser[] getAllRegistrations(){
		return getAllRegisteredUsers();
	}
	
	
	@PostMapping("/addNewUser")
	public ResponseEntity<?> addNewUser(@RequestBody RegisteredUser registeredUser){
		allUsersList.add(registeredUser);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	private RegisteredUser[] getAllRegisteredUsers() {
		return allUsersList.toArray(new RegisteredUser[allUsersList.size()]);
	}

}
