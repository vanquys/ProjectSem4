
package com.aptech.ProjectSem4.entities;

public class LoginModel {
	private String UserName ;
	private String Password;
	private String Role;
	public LoginModel(String userName, String password, String role) {
		super();
		UserName = userName;
		Password = password;
		Role = role;
	}
	public LoginModel() {
		super();
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
}

