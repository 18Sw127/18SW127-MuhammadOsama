
import java.util.Scanner;
class Task3{
	public static void main(String[] args) {
	 char x;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a Character :: ");
     x = input.next().charAt(0);
     switch (x)
     {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
          System.out.println(" \"" + x + "\"" +  " is a Vowel.");
         break;
         default:
         System.out.println(" \"" + x + "\"" + " is a Consonant."); 
     }

	}
}