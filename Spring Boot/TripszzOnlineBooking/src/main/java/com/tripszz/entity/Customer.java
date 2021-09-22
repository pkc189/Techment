package com.tripszz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customer_id;
	
	@NotEmpty(message= "Customer name is required ")
	String customer_name;
	@NotEmpty(message= "Password is required ")
	String password;
	@NotEmpty(message= "City is required ")
	String city;
	@NotEmpty(message= "State name is required ")
	String state;
	@NotEmpty(message= "Zip is required ")
	String zip;
	@NotEmpty(message= "Country name is required ")
	String country;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Customer(@NotEmpty(message = "Customer name is required ") String customer_name,
			@NotEmpty(message = "Password is required ") String password,
			@NotEmpty(message = "City is required ") String city,
			@NotEmpty(message = "State name is required ") String state,
			@NotEmpty(message = "Zip is required ") String zip,
			@NotEmpty(message = "Country name is required ") String country) {
		super();
		this.customer_name = customer_name;
		this.password = password;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public Customer() {
		super();
	}
	
	
	
}
