package recursion;

import java.util.Scanner;

public class BinarySearch 
{
	public static int test(int a[], int first, int len, int key)
	{
		if(len>=first)
		{
			int mid = (first+len)/2;
			if(a[mid]==key)
			{
				return mid;
			}
			if(a[mid]>key)
			{
				return test(a,first,mid-1,key);
			}
			else
			{
				return test(a,mid+1,len,key);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int len = a.length;
		int key = sc.nextInt();
		int res = test(a,0,len,key);
		System.out.println(res);
	}

}
