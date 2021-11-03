package inheritance;

public class MediaItem extends Item
{
	private int runTime;

	public int getRuntime() {
		return runTime;
	}

	public void setRuntime(int runtime) {
		this.runTime = runtime;
	}

	public MediaItem(int runtime) {
		super();
		this.runTime = runtime;
	}
	
	public void showDetails()
	{
		System.out.println("RunTime is : "+runTime);
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
}
