package practice;

import java.util.Scanner;

public class Demo 
{
	public static void test(int n)
	{
		if(n%3==0 && n%5==0)
		{
			System.out.println("HelloWorld");
			return;
		}
		if(n%3==0)
		{
			System.out.println("Hello");
		}
		if(n%5==0)
		{
			System.out.println("World");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n =  sc.nextInt();
		test(n);
	}

}
