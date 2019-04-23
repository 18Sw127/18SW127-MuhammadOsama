
import java.util.Scanner;
class Task2{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long units;
		
		System.out.println("Enter total consumed units :: ");
		double amount = 0.00d;
		units =sc.nextLong();
		
		if(units>=0 && units<=50){ 
			amount = units*10 ;
			System.out.println("Total Bill :: " + amount);
		}
		
		if(units>=50 && units<=100){ 
			amount = 50*10 + (units-50)*15;
             System.out.println("Total Bill :: " + amount);
			 } 
			 
			 if(units>=101 && units<=200){
			 	amount = 50*10 + 50*15 + (units-100)*20;
			 	System.out.println("Total Bill :: " + amount);
			 }
			 
			 if(units>=201 && units<=300){
			 	amount = 50*10 + 50*15 + 100*20 +(units-200)*25;
			 	System.out.println("Total Bill :: " + amount);
			 }

			 if(units>=301){
			 	amount = amount = 50*10 + 50*15 + 100*20 + 100*25 + (units-300)*30;
			 	System.out.println("Total Bill :: " + amount);
			 }


	}
}