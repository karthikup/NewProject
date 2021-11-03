package practice;

import java.util.Scanner;

public class SecondsToMinsHours 
{
	public static void test(int sec)
	{
		int newSec = sec%60;//getting seconds (reminder)
		int hour =  sec/60;
		int newHour = hour/60;//getting hours 
		int mins = hour%60;//getting minutes
		System.out.println(+newHour+":"+mins+":"+newSec);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to Seconds: ");
		int sec =  sc.nextInt();
		test(sec);
	}

}
