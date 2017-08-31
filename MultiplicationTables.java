import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTablesGrid
{
 public static void main(String[]args)
 {
     Scanner keyboard = new Scanner (System.in);
     out.println("Welcome to Multiplicaion Tables");
     out.println("");
     out.print("How large would you like to see them? ");
     int number = keyboard.nextInt();
     out.println("");
     out.print("    ");
     for (int row = 0; row <= number;row++)
         out.printf("%4d",row );
         out.println();

     for ( int col=0; col <= number; col++){
           out.printf("%4d",col );
           for(int row=0; row <= number; row++){
               out.printf("%4d",col * row);
           }
           out.println();
       }
   }
}
