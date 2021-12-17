package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program is a Demo of String Comparison ignoring Case Date Written:
 * 11/15/2004 Date Modified: 4/4/2007 - switched to Scanner 10/10/2007 - changed
 * class name 9/27/2008 - changed class name
 *
 * @author Stephen Brower
 */
public class CompareStringsA {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String nameString;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        nameString = input.nextLine();

        System.out.printf("\nYou Entered: %s\n\n", nameString);

        // NOTE: if (nameString == "Homer") //does not work!
        if (nameString.equalsIgnoreCase("Homer")) {
            System.out.println("Hey Homer!");
        } else {
            System.out.println("Greetings");
        }

    }
}
