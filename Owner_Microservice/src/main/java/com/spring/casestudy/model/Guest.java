package com.spring.casestudy.model;

import org.springframework.data.annotation.Id;

public class Guest {
	
	@Id
	private int guestId;
	private int guestMemberCode;
	private String guestName;
	private String gender;
	private String guestEmail;
	private String guestAddress;
	private String company;
	private String guestPhoneNumber;
	public int getGuestId() {
		return guestId;
	}
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}
	public int getGuestMemberCode() {
		return guestMemberCode;
	}
	public void setGuestMemberCode(int guestMemberCode) {
		this.guestMemberCode = guestMemberCode;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGuestEmail() {
		return guestEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	public String getGuestAddress() {
		return guestAddress;
	}
	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGuestPhoneNumber() {
		return guestPhoneNumber;
	}
	public void setGuestPhoneNumber(String guestPhoneNumber) {
		this.guestPhoneNumber = guestPhoneNumber;
	}
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", guestMemberCode=" + guestMemberCode + ", guestName=" + guestName
				+ ", gender=" + gender + ", guestEmail=" + guestEmail + ", guestAddress=" + guestAddress + ", company="
				+ company + ", guestPhoneNumber=" + guestPhoneNumber + "]";
	}
	
		
	    
	    

}
