package com.jspiders.threads;


	class Superclass
	{
		
	}
	
	class Task1 extends Thread
	{
		@override
		public void run()
		{
			for(int i=0; i<=2; i++)
			{
				System.out.println("executing TaskOne");
			}
		}
	}
	
	class Task2 extends Superclass implements Runnable
	{
		@override
		public void run()
		{
			for(int i=0; i<=2; i++)
			{
				System.out.println("executing TaskTwo");
			}
		}
	}
public class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread Starts");
		
		Task2 t2 = new Task2();
		Thread th1 = new Thread(t2);
		th1.start();
		
		Task1 t1 = new Task1();
		t1.start();
		
		System.out.println("Main Thread Ends");
	}
}
