import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class NumberGuess2Players {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        String[] players = new String[2];
        out.println("Enter player Name:");
        players[0] = keyboard.next();
        players[1] = keyboard.next();
        int numberOfAttemts = 0;
        String playAgain = "yes";
        boolean gameWon = false;

        int randomNumber = random.nextInt(100);
        out.println("I'm thinking of a number between 1 and 100. What is it? \n");
        while (numberOfAttemts < 5 && playAgain.equals("yes")) {
            ++numberOfAttemts;

            for (int i = 0; i < players.length; ++i) {
                out.println(players[i] + " guess is:");
                int playerGuess = keyboard.nextInt();
                while (playerGuess > 100) {
                    out.println("Oops! That number isn't between 1 and 100. Try again.");
                    out.println(players[i] + " guess is:");
                    playerGuess = keyboard.nextInt();
                }

                if (playerGuess == randomNumber) {
                    gameWon = true;
                    out.println("You got it" + players[i] + ". My number is " + randomNumber);
                    break;
                } else if (playerGuess < randomNumber) {
                    out.println(players[i] + " guess is lower.");
                } else if (playerGuess > randomNumber) {
                    out.println(players[i] + " guess is higher.");
                }
            }

            if(numberOfAttemts > 4 || gameWon){
                out.println("Game over.\n");
                out.println("Do you want to play again ?");
                playAgain = keyboard.next();
                gameWon = false;
                randomNumber = random.nextInt(100);
                numberOfAttemts = 0;
            }

        }
    }
}
