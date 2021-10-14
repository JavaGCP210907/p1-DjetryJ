package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

public class UserDao implements UserInterface {

	@Override
	public List<User> getAllUsers() {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ers_users";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
			List<User> Userlist = new ArrayList<>();
			
			while(rs.next()) {
				User u = new User(
						rs.getInt("ers_users_ID"),
						rs.getString("ers_username"),
						rs.getString("user_first_name"),
						rs.getString("user_last_name"),
						rs.getString("user_email"),
						null,0
						);
				Userlist.add(u);
			}
			return Userlist;
		}catch (SQLException e) {
			System.out.println("Getting the User's has failed");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserById(int id) {
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT ers_users_ID FROM ers_users";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch (SQLException e) {
			System.out.println("Getting the ID's of users failed");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByF_name(String f_name) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "SELECT user_first_name FROM ers_users";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
		}catch(SQLException e) {
			System.out.println("Could not retrieve first names");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByL_name(String l_name) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "SELECT user_last_name FROM ers_users";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("Could not retrieve last names");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "SELECT user_email FROM ers_users";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
		}catch(SQLException e) {
			System.out.println("Email no bueno bro");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void adduser(User user) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "INSERT INTO ers_users(ers_username, ers_password, user_first_name, user_last_name, user_email)"+
													"Values(?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFirst_name());
			ps.setString(4, user.getLast_name());
			ps.setString(5, user.getEmail());
			
			ps.executeUpdate();
		}catch(SQLException e) {
			System.out.println("adding new user failed dog!!!");
			e.printStackTrace();
		}
		
	}

}
