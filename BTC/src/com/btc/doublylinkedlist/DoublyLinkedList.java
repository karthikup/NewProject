package com.btc.doublylinkedlist;

public class DoublyLinkedList 
{
	public Node first;
	public Node last;
	//public Node head, tail=null;
	
	public void insertFirst(int data)
	{
		Node newNode = new Node();
		if(first==null)
		{
			newNode.data=data;
			last=newNode;
		}
		else
		{
			first.previous=newNode;
		}
		newNode.data=data;
		newNode.next=first;
		newNode.previous=null;
		first=newNode;
	}
	
	public void insertLast(int data)
	{
		Node current = first;
		Node newNode = new Node();
		if(first==null)
		{
			newNode.data=data;
		}
		else 
		{
			while(current.next!=null)
			{
				current=current.next;
			}
		
			newNode.data=data;
			current.next=newNode;
			newNode.previous=last;
			last=newNode;
			last.next=null;
		}
	}
	
	public void inserAtPosition(int pos, int data)
	{
		Node newNode = new Node();
		if(pos==0)
		{
			if(first==null)
			{
				newNode.data=data;
			}
			newNode.data=data;
			newNode.next=first;
			newNode.previous=null;
			first=newNode;
		}
		int currentPosition=0;
		Node currentNode = first;
		while(pos-1!=currentPosition)
		{
			currentPosition++;
		}
		for(int i=0; i<currentPosition; i++)
		{
			currentNode=currentNode.next;
		}
		Node temp = currentNode.next;
		newNode.data=data;
		currentNode.next=newNode;
		newNode.next=temp;
		newNode=temp.previous;
		//currentNode=newNode.previous;
		//currentNode.next=newNode;
	}
	
	public void deleteFirst()
	{
		if(first==null)
		{
			System.out.println("List is Empty!!!");
		}
		Node temp = first;
		first = first.next;
		first.previous=null;
	}
	
	public void deletelast()
	{
//		int count=0;
//		if(first==null)
//		{
//			System.out.println("List is Empty!!");
//		}
//		Node current = first;
//		while(current.next!=null)
//		{
//			current=current.next;
//			count++;
//		}
//		Node temp = current;
//		last=temp.previous;
//		Node currentNode =first;
//		for(int i=0; i<count; i++)
//		{
//			currentNode.displayData();
//			currentNode=currentNode.next;
//		}
		Node temp = new Node();
		if(first.next==null)
		{
			first=null;
		}
		else
		{
			last.previous.next=null;
		}
		last=last.previous;
	}
	
	public void deleteAtPosition(int pos)
	{
//		int count=0;
//		int currentPosition = 0;
//		Node currentNode=first;
//		while(pos!=currentPosition)
//		{
//			currentPosition++;
//		}
//		for(int i=0; i<currentPosition; i++)
//		{
//			currentNode=currentNode.next;
//		}
//		Node temp=currentNode.next;
//		
//		Node newCurrentNode=first;
//		for(int i=0; i<currentPosition-1; i++)
//		{
//			newCurrentNode=newCurrentNode.next;
//		}
//		newCurrentNode.next=temp;
//		newCurrentNode=temp.previous;
//		
//		Node current=first;
//		while(current.next!=null)
//		{
//			current=current.next;
//			count++;
//		}
//		Node newTraverseNode=first;
//		for(int i=0; i<count; i++)
//		{
//			newTraverseNode.displayData();
//			newTraverseNode=newTraverseNode.next;
//		}
		
		Node current = first;
		if(first==null)
		{
			System.out.println("List is Empty");
		}
		if(first==last && first.data==last.data)
		{
			Node temp=first;
		}
		else
		{
			
			while(pos != current.data)
			{
				current=current.next;
			}
		}
		Node delete = current;
		Node temp1 = current.next;
		Node temp2 = current.previous;
		temp2.next = temp1;
		temp2 = temp1.previous;
		
		Node newCurrent=first;
		while(newCurrent!=null)
		{
			newCurrent.displayData();
			newCurrent=newCurrent.next;
		}
		System.out.println();
	}
	
	public static void test(int a[])
	{
		for(int i=0; i<=a.length-1; i++)
		{
			int j = Math.abs(a[i]);
			if(a[j]>=0)
			{
				a[j]=-a[j];
			}
			else
			{
				System.out.print(j+" ");
			}
		}
	}
	
	public void ReverseList()
	{
		Node temp = null;
		Node current = first;
		while(current!=null)
		{
			temp =  current.next;
			current.next=current.previous;
			current.previous=temp;
			current=current.previous;
		}
		temp=first;
		first=last;
		last=temp;
//		Node temp=first;
//		Node newfirst=first;
//		while(temp!=null)
//		{
//			Node previous = temp.previous;
//			temp.previous=temp.next;
//			temp.next=previous;
//			newfirst=temp;
//			temp=temp.previous;
//		}
	
	}
	
	public void  insertBeforeNode(int data, int key)
	{
		Node newNode = new Node();
		if(first==null)
		{
			newNode.data=key;
			newNode.next=null;
			newNode.previous=null;
			newNode.displayData();
			System.exit(1);
		}
		Node current = first;
		while(data!=current.data)
		{
			current=current.next;
		}
		Node temp = current.previous;
		newNode.data=key;
		temp.next=newNode;
		temp=newNode.previous;
		newNode.next=current;
		newNode=current.previous;
		
		Node newCurrent=first;
		while(newCurrent!=null)
		{
			newCurrent.displayData();
			newCurrent=newCurrent.next;
		}
		System.out.println();
	}
	
	public void insertAfterNode(int data, int key)
	{
		Node newNode = new Node();
		if(first==null)
		{
			newNode.data=key;
			newNode.next=null;
			newNode.previous=null;
			newNode.displayData();
			System.exit(1);
		}
		Node current = first;
		while(data!=current.data)
		{
			current=current.next;
		}
		
		Node temp = current.next;
		newNode.data=key;
		current.next= newNode;
		newNode.next=temp;
		current=newNode.previous;
		
		Node newCurrent=first;
		while(newCurrent!=null)
		{
			newCurrent.displayData();
			newCurrent=newCurrent.next;
		}
		System.out.println();
	}
	
	public void displayList()
	{
		Node current = first;
		while(current!=null)
		{
			current.displayData();
			current=current.next;
		}
		System.out.println();
	}
}
