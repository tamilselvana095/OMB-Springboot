package com.omb.dto;

public class MaidLoginDto {
	
	private String phone;
	private String password;
	
	public MaidLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MaidLoginDto [phone=" + phone + ", password=" + password + "]";
	}
	
	

}
