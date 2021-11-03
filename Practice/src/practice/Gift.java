package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Gift 
{

	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		SortedSet<String> s = new TreeSet();
		for(int i=1; i<=3; i++)
		{
			s.add(""+i);
		}
		//s.subSet(s.first(), s.last());
		//System.out.println(s+ " ");
		String first = s.first();
		System.out.println(first);
		String last = s.last();
		System.out.println(last);
	}

}
