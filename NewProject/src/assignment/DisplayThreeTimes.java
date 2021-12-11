package assignment;

class Demo19
{
	public String test(String s1, String s2)
	{
		 StringBuffer sb=new StringBuffer();
		 int n1=s2.length();
		 
		 if(n1==3)
			 for(int i=0;i<n1-1;i++)
				 sb.append(s1.substring(0, n1));
		 
		 else if(n1==2)
			 for(int i=0;i<n1+1;i++)
				 sb.append(s1.substring(0, n1));
		 
		 return sb.toString();
		
	}
}

public class DisplayThreeTimes {

	public static void main(String[] args) 
	{
		Demo19 d = new Demo19();
		String s1="bowboy";
		String s2="bow";
		System.out.println(d.test(s1,s2));
		
	}

}
