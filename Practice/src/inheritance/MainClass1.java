package inheritance;

public class MainClass1 {

	public static void main(String[] args) {
		
		SubClass1 s1 = new SubClass1(121,"Book", 4);
		s1.checkIn();
		s1.addItem();
		s1.checkOut();
		System.out.println();
		s1.printDetails();
		System.out.println();
		WrittenItem w1 = new WrittenItem("xxy","abc",5);
		String s= w1.getAuthorBookName();
		System.out.println(s);
		w1.checkIn();
		w1.addItem();
		System.out.println();
		JournalPaper jp = new JournalPaper("aaa","Indian Cricket",6, 1997);
		jp.showDetails();
		System.out.println();
		Book b1 = new Book("bbb","Fury",8);
		b1.showDetails();
		System.out.println();
		Vedio v1 = new Vedio("www",2,4,3);
		v1.showDetails();
	}

}
