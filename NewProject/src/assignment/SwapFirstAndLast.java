package assignment;

class Demo13
{
	public String test(String s)
	{
		 StringBuffer str=new StringBuffer();
		 str.append(s.substring(s.length()-1));
		 str.append(s.substring(1, s.length()-1));
		 str.append(s.substring(0, 1));
		 return str.toString();
	}
}

public class SwapFirstAndLast {

	public static void main(String[] args) 
	{
		Demo13 d = new Demo13();
		String s="Hello World"; 
		System.out.println(d.test(s));
		
	}

}
