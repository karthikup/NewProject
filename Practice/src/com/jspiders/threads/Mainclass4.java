package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadTask implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("ThreadTask executing");
	}
	
}
public class Mainclass4 
{
	public static void main(String[] args) 
	{
		ThreadTask t1 = new ThreadTask();
		ExecutorService ctp = Executors.newCachedThreadPool(); 
		for(int i=0; i<=5; i++)
		{
			ctp.submit(t1);
		}
		ctp.shutdown();
	}
}
