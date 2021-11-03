package practice;

import java.util.Scanner;

public class Array1 
{
	public static void test(int a[], int index)
	{
		int sum = 0;
		for(int i=0; i<index-1; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of array : ");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the elements of the array : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the array : ");
		int index = sc.nextInt();
		if(index <= n)
		{
			boolean val = true; 
		}
		else 
		{
			System.out.println("Index out of range!!");
		}
		test(a,index);
	}

}
