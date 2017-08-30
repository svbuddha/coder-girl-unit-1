import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTablesGrid
{
    public static void main (String[] args) {
        int mult; 
        int num;
        out.println("Welcome to Multiplication Tables");
        out.println("");
        Scanner number = new Scanner(System.in);
        out.print("How large would you like to see them? ");
        num = number.nextInt();
        out.println("");
        if (num <= 20){
        for (int row = 0; row <= num ; row++)
        {
            for (int column = 0; column <= num; column++) {
                mult = row*column;
                out.printf("%4d", + mult);
                }
            out.println();
            }
        } else {
            out.print("Number too big.");
        }
    }
}
