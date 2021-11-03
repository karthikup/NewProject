package inheritance;

public class Book extends WrittenItem 
{
	private int noOfBook;
	
	public int getNoOfBook() {
		return noOfBook;
	}

	public void setNoOfBook(int noOfBook) {
		this.noOfBook = noOfBook;
	}

	public Book(String authorName, String authorBookName, int noOfBookOfAuthor) 
	{
		super(authorName, authorBookName, noOfBookOfAuthor);
	}
	
	@Override
	public void checkIn() {
		System.out.println("Item CheckingIn");
		
	}

	@Override
	public void checkOut() {
		System.out.println("Item CheckinOut");
		
	}

	@Override
	public void addItem() {
		System.out.println("Item Added");
		
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("No of Book : "+noOfBook);
	}
	

}
