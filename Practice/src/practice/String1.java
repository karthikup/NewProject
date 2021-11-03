package practice;

import java.util.Scanner;
import java.util.*;


public class String1 
{
	public static void test(String s1)
	{
		String str = "";
		for(int i=s1.length()-2; i>=1; i--)
		{
			char c1 = s1.charAt(i);
			str = str + c1;
		}
		System.out.println(s1.charAt(0)+str+s1.substring(s1.length()-1));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("Enter the String : ");
		s1 = sc.nextLine();
		test(s1);
	}

}
