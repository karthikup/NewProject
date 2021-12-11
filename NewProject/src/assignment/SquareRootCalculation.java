package assignment;

class Demo11
{
	public void test(int x1, int x2, int x3, int x4)
	{
		 int res;
		 res=(int) (Math.sqrt((x1+x2)*(x1+x2))+((x3+x4)*(x3+x4)));
		 System.out.println(res);
	}
}

public class SquareRootCalculation {

	public static void main(String[] args) 
	{
		Demo11 d = new Demo11();
		 int x1=4,x2=8;
		 int y1=3,y2=5;
		 d.test(x1,x2,y1,y2);
	}

}
