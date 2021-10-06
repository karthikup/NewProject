package search;

import java.util.Scanner;

public class BinarySearch 
{
	public static int test(int a[], int data)
	{
		//boolean flag = false;
		int l = 0;
		int r = a.length;
		//int mid = (l + r)/2;
		
		for(int i=0; i<=a.length-1; i++)
		{
			while(l<r)
			{
				int mid = (l+r)/2;
				
				if(data == a[mid])
				{
					return mid;
				}
				else if(data < a[mid])
				{
					//flag = true;
					r = mid - 1;
				}
				else
				{
					//flag = true;
					l = mid + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array : ");
		int n = s.nextInt();
		
		int a[] = new int [n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt(); 
		}
		int ele = 0;
		ele = 60;
		int res = test(a, ele);
		System.out.println("Index is : "+res);
	}

}
