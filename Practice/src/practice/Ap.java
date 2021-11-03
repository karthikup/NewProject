package practice;

import java.util.Scanner;

public class Ap 
{
	public static int test(int n, int a, int d)
	{
		int term = a + (n-1)*d;
		return term;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number of AP series : ");
		int n = sc.nextInt();
		System.out.println("Enter the first element of the AP series : ");
		int a = sc.nextInt();
		System.out.println("Enter the common difference of the AP series :");
		int d = sc.nextInt();
		int res = test(n,a,d);
		System.out.println("The " +n+ "th term of AP series is : "+res);
	}

}
