package com.techment.custom;

public class Account {
  int balance = 5000;
  String withdraw (int amount) {
	  if(amount>balance)
		  throw new InsuffientFundException("insuffient fund");
	  else 
		 return "you have withdraw "+amount;
  }
}
