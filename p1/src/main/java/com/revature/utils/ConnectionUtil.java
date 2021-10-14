package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Cannot locate Driver");
		}
		
		String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=p1";
		String username = "postgres";
		String password = "Nukacola4$";
		
		return DriverManager.getConnection(url, username, password);
	}
}
