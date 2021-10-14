package com.revature.services;

import java.util.List;

import com.revature.daos.ReTypeDao;
import com.revature.models.ReimbType;

public class ReimbTypeService {

	ReTypeDao rtDao = new ReTypeDao();
	
	public List<ReimbType> getAllReimbType(){
		return rtDao.getAllReimbType();
		}
}
