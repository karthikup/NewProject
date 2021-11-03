package practice;

import java.util.Scanner;

public class Sorted {

	 
	
		public static void test(int a[])
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
			printReverse(a);
			System.out.println();
			System.out.println();
			printArray(a);
		}
		
		public static void printArray(int a[])
		{
			System.out.println("Array Forward : ");
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+ " ");
			}
		}
		
		public static void printReverse(int a[])
		{
			System.out.println("Array Reverse: ");
			for(int i=a.length-1; i>=0; i--)
			{
				System.out.print(a[i]+ " ");
			}
		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of arrray elements: ");
			int n = sc.nextInt();
			int a[] = new int[n];
			System.out.println();
			System.out.println("Enter the array elements: ");
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			test(a);
			
	}

}
