package inheritance;

public class WrittenItem extends Item
{
	private String authorName;
	private String authorBookName;
	private int NoOfBookOfAuthor;
	
	
	public WrittenItem(String authorName, String authorBookName, int noOfBookOfAuthor) {
		super();
		this.authorName = authorName;
		this.authorBookName = authorBookName;
		this.NoOfBookOfAuthor = noOfBookOfAuthor;
	}


	@Override
	public void checkIn() {
		System.out.println("Item CheckingIn");
		
	}


	@Override
	public void checkOut() {
		System.out.println("Item CheckinOut");
		
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getAuthorBookName() {
		return authorBookName;
	}


	public void setAuthorBookName(String authorBookName) {
		this.authorBookName = authorBookName;
	}


	public int getNoOfBookOfAuthor() {
		return NoOfBookOfAuthor;
	}


	public void setNoOfBookOfAuthor(int noOfBookOfAuthor) {
		NoOfBookOfAuthor = noOfBookOfAuthor;
	}


	@Override
	public void addItem() {
		System.out.println("Item Added");
		
	}
	
	public void showDetails()
	{
		System.out.println("Author Name : "+authorName);
		System.out.println("Author Book Name : "+authorBookName);
		System.out.println("Number of Book of Author : "+NoOfBookOfAuthor);
	}
	
}
