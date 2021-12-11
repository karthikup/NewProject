package assignment;

import java.util.ArrayList;
import java.util.List;

class Demo12
{
	public void test(String a[])
	{
		 int i=0;
		 List<String> l1=new ArrayList<String>();
		 for(String s:a)
			 if(s.startsWith("10") || s.startsWith("01") &&(s.length()>2))
				 l1.add(s);
		 i=l1.size();
		 System.out.println(i);
	}
}

public class PrefixStringMatch {

	public static void main(String[] args) 
	{
		Demo12 d = new Demo12();
		String[] a={"100","111","10100","10","1111"};
		d.test(a);
	}

}
