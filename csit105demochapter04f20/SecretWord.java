package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates a case-insensitive string comparison.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class SecretWord {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;    // To hold the user's input

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Prompt the user to enter the secret word.
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();

        // Determine if the user entered the secret word.
        if (input.equalsIgnoreCase("Rosebud")) {
            System.out.println("Congratulations! You know the "
                    + "secret word!");
        } else {
            System.out.println("Sorry, that is NOT the "
                    + "secret word!");
        }
    }
}
