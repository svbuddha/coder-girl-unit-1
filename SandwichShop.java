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
        int veggieSandwichSold;
        int burgersSold;
        int subsSold;
        int soupsSold;
        out.println("Checking sales goals.");
        out. println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        
        veggieSandwichSold = keyboard.nextInt();
        out.println("");
        if (veggieSandwichSold >= goalForVeggies){
            out.println("Made goal for veggies.");      
        } else {
            out.println("Fell short for veggies.");
        }
        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        
        burgersSold = keyboard.nextInt();
        out.println("");
        if (burgersSold >= goalForBurgers){
            out.println("Made goal for burgers.");      
        } else {
            out.println("Fell short for burgers.");
        }
        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        
        subsSold = keyboard.nextInt();
        out.println("");
        if (subsSold >= goalForSubs){
            out.println("Made goal for subs.");      
        } else {
            out.println("Fell short for subs.");
        }
        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        
        soupsSold = keyboard.nextInt();
        out.println("");
        if (soupsSold >= goalForSoup){
            out.println("Made goal for soup.");      
        } else {
            out.println("Fell short for soup.");
        }
        out.println("");
        if (veggieSandwichSold >= goalForVeggies && burgersSold >= goalForBurgers 
        && subsSold >= goalForSubs && subsSold>= goalForSoup){
            out.println("Made goal for everything!");
        } else {
            out.println("Did not reach goal for everything.");
        }
    }   
}

 
