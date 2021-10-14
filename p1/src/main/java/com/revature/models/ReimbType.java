package com.revature.models;

public class ReimbType {

	private int reimb_type_ID;
	private String reimb_type;
	
	
	
	
	
	//boilerplate code below....................
	
	//no args constructor
	public ReimbType() {
		super();
		// TODO Auto-generated constructor stub
	}





	public ReimbType(int reimb_type_ID, String reimb_type) {
		super();
		this.reimb_type_ID = reimb_type_ID;
		this.reimb_type = reimb_type;
	}





	@Override
	public String toString() {
		return "ReimbType [reimb_type_ID=" + reimb_type_ID + ", reimb_type=" + reimb_type + "]";
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reimb_type == null) ? 0 : reimb_type.hashCode());
		result = prime * result + reimb_type_ID;
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
		ReimbType other = (ReimbType) obj;
		if (reimb_type == null) {
			if (other.reimb_type != null)
				return false;
		} else if (!reimb_type.equals(other.reimb_type))
			return false;
		if (reimb_type_ID != other.reimb_type_ID)
			return false;
		return true;
	}





	public int getReimb_type_ID() {
		return reimb_type_ID;
	}





	public void setReimb_type_ID(int reimb_type_ID) {
		this.reimb_type_ID = reimb_type_ID;
	}





	public String getReimb_type() {
		return reimb_type;
	}





	public void setReimb_type(String reimb_type) {
		this.reimb_type = reimb_type;
	}
	
	
	
	
}
