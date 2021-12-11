package assignment;

import java.util.Arrays;
import java.util.List;

class Demo1
{
	public void test(List<Integer> list1, List<Integer> list2)
	{
		if(list1.size()==list2.size())
		{
			for(int i=0; i<list1.size(); i++)
			{
				if(list1.get(i)!=list2.get(i))
				{
					System.out.print(list1.get(i)+" "+list2.get(i)+" ");
				}
				
			}
		}
	}
}
public class CollectElementsNotPresentInRespectiveList 
{

	public static void main(String[] args) 
	{
		Demo1 d = new Demo1();
		List<Integer> list1 = Arrays.asList(1,2,3,4,6);
		List<Integer> list2 = Arrays.asList(1,2,3,5,8);
		d.test(list1,list2);
	}

}
