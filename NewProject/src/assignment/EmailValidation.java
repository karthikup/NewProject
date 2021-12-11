package assignment;

import java.util.StringTokenizer;

class Demo8
{
	public boolean test(String str)
	{
		
		int i=0;
		boolean b=false;
		StringTokenizer t=new StringTokenizer(str,"@");
		String s1=t.nextToken();
		String s2=t.nextToken();
		StringTokenizer t1=new StringTokenizer(s2,".");
		String s3=t1.nextToken();
		String s4=t1.nextToken();
		if(str.contains("@") && str.contains("."))
			i++;
		 
		if(i==1)
			if(s3.length()==5)
					if(s1.length()>=3)
							if(s4.equals("com"))
								b=true;
		return b;
	}
	
}

public class EmailValidation {

	public static void main(String[] args) 
	{
		Demo8 d = new Demo8();
		String str="kar@gmail.com";
		boolean b = d.test(str);
		if(b==true)
			System.out.println("valid mail Id");
		else
			System.out.println("not a valid Id");
	}

}
