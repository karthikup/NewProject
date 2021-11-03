package practice;

import java.util.Scanner;

public class Array2 
{
	public static void test(int a[])
	{
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]==i)
				{
					a[i] = i;
				}
				else
				{
						int temp = 0;
						temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					
				}
			}
		}
		print(a);
	}
	public static void print(int a[])
	{
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]>a[j])
				{
					int temp = 0;
					temp = a[j];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		array(a);
	}
	public static void array(int a[])
	{
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]+ " ");
		}
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
		test(a);
	}

}
