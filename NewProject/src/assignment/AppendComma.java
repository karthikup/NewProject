package assignment;

class Demo7
{
	public String test(String a[])
	{
		StringBuffer s=new StringBuffer();
		for(int i=0;i<a.length;i++)
			s.append(a[i]).append(',');
		s.deleteCharAt(s.length()-1);
		return s.toString();
	}
}

public class AppendComma {

	public static void main(String[] args) 
	{
		Demo7 d = new Demo7();
		String[] a={"Vikas","Lokesh","Ashok"};
		System.out.println(d.test(a));
	}

}
