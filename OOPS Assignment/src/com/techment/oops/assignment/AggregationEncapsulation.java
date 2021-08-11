package com.techment.oops.assignment;



	
	

class Address12{
	String area;
	String city;

  Address12(String area,String city)
  {
	  this.area=area;
	  this.city=city;
  }
	
}

public class AggregationEncapsulation {

	private String customerName;
	Address12 residentialAddress;
	
	
	AggregationEncapsulation(String customerName,Address12 resdentialAddress){
		this.customerName=customerName;
		this.residentialAddress=resdentialAddress;
	}
	
	
	
	
	
	
	public String getCustomerDetails() {
		
		String str = "Customer : "+customerName+"\n"+"Residential Address :"+residentialAddress.area+" "+residentialAddress.city;
		return str;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Address12 addr = new Address12("Houding board","Durg");
		AggregationEncapsulation customer = new AggregationEncapsulation("Pankaj",addr);
		System.out.println(customer.getCustomerDetails());
	}

}

	
	
	

