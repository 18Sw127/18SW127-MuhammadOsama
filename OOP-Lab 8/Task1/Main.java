import java.util.*;
class Main{
	public static void main(String []abcd)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=s.nextInt();
		MyCalculator a =new MyCalculator();
		int result=a.sumOfFactors(n);
		System.out.print("Result: "+result);
	}
}