package inheritance;

public class JournalPaper extends WrittenItem 
{
	private int yearOfPublish;
	
	
	
	public JournalPaper(String authorName, String authorBookName, int noOfBookOfAuthor, int yearOfPublish) {
		super(authorName, authorBookName, noOfBookOfAuthor);
		this.yearOfPublish=yearOfPublish;
	}



	public int getYearOfPublish() {
		return yearOfPublish;
	}



	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
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
		System.out.println("Year of Publish : "+yearOfPublish);
	}

}
