package com.btc.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmailDomains 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of emails : ");
		int n = sc.nextInt();
		String str = new String();
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter the emails : ");
		for(int i=0; i<n; i++)
		{
			str = sc.next()+sc.nextLine();
			list.add(str);
		}
		Map<String, List<String>> emailGroup = new HashMap<>();
		for(String email:list)
		{
			int start = email.indexOf("@")+1;
			int end = email.indexOf(".com");
			String domain = email.substring(start, end);
			if(emailGroup.containsKey(domain))
			{
				emailGroup.get(domain).add(email);
			}
			else
			{
				List<String> emailList = new ArrayList<>();
				emailList.add(email);
				emailGroup.put(domain, emailList);
			}
		}
		Collection c = emailGroup.values();
		Set s1 = emailGroup.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"....."+m1.getValue());
		}
	}
}
