package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Demo10
{
	public void test(Map<String, Integer> m)
	{
		Map<String, String> m1 = new HashMap<>();
		for(Entry<String, Integer> mapValue:m.entrySet())
		{
			if(mapValue.getValue()<=50)
			{
				
				m1.put(mapValue.getKey(), "fail");
			}
			else
			{
				m1.put(mapValue.getKey(), "pass");
			}
		}
		System.out.println(m1);
	}
}

public class MarksLessThan50 {

	public static void main(String[] args) 
	{
		Demo10 d = new Demo10();
		Map<String, Integer> m = new HashMap<>();
		m.put("abc", 50);
		m.put("efg", 70);
		m.put("hij", 81);
		m.put("lmn", 43);
		m.put("xyz", 88);
		d.test(m);
	}

}
