package com.techment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CustomerDTO {

	private int id;
	  @NotBlank(message = "Name is mandatory")
	private int age;
	@Size(min = 3 , message="name should be minimum 3 character")
	private String name;
	  @NotBlank(message = "Name is mandatory")
	private String address;
	@Email(message="give proper email")
	private String email;
	@Size(min=10,max=10, message="length shoud be 10")
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
