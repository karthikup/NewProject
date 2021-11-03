package encapsulation;

public class Car 
{
	private int regNumber;
	private String carName;
	private String carCompanyName;
	
	
	
	public Car(int regNumber, String carName, String carCompanyName) {
		super();
		this.regNumber = regNumber;
		this.carName = carName;
		this.carCompanyName = carCompanyName;
	}

	public void start()
	{
		System.out.println("Car Started");
	}
	
	public void acclerate()
	{
		System.out.println("Car Moving");
	}
	
	public void stop()
	{
		System.out.println("Car Stopped");
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarCompanyName() {
		return carCompanyName;
	}

	public void setCarCompanyName(String carCompanyName) {
		this.carCompanyName = carCompanyName;
	}
	
}


