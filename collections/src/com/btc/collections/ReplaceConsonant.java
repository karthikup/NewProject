package com.btc.collections;

import java.util.Scanner;

public class ReplaceConsonant 
{
	public static String test(String str)
	{
		for(int i=0; i<=str.length()-1; i++)
		{
			String s = " ";
			char c = str.charAt(i);
			if(c!='a'||c!='e'||c!='i'||c!='o'||c!='u')
			{
				++c;
				s = s+c;
			}
			s=s+c;
		}
		
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = new String();
		str = sc.nextLine();
		String result = test(str);
		System.out.println(result);
	}

}
