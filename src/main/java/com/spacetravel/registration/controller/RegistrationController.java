package com.spacetravel.registration.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spacetravel.registration.beans.RegisteredUser;

@RestController
@RequestMapping("registration")
public class RegistrationController {

	@GetMapping("/allUsers")
	public List<RegisteredUser> getAllRegistrations(){
		return getAllRegisteredUsers();
	}

	private List<RegisteredUser> getAllRegisteredUsers() {
		List<RegisteredUser> allUsersList = new ArrayList<RegisteredUser>();
		allUsersList.add(new RegisteredUser("Sridhar", "Karanam", "karanamsridhar@gmail.com"));
		allUsersList.add(new RegisteredUser("Satya", "Karanam", "karanamsatya@gmail.com"));
		allUsersList.add(new RegisteredUser("Purvik", "Karanam", "karanampurvik@gmail.com"));
		allUsersList.add(new RegisteredUser("Rajeev", "Karanam", "karanamrajeev@gmail.com"));
		allUsersList.add(new RegisteredUser("Saritha", "Karanam", "karanamsaritha@gmail.com"));
		allUsersList.add(new RegisteredUser("Aashi", "Karanam", "karanamaashi@gmail.com"));
		return allUsersList;
	}

}
