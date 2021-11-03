package practice;

import java.util.Scanner;

public class HoursMinsToSeconds
{
	
	public static void test(double hours, int mins)
	{
		double newSec1 = hours*60*60;
        double newSec2 = mins*60;
        double total = newSec1+newSec2;
        System.out.println("Total Seconds is: "+total+"secs");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter the hours: ");
        double hours = sc.nextInt();
        System.out.println("Enter the minutes: ");
        int mins =  sc.nextInt();
        test(hours,mins);
	}

}
