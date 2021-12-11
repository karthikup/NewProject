package lambdaExpressionss;

import java.util.Arrays;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) 
	{
//		List<String> list = Arrays.asList("Manoj","Shree","Ramnath","Ram","Karthik");
//		list.stream().map(String::toLowerCase).filter(i->i.startsWith("m")).forEach(System.out::println);
		
		List<Integer> list = Arrays.asList(2,13,5,10,12,4);
		list.stream().map(i->i*i).filter(i->i%2==0).forEach(System.out::println);
	}

}
