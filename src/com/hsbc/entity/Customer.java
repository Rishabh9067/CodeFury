package com.hsbc.entity;

public class Customer {
	private int cid;
	private String cname;
	private String address;
	private String state;
	private String email;
	private int pincode;
	private String phone;
	private int gstNo;
	
	public Customer(int cid, String cname, String address, String state, String email, int pincode, String phone,
			int gstNo) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.state = state;
		this.email = email;
		this.pincode = pincode;
		this.phone = phone;
		this.gstNo = gstNo;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getGstNo() {
		return gstNo;
	}

	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}
}
