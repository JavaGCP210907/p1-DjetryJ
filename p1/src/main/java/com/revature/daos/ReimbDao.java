package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Reimbursement;
import com.revature.utils.ConnectionUtil;

public class ReimbDao implements ReimbInterface {

	@Override
	public List<Reimbursement> getAllReimbursement() {
		
		try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "SELECT * FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
			List<Reimbursement> ReList = new ArrayList<>();
			
			while(rs.next()) {
				Reimbursement r = new Reimbursement(
						rs.getInt("reimb_ID"),
						rs.getInt("reimb_amount"),
						rs.getTimestamp("reimb_submitted"),
						rs.getTimestamp("reimb_resolved"),
						rs.getString("reimb_description"),
						rs.getInt("reimb_receipt"), 0, 0, 0, 0
						);
				
				ReList.add(r);
			
			}
			
		}catch(SQLException e) {
			System.out.println("Could not get Reimbursements");
			e.printStackTrace();
		
	}
		return null;
		
	}

	@Override
	public Reimbursement getReimbByID(int id) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_ID FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement getReimbAmount(int reimb_amount) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_amount FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
			
		return null;
	}

	@Override
	public Reimbursement getReimbSubmit(Timestamp reimb_submit) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_submitted FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement getReimbResolve(Timestamp reimb_resolve) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_resolved FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement getReimbDescription(String reimb_description) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_description FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement getReimbReceipt(int reimb_receipt) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_receipt FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement getReimbAuthor(int reimb_author) {
		
		try(Connection con = ConnectionUtil.getConnection()){
			String sql = "SELECT reimb_author FROM ers_reimbursement";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println("THERE'S BEEN A GLITCH IN THE MATRIX");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Reimbursement addReimbursement(Reimbursement reimb) {
		
try(Connection con = ConnectionUtil.getConnection()){
			
			String sql = "INSERT INTO ers_reimbursement(reimb_ID, reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_receipt, reimb_author, reimb_resolver)"+
													"Values(?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, reimb.getReimb_ID());
			ps.setInt(2, reimb.getReimb_amount());
			ps.setTimestamp(3, reimb.getReimb_submitted());
			ps.setTimestamp(4, reimb.getReimb_resolved());
			ps.setString(5, reimb.getReimb_description());
			ps.setInt(6, reimb.getReimb_receipt());
			ps.setInt(7, reimb.getReimb_author());
			ps.setInt(8, reimb.getReimb_resolver());
			
			ps.executeUpdate();
		}catch(SQLException e) {
			System.out.println("adding new user failed dog!!!");
			e.printStackTrace();
		}
		return null;
	}

}
