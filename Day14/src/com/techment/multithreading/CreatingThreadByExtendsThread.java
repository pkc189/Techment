package com.techment.multithreading;

class Message extends Thread
{
	public void run()
	{
		System.out.println("this is my task");
	}
}



public class CreatingThreadByExtendsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message message = new Message();
		message.start();
	}

}
