package com.btc.datastructure2;

public class MainClass1 {

	public static void main(String[] args) 
	{
		Queue q = new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.peek();
		q.enqueue(30);
		q.enqueue(40);
		System.out.println("-------------");
		//q.enqueue(50);
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		//q.dequeue();
		
		
	}

}
