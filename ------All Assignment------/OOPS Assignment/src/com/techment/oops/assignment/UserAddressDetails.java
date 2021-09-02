package com.techment.oops.assignment;

class Address {
	private String addressLine;
	private String city;

	Address(String addressLine, String city) {
		this.addressLine = addressLine;
		this.city = city;
	}

	public String getAddressDetails() {
        return addressLine+", "+city;
	}

}

public class UserAddressDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Address obj1 = new Address("Housing board","Durg");
		System.out.println(obj1.getAddressDetails());
	}

}
