package com.revature.daos;

import java.util.List;

import com.revature.models.ReimbType;

public interface ReTypeInterface {

	public List<ReimbType> getAllReimbType();
	
	public ReimbType getReimbTypeID(int reimb_type_id);
	
	public ReimbType getReimbType(int reimb_type);
}
