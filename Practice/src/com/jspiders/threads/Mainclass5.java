package com.jspiders.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class BackUpTask implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("BackUpTask starts");
		
		System.out.println("BackUpTask ends");
	}
}

class LoadPostTask implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("Load All Posts");
	}
	
}
public class Mainclass5 
{
	public static void main(String[] args) 
	{
		BackUpTask t1 = new BackUpTask();
		LoadPostTask t2 = new LoadPostTask();
		
		ScheduledExecutorService stp = Executors.newScheduledThreadPool(4); 
		stp.scheduleAtFixedRate(t1, 4, 10, TimeUnit.SECONDS);
		stp.schedule(t2, 3, TimeUnit.SECONDS);
	}
}
