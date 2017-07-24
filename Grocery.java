import static java.lang.System.out;
import java.util.Scanner;
public class Grocery
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        String itemName1 = keyboard.nextLine();
        out.println("");
        out.print("Item 2? ");
        String itemName2 = keyboard.nextLine();
        out.println("");
        out.print("Item 3? ");
        String itemName3 = keyboard.nextLine();
        out.println("");
        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + itemName1 + "? ");
        int itemQuantity1 = keyboard.nextInt();
        out.println("");
        out.print("How many " + itemName2 + "? ");
        int itemQuantity2 = keyboard.nextInt();
        out.println("");
        out.print("How many " + itemName3 + "? ");
        int itemQuantity3 = keyboard.nextInt();
        out.println("");
        out.println("Now, please enter the price of each item.");
        out.print("How much does one " + itemName1 + " cost? ");
        float itemPrice1 = keyboard.nextFloat();
        out.println("");
        out.print("How much does one " + itemName2 + " cost? ");
        float itemPrice2 = keyboard.nextFloat();
        out.println("");
        out.print("How much does one " + itemName3 + " cost? ");
        float itemPrice3 = keyboard.nextFloat();
        out.println("");
        float totalPriceItem = (itemQuantity1 * itemPrice1) + (itemQuantity2 * itemPrice2) + (itemQuantity3 * itemPrice3);
        out.println("Calculating your grocery bill.");
        out.print("Your total cost is " + totalPriceItem);
        
    }
}
