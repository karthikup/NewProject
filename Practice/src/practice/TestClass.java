package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String arr[] = br.readLine().split(" ");
		int [] p = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			p[i] = Integer.parseInt(arr[i]); 
		}
		int out = solve(p);
		wr.println(out);
		wr.close();
		br.close();
	} 
	public static int solve(int p[])
	{
		int returningProfit = 0;
		int returingProfit = 0;
		for(int x = p.length-1; x>=0; x--)
		{
			int currentVillage = 0;
			int currentProfitGain = 0;
			int runningProfit = 0;
			for(int i=x; i>=0; i--)
			{
				if(i==x)
				{
					currentVillage = i;
					runningProfit += p[i];
					currentProfitGain = p[i];
				}
				if(currentVillage > i && currentProfitGain % p[i] == 0)
				{
					runningProfit += p[i];
					currentProfitGain = p[i];
					currentVillage = i;
				}
			}
			if(returingProfit < runningProfit)
			{
				returningProfit = returningProfit < runningProfit ? runningProfit:returningProfit; 
			}
			//return returningProfit;
		}
		return returningProfit;
	}

}
