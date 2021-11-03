package sorting;

import java.util.Scanner;

public class QuickSort 
{
	public static int partation(int a[], int lb, int ub)
	{
//		int pivot = a[lb];
//		int start = lb;
//		int end = ub;
//		while(lb<ub)
//		{
//			while(a[start]<=pivot)
//			{
//				start++;
//			}
//			while(a[end]>pivot)
//			{
//				end--;
//			}
//			if(start<end)
//			{
//				swap(a[start],a[end]);
//			}
//		}
//		swap(a[lb],a[end]);
//		return end;
		int pivot=a[ub];
		
		int i=lb-1;
		for(int j=lb; j<=ub-1; j++) {
			if(a[j]<=pivot) {
				i++;
				int iVal=a[i];
				int jVal=a[j];
				a[i]=jVal;
				a[j]=iVal;
			}
		}
		i++;
		int iVal=a[i];
		a[ub]=iVal;
		a[i]=pivot;
		
		return i;
	}
	public static void swap(int a, int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
	}
	public static void quickSort(int a[], int lb, int ub)
	{
		if(lb<ub)
		{
			int loc =  partation(a,lb,ub);
			quickSort(a, lb, loc-1);
			quickSort(a,loc+1,ub);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int lb=0;
		int ub=a.length-1;
		quickSort(a,lb, ub);
		System.out.println("After Sorting : ");
		for(int ele:a)
		{
			System.out.print(ele+ " ");
		}
	}

}
