package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates the logical && operator.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class LogicalAnd {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;     // To hold keyboard input
        char employed, // Employed? y or n
                recentGrad;  // Recent graduate? y or n

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Display instructions.
        System.out.println("Answer the following questions "
                + "with either y for Yes");
        System.out.println("or n for No.");

        // Is the user employed?
        System.out.print("Are you employed? ");
        input = keyboard.nextLine();
        employed = input.charAt(0); // Get the first character
        // note: input.charAt(0) fails if the string is empty

        // Is the user a recent graduate?
        System.out.print("Have you graduated from college "
                + "in the past two years? ");
        input = keyboard.nextLine();
        recentGrad = input.charAt(0);  // Get the first character

        // Determine whether the user qualifies.
        if (employed == 'y' && recentGrad == 'y') {
            System.out.println("You qualify for the special "
                    + "interest rate.");
        } else {
            System.out.println("You must be employed and have "
                    + "graduated from college in the"
                    + "past two years to qualify.");
        }
    }
}
