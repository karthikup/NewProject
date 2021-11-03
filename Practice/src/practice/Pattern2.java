package practice;

import java.util.Scanner;

public class Pattern2 
{
	public static void test(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i == 1)
			{
				for(int j=1; j<=n*2; j++)
				{
					if(j <= n)
					{
						System.out.print("* ");
					}
					if(j >= n)
					{
						System.out.print(" ");
					}
				}
			System.out.println();
			}
			if(i >= 2)
			{
				for(int j=1; j<=n*2; j++)
				{
					if(j < i || j>= i+n)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("* ");
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
