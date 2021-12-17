package csit105demochapter05f20;

import java.util.Scanner;

/**
 * This program demonstrates do while with Strings
 * Date Written:    10/24/2004
 * Date Modified:   10/22/2006 - changed BufferedReader to Scanner
 *                  10/18/2007 - changed to strings
 *                  9/30/2014 - reduced messages to fit on slide
 *                  6/22/2015 - changed customerChoice to fishersChoice
 * @author Stephen Brower
 */
public class DemoDoWhileStringsBrief {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String fishersChoice;

        Scanner input = new Scanner(System.in);

        System.out.println("Fisher's Dilemma");

        do {
            System.out.print("\nEnter choice (F=Fish, C=Cut "
                    + "Bait,Q=Quit: ");
            fishersChoice = input.nextLine(); // get users choice

            if (fishersChoice.equalsIgnoreCase("Q")) {
                System.out.println("\nBye bye!\n");
            } else if (fishersChoice.equalsIgnoreCase("F")) {
                System.out.println("\nGo Fish!");
            } else if (fishersChoice.equalsIgnoreCase("C")) {
                System.out.println("\nyucky");
            } else {
                System.out.println("\nyou entered an invalid choice");
            }

        } while (!(fishersChoice.equalsIgnoreCase("Q")));
    } // end main method
} // end class
