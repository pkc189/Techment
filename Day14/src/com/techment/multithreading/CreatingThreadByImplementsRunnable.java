package com.techment.multithreading;

class Info implements Runnable
{

	@Override
	public void run() {
		 System.out.println("this is my task runnable");
		
	}
	
}


public class CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Info info = new Info();
		
		Thread thread = new Thread(info);
		thread.start();
	}

}
