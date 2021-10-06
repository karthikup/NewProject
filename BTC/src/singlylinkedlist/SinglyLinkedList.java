package singlylinkedlist;

public class SinglyLinkedList 
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

	public void insertLast(int data)
	{
		Node newNode = new Node();
		if(first==null)
		{
			newNode.data=data;
		}
		Node current = first;
		while(current.next!=null)
		{
			current = current.next;
		}
		newNode.data=data;
		current.next=newNode;
		last=newNode;
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
		newNode.data=data;
		currentNode.next=newNode;
		newNode.next=temp;
	}
	
	public void deleteFirst()
	{
		if(first==null)
		{
			System.out.println("List is empty!!!");
		}
		Node temp = first;
		first = first.next;
	}
	
	public void deleteLast()
	{
		int count=0;
		if(first==null)
		{
			System.out.println("List is empty!!!");
		}
		Node current = first;
		while(current.next!=null)
		{
			current=current.next;
			count++;
		}
		Node temp = current;
		Node currentNode=first;
		for(int i=0; i<count; i++)
		{
			currentNode.displayData();
			currentNode=currentNode.next;
		}
		last=currentNode;
		currentNode.next=null;
	}
	
	public void deleteAtPosition(int pos)
	{
		int count=0;
		int currentPosition = 0;
		Node currentNode=first;
		while(pos!=currentPosition)
		{
			currentPosition++;
		}
		for(int i=0; i<currentPosition; i++)
		{
			currentNode=currentNode.next;
		}
		Node temp = currentNode.next;
		
		Node newCurrentNode = first;
		for(int i=0; i<currentPosition-1; i++)
		{
			newCurrentNode=newCurrentNode.next;
		}
		newCurrentNode.next=temp;
		
		Node current=first;
		while(current.next!=null)
		{
			current=current.next;
			count++;
		}
		Node newTraverseNode=first;
		for(int i=0; i<count; i++)
		{
			newTraverseNode.displayData();
			newTraverseNode=newTraverseNode.next;
		}
	}
}



