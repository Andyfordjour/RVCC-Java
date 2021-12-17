package csit105demochapter05f20;

import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

/**
 * This program reads payroll data from a file.
 * Date Modified:   10/5/2008 by Stephen Brower
 *                            changed to read payroll file
 * @author Concept by:  Tony Gaddis (et al) modified by Stephen Brower
*/
public class SpringfieldNuclearPayrollFileDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String filename;
        String employeeName, lineRead;
        double annualSalary;
        double totalSalary = 0;

        // Get the filename.
        filename = "SpringfieldNuclear.txt";

        // Open the file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // display report header
        System.out.printf("%-25s %13s\n", "Employee Name", "Ann.Salary");
        System.out.printf("%-25s %13s\n", "=========================", "=============");

        // Read lines from the file until no more are left.
        while (inputFile.hasNext()) {
            // Read the employee name.
            employeeName = inputFile.nextLine();

            // this assumes the salary exists
            lineRead = inputFile.nextLine();

            // convert the lineRead to a double
            annualSalary = Double.parseDouble(lineRead);

            // accumulate salary
            totalSalary += annualSalary;

            // Display the employee name and salary read.
            System.out.printf("%-25s %,13.2f\n", employeeName, annualSalary);
        }

        // Close the file.
        inputFile.close();

        // display total
        System.out.printf("\n%-25s %,13.2f\n", "Total Salaries", totalSalary);
    }
}
