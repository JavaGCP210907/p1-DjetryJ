package com.revature.models;

public class ReimbStatus {

	private int reimb_status_ID;
	private String reimb_status;
	
	
	//boilerplate code below................
	
	//no args constructor
	public ReimbStatus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ReimbStatus(int reimb_status_ID, String reimb_status) {
		super();
		this.reimb_status_ID = reimb_status_ID;
		this.reimb_status = reimb_status;
	}


	@Override
	public String toString() {
		return "ReimbStatus [reimb_status_ID=" + reimb_status_ID + ", reimb_status=" + reimb_status + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reimb_status == null) ? 0 : reimb_status.hashCode());
		result = prime * result + reimb_status_ID;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbStatus other = (ReimbStatus) obj;
		if (reimb_status == null) {
			if (other.reimb_status != null)
				return false;
		} else if (!reimb_status.equals(other.reimb_status))
			return false;
		if (reimb_status_ID != other.reimb_status_ID)
			return false;
		return true;
	}


	public int getReimb_status_ID() {
		return reimb_status_ID;
	}


	public void setReimb_status_ID(int reimb_status_ID) {
		this.reimb_status_ID = reimb_status_ID;
	}


	public String getReimb_status() {
		return reimb_status;
	}


	public void setReimb_status(String reimb_status) {
		this.reimb_status = reimb_status;
	}
	
	
}
