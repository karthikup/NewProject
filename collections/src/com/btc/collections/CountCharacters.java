package com.btc.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Create a method that accepts a character array and count the number of times each
//character is present in the array.
public class CountCharacters {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		//List<Character> list = new ArrayList<>();
		List<Character> list = Arrays.asList('a','a','b','b','c');
//		list.add('a');
//		list.add('a');
//		list.add('b');
//		list.add('c');
		
		int count =1;
		for(int i=0; i<list.size()-1; i++)
		{
			int j=i+1;
			if(list.get(i)==list.get(j))
			{
				count++;
				System.out.println("Character "+list.get(i)+ " has "+ count +" count" );
				i=j+1;
			}
			else
			{
				count=1;
				System.out.println("Character "+list.get(i)+" has "+ count +" count" );
				System.out.println("Character "+list.get(j)+" has "+ count +" count" );
			}
		}
		
	}

}
