import java.util.Scanner;
class Addmatri{
	public static void main(String[]args)
	{
		int rows=3;
		int cols=3;
		Scanner sc=new Scanner(System.in);
		int [][]A=new int[rows][cols];
		int [][]B=new int[rows][cols];
		int [][]C=new int[rows][cols];
		//input for matrix 1
		for(int x=0;x<rows;x++){
			for(int y=0;y<cols;y++){
				System.out.print("A["+x+"]["+y+"]= ");
				A[x][y]=sc.nextInt();
			}
			System.out.println();
		}
		//input for matrix 2
		for(int x=0;x<rows;x++){
			for(int y=0;y<cols;y++){
				System.out.print("B["+x+"]["+y+"]= ");
				B[x][y]=sc.nextInt();
			}
			System.out.println();
		}
		for(int x=0;x<rows;x++){
			for(int y=0;y<cols;y++){
				C[x][y]=A[x][y]+B[x][y];
				System.out.println("C["+x+"]["+y+"]= "+ C[x][y]);
			}
		}
	}
}