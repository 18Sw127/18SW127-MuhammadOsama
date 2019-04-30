import java.util.Scanner;
class Table{
	public static void main(String[]args)
	{
		int table,sEnd,fEnd;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter table: ");
		table=sc.nextInt();
		System.out.print("Enter starting end: ");
		sEnd=sc.nextInt();
		System.out.print("Enter finishing end: ");
		fEnd=sc.nextInt();
		for(int x=sEnd;x<=fEnd;x++){
			System.out.print(table+"X"+x+"="+(table*x));
			System.out.println();
		}
	}
}