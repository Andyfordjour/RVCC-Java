package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates the if-else statement.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class Division {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lastMonthsSales, thisMonthsSales; // Division operands
        double percentChange;         // Result of division

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the first number.
        System.out.print("Enter the sales for Last Month: ");
        lastMonthsSales = keyboard.nextDouble();

        // Get the second number.
        System.out.print("Enter the sales for This Month: ");
        thisMonthsSales = keyboard.nextDouble();

        if (lastMonthsSales == 0) {
            System.out.println("\nSince there were no sales last month, "
                    + "the percent change cannot be calculated.");
        } else {
            percentChange = (thisMonthsSales - lastMonthsSales) / lastMonthsSales * 100;
            System.out.printf("\nFrom last month to this month sales have changed %.1f%%\n", percentChange);
        }
    }
}
