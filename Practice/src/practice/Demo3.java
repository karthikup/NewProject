package practice;

import java.util.Scanner;

public class Demo3 
{
	public static void test(int n)
	{
		if((n%400==0)||(n%100!=0)&&(n%4==0))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		test(n);
	}

}
