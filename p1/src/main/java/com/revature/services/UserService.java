package com.revature.services;

import java.util.List;

import com.revature.daos.UserDao;
import com.revature.models.User;

public class UserService {

	UserDao uDao = new UserDao();
	
	public List<User> getallUsers(){
		return uDao.getAllUsers();
	}
}
