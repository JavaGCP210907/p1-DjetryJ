package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.ReimbType;
import com.revature.utils.ConnectionUtil;

public class ReTypeDao implements ReTypeInterface {

	@Override
	public List<ReimbType> getAllReimbType() {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ers_reimburesment_type";
			
			Statement s = con.createStatement();
			
			ResultSet rs = null;
			
			rs = s.executeQuery(sql);
			
			List<ReimbType> RTList = new ArrayList<>();
			
			while(rs.next()) {
				ReimbType rt = new ReimbType(
						rs.getInt("reimb_type_ID"),
						rs.getString("reimb_type"));
				
				RTList.add(rt);
			}
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ReimbType getReimbTypeID(int reimb_type_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReimbType getReimbType(int reimb_type) {
		// TODO Auto-generated method stub
		return null;
	}

}
