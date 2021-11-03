package practice;

import java.util.Scanner;

public class SecondSmallestNumber 
{
	public static int test(int a[])
	{
		int i=0;
		int j=0;
		for( i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println();
		System.out.println("Enter the array elements: ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println();
		int res = test(a);
		System.out.println("Second Smallest Element is : "+res);
	}

}
