package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReturnDuplicateKey {
	
	public void checkDuplicate(Map<String, String> hash)
	{
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		for(Entry<String,String> mapValue:hash.entrySet())
		{
			if(!set.add(mapValue.getValue()))
			{
				list.add(mapValue.getValue());
			}
			else
			{
				set.add(mapValue.getValue());
			}
		}
		for(Entry<String, String> mapValue:hash.entrySet())
		{
			if(list.contains(mapValue.getValue()))
			{
				System.out.print(mapValue.getKey()+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		ReturnDuplicateKey a = new ReturnDuplicateKey();
		Map<String, String> hash = new HashMap<>();
		hash.put("ram", "hari");
		hash.put("cisco", "barfi");
		hash.put("honeywell", "cs");
		hash.put("cts", "hari");
		//System.out.println(hash);
		a.checkDuplicate(hash);
	
	}

}
