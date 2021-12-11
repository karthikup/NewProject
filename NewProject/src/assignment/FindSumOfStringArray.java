package assignment;

class Demo6
{
	public void test(String[] str)
	{
		int sum=0;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				char c=str[i].charAt(j);
				if(Character.isDigit(c))
				{
					String t=String.valueOf(c);
					int n=Integer.parseInt(t);
					sum=sum+n; 
				} 
			}
		}
		 System.out.println(sum);
	}
}

public class FindSumOfStringArray {

	public static void main(String[] args) 
	{
		Demo6 d = new Demo6();
		String[] str={"2AA","12","ABC","C1a"};
		d.test(str);
	}

}
