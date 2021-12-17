package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program calculates a salesperson's gross pay at Hal's Computer Emporium.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class SalesCommissionHals {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sales, // To hold amount of sales
                advancePay;  // To hold advance pay

        // Create DecimalFormat objects for dollar amounts
        // and percentages.
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will display a "
                + "pay report for a salesperson.");
        System.out.println("Enter the following information:");

        // Ask the user for sales & Advanced Pay
        System.out.print("Amount of sales: $");
        sales = keyboard.nextDouble();
        System.out.print("Amount of advanced pay: $");
        advancePay = keyboard.nextDouble();

        // Create an instance of the SalesCommission
        // class and pass the data to the constructor.
        SalesCommission payInfo
                = new SalesCommission(sales, advancePay);

        // Display the pay report for the salesperson.
        System.out.println("\nPay Report");
        System.out.println("--------------------------------");
        System.out.printf("%-20s $%,9.2f\n", "Sales: ", payInfo.getSales());
        System.out.printf("%-20s  %9.0f%%\n", "Commission rate:", (payInfo.calculateRate() * 100));
        System.out.printf("%-20s $%,9.2f\n", "Commission: ", payInfo.calculateCommission());
        System.out.printf("%-20s $%,9.2f\n", "Advanced pay: ", payInfo.getAdvance());
        System.out.printf("%-20s $%,9.2f\n", "Remaining pay: ", payInfo.calculatePay());
    }
}
