package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscendingOderRemoval 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		List<Integer> intlist= new ArrayList<Integer>(arr.length);
		for(int i :arr)
		{
			intlist.add(i);
		}
		int count = operation(intlist,arr);
		System.out.println(count);
	}
	public static boolean isSorted(List<Integer> intlist)
	{
		for(int i=0; i<intlist.size()-1;i++)
		{
			if(intlist.get(i)>intlist.get(i+1))
			{
				return false;
			}
		}
		return true;
	}
	public static int operation (List<Integer> intlist, int arr[])
	{
		int count = 0;
		while(!isSorted(intlist))
		{
			List<Integer> intListFirst = new ArrayList<Integer> (intlist.size());
			for(int i : arr)
			{
				intListFirst.add(i);
			}
			intListFirst.remove(0);
			if(isSorted(intListFirst))
			{
				count++;
				break;
			}
		    List<Integer> intListLast = new ArrayList<Integer>(intlist.size());
		    for(int i : arr)
		    {
		    	intListLast.add(i);
		    }
		    intListLast.remove(intListLast.size()-1);
		    if(isSorted(intListLast))
		    {
		    	count++;
		    	break;
		    }
		    intlist.remove(0);
		    intlist.remove(intlist.size()-1);
		    count  = count+2;
		}
		return count;
	}
}
