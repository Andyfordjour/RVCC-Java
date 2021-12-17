package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program This program demonstrates the logical || operator. Date written:
 * 10/11/2004 Date Modified:	10/22/2006 - implement Scanner 9/27/2008 - changed
 * class name 9/29/2011 - changed class name
 *
 * @author Stephen Brower
 */
public class LogicalOrCoupon {

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

        // we want to give a coupon to customers
        // who EITHER buy a shake OR spend $3 or more
        if ((customerChoice == 2) || (itemCost >= 3.0)) {
            System.out.println("\nGive the customer a coupon");
        } else {
            System.out.println("\nThank the customer");
        }
    }
}
