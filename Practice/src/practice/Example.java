package practice;

public class Example 
{

	public static void main(String[] args) 
	{
		class InnerTest
		{
			public String name;
			public InnerTest(String s)
			{
				name = s;
			}
		}
		Object obj = new InnerTest("InnerTest");
		InnerTest t = (InnerTest)obj;
		System.out.println(t.name);
	}

}
