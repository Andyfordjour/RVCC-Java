package csit105demochapter07part2f20;

import java.util.Random;

/**
 * This program demonstrates passing an array as an argument to a method.
 *
 * @author Tony Gaddis (et al)
 */
public class PassArray {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ARRAY_SIZE = 8;   // Size of the array

        // Create an array.
        int[] numbers = new int[ARRAY_SIZE];

        System.out.println("Array before population:");
        // Pass the array to the showArray method.
        showArray(numbers);

        // Pass the array to the getValues method.
        getValues(numbers);

        System.out.println("\nHere are the numbers assigned:");
        // Pass the array to the showArray method.
        showArray(numbers);
    }

    /**
     * The getValues method accepts an array as its argument - random numbers
     * are assigned.
     *
     * @param array reference to array to load
     */
    private static void getValues(int[] array) {
        Random randomNumbers = new Random();

        // assign random values to elements in array
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + randomNumbers.nextInt(10000);
        }
    }

    /**
     * The showArray method accepts an array as an argument displays its
     * contents.
     *
     * @param array reference to filled array to display
     */
    public static void showArray(int[] array) {
        // Display the array elements.
        for (int value : array) {
            System.out.printf("%,5d ", value);
        }
        System.out.println();
    }
}
