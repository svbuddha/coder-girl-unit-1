import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTables
{
    public static void main (String[] args) {
        int mult; 
        int num;
        out.println("Welcome to Multiplication Tables");
        out.println("");
        Scanner number = new Scanner(System.in);
        out.print("How large would you like to see them?");
        num = number.nextInt();
        out.println("");
        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j <= num; j++) {
                mult = i*j;
                System.out.print("" + mult + " ");
                }
                System.out.println();
            }
        } 
    }
