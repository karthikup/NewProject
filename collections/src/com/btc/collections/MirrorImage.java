package com.btc.collections;

import java.util.Scanner;

public class MirrorImage 
{
	public static String test(String str)
	{
		String s = " ";
		for(int i=str.length()-1; i>=0; i--)
		{
			char c = str.charAt(i);
			s = s+c;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = new String();
		str = sc.nextLine();
		String result = test(str);
		System.out.println("Mirror of the String :");
		System.out.println(str+"|"+result);
	}

}
