package com.ahsan.entity;

//POJO CLASS: Plain Old Java Object
public class user_details {
	private int user_id;
	
	@Override
	public String toString() {
		return "user_details [user_id=" + user_id + ", user_name=" + user_name + ", email_address=" + email_address
				+ ", password=" + password + "]";
	}
	private String user_name;
	private String email_address;
	private String password;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public user_details() {
		// TODO Auto-generated constructor stub
	}
	public user_details(int user_id, String user_name, String email_address, String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email_address = email_address;
		this.password = password;
	}
	
	
}

