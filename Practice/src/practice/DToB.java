package practice;

import java.util.Scanner;

public class DToB 
{
	public static StringBuffer test(int b)
	{
		StringBuffer s = new StringBuffer(10);
		try
		{
			while(b>0)
			{
				int rem = b/2;
				s.append(rem);
			}
		}
		catch(Exception e )
		{
			System.out.println("Handled Exception "+e);
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		StringBuffer s1 = test(b);
		System.out.println(s1);
	}

}
