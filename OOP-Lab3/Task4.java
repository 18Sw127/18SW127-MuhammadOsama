// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
import java.util.Scanner;
class Task4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double x[]={0,0};
		int y;
		
		System.out.println("\nWhat do you want to do ?\n\nPress 1 For Addition(+).\nPress 2 For Subtraction(-).\nPress 3 For Division(/).\nPress 4 For multiplication(*).");
		y = input.nextInt();
		
		if(y==1)
		{
			System.out.println("\nEnter any two numbers for adition .");
			x[0] = input.nextDouble();
		    x[1] = input.nextDouble();
		    double sum = x[0] + x[1];
		    System.out.println("\nSum = " + sum );
		}
		
		if(y==2)
		{
          System.out.println("\nEnter 1st number :");
          x[0] = input.nextDouble();
          System.out.println("\nEnter 2nd number :");
		  x[1] = input.nextDouble();
		  double sub = x[0] - x[1];
		  System.out.println("\nSubtraction = " + sub );	
		}
		
		if(y==3)
		{
			System.out.println("\nEnter Dividend : ");
			x[0] = input.nextDouble();
			System.out.println("\nEnter Divisor : ");
	        x[1] = input.nextDouble();
            double div = x[0]/x[1];
            System.out.println("\nDivision :: " + div);
        }
		
		if(y==4)
		{
			System.out.println("\nEnter any two numbers for multiplication .");
			x[0] = input.nextDouble();
		    x[1] = input.nextDouble();
		    double multiplication = x[0]*x[1];
		    System.out.println("\nMultiplication = " + multiplication );
		}
		
	}
}