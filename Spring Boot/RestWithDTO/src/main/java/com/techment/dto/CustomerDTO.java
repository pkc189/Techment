package com.techment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class CustomerDTO {

	private int id;
	private int age;
	private String name;
	private String address;
	private String email;
	private String mobile;
	public CustomerDTO(int age, String name, String address, String email, String mobile) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}
	
	
	
	
	public CustomerDTO(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}




	public CustomerDTO() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
