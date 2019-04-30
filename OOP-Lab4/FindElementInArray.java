import java.util.Scanner;
class FindElementInArray{
	public static void main(String[]args)
	{
		int arr[]={1,2,3,4,5,9};
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		int a;
		for(a=0;a<arr.length;a++){
			if(num==arr[a]){
				System.out.println("Number found.");
				System.out.println("Location: "+a+" index");
				break;
			}
			else if(a==arr.length-1){
				System.out.println("Number not Found.");
			}
		}


	}
}