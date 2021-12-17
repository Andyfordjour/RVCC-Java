package csit105demochapter03f20;

/**
 * This program's purpose is to demo use of Pizza Class
 * Date Written     7/13/2011
 * @author Stephen Brower
 */

public class PizzaDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // declare variables
        Pizza pizzaOrder;     // notice the datatype...Pizza
        int pizzaSize = 2; // medium
        int numToppings = 1;
        String toppingDescription = "Sausage";

        // Get Data
        pizzaOrder = new Pizza(pizzaSize, numToppings, toppingDescription);

        // Display Pizza Order
        System.out.println(pizzaOrder);
    }
}
