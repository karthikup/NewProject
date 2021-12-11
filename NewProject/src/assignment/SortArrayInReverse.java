package assignment;

import java.util.ArrayList;
import java.util.List;

public class SortArrayInReverse {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("blue");
		list.add("ivory");
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.print(list.get(i)+" ");
		}
	}

}
