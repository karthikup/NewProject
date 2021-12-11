package assignment;

import java.util.StringTokenizer;

class Demo20
{
	public String test(String str)
	{
		 int max=0;
		 String s2=new String();
		 StringTokenizer t=new StringTokenizer(str," ");
		 loop:
		 while(t.hasMoreTokens())
		 {
			 String s3=t.nextToken();
			 int n=s3.length();
			 if(n>max)
			 {
				 max=n;
				 s2=s3;
			 }
			 if(n==max)
				 for(int i=0;i<s3.length();i++)
				 {
					 char c1=s2.charAt(i);
					 char c2=s3.charAt(i);
					 if(c1!=c2)
					 {    
						 if(c2<c1)
							 s2=s3;
						 continue loop;
					 }   
				 }
		 }
		 return s2;
	}

}

public class MaximumWordLength {

	public static void main(String[] args) 
	{
		 Demo20 d = new Demo20();
		 String s1="Honesty is my best ploicy"; 
		 System.out.println(d.test(s1));
	}

}
