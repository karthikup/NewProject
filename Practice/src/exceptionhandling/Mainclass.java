package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainclass 
{
	public void test(int n1, int n2)
	{
		System.out.println("test() starts.." );
		
		System.out.println("The value of n1 is : "+n1);
		System.out.println("The value of n2 is : "+n2);
		int a[] = {10,20,30,40};		
		try
		{
			int res = (int)(n1/n2);
			System.out.println("The result is : "+res);
			System.out.println("The element at index " +res+ " is "+a[res]);
		}
		catch(ArithmeticException ref1)
		{
			System.out.println("HANDELED ArithmeticException" );
			System.out.println("INVALID NUMBER FOR DIVISION");
		}
		catch(ArrayIndexOutOfBoundsException ref2)
		{
			System.out.println("HANDELED ArrayIndexOutOfBoundsException");
			System.out.println("INVALID INDEX RANGE");
		}

		
		System.out.println("test() ends..");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("main() starts...");
		int n1=0,n2=0;
		try
		{
			System.out.println("Enter the first integer number : ");
			n1 = sc.nextInt();
			System.out.println("Enter the second integer number : ");
			n2 = sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("HANDELED InputMismatchException");
			System.out.println("INVALID INPUT");
		}
		Mainclass m = new Mainclass(); 
		m.test(n1,n2);
		//System.out.println();
		//m.test(50,0);
		System.out.println("main() ends...");
	}
}
