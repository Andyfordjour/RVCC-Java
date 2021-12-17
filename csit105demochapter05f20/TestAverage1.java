package csit105demochapter05f20;

import java.util.Scanner;

/**
 * This program demonstrates a user-controlled loop.
 *
 * @author Tony Gaddis
 */
public class TestAverage1 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;                   // To hold keyboard input
        double score1, score2, score3;  // Three test scores
        double average;                 // Average test score
        char repeat;                    // Holds 'y' or 'n'

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program calculates the average "
                + "of three test scores.");

        do {
            // Get the three test scores.
            System.out.print("\nEnter score #1: ");
            score1 = keyboard.nextDouble();
            System.out.print("Enter score #2: ");
            score2 = keyboard.nextDouble();
            System.out.print("Enter score #3: ");
            score3 = keyboard.nextDouble();

            // Calculate and print the average test score.
            average = (score1 + score2 + score3) / 3.0;
            System.out.printf("\nThe average is %.1f", average);
            System.out.println();

            // Does the user want to average another set?
            System.out.println("\nWould you like to average "
                    + "another set of test scores?");
            System.out.print("Enter Y for yes or N for no: ");
            input = keyboard.next();     // Read a string.
            repeat = input.charAt(0);    // Get the first char.

        } while (repeat == 'Y' || repeat == 'y');
    }
}
