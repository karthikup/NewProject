package recursion;

import java.util.Scanner;

public class LinearSearch 
{
	public static int test(int a[], int initialPoint, int len, int key)
	{
		if(len<initialPoint)
		{
			return -1;
		}
		else if(a[initialPoint]==key)
		{
			return initialPoint;
		}
		else
			return test(a,initialPoint+1,len,key);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int len = a.length;
		int initialPoint = 0;
		int key = sc.nextInt();
		int res = test(a,initialPoint,len,key);
		System.out.println(res);
	}

}
