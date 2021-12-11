package assignment;

class Demo16
{
	public String test(String s1, String s2)
	{
		 StringBuffer sb=new StringBuffer();
		 int n1=s1.length();
		 int n2=s2.length();
		 if(n1<n2)
			 sb.append(s2.substring(n1, n2)).append(s1);
		 return sb.toString();
	}
}
public class ConcatinateTwoStrings {

	public static void main(String[] args) 
	{
		Demo16 d = new Demo16();
		String ip1="hello";
		String ip2="helloworld";
		System.out.println(d.test(ip1,ip2));
		
	}

}
