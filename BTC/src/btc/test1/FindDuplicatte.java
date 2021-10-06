package btc.test1;

import java.util.Scanner;


//find the duplicate elements in an array
public class FindDuplicatte 
{
	public static void test(int a[])
	{
		for(int i=0; i<=a.length-1; i++)
		{
			int j = Math.abs(a[i]);
			if(a[j]>=0)
			{
				a[j]=-a[j];
			}
			else
			{
				System.out.print(j+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		test(a);
	}

}
