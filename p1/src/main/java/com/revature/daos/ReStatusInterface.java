package com.revature.daos;

import java.util.List;

import com.revature.models.ReimbStatus;

public interface ReStatusInterface {

	public List<ReimbStatus> getReimbStatus();
	
	public ReimbStatus getReimbStatus(String reimb_status);
	
	public ReimbStatus getReimbStatusID(int reimb_status_id);
}
