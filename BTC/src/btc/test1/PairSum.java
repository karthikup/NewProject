package btc.test1;

import java.util.Scanner;


//find all pairs equal to a given sum in an unsorted array
public class PairSum 
{
	public static void test(int a[], int sum)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length-1; j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements : ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the sum value : ");
		int sum = s.nextInt();
		test(a,sum);
	}

}
