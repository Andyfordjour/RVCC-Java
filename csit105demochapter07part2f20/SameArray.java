package csit105demochapter07part2f20;

/**
 * This program demonstrates that two variables can reference the same array.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */

public class SameArray {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = {8, 6, 7, 5, 3, 0, 9};
        int[] array2 = new int[array1.length];

        // Display all the elements using array1
        System.out.println("The contents of array1:");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Display all the elements using array2
        System.out.println("The contents of array2:");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        // this does not do what we think
        array2 = array1;

        // Display all the elements using array1
        System.out.println("\nThe contents of array1:");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Display all the elements using array2
        System.out.println("The contents of array2:");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Change one of the elements using array1.
        array1[0] = 200;

        // Change one of the elements using array2.
        array2[4] = 1000;

        // Display all the elements using array1
        System.out.println("\nThe contents of array1:");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Display all the elements using array2
        System.out.println("The contents of array2:");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
