package com.btc.datastructures;

public class Stack 
{
	private int maxSize;
	private char stackArray[];
	private int top;
	
	
	public Stack(int size)
	{
		this.maxSize=size;
		this.stackArray=new char[maxSize];
		top=-1;
	}
	
	public void push(char item)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		top++;
		stackArray[top]=item;
		System.out.println("Pushed: "+stackArray[top]);
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		int oldTop = top;
		top--;
		System.out.println("Poped: "+stackArray[oldTop]);
	}
	
	public char peek()
	{
		int oldTop = top;
		return stackArray[oldTop];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top == maxSize-1;
	}
}
