package csit105demochapter07part3f20;

/**
 * This program uses the length fields of a 2D array to display the number of
 * rows and the number of columns in each row.
 *
 * @author Tony Gaddis (et al)
 */

public class LengthsRowTotals {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare a 2D array with 3 rows
        // and 4 columns.
        int[][] numbers = { {1, 2, 3, 4},
                            {5, 6, 7},          // this row has 1 less column
                            {9, 10, 11, 12, 13}}; // this row has 1 more column
        int grandTotal = 0;
        int rowTotal;

        // Display the number of rows.
        System.out.println("The number of rows is "
                + numbers.length);

        // Display the number of columns in each row.
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("The number of columns "
                    + "in row " + index + " is "
                    + numbers[index].length);
        }

        // calc grand total
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                grandTotal += numbers[row][col];
            }
        }

        System.out.println("\nData:\n");

        // Nested loops to display all the elements of the array.
        for (int row = 0; row < numbers.length; row++) {
            rowTotal = 0; // initialize row accumulator to 0
            for (int col = 0; col < numbers[row].length; col++) {
                // accumulate element
                rowTotal += numbers[row][col];
                // display item
                System.out.printf("%2d ", numbers[row][col]);
            }
            // display row total
            System.out.printf(":%2d\n", rowTotal);
        }

        System.out.printf("\nGrand Total is %d\n", grandTotal);

    }
}
