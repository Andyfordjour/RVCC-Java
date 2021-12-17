package csit105demochapter07part2f20;

/**
 * This program demonstrates the selectionSort method in the ArrayTools class.
 *
 * @author Tony Gaddis (et al)
 */

public class SelectionSortDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param arg the command line arguments
     */
    public static void main(String[] arg) {
        // Create an array of unsorted values.
        int[] values = {8, 6, 7, 5, 3, 0, 9};

        // Display the unsorted array.
        System.out.println("The unsorted values are:");
        for (int index = 0; index < values.length; index++) {
            System.out.print(values[index] + " ");
        }
        System.out.println();

        // Sort the array.
        ArrayTools.selectionSort(values);

        // Display the sorted array.
        System.out.println("The sorted values are:");
        for (int index = 0; index < values.length; index++) {
            System.out.print(values[index] + " ");
        }
        System.out.println();
    }
}
