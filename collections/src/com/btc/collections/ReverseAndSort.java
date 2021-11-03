package com.btc.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ReverseAndSort 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Array Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter the Array Elements : ");
		ArrayList<Integer> list = new ArrayList<>();
		Integer i1=0;
		Integer i2 = new Integer(i1);
		for(int i=0; i<n; i++)
		{
			i2 = sc.nextInt();
			list.add(i2);
		}
		Iterator itr = list.iterator();
		System.out.print("Reverse Array Elements are : ");
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.print(list.get(i)+ " ");
		}
		Collections.sort(list);
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		System.out.println();
		System.out.println("Sorted Elements : "+list);
	}
}
