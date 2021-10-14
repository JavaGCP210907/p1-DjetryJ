package com.revature.daos;

import java.util.List;

import com.revature.models.UserRoles;

public interface UserRoleInterface {

	public List<UserRoles> getAllUserRoles();
	
	public UserRoles getUserRolesById(int id);
	
	public UserRoles getUserRoles(String user_role);
}
