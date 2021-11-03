package practice;

import java.util.Scanner;

public class Mainclass3 
{
	public static void test(int num[][], char c)
	{
		for(int i=1; i<=num.length; i++)
		{
			c='A';
			for(int j=1; j<=num.length; j++)
			{
				if(j<=num.length-i)
				{
					System.out.print(j + " ");
				}
				else
				{
					System.out.print(c+" ");
					c++;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first index of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the second index of the array: ");
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		test(a, 'A');
	}

}
