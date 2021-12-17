package csit105demochapter07part3f20;

import java.util.Scanner;

/**
 * This program Demonstrates the loading of an
 * array from user input
 * n is profoundly meaningful in computer science
 * n represents the number of pieces of data we have
 * Date Written:    4/20/2005
 * Date Modified:   4/18/2007 - tweaked comments
 *                  7/6/2015 - migrated to NetBeans
 * @author Stephen Brower
 */

public class ArrayDemo4 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n;                  // n = number of elements in array
        int index;              // index - to hold index of element referenced
        double priceEntered;    // temporarily holds what the user enters
        double[] prices;        // declaration of array
        prices = new double[6]; // allocation of array

        Scanner input = new Scanner(System.in);

        // get data
        System.out.print("Enter a price (-1 when done): ");
        priceEntered = input.nextDouble();

        // n is the number of elements USED in the array
        n = 0;

        // I'm assuming that the user will not enter
        // more than 6 values
        while (priceEntered != -1) // while user has not entered sentinel
        {
            // at this point, price entered has a value
            // I want to stick that value into the array

            prices[n] = priceEntered;
            n++;

            System.out.print("Enter a price (-1 when done): ");
            priceEntered = input.nextDouble();
        }

        // when this loop is done, n is the number of elements that I have
        // n is one more than the highest subscript I used
        if (n == 0) {
            System.out.println("\nNo Data Entered");
        } else {
            // display header
            System.out.printf("\n%2s %6s\n\n", "#", "Price");

            // display prices array
            for (index = 0; index < n; index++) {
                System.out.printf("%2d %6.2f\n", index, prices[index]);
            }
        }

    }
}
