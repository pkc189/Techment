package com.techment.task;
class Customer{
	int id;
	String name;
	long  contact;
	float minBalance;
	
	public void CustomerDetails() {
		System.out.println("Name "+name);
		System.out.println("Id "+id);
		System.out.println("Contact "+contact);
		System.out.println("minBalance "+minBalance);
	System.out.println();
	}
	Customer(int id,String name,long contact,float minBalance){
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.minBalance=minBalance;
	}
	
	public String AccountType() {
		if(minBalance==0)
		{
			return "Zero Balance";
		}
		else if(minBalance==1000)
		{
			return "Saving Account";
		}
		
		
		{
			return "Current Account";
		}
	}
	
	
}


public class CustomerOops {

	public static void main(String[] args) {
		
		Customer cus1 = new Customer(1,"Pankaj",877063146,987656);
		Customer cus2 = new Customer(2,"abc",877063146,1000);
		Customer cus3 = new Customer(3,"xyz",877063146,987656);
		
		cus1.CustomerDetails();
		cus2.CustomerDetails();
		System.out.println(cus2.AccountType());
 
	}

}
