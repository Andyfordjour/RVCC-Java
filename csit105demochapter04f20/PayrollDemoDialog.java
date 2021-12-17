package csit105demochapter04f20;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class PayrollDemoDialog {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, // The user's name
                inputString;  // To hold input
        int hours;           // Hours worked
        /* Note: in reality, hours worked
                              can be a decimal, this is just meant
                              to be an example of int */
        double payRate; // Hourly pay rate

        // Create a Payroll object.
        Payroll employee;

        // Get the user's name.
        name = JOptionPane.showInputDialog("What is your name?");

        // Get the hours worked.
        inputString = JOptionPane.showInputDialog("How many hours "
                + "did you work this week?");
        hours = Integer.parseInt(inputString);

        // Get the hourly pay rate.
        inputString = JOptionPane.showInputDialog("What is your "
                + "hourly pay rate?");
        payRate = Double.parseDouble(inputString);

        // Store the data.
        employee = new Payroll(hours, payRate);

        // Display the results.
        JOptionPane.showMessageDialog(null, "Hello " + name
                + ". Your gross pay is $" + String.format("%,.2f", employee.getGrossPay()));

        // close the JOptionPane thread.
        System.exit(0);
    }

}
