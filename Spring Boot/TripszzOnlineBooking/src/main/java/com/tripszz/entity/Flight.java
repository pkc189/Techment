package com.tripszz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int flight_id;
	
	@NotEmpty(message= "Flight name is required ")
	 String flight_name;
	
	@NotEmpty(message= "Source name is required ")
	 String source;
	
	@NotEmpty(message= "Destination name is required ")
	 String destination;
	
	@NotNull
	 int amount;

	
	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	

	public Flight(@NotEmpty(message = "Flight name is required ") String flight_name,
			@NotEmpty(message = "Source name is required ") String source,
			@NotEmpty(message = "Destination name is required ") String destination, @NotNull int amount) {
		super();
		this.flight_name = flight_name;
		this.source = source;
		this.destination = destination;
		this.amount = amount;
	}

	public Flight() {
		super();
	}



	
}
