package inheritance;

public class Vedio extends MediaItem {
	
	private String director;
	private int genre;
	private int yearRealeased;
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public int getYearRealeased() {
		return yearRealeased;
	}
	public void setYearRealeased(int yearRealeased) {
		this.yearRealeased = yearRealeased;
	}
	
	public Vedio(String director, int genre, int yearRealeased, int runTime) {
		super(runTime);
		this.director = director;
		this.genre = genre;
		this.yearRealeased = yearRealeased;
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
		System.out.println("Director : "+director);
		System.out.println("genre : "+2);
		System.out.println("Year of Realease : "+yearRealeased);
	}
	

}
