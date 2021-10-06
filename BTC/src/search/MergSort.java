package search;

import java.util.Scanner;

public class MergSort 
{
	public static void mergSort(int a[], int lb, int ub)
	{
		
		if(ub<=lb)
		{
//			int mid = (lb+ub)/2;
//			mergSort(a,lb,mid);
//			mergSort(a,mid+1,ub);
//			merg(a,lb,mid,ub);
			return;
		}
		int mid = (lb+ub)/2;
		mergSort(a,lb,mid);
		mergSort(a,mid+1,ub);
		merg(a,lb,mid,ub);
	}
	public static void merg(int a[], int lb, int mid, int ub)
	{
		
		int b[] = new int[(ub-lb)+1];
		int i = lb;
		int j = mid+1;
		int k = 0;
		while(i<=mid && j<=ub)
		{
			if(a[i]<a[j])
			{
				b[k]= a[i];
				i++; 
				
			}
			else
			{
				b[k] = a[j];
				j++;
				
			}
			k++;
		}
		if(i<=mid)
		{
			while(i<=mid)
			{
				b[k] = a[i];
				i++;
				k++;
			}
		}
		else if(j<=ub)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		for(int p=0; p<b.length; p++)
		{
			a[lb+p] = b[p];
		}
//		for(int q=0; q<=ub; q++)
//		{
//			System.out.print(a[q]+" ");
//		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements :");
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		
		System.out.println("Enter the array elements :");
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		int lb = 0;
		int ub = a.length-1;
		mergSort(a,lb,ub);
		for(int element:a)
		{
			System.out.print(element+" ");
		}
	}

}
