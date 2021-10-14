package com.revature.services;

public class LoginService {

	public boolean login(String username, String password) {
		
		if(username.equals("Neo") && password.equals("The1")) {
			return true;
		}
		return false;
	}
}
