package practice;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1 > i2)
		{
			return +1;
			
		}
		else if(i1 < i2)
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
}
class Example2
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(4);
		t.add(20);
		t.add(20);
		t.add(6);
		System.out.print(t+ " ");
	}
}
