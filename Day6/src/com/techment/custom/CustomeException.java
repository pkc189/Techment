package com.techment.custom;

public class CustomeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Account account = new Account();
		try {
			System.out.println(account.withdraw(20000));
		}catch(InsuffientFundException a) {
			System.out.println(a.getMessage());
		}
		
	}

}
