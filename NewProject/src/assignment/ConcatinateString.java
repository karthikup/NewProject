package assignment;

class Demo18
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
public class ConcatinateString {

	public static void main(String[] args) 
	{
		 Demo18 d = new Demo18();
		 String s1="hello";
		 String s2="helloworld";
		 System.out.println(d.test(s1,s2));
	}

}
