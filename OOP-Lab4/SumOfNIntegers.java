import java.util.Scanner;
class SumOfNIntegers{
	public static void main(String[]args)
	{
		int N,num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of N: "); //where N represnting the number of inputs
		N=sc.nextInt();
		for(int x=1;x<=N;x++){
			System.out.print(x+") Number: "); //it will show like 1) Number: 
			num=sc.nextInt(); 				  //                  2) Number: 
			sum+=num;
		}
		System.out.println("Sum of all numbers: "+sum);

	}
}