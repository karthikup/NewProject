package assignment;

class Demo9
{
	public boolean test(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='*')
			{
				int j=i-1;
				int k=i+1;
				if(s.charAt(j)==s.charAt(k))
				{
					return true;
				}
			}
		}
		return false;
	}
}

public class BeforeAndAfterStar {

	public static void main(String[] args) 
	{
		Demo9 d = new Demo9();
		String s = "Hellw*world";
		System.out.println(d.test(s));
	}

}
