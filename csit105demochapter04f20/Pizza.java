package csit105demochapter04f20;
/** 
 * Think of this Pizza class as being a "template" for a Pizza
 * Notes:
 *      A Class provides one or more methods (Methods represents tasks in a program)
 *      Classes contain one or more attributes (Specified by instance variables)
 *      This class does not contain a main method - this cannot be run!
 * Date Written     10/4/2006
 * Date Modified    9/26/2007 - cleaned up constructor to call appropriate methods
 *                            - streamlined output to remove redundant output
 *                            - added more comments by placing some lecture notes into the code
 * @author Stephen Brower
*/
import java.text.DecimalFormat;

public class Pizza {

    // Pizza Data (Class Attributes)
    private int size;           // 1 small; 2 medium; 3 large
    private int numToppings;    // 0-9
    private String toppingDescription;
    // the proper way to handle the toppings is to
    // use an array of Strings...that's chapter 7

    /**
     * Constructor (when you do issue a "new Pizza" this is called
     *
     * @param newSize The size of the pizza
     * @param newNumToppings The number of toppings
     * @param newToppingDescription the description of the toppings
     */
    public Pizza(int newSize, int newNumToppings, 
            String newToppingDescription) {
        setSize(newSize);

        setNumToppings(newNumToppings);

        setToppingDescription(newToppingDescription);
    }

    /**
     * The setSize method stores a value in the size field.
     *
     * @param newSize The value to store in size.
     */
    public void setSize(int newSize) {
        if ((newSize >= 1) && (newSize <= 3)) {
            size = newSize;
        } else {
            size = 1; // assume small
        }
    }

    /**
     * The setNumToppings method stores a value in the numToppings field.
     *
     * @param newNumToppings The value to store in size.
     */
    public void setNumToppings(int newNumToppings) {
        if ((newNumToppings >= 0) && (newNumToppings <= 9)) {
            numToppings = newNumToppings;
        } else {
            numToppings = 0; // assume no toppings
        }
    }

    /**
     * The setToppingDescription method stores a value in the toppingDescription
     * field.
     *
     * @param newToppingDescription The value to store in size.
     */
    public void setToppingDescription(String newToppingDescription) {
        toppingDescription = newToppingDescription;
    }

    /**
     * The getSize method returns a Pizza object's size.
     *
     * @return The value in the size field.
     */
    public int getSize() {
        return size;
    }

    /**
     * The getNumToppings method returns a Pizza object's numToppings.
     *
     * @return The value in the numToppings field.
     */
    public int getNumToppings() {
        return numToppings;
    }

    /**
     * The getToppingDescription method returns a Pizza object's
     * toppingDescription.
     *
     * @return The value in the toppingDescription field.
     */
    public String getToppingDescription() {
        return toppingDescription;
    }

    /**
     * The toString method returns a description of a Pizza object.
     *
     * @return a String that represents the Pizza .
     */
    public String toString() {
        DecimalFormat moneyFormat = new DecimalFormat("#,##0.00");
        String stringToReturn, displayPizzaSize;

        if (size == 1) {
            displayPizzaSize = "Small Pizza";
        } else if (size == 2) {
            displayPizzaSize = "Medium Pizza";
        } else if (size == 3) {
            displayPizzaSize = "Large Pizza";
        } else {
            displayPizzaSize = "Unknown Pizza Size";
        }

        if (numToppings > 0) {
            stringToReturn = displayPizzaSize + " with " + numToppings
                    + " toppings(" + toppingDescription + ").";
        } else {
            stringToReturn = displayPizzaSize + " with no toppings.";
        }

        return stringToReturn + " Cost $" + moneyFormat.format(cost());
    }

    /**
     * The cost method returns a Pizza object's cost.
     *
     * @return The cost of the pizza.
     */
    public double cost() {
        // it would be best if these values were read
        // from a database or file
        final double SMALL_BASE_COST = 7.5;
        final double MEDIUM_BASE_COST = 9.25;
        final double LARGE_BASE_COST = 12.5;

        final double SMALL_TOPPING_COST = .6;
        final double MEDIUM_TOPPING_COST = .75;
        final double LARGE_TOPPING_COST = .9;

        double pizzaCost = 0;

        if (size == 1) {
            pizzaCost = SMALL_BASE_COST + numToppings * SMALL_TOPPING_COST;
        } else if (size == 2) {
            pizzaCost = MEDIUM_BASE_COST + numToppings * MEDIUM_TOPPING_COST;
        } else if (size == 3) {
            pizzaCost = LARGE_BASE_COST + numToppings * LARGE_TOPPING_COST;
        }

        return pizzaCost;
    }

}
