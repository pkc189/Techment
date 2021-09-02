package com.techment.oops.assignment;

import java.util.Scanner;

abstract class PrepaidCard{
	int CardNo;
	double AvailableBalance;
	double swipeLimit;
	
	abstract boolean swipeCard(int amount);
	
	
	
	
	public int getCardNo() {
		return CardNo;
	}




	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}




	public double getAvailableBalance() {
		return AvailableBalance;
	}




	public void setAvailableBalance(double availableBalance) {
		AvailableBalance = availableBalance;
	}




	public double getSwipeLimit() {
		return swipeLimit;
	}




	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}




	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", AvailableBalance=" + AvailableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}




	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		CardNo = cardNo;
		AvailableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}




}

interface Rewardable{
	public static final int rewardPoints = 5;
	default int RewardPoints(int amount)
	{
		if(amount>=100)
		return rewardPoints;
		else return 0;
	}
}

class TravelCard extends PrepaidCard implements Rewardable{

	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	int rewardPoints;
	@Override
	boolean swipeCard(int amount) {
		// TODO Auto-generated method stub
		if(amount<swipeLimit && amount<AvailableBalance)
		{    
			
			this.rewardPoints=	RewardPoints(100);
			this.AvailableBalance-=amount;
			this.AvailableBalance-=amount*0.05;
				
			return true;
		}
		else 
		return false;
	}
	
}


public class PrepaidCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("Enter card no ");
		    int cardno = scanner.nextInt();
		
		    System.out.println("Enter available amount ");
		    double av_amount = scanner.nextInt();
		    
		    System.out.println("Enter swipe limit ");
		    double swipe = scanner.nextInt();
		
		    //PrepaidCard p_card = new PrepaidCard();
		    
		    
	    System.out.println("Enter amount ");
	    int amount = scanner.nextInt();
	    TravelCard obj = new TravelCard(cardno,av_amount,swipe);
	   boolean value = obj.swipeCard(amount*60);
	   
//	   if(value)
//	   {   
//		   obj.AvailableBalance -= amount;
//		   obj.AvailableBalance-=amount*0.05;
//	   }
	    
	   
	   
	   System.out.println("Details are ----------");
	   
	   System.out.println("Card no :"+obj.getCardNo());
	   System.out.println("Available amount :"+obj.getAvailableBalance());
	   System.out.println("Swipelimit :"+obj.getSwipeLimit());
	   System.out.println("Reward Points :"+obj.rewardPoints);
	    

	}

}
