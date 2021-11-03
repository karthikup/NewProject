package practice;

import java.util.Scanner;

public class Mainclass2 
{
	public static void test(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				System.out.print(j+1);
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
		test(a);
	}

}
