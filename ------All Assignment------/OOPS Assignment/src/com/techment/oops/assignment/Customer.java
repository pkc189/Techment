package com.techment.oops.assignment;


//Create a class Customer with following private member variables
//•	customerName of type String
//•	residentialAddress of type Address (HAS –A relation)
//
//Include a default constructor
//Create parameterized constructor which takes 2 parameters and initialize member variables
//Include Getters and Setters.
//Create method getCustomerDetails which returns a String with Customer details in below format
//Customer : John
//Residential Address : Ist Main HSR Layout, Bangalore

class Address1{
	String area;
	String city;

  Address1(String area,String city)
  {
	  this.area=area;
	  this.city=city;
  }
	
}

public class Customer {

	private String customerName;
	Address1 residentialAddress;
	
	
	Customer(String customerName,Address1 resdentialAddress){
		this.customerName=customerName;
		this.residentialAddress=resdentialAddress;
	}
	
	
	
	
	
	
	public String getCustomerDetails() {
		
		String str = "Customer : "+customerName+"\n"+"Residential Address :"+residentialAddress.area+" "+residentialAddress.city;
		return str;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Address1 addr = new Address1("Houding board","Durg");
		Customer customer = new Customer("Pankaj",addr);
		System.out.println(customer.getCustomerDetails());
	}

}
