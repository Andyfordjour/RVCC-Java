package csit105demochapter05f20;

import java.util.Scanner;

/**
 * This program demonstrates do while with Strings
 * Date Written:    10/24/2004
 * Date Modified:   10/22/2006 - changed BufferedReader to Scanner
 *                  10/18/2007 - changed to strings
 *                  9/30/2014 - reduced messages to fit on slide
 *                  6/22/2015 - changed customerChoice to fishersChoice
 *                  10/5/2020 - changed to switch
 * @author Stephen Brower
 */
public class DemoDoWhileStringsBriefSwitch {

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

            switch (fishersChoice.toUpperCase()) {
                case "Q":
                    System.out.println("\nBye bye!\n");
                    break;
                case "F":
                    System.out.println("\nGo Fish!");
                    break;
                case "C":
                    System.out.println("\nyucky");
                    break;
                default:
                    System.out.println("\nyou entered an invalid choice");
            }

        } while (!(fishersChoice.equalsIgnoreCase("Q")));
    } // end main method    
}
