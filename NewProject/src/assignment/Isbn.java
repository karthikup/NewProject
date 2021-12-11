package assignment;

class Demo14
{
	public boolean test(String s)
	{
		boolean b=false;
		int sum=0;
		for(int i=0,j=s.length();i<s.length();i++,j--)
		{
			String.valueOf(s.charAt(i));
		    int n=Integer.parseInt(s);
		    sum+=(n*j);    
		}
		if(sum%11==0)
			b=true;
		return b;
	}
}

public class Isbn {

	public static void main(String[] args) 
	{
		Demo14 d = new Demo14();
		String ip="0201103311";
		boolean b=d.test(ip);
		if(b==true)
			System.out.println("valid ISBN number");
		else
		    System.out.println("Not ISBN Number");
		
	}

}
