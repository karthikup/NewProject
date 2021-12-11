package assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Demo 
{
	public void firstThreeKey(List<String> list)
	{
		HashMap<String, String> hash= new HashMap<>();
		for(int i=0; i<list.size(); i++)
		{
			hash.put(list.get(i).substring(0,3).toUpperCase(), list.get(i));
		}
		System.out.println(hash);
	}
}
public class FirstThreeAsKey
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		List<String> list = Arrays.asList("goa","kerala","gujarat");
		d.firstThreeKey(list);
	}
}
