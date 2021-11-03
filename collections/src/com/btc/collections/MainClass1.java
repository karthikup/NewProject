package com.btc.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class MainClass1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array of String : ");
		int n = sc.nextInt();
		ArrayList<String> a = new ArrayList<>();
		String str = new String();
		System.out.println("Enter the string elements : ");
		for(int i=0; i<n; i++)
		{
			str = sc.next()+sc.nextLine();
			a.add(str);
		}
		Iterator<String> i = a.iterator();
		int halfLength=a.size()/2;
		System.out.println("Final String Elements : ");
		if(a.size()%2==0)
		{
			for(int j=0; j<halfLength; j++)
			{
				System.out.println(a.get(j).toUpperCase());
			}
			for(int k=halfLength; k<a.size(); k++)
			{
				System.out.println(a.get(k).toLowerCase());
			}
		}
		int newHalfLength = (a.size()/2)+1;
		for(int j=0; j<=newHalfLength-1; j++)
		{
			System.out.println(a.get(j).toUpperCase());
		}
		for(int k=newHalfLength; k<a.size(); k++)
		{
			System.out.println(a.get(k).toLowerCase());
		}
		
//		System.out.println("Entered String elements are:");
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		System.out.println("Program Ends");
		
//		for(Object item:a) {
//			System.out.println(item);
//		}
		
//		a.forEach(item->System.out.println(item));
		
//		for(int i=0; i<a.size(); i++)
//		{
//			System.out.println(a.get(i));
//		}
	}
	
}
