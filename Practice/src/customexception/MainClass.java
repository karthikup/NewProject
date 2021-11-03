package customexception;

public class MainClass {

	public static void main(String[] args) 
	{
		PersonDetails pd=new PersonDetails();
	
		try {
			pd.readPersonDetails();
		} 
		catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		catch(InvalidNameLengthException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(pd);
	}

}
