package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.models.UserRoles;
import com.revature.utils.ConnectionUtil;

public class UserRoleDao implements UserRoleInterface {

	@Override
	public List<UserRoles> getAllUserRoles() {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ers_user_roles";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
		}catch (SQLException e) {
			System.out.println("Could not get the roles bro!!");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserRoles getUserRolesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRoles getUserRoles(String user_role) {
		// TODO Auto-generated method stub
		return null;
	}

}
