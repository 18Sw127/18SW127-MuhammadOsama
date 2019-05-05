import java.util.Scanner;
class ArrayClass{
	private int []arr=new int[8];
	public void populateArray(){
		Scanner sc=new Scanner(System.in);
		for(int a=0;a<arr.length;a++){
			System.out.print("Array["+a+"]= ");
			arr[a]=sc.nextInt();
		}
	}
	public void printOddEvenNumbers(){
		//odd numbers
		int oddCount=0;
		System.out.print("Odd Numbers in Array: ");
		for(int a=0;a<arr.length;a++){
			if(arr[a]%2!=0){
				System.out.print(arr[a]+" ");
				oddCount++;
			}
		}
		System.out.println();
		System.out.println("Number of Odd numbers in Array: "+oddCount);

		//even numbers
		int evenCount=0;
		System.out.print("Even Numbers in Array: ");
		for(int a=0;a<arr.length;a++){
			if(arr[a]%2==0){
				System.out.print(arr[a]+" ");
				evenCount++;
			}
		}
		System.out.println();
		System.out.println("No. of even numbers in Array: "+oddCount);
	}
}