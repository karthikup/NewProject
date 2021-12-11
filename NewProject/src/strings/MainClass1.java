package strings;

public class MainClass1 {

	public static void main(String[] args) 
	{
		String s = "Shree";
		String sNew= "";
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			char c = s.charAt(i);
//			sNew = sNew+c;
//		}
//		System.out.println(sNew);
		int count=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	

}
