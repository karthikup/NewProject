package practice;

import java.util.Scanner;

public class Demo2 
{
	public static void test(String str)
	{
		boolean flag = true;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				flag = false;
				break;
			}
		}
		if(flag)
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
		String str = sc.nextLine();
		test(str);
	}

}
