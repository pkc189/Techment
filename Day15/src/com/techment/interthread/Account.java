package com.techment.interthread;

public class Account {
	int balance = 0;

	synchronized public int withdraw(int amount) {

		if (amount > balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName() + " is going to withdraw");
		balance -= amount;

		return balance;
	}

	synchronized public int deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " is going to deposit ");
		return balance;
	}

}
