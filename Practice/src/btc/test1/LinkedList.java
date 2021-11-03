package btc.test1;

//replace an element at a specific position of a LinkedList with the given element.

class Node
{
	public int data;
	public Node next;
	public void displayData()
	{
		System.out.println(data);
	}
}
public class LinkedList 
{
	private Node first;
	private Node last;
	
	public void inserAtFirst(int data)
	{
		Node newNode = new Node();
		if(first==null)
		{
			newNode.data=data;
		}
		newNode.data=data;
		newNode.next=first;
		first=newNode;
	}
	
	public void insertAtPosition(int pos, int data)
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
			first=newNode;
		}
		int currentPosition = 0;
		Node currentNode = first;
		while(pos-1!=currentPosition)
		{
			currentPosition++;
		}
		for(int i=0; i<currentPosition; i++)
		{
			currentNode=currentNode.next;
		}
		Node temp=currentNode.next;
		Node temp2 = temp.next;
		newNode.data=data;
		currentNode.data=data;
		newNode.next=temp2;
	}
	
	public void displayList()
	{
		Node current = first;
		while(current!=null)
		{
			current.displayData();
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		l.inserAtFirst(10);
		l.inserAtFirst(20);
		l.inserAtFirst(30);
		l.inserAtFirst(40);
		l.inserAtFirst(50);
		l.displayList();
		System.out.println("-----------");
		l.insertAtPosition(2, 0);
		l.displayList();
		
	}
}
