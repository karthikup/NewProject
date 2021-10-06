package search;

import java.util.Scanner;

public class LinearSearch 
{
	public static int test(int a[], int data)
	{
		int i = 0;
		for( i=0; i<=a.length-1; i++)
		{
			if(data == a[i])
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements : ");
		int n = s.nextInt();
		
		int a[] = new int [n];
		int ele = 0;
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		ele = 35;
		int res = test(a, ele);
		System.out.println("Index is : "+res);
		/*for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+ " ");
		}*/
	}

}
