package csit105demochapter04f20;

import java.util.Scanner;

/**
 * This program uses the Payroll class to calculate an employee's gross pay.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class PayrollDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hours, // To hold hours worked
                rate;   // To hold the hourly pay rate

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Create a Payroll object.
        Payroll employee;

        // Get the number of hours worked.
        System.out.print("How many hours did the "
                + "employee work? ");
        hours = keyboard.nextDouble();

        // Get the hourly pay rate.
        System.out.print("What is the employee's "
                + "hourly pay rate? ");
        rate = keyboard.nextDouble();

        // Store the data.
        employee = new Payroll(hours, rate);

        // Display the gross pay.
        System.out.printf("The employee's gross pay is $%,.2f\n",
                employee.getGrossPay());
    }
}
