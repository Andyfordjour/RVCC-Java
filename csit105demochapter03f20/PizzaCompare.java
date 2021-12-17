package csit105demochapter03f20;

import java.util.Scanner;

/**
 * This program demonstrates comparing Pizza objects Date written: 10/12/2011
 * Date Modified: 9/21/2020 - embedded output
 *
 * @author Stephen Brower
 */
public class PizzaCompare {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        Pizza pizzaThought = new Pizza(3, 1, "Sausage");
        Pizza pizzaGuessed;
        int sizeEntered, numToppingsEntered;
        String toppingDescriptionEntered;
        Scanner input = new Scanner(System.in);

        // get data
        System.out.println("I'm thinking of a pizza...can you guess which one?");
        System.out.println("\nIf you get it right I'll give you one!\n");
        System.out.print("Enter size (1-small, 2-medium, 3-large): ");
        sizeEntered = Integer.parseInt(input.nextLine());

        System.out.print("Enter description of toppings: ");
        toppingDescriptionEntered = input.nextLine();

        System.out.print("Umm..I can't count...how many toppings is that? ");
        numToppingsEntered = Integer.parseInt(input.nextLine());

        // create guessed object
        pizzaGuessed = new Pizza(sizeEntered, numToppingsEntered,
                toppingDescriptionEntered);

        System.out.print("\nSo you are guessing a: ");

        displayPizza(pizzaGuessed);

        if (pizzaGuessed.equals(pizzaThought)) {
            System.out.println("\nYou got it!\nUh...I'm a little short "
                    + "of money right now, I'll catch you later");
        } else {
            System.out.println("\noooh that sounds good too...."
                    + "I was thinking of a\n");
            displayPizza(pizzaThought);
        }
    }

    public static void displayPizza(Pizza pizzaToDisplay) {
        String displayPizzaSize;

        // display pizza            
        if (pizzaToDisplay.getSize() == 1) {
            displayPizzaSize = "Small Pizza";
        } else if (pizzaToDisplay.getSize() == 2) {
            displayPizzaSize = "Medium Pizza";
        } else if (pizzaToDisplay.getSize() == 3) {
            displayPizzaSize = "Large Pizza";
        } else {
            displayPizzaSize = "Unknown Pizza Size";
        }

        System.out.print(displayPizzaSize);

        if (pizzaToDisplay.getNumToppings() > 0) {
            System.out.print(" with " + pizzaToDisplay.getNumToppings()
                    + " toppings(" + pizzaToDisplay.getToppingDescription() + ").");
        } else {
            System.out.print(" with no toppings.");
        }

        System.out.println(" Cost $" + String.format("%,.2f", pizzaToDisplay.cost()));
    }
}
