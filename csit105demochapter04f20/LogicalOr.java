package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates the logical || operator.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class LogicalOr {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double income;  // Annual income
        int years;      // Years on the job

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the annual income.
        System.out.print("What is your annual income? ");
        income = keyboard.nextDouble();

        // Get the number of years on the current job.
        System.out.print("For how many years have you "
                + "worked on your current job? ");
        years = keyboard.nextInt();

        // Determine whether the user qualifies.
        if (income >= 35000 || years > 5) {
            System.out.println("You qualify for the loan.");
        } else {
            System.out.println("You must earn at least $35000 "
                    + "or have been employed for more");
            System.out.println("than 5 years to qualify.");
        }
    }
}
