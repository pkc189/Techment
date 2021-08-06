package com.techment.bank;


class CustomerDetails{
	int custid;
	String custname;
	Account account;
	public CustomerDetails(int custid, String custname, Account account) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.account = account;
	}
	
	
	void showDetails() {
		System.out.println("Customer id "+custid);
		System.out.println("Name "+custname);
		System.out.println("Account no "+account.accountno);
		System.out.println("Account type "+account.accountType);
		System.out.println("Balance "+account.balance);
		System.out.println("IFSC "+account.ifsc);
		System.out.println("Branch "+account.branch);
	}
	
}

class Account{
	int accountno;
	String accountType;
	int balance;
	String ifsc;
	String branch;
	public Account(int accountno, String accountType, int balance, String ifsc, String branch) {
		super();
		this.accountno = accountno;
		this.accountType = accountType;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
}


public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		Account pankajAccount = new Account(122334,"Saving",32000,"SBIN3333","SBI");
		
		CustomerDetails pankaj = new CustomerDetails(23421,"Pankaj",pankajAccount);
		
		pankaj.showDetails();
		
		
	}

}
