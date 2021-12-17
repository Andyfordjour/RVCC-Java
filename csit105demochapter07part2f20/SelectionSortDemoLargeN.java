package csit105demochapter07part2f20;

import java.util.Random;

/**
 * This program demonstrates the selectionSort method in the ArrayTools class.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class SelectionSortDemoLargeN {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] arg) {
        // Create an array of unsorted values.
        int[] values = new int[200000]; // note: 200,000 ~30 seconds on 2.4 GHz proc

        // load array
        populateArray(values);

        // Display the unsorted array.
        System.out.println("The first 100 unsorted values are:");
        for (int index = 0; index < 100; index++) {
            System.out.print(values[index] + " ");
        }
        System.out.println();

        System.out.println("\nSorting the array...please wait!");
        // Sort the array.
        ArrayTools.selectionSort(values);

        // Display the sorted array.
        System.out.println("\nThe first 100 sorted values are:");
        for (int index = 0; index < 100; index++) {
            System.out.print(values[index] + " ");
        }
        System.out.println();
    }

    public static void populateArray(int[] data) {
        Random randomNumbers = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = randomNumbers.nextInt(200001);  // generates 0-200,000
        }
    }
}
