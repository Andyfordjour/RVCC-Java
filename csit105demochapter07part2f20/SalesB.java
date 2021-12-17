package csit105demochapter07part2f20;

import java.util.Scanner;   // Needed for Scanner class

/**
 * This program gathers sales amounts for the week. It uses the SalesData class
 * to display the total, average, highest, and lowest sales amounts.
 * @author Tony Gaddis and Stephen Brower
 */
public class SalesB {

    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        final int ONE_WEEK = 7; // Number of elements

        // Create an array to hold sales amounts for a week.
        double[] sales = new double[ONE_WEEK];

        // Get the week's sales figures.
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter the sales for day " + (i + 1) + ": ");
            sales[i] = keyboard.nextDouble();
        }

        // Create a SalesData object, initialized
        // with the week's sales figures.
        SalesData week = new SalesData(sales);

        // Display the total, average, highest, and lowest
        // sales amounts for the week.
        System.out.printf("\nThe total sales were $%,.2f\n"
                + "The average sales were $%,.2f\n"
                + "The highest sales were $%,.2f\n"
                + "The lowest sales were $%,.2f\n",
                week.getTotal(),
                week.getAverage(),
                week.getHighest(),
                week.getLowest());

    }

}
