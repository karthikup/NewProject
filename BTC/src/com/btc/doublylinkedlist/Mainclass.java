package com.btc.doublylinkedlist;

public class Mainclass {

	public static void main(String[] args) 
	{
		DoublyLinkedList d = new DoublyLinkedList();
		d.insertFirst(10);
		d.insertFirst(20);
		d.insertFirst(30);
		d.insertFirst(40);
//		d.insertLast(40);
//		d.inserAtPosition(2, 25);
//		d.inserAtPosition(4, 35);
//		d.deleteFirst();
		d.displayList();
		//System.out.println("--------");
//		d.deletelast();
//		System.out.println("--------");
//		d.deleteAtPosition(2);
//		d.displayReverseList();
//		System.out.println();
//		d.displayList();
//		d.insertLast(1);
//		d.insertLast(2);
//		d.insertLast(3);
//		d.insertLast(4);
//		d.displayList();
		System.out.println("--------");
//		d.ReverseList();
//		d.deleteAtPosition(20);
//		System.out.println("--------");
//		d.displayList();
//		d.insertBeforeNode(20, 15);
		d.insertAfterNode(20, 100);
		
	}

}
