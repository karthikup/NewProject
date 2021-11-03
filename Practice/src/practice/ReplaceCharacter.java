package practice;

import java.util.Scanner;

public class ReplaceCharacter 
{
	public static String replace(String str, String s2, int s1)
	{
		for(int i=0; i<s2.length(); i++)
		{
			if(str.indexOf(i)==s1)
			{
				return(str.substring(0,s1)+"s2"+str.substring(s1+1));
			}
		}
		return "notpossible";
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = string.nextLine();
		System.out.println("Enter the index of the character present in the String :");
		int s1 = sc.nextInt();
		System.out.println("Enter the character to replace in the String : ");
		String s2 = s.nextLine();
		String result = replace(str, s2, s1);
		System.out.println(result);
	}

}
