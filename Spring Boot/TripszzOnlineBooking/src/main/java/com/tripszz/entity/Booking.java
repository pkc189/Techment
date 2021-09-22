package com.tripszz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking_id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	private Customer customer;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	private Flight flight;
	
	@NotEmpty(message= "Departure is required ")
	private String departure;
	
	@NotEmpty(message= "Return name is required ")
	private String returns;
	
	@NotEmpty(message= "No of Person  is required ")
	private Long noOfPerson;
	
	@NotEmpty(message= "Amount is required ")
	private Double amount;
	
	@NotEmpty(message= "Status name is required ")
	private String status;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getReturns() {
		return returns;
	}

	public void setReturns(String returns) {
		this.returns = returns;
	}

	public Long getNoOfPerson() {
		return noOfPerson;
	}

	public void setNoOfPerson(Long noOfPerson) {
		this.noOfPerson = noOfPerson;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Booking(@NotNull Customer customer, @NotNull Flight flight,
			@NotEmpty(message = "Departure is required ") String departure,
			@NotEmpty(message = "Return name is required ") String returns,
			@NotEmpty(message = "No of Person  is required ") Long noOfPerson,
			@NotEmpty(message = "Amount is required ") Double amount,
			@NotEmpty(message = "Status name is required ") String status) {
		super();
		this.customer = customer;
		this.flight = flight;
		this.departure = departure;
		this.returns = returns;
		this.noOfPerson = noOfPerson;
		this.amount = amount;
		this.status = status;
	}

	public Booking() {
		super();
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", customer=" + customer + ", flight=" + flight + ", departure="
				+ departure + ", returns=" + returns + ", noOfPerson=" + noOfPerson + ", amount=" + amount + ", status="
				+ status + "]";
	}
	
	
	
}
