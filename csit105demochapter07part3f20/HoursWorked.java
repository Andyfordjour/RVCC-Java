package csit105demochapter07part3f20;

import java.util.Scanner;

/**
 * Array Demo
 *
 * @author Stephen Brower
 */
public class HoursWorked {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        String[] employees = {"Homer", "Carl", "Lenny"};
        String daysOfWeekName[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        int dayOfWeek, employeeNum;

        // declare array row for each employee, column for day of week
        int[][] hoursWorkedForWeek = new int[employees.length][daysOfWeekName.length];

        // load array
        for (employeeNum = 0; employeeNum < employees.length; employeeNum++) {
            // display employee name
            System.out.println("\nEnter the hours worked for the week for " + employees[employeeNum] + ":");

            // Get employee's hours worked for each day.
            for (dayOfWeek = 0; dayOfWeek < daysOfWeekName.length; dayOfWeek++) {
                System.out.print(daysOfWeekName[dayOfWeek] + ": ");
                hoursWorkedForWeek[employeeNum][dayOfWeek] = keyboard.nextInt();
            }
        }

        // display array
        // display column headers:
        System.out.printf("\n%-10s ", "Employee");
        for (dayOfWeek = 0; dayOfWeek < daysOfWeekName.length; dayOfWeek++) {
            System.out.printf("%9s ", daysOfWeekName[dayOfWeek]);
        }
        System.out.println();

        // display data
        for (employeeNum = 0; employeeNum < employees.length; employeeNum++) {
            System.out.printf("\n%-10s ", employees[employeeNum]);

            // Get employee's hours worked for each day.
            for (dayOfWeek = 0; dayOfWeek < daysOfWeekName.length; dayOfWeek++) {
                System.out.printf("%9d ", hoursWorkedForWeek[employeeNum][dayOfWeek]);
            }
        }
        System.out.println();

    }
}
