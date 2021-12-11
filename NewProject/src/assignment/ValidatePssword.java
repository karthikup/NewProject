package assignment;

import java.util.Scanner;

class Demo15
{
	public boolean test(String str)
	{
		boolean b=false,b1=false,b2=false;
		if(str.length()>=8)
			if(!Character.isDigit(str.charAt(0)))
				if(str.charAt(0)!='@' && str.charAt(0)!='_' && str.charAt(0)!='#')
					if(str.charAt(str.length()-1)!='@' && str.charAt(str.length()-1)!='_' && str.charAt(str.length()-1)!='#')
						b1=true;
		
		if(b1==true)
			for(int i=0;i<str.length();i++)
				if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i)=='#' || str.charAt(i)=='@' || str.charAt(i)=='_')
					b2=true;
		if(b2==true)
			if(str.contains("#") || str.contains("@") || str.contains("_"))
				b=true;
		return b;
	}
	
}

public class ValidatePssword {

	public static void main(String[] args) 
	{
		 @SuppressWarnings("resource")
		 Scanner s=new Scanner(System.in);
		 Demo15 d = new Demo15();
		 String str = s.nextLine();
		 boolean b = d.test(str);
		 if(b==true)
			 System.out.println("valid password");
		 else
		     System.out.println("not a valid password");
	}

}
