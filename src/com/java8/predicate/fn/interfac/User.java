package com.java8.predicate.fn.interfac;

public class User {

	private String userName;
	private String role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String role) {
		super();
		this.userName = userName;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", role=" + role + "]";
	}
	
	
	
}
