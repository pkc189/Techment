package com.techment.multithreading;

class Water
{
	 public void drinkingWater(int time)
	{  synchronized (this) {
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking "+time);
		}
		
	}
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is eating "+time);
		}
	}
}

class WaterBottle implements Runnable
{
	Water water = new Water();
	

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		water.drinkingWater(5);
	}
	
}


public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterBottle w1 = new WaterBottle();
		Thread person1 = new Thread(w1);
		Thread person2 = new Thread(w1);
		
		person1.start();
		person2.start();
		
	}

}
