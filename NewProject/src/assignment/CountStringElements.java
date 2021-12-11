package assignment;

import java.util.ArrayList;
import java.util.List;

class Demo23
{
	public int test(List<String> list, String str)
	{
		int count=0;
		for(String s:list)
		{
			if(!s.equalsIgnoreCase(str))
			{
				count++;
			}
		}
		return count; 
	}
}

public class CountStringElements {

	public static void main(String[] args) 
	{
		Demo23 d = new Demo23();
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bb");
		list.add("cccc");
		list.add("d");
		String str = "aaa";
		System.out.println(d.test(list, str));
	}

}
