package practice;

import java.util.Scanner;

public class SumOfPower 
{

	public static void main(String[] args) 
	{
		
		int a[] = {394376,421875,390625,781250,484377};	
		for(int i=0;i<=a.length-1; i++)
		{
			int x = a[i];
			int n = (int)(Math.log(x)/Math.log(5));
			if(Math.pow(5, n)==x)
			{
				System.out.println("pass "+x+" is a sum of power of 5");
			}
			else
			{
				System.out.println("fail "+x+" is not a sum of power of 5");
			}
		}
	}

}
