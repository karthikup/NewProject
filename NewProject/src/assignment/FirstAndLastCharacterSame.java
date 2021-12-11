package assignment;

class Demo17
{
	public int test(String str)
	{
//		for(int i=0; i<str.length(); i++)
//		{
//			if(str.charAt(i)==str.charAt(str.length()-1))
//			{
//				return 1;
//			}
//			return -1;
//		}
		if(str.substring(0,1).equalsIgnoreCase(str.substring(str.length()-1)))
			return 1;
		return -1;
	}
}
public class FirstAndLastCharacterSame {

	public static void main(String[] args) 
	{
		Demo17 d = new Demo17();
		String str = "abcdec is a";
		System.out.println(d.test(str));
		
	}

}
