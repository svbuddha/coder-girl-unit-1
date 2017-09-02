import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber 
{
    public static void main(String[] args) {

        Random rand = new Random();
        int NumGuess = rand.nextInt(100);
        int NumTries = 0;
        Scanner input = new Scanner(System.in);
        int guessa; int guessb; 
        String playagain = "";
        boolean Game = false;
        out.print("I'm thinking of a number between 1 and 100. What is it?  ");

        while (Game == false) {
            guessa = input.nextInt();
            //guessb = input.nextInt();
            NumTries++;

            if (guessa == NumGuess) {
                Game = true;
            }

            else if (guessa < NumGuess) {
                out.println("My number is higher.");

            }

            else if(guessa > 101){
                out.println("Oops! That number isn't between 1 and 100. Try again.");
            }
            else if (guessa > NumGuess) {
                out.println("My number is lower.");

            } 
        }
        out.println("You got it!\n");
        out.println("My number was " + NumGuess+"\n");
        out.println("Play again? \n");
        if (playagain == "yes") {

        } else 
            out.print("done");

    }
}
