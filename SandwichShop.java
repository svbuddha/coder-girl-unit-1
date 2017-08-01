import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    { 
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        out.println("Checking sales goals.");
        out. println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        goalForVeggies = keyboard.nextInt();
        out.println("");
        if (goalForVeggies>=50){
            out.println("Made goal for veggies.");      
        } else {
            out.println("Fell short for veggies.");
        }
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        goalForBurgers = keyboard.nextInt();
        out.println("");
        if (goalForBurgers>=250){
            out.println("Made goal for burgers.");      
        } else {
            out.println("Fell short for burgers.");
        }
        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        goalForSubs = keyboard.nextInt();
        out.println("");
        if (goalForSubs>=180){
            out.println("Made goal for subs.");      
        } else {
            out.println("Fell short for subs.");
        }
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        goalForSoup = keyboard.nextInt();
        out.println("");
        if (goalForSoup>=70){
            out.println("Made goal for soup.");      
        } else {
            out.println("Fell short for soup.");
        }
        out.println("");
        if (goalForVeggies>=50 && goalForBurgers>=250 && goalForSubs>=180 && goalForSoup>=70){
            out.println("Made goal for everything!");
        } else {
            out.println("Did not reach goal for everything.");
        }
    }   
}
 