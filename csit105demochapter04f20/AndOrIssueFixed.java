package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program Demonstrates need for overriding the Hierarchy Date written:
 * 10/11/2004 Date Modified:	10/22/2006 - Scanner 10/18/2007 - extra ( ) not
 * needed removed 9/27/2008 - Changed class name
 *
 * @author Stephen Brower
 */

public class AndOrIssueFixed {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int customerChoice;
        double itemCost;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the customer's choice (1-Sundae, 2-Shake, 3-Cone): ");
        customerChoice = input.nextInt();

        System.out.print("Enter the cost: ");
        itemCost = input.nextDouble();

        // we want to give a coupon only to customers
        // who spend $3 or more on a shake or a sundae
        // But because of the Hierarchy, the && is processed before ||
        if ((customerChoice == 1 || customerChoice == 2) && itemCost >= 3.0) {
            System.out.println("\nGive the customer a coupon");
        } else {
            System.out.println("\nThank the customer");
        }
    }
}
