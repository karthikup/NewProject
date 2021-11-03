package com.btc.datastructure2;

public class Queue 
{
	private int maxSize;//queue size
	private int front;//points to the front end of the queue
	private int rear;//points to the last end of the queue
	private int queueArray[];//array to store queue elements
	private int count;//current size of the queue
	
	public Queue(int size)
	{
		this.maxSize=size;
		this.queueArray=new int[maxSize];
		front=0;
		rear=-1;
		count=0;
	}
	
	public void enqueue(int item)//Inserting the elements in the queueArray from the rear end
	{
		if(isFull())
		{
			System.out.println("Queue is Full!!");
			System.exit(1);
		}
		rear = rear + 1;
		queueArray[rear] = item;
		System.out.println("Inserted: "+queueArray[rear]);
		count++;
	}
	
	public void dequeue()//removing the elements from the queueArray from front end
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!!");
			System.exit(1);
		}
		int ele = queueArray[front];
		System.out.println("dequeued: "+ele);
		front = front+1;
		count--;
	}
	
	public void peek()//Returns the front element of the queueArray
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty!!");
		}
		System.out.println("Front element is: "+queueArray[front]);
	}
	
	public int size()//Returns the current size of the queueArray
	{
		return count;
	}
	
	public boolean isEmpty()//Returns the boolean value whether the queueArray is empty or not
	{
		return size()==0;
	}
	
	public boolean isFull()//Returns the boolean value whether the queueArray is full or not
	{
		return size()==maxSize;
	}
}
