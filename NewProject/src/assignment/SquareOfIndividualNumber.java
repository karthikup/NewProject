package assignment;

import java.util.Scanner;

class Demo4
{
	public void test(int n)
	{
		int finalResult=0;
		int res=0;
		while(n>0)
		{
			int r = n%10;
			res = r*r;
			finalResult=finalResult+res;
			n = n/10;
		}
		System.out.println(finalResult);
	}
}

public class SquareOfIndividualNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Demo4 d = new Demo4();
		int n = sc.nextInt();
		d.test(n);
	}

}
