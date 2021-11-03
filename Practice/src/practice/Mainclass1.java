package practice;
import java.lang.Math;

public class Mainclass1
{
	public static long test(long n)
	{
		//int p = 0;
		long sum = 0;
		for(int i=1; i<=5; i++)
		{
			for(int p=0; p<=i || p>i; p++)
			{
				sum += (long) Math.pow(i, p);
				return sum;
			}
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		//System.out.println(test(421875));
		long res = test(421875);
		System.out.println(res);
		long res1 = test(394676);
		System.out.println(res1);
		long res2 = test(390625);
		System.out.println(res2);
		long res3 = test(781250);
		System.out.println(res3);
		long res4 = test(394676);
		System.out.println(res4);
	}

}
