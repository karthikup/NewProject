package com.btc.collections;


import java.util.Scanner;
import java.util.stream.Collectors;

public class MethodReference 
{
	public static String test(String str)
	{
		return str.toString().chars().mapToObj(c->(char)c+" ").collect(Collectors.joining()).trim();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();
		String res = test(str);
		System.out.println(res);
	}

}
