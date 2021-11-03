package encapsulation;

public class MainClass {

	public static void main(String[] args) 
	{
		Car c1 = new Car(123, "Duster", "Nissan");
		String s = c1.getCarCompanyName();
		c1.start();
		System.out.println(s);
		System.out.println("---------------");
		Car c2 = new Car(777, "city", "Hundai");
		c2.acclerate();
		String s1 = c2.getCarName();
		System.out.println(s1);
	}

}
