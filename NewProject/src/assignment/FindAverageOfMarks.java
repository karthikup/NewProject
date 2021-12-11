package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Demo3
{
	public void test(Map<Integer, Integer> m)
	{
		int l=0;
		int a=0;
		Iterator<Integer> i=m.keySet().iterator();
		while(i.hasNext())
		{
			int n=(Integer) i.next();
			if(n%2!=0)
			{
				a+=m.get(n);
				l++;
			} 
		}
		System.out.println(a/l);
	}
}

public class FindAverageOfMarks {

	public static void main(String[] args) 
	{
		Demo3 d = new Demo3();
		Map<Integer,Integer> m = new HashMap<>();
		m.put(100, 70);
		m.put(101, 76);
		m.put(102, 64);
		m.put(103, 84);
		m.put(104, 93);
		d.test(m);
	}

}
