import static java.lang.System.out;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //String[][] table = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        //String currentMove = "X";
        //String scanValue;
        //Scanner keyboard = new Scanner (System.in);
        out.println("Welcome to Tic Tac Toe!");
        out.println("");
        out.println("To play, enter a number for which box to play in:");
        out.println("1 2 3");
        out.println("4 5 6");
        out.println("7 8 9");
        out.println("");
        out.println("You'll need a buddy to play with. Ready to begin?");
        out.println("");
        //printBoard(table);
        //String currentValue = "";
        //take user input and set it to scanvalue
        //scanValue = keyboard.next();
        //out.println("ScanValue"+ scanValue);
        //replacePosition(scanValue,currentMove,table);
        nextMove();
    }

    public static void printBoard(String[][] table) {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; c++) {
                if (column < (table.length - 1)) {
                    if (table[row][column] == "X" || table[row][column] == "x" || table[row][column] == "o" || table[row][column] == "O") {
                        out.print(table[row][column] + "|");
                    } else {
                        out.print("." + "|");
                    }
                } else {
                    if (table[row][column] == "X" || table[row][column] == "O") {
                        out.println(table[row][column]);
                    } else {
                        out.println(".");
                    }
                }
            }
        }
    }

    public static String[][] replacePosition(String scanValue, String move, String[][] table) {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                if (scanValue.equals(table[row][column])) {
                    table[row][column] = move;
                    break;
                }
            }
        }
        printBoard(table);
        return table;
    }

    public static void nextMove() {
        boolean gameOver = false;
        boolean doesXStart = true;
        boolean isXTurn = doesXStart;
        String[][] table = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        String scanValue;
        String currentMove = "X";
        Scanner keyboard = new Scanner(System.in);
        printBoard(table);
        while (!gameOver) {
            scanValue = keyboard.next();
            replacePosition(scanValue, currentMove, table);
            currentMove = switchMove(currentMove);
            isXTurn = doesXStart;
            doesXStart = !doesXStart;
            boolean gameStillGoing = true;
            String winner = getWinner(table);
            if (winner.length() > 0) {
                out.println("winner is " + winner);
                gameOver = true;
            } else {
                if (isGameDraw(table)) {
                    out.println("The game is a draw. Nobody wins.");
                    gameOver = true;
                }
            }
        }
    }

    public static boolean isGameDraw(String[][] table) {
        boolean isDraw = true;
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                if (!(table[row][column].equals("X") || table[row][column].equals("O"))) {
                    return false;
                }
            }
        }
        return isDraw;
    }

    public static String getWinner(String[][] table) {
        String winner = "";
        String rowWinner = rowWinner(table);
        String columnWinner = columnWinner(table);
        String leftDiagonalWinner = leftDiagonalWinner(table);
        String rightDiagonalWinner = rightDiagonalWinner(table);
        if (rowWinner.length() > 0) {
            winner = rowWinner;
        } else if (columnWinner.length() > 0) {
            winner = columnWinner;
        } else if (leftDiagonalWinner.length() > 0) {
            winner = leftDiagonalWinner;
        } else if (rightDiagonalWinner.length() > 0) {
            winner = rightDiagonalWinner;
        }
        return winner;
    }

    public static String switchMove(String currentMove) {
        //condition?x:y ternary condition
        //  nextPlayer = currentMove.equals("X")?"O":"X";
        String nextPlayer = currentMove;
        if (currentMove.equals("X")) {
            nextPlayer = "O";
        } else {
            nextPlayer = "X";
        }
        return nextPlayer;
    }

    public static String rowWinner(String[][] table) {
        String winner = "";
        for (int row = 0; row < table.length; row++) {
            String firstValue = table[r][0];
            for (int column = 0; column < table.length; column++) {
                if (table[row][column].equals(firstValue)) {
                    if (column == table.length - 1) {
                        winner = firstValue;
                    }
                } else {
                    break;
                }
            }
            if (winner.length()!= 0) {
                break;
            }
        }
        return winner;
    }

    public static String columnWinner(String[][] table) {
        String winner = "";
        for (int column = 0; column < table.length; column++) {
            String firstValue = table[0][column];
            for (int row = 0; row < table.length; row++) {
                if (table[row][column].equals(firstValue)) {
                    if (row == table.length - 1) {
                        winner = firstValue;
                    }
                } else {
                    break;
                }
            }
            if (winner.length()!= 0) {
                break;
            }
        }
        return winner;
    }

    public static String leftDiagonalWinner(String[][] table) {
        String firstValue = table[0][0];
        String winner = "";
        for (int i = 0; i < table.length; i++) {
            if (table[i][i].equals(firstValue)) {
                if (i == 2) {
                    winner = firstValue;
                    break;
                }
            } else {
                break;
            }
        }
        return winner;
    }

    public static String rightDiagonalWinner(String[][] table) {
        /*String firstValue = table[0][2];
        String winner = "";
        for (int row = 0; row < table.length; row++) {
            for (int column = 2; column > 0; column--) {
                if (table[row][column].equals(firstValue)) {
                    if (column == 0) {
                        winner = firstValue;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return winner;*/ // I am trying to find why this code is not working? 
        
        String startingValue = table[0][table.length -1];
        String winner = "";
        for(int row = 1, column = table.length-2; row < table.length; row++, column--) {
            if(!startingValue.equals(table[row][column])){
                winner = "";
                break;
            } else {
                winner = table[row][column];
            }
        }
        return winner;
    }
}

