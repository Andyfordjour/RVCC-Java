package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program demonstrates how variables can be declared in various locations
 * throughout a program - HOWEVER....programming guidelines say to declare
 * variables up top
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class VariableScope {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the annual income.
        System.out.print("What is your annual income? ");
        double income;  // Annual income
        income = keyboard.nextDouble();

        // Determine whether the user qualifies.
        if (income >= 35000) {
            System.out.println("For how many years have you ");
            System.out.print("worked on your current job? ");
            int years;   // Years on the job
            years = keyboard.nextInt();
            if (years > 5) {
                System.out.println("You qualify.");
            } else {
                System.out.println("You must have been employed for ");
                System.out.println("more than 5 years to qualify.");
            }
        } else {
            System.out.println("You must make more that 35,000 ");
        }

    }
}
