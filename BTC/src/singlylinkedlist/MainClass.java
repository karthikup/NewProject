package singlylinkedlist;

public class MainClass {

	public static void main(String[] args) 
	{
		SinglyLinkedList s = new SinglyLinkedList();
		s.inserAtFirst(10);
		s.inserAtFirst(20);
		s.inserAtFirst(30);
		s.insertLast(40);
		s.inserAtFirst(5);
		//s.displayList();
		s.insertAtPosition(2, 25);
		s.insertAtPosition(0, -1);
		s.deleteFirst();
		s.displayList();
		System.out.println("-----------");
		s.deleteLast();
		//s.displayList();
		System.out.println("------------");
		s.deleteAtPosition(1);
	}

}
