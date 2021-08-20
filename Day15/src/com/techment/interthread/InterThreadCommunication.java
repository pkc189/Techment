package com.techment.interthread;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		Thread t1 = new Thread() {
			public void run() {
				account.withdraw(3000);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				System.out.println(" after deposit balance is " + account.deposit(2000));
			}
		};

		t1.setName("Atm");
		t2.setName("Bank");
		
		t1.start();
		t2.start();
	}

}
