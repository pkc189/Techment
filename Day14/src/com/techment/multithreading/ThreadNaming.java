package com.techment.multithreading;

class Apple extends Thread
{
	public void run()
	{   for(int i=0;i<5;i++)
		System.out.println("eat apple "+Thread.currentThread().getName());
	}
}

class Banana extends Thread
{
	public void run()
	{   for(int i =0;i<5;i++)
		System.out.println("eat banana "+Thread.currentThread().getName());
	}
}




public class ThreadNaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple apple = new Apple();
Banana banana = new Banana();

apple.setName("apple");

banana.setPriority(5);
apple.setPriority(6);

apple.start();
banana.start();
System.out.println(Thread.currentThread().getName());

	}

}
