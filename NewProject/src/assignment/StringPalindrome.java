package assignment;

import java.util.Scanner;

class Demo5
{
	public boolean test(String str)
	{
		boolean flag = true;
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=false;
				break;
			}
		}
		for(int i=0; i<str.length()/2; i++)
		{
			if(flag)
			{
				if(str.charAt(i)==str.charAt(str.length()-i-1))
				{
					return false;
				}
			}
			else
			{
				return true;
			}
		}
		return flag;
	}
}
public class StringPalindrome 
{

	public static void main(String[] args) 
	{
		Demo5 d = new Demo5();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(d.test(str));
	}

}
