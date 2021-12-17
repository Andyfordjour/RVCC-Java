package csit105demochapter05f20;

import java.util.Scanner;

/**
 * This program demonstrates a user-controlled for loop.
 *
 * @author Tony Gaddis
 */
public class UserSquares {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number, // Loop control variable
                maxValue;  // Maximum value to display

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("I will display a table of "
                + "numbers and their squares.");

        // Get the maximum value to display.
        System.out.print("How high should I go? ");
        maxValue = keyboard.nextInt();

        // Display the table.
        System.out.printf("\n%-6s %-14s\n", "Number", "Number Squared");
        System.out.printf("%-6s %-14s\n", "------", "--------------");

        for (number = 1; number <= maxValue; number++) {
            System.out.printf("%,6d %,14d\n", number, number * number);
        }
    }
}
