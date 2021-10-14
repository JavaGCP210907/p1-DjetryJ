package com.revature.models;

import java.sql.Timestamp;

public class Reimbursement {

	private int reimb_ID;
	private int reimb_amount;
	private Timestamp reimb_submitted;
	private Timestamp reimb_resolved;
	private String reimb_description;
	private int reimb_receipt;
	private int reimb_author;
	private int reimb_resolver;
	private int reimb_status_ID_fk;
	private int reimb_type_ID_fk;
	
	
	
	
	//boilerplate code below.....................
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}



	//all args constructor
	public Reimbursement(int reimb_ID, int reimb_amount, Timestamp reimb_submitted, Timestamp reimb_resolved,
			String reimb_description, int reimb_receipt, int reimb_author, int reimb_resolver, int reimb_status_ID_fk,
			int reimb_type_ID_fk) {
		super();
		this.reimb_ID = reimb_ID;
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_receipt = reimb_receipt;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_ID_fk = reimb_status_ID_fk;
		this.reimb_type_ID_fk = reimb_type_ID_fk;
	}



	public Reimbursement(int reimb_amount, Timestamp reimb_submitted, Timestamp reimb_resolved,
			String reimb_description, int reimb_receipt, int reimb_author, int reimb_resolver, int reimb_status_ID_fk,
			int reimb_type_ID_fk) {
		super();
		this.reimb_amount = reimb_amount;
		this.reimb_submitted = reimb_submitted;
		this.reimb_resolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_receipt = reimb_receipt;
		this.reimb_author = reimb_author;
		this.reimb_resolver = reimb_resolver;
		this.reimb_status_ID_fk = reimb_status_ID_fk;
		this.reimb_type_ID_fk = reimb_type_ID_fk;
	}



	@Override
	public String toString() {
		return "Reimbursement [reimb_ID=" + reimb_ID + ", reimb_amount=" + reimb_amount + ", reimb_submitted="
				+ reimb_submitted + ", reimb_resolved=" + reimb_resolved + ", reimb_description=" + reimb_description
				+ ", reimb_receipt=" + reimb_receipt + ", reimb_author=" + reimb_author + ", reimb_resolver="
				+ reimb_resolver + ", reimb_status_ID_fk=" + reimb_status_ID_fk + ", reimb_type_ID_fk="
				+ reimb_type_ID_fk + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reimb_ID;
		result = prime * result + reimb_amount;
		result = prime * result + reimb_author;
		result = prime * result + ((reimb_description == null) ? 0 : reimb_description.hashCode());
		result = prime * result + reimb_receipt;
		result = prime * result + ((reimb_resolved == null) ? 0 : reimb_resolved.hashCode());
		result = prime * result + reimb_resolver;
		result = prime * result + reimb_status_ID_fk;
		result = prime * result + ((reimb_submitted == null) ? 0 : reimb_submitted.hashCode());
		result = prime * result + reimb_type_ID_fk;
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
		Reimbursement other = (Reimbursement) obj;
		if (reimb_ID != other.reimb_ID)
			return false;
		if (reimb_amount != other.reimb_amount)
			return false;
		if (reimb_author != other.reimb_author)
			return false;
		if (reimb_description == null) {
			if (other.reimb_description != null)
				return false;
		} else if (!reimb_description.equals(other.reimb_description))
			return false;
		if (reimb_receipt != other.reimb_receipt)
			return false;
		if (reimb_resolved == null) {
			if (other.reimb_resolved != null)
				return false;
		} else if (!reimb_resolved.equals(other.reimb_resolved))
			return false;
		if (reimb_resolver != other.reimb_resolver)
			return false;
		if (reimb_status_ID_fk != other.reimb_status_ID_fk)
			return false;
		if (reimb_submitted == null) {
			if (other.reimb_submitted != null)
				return false;
		} else if (!reimb_submitted.equals(other.reimb_submitted))
			return false;
		if (reimb_type_ID_fk != other.reimb_type_ID_fk)
			return false;
		return true;
	}



	public int getReimb_ID() {
		return reimb_ID;
	}



	public void setReimb_ID(int reimb_ID) {
		this.reimb_ID = reimb_ID;
	}



	public int getReimb_amount() {
		return reimb_amount;
	}



	public void setReimb_amount(int reimb_amount) {
		this.reimb_amount = reimb_amount;
	}



	public Timestamp getReimb_submitted() {
		return reimb_submitted;
	}



	public void setReimb_submitted(Timestamp reimb_submitted) {
		this.reimb_submitted = reimb_submitted;
	}



	public Timestamp getReimb_resolved() {
		return reimb_resolved;
	}



	public void setReimb_resolved(Timestamp reimb_resolved) {
		this.reimb_resolved = reimb_resolved;
	}



	public String getReimb_description() {
		return reimb_description;
	}



	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}



	public int getReimb_receipt() {
		return reimb_receipt;
	}



	public void setReimb_receipt(int reimb_receipt) {
		this.reimb_receipt = reimb_receipt;
	}



	public int getReimb_author() {
		return reimb_author;
	}



	public void setReimb_author(int reimb_author) {
		this.reimb_author = reimb_author;
	}



	public int getReimb_resolver() {
		return reimb_resolver;
	}



	public void setReimb_resolver(int reimb_resolver) {
		this.reimb_resolver = reimb_resolver;
	}



	public int getReimb_status_ID_fk() {
		return reimb_status_ID_fk;
	}



	public void setReimb_status_ID_fk(int reimb_status_ID_fk) {
		this.reimb_status_ID_fk = reimb_status_ID_fk;
	}



	public int getReimb_type_ID_fk() {
		return reimb_type_ID_fk;
	}



	public void setReimb_type_ID_fk(int reimb_type_ID_fk) {
		this.reimb_type_ID_fk = reimb_type_ID_fk;
	}
	
	
	
	
	
}
