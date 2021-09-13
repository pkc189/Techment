package com.techment.dto;

public class UserDto {

	
	String username;
	String password;
	String token;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public UserDto(String username, String password, String token) {
		super();
		this.username = username;
		this.password = password;
		this.token = token;
	}
	
	public UserDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
	}
	
}
