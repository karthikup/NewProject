package assignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveGivenElement {

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(70);
		list.add(85);
		Integer removeElement = 10;
		int i=0;
		for(i=0; i<list.size(); i++)
		{
			if(removeElement==list.get(i))
			{
				list.remove(i);
			}
		}
		System.out.print(list+" ");
		
	}

}
