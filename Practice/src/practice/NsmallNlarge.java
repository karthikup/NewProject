package practice;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class NsmallNlarge 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		//System.out.println("hi");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}	
		int res[] = sumNum(arr);
		for(int a : res)
		{
			System.out.print(a+ " ");
		}
	}
	public static int getArrayIndex(int arr[], int value)
	{
		int k=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] ==value)
			{
				k=i;
				break;
			}
		}
		return k;
	}
	public static int[] sumNum(int arr[])
	{
		int arrClone[] = arr.clone();
		Dictionary<Integer, Integer>  total = new Hashtable<>();
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++)
		{
			if(i==0)
			{
				total.put(0, arr[i+1]);
			}
			else if(i==arr.length-1)
			{
				total.put(arr.length-1, arr[i-1]);
			}
			else
			{
				int sum= arr[i-1]+arr[i+1];
				total.put(i, sum);
			}
		}
		int res[] = new int[arr.length];
		
		Dictionary<Integer, Integer> resD = new Hashtable<>();
		for(int i=0; i<arr.length;i++)
		{
			int val= arr[i];
			int ind = getArrayIndex(arrClone, val);
			resD.put(ind, total.get(i));
		}
		for(int i=0; i<arr.length; i++)
		{
			res[i] = resD.get(i);
		}
		return res;
	}
}
