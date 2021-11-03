package inheritance;

public abstract class Item 
{
	
//	private double  identificationNumber;
//	private String title;
//	private int noOfCopies;
//	
//	public Item()
//	{
//		
//	}
//	
//	public Item(double identificationNumber, String title, int noOfCopies) {
//		super();
//		this.identificationNumber = identificationNumber;
//		this.title = title;
//		this.noOfCopies = noOfCopies;
//	}
//	
//	
//	
//	public double getIdentificationNumber() {
//		return identificationNumber;
//	}
//	
//	public void setIdentificationNumber(double identificationNumber) {
//		this.identificationNumber = identificationNumber;
//	}
//	
//	public String getTitle() {
//		return title;
//	}
//	
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	
//	public int getNoOfCopies() {
//		return noOfCopies;
//	}
//	
//	public void setNoOfCopies(int noOfCopies) {
//		this.noOfCopies = noOfCopies;
//	}
//	
//	
//	public void printDetails()
//	{
//		System.out.println("Identification Number : " +identificationNumber);
//		System.out.println("Title is : "+title);
//		System.out.println("Number of copies is : "+noOfCopies);
//	}
	
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	
}
