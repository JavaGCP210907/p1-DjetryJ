package com.revature.daos;

import java.util.List;

import com.revature.models.User;

public interface UserInterface {

	public List<User> getAllUsers();
	
	public User getUserById(int id);
	
	public User getUserByF_name(String f_name);
	
	public User getUserByL_name(String l_name);
	
	public User getUserByEmail(String email);
	
	public void adduser(User user);
	
	
}
