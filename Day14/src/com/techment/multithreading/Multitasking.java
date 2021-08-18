package com.techment.multithreading;

class Sanika extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("sanika :"+i+" msg :welcome to banglore");
		}
	}
}

class Parul extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("parul :"+i+" msg :vaccination");
		}
	}
}



class Amit extends Thread
{
	public void run()
	{
		for(int i=1;i<=8;i++)
		{
			if(i==3)
			{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Amit :"+i+" msg :covid 19");
		}
	}
}




public class Multitasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sanika sanika =new Sanika();
		Parul parul = new Parul();
		sanika.start();
		parul.start();
	}

}
