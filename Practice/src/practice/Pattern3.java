package practice;

public class Pattern3 
{
	public static void test(int n)
	{
		int count = 0;
		do
		{
			System.out.print("*");
			count++;
			if(count == n)
			{
				count = 0;
				System.out.println();
				do
				{
					System.out.print("*");
					count++;
					if(count == n)
					{
						count = 0;
						System.out.println();
						do
						{
							System.out.print("*");
							count++;
						}
						while(count <= n-1);
					}
				}
				while(count <= n-1);
			}
		}
		while(count <= n-1);
	}
	public static void main(String[] args) 
	{
		test(10);
	}

}
