package com.revature.daos;

import java.sql.Timestamp;
import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbInterface {

	public List<Reimbursement> getAllReimbursement();
	
	public Reimbursement getReimbByID(int id);
	
	public Reimbursement getReimbAmount(int reimb_amount);
	
	public Reimbursement getReimbSubmit(Timestamp reimb_submit);
	
	public Reimbursement getReimbResolve(Timestamp reimb_resolve);
	
	public Reimbursement getReimbDescription(String reimb_description);
	
	public Reimbursement getReimbReceipt(int reimb_receipt);
	
	public Reimbursement getReimbAuthor(int reimb_author);
	
	public Reimbursement addReimbursement(Reimbursement reimb);
}
