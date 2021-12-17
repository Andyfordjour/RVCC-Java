package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates the switch statement.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class SwitchDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input; // To hold keyboard input
        char choice;  // To store the user's choice

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Ask the user to enter A, B, or C.
        System.out.print("Enter A, B, or C: ");
        input = keyboard.nextLine();
        choice = input.charAt(0);  // Get the first char
        // note: input.charAt(0) fails if the string is empty

        // Determine which character the user entered.
        switch (choice) {
            case 'A':
                System.out.println("You entered A.");
                break;
            case 'B':
                System.out.println("You entered B.");
                break;
            case 'C':
                System.out.println("You entered C.");
                break;
            default:
                System.out.println("That's not A, B, or C!");
        }
    }
}
