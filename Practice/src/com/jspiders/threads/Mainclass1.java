package com.jspiders.threads;

class TaskOne extends Thread
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

class TaskTwo extends Thread
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

public class Mainclass1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Thread Starts");
		
		TaskOne t1 = new TaskOne();
		TaskTwo t2 = new TaskTwo();
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread Ends");
	}
}
