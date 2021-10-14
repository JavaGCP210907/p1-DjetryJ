package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.ReimbStatus;
import com.revature.models.ReimbType;
import com.revature.utils.ConnectionUtil;

public class ReStatDao implements ReStatusInterface {

	@Override
	public List<ReimbStatus> getReimbStatus() {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ers_reimbursement_status";
			
			Statement s = con.createStatement();
			
			ResultSet rs = null;
			
			rs = s.executeQuery(sql);
			
			List<ReimbStatus> RTstatList = new ArrayList<>();
			
			while(rs.next()) {
				ReimbStatus rstat = new ReimbStatus(
						rs.getInt("reimb_status_ID"),
						rs.getString("reimb_status"));
				
				RTstatList.add(rstat);
			}
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ReimbStatus getReimbStatus(String reimb_status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReimbStatus getReimbStatusID(int reimb_status_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
