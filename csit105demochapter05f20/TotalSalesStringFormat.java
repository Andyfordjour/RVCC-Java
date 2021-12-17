package csit105demochapter05f20;

import java.util.Scanner;

/**
 * This program calculates a running total.
 *
 * @author Tony Gaddis, modified by Stephen T. Brower
 */
public class TotalSalesStringFormat {
    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days;          // The number of days
        double sales;      // A day's sales figure
        double totalSales; // Accumulator

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of days.
        System.out.print("For how many days do you have "
                + "sales figures? ");
        days = keyboard.nextInt();

        // Set the accumulator to 0.
        totalSales = 0.0;

        // Get the sales figures and calculate
        // a running total.
        for (int count = 1; count <= days; count++) {
            System.out.print("Enter the sales for day "
                    + count + ": ");
            sales = keyboard.nextDouble();
            totalSales += sales;   // Add sales to total.
        }

        // Display the total sales.
        System.out.println("The total sales are $" + 
                String.format("%,.2f",totalSales));
    }    
}
