package practice;

import java.util.Scanner;

public class Pattern1 
{
	public static void test(int n)
	{
		for(int i=1; i<=n-(i-1); i++)
		{
			if(i==1)
			{
				for(int j=1; j<=n; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			if(i >= 2)
			{
				for(int j=1; j<= n-(i-1); j++)
				{
					if(j == i || j == n-(i-1))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n : ");
		int n = sc.nextInt();
		test(n);
	}

}
