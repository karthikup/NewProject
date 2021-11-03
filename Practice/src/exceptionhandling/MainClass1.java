package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Program Starts");
		try 
		{
			System.out.println("Enter the Integer Number : ");
			int n = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("HANDELED EXCEPTION");
			System.out.println("INVALID INPUT");
		}
		System.out.println("Program Ends");
	}

}
