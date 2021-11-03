package com.btc.heap;

public class MainClass {

	public static void main(String[] args) 
	{
		Heap h = new Heap(5);
		h.insert(10);
		h.insert(5);
		h.insert(100);
		h.insert(12);
		h.insert(18);
		System.out.println("After Inserting: ");
		for(int i=0;i<h.getSize();i++) 
		{
			System.out.print(h.heapArray[i].getKey()+" ");
		}
		System.out.println();
		h.delete();
		System.out.println("After Deleting: ");
		for(int i=0;i<h.getSize();i++) 
		{
			System.out.print(h.heapArray[i].getKey()+" ");
		}
		
		
	}

}
