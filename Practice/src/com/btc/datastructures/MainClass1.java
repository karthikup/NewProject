package com.btc.datastructures;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int length = str.length();
		Stack s = new Stack(length);
		
		for(int i=0; i<length; i++)
		{
			s.push(str.charAt(i));
		}
		
		//s.push('a');
		//s.push('b');
		System.out.println("---------------");
		System.out.println("Top Item is: "+s.peek());
		//s.push('c');
		//s.push('d');
		//s.push('e');
		System.out.println("---------------");
		/*s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();*/
		for(int i=0; i<length; i++)
		{
			s.pop();
		}
		//s.pop();
	}

}
