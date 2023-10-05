package com.velocity.ec.dto;

public class UserLoginDto {

	private String email;
	private String password;

	// generate getter and setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Default Constructor
	public UserLoginDto() {

	}

	// parameterized Constructor
	public UserLoginDto(String email, String password) {

		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLoginDto [email=" + email + ", password=" + password + "]";
	}

}
