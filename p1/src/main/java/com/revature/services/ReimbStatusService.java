package com.revature.services;

import java.util.List;

import com.revature.daos.ReStatDao;
import com.revature.models.ReimbStatus;

public class ReimbStatusService {

	ReStatDao rsDao = new ReStatDao();
	
	public List<ReimbStatus> getAllReimbStatus(){
		return rsDao.getReimbStatus();
	}
}
