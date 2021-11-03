package wrapper;

public class Mainclass1 
{
	public static int add(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	
	public static double add(double a, double b)
	{
		double sum = a + b;
		return sum;
	}
	
	public static String add(String a, String b)
	{
		String sum = a + b;
		return sum;
	}
	
	public static void printOutPut(Object obj)
	{
		System.out.println("printOutPut of Object");
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		int res = add(10, 10);
		Integer i1 = new Integer(res);
		printOutPut(i1);
		
		double res1 = add(20.5, 100.0);
		Double d1 = new Double(res1);
		printOutPut(d1);
		
		String s1 = add("hi", "hello");
		String res3 = new String(s1);
		printOutPut(res3);
		
		StringBuffer sb1 = new StringBuffer("hello");
		printOutPut(sb1);
	}

}
