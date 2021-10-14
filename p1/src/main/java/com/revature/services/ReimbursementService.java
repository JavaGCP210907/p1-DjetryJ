package com.revature.services;

import java.util.List;

import com.revature.daos.ReimbDao;
import com.revature.models.Reimbursement;

public class ReimbursementService {

	ReimbDao rDao = new ReimbDao();
	
	public List<Reimbursement> getAllReimburesment(){
		return rDao.getAllReimbursement();
	}
}
