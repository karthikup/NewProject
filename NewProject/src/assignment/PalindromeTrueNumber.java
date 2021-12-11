package assignment;

import java.util.Scanner;

class Demo2
{
	public void test(int n1, int n2)
	{
		int count=0;
		for(int i=n1; i<=n2; i++)
		{
			int temp1=i;
			int temp2=0;
			while(temp1>0)
			{
				int r=temp1%10;
				temp1=temp1/10;
				temp2=(temp2*10)+r;
			}
			if(i==temp2)
			{
				count = count+temp2;
			}
		}
		System.out.println("Sum is : "+count);
	}
}

public class PalindromeTrueNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Demo2 d2 = new Demo2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int n2 = sc.nextInt();
		d2.test(n1,n2);
	}

}
