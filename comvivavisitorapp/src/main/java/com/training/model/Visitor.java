package com.training.model;

public class Visitor {

	private int visitorId;
	private String visitorName;
	private String purpose;
	private String contactPerson;
	
	public Visitor() {
		// TODO Auto-generated constructor stub
	}

	public Visitor(int visitorId, String visitorName, String purpose, String contactPerson) {
		super();
		this.visitorId = visitorId;
		this.visitorName = visitorName;
		this.purpose = purpose;
		this.contactPerson = contactPerson;
	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Override
	public String toString() {
		return "Visitor [visitorId=" + visitorId + ", visitorName=" + visitorName + ", purpose=" + purpose
				+ ", contactPerson=" + contactPerson + "]";
	}

}
