package com.revature.services;

import java.util.List;

import com.revature.daos.UserRoleDao;
import com.revature.models.UserRoles;

public class UserRoleService {

	UserRoleDao urDao = new UserRoleDao();
	
	public List<UserRoles> getAllUserRoles(){
		return urDao.getAllUserRoles();
	}
}
