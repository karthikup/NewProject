package practice;

import java.util.Scanner;

public class SwapCharacter 
{
	public static char[] swap(String str, int i , int j)
	{
		char ch[] = str.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j]= temp;
		return ch;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println(swap(str, 2, 6));
	}

}
