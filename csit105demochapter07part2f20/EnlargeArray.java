package csit105demochapter07part2f20;

/**
 * This program demonstrates how to enlarge an array.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class EnlargeArray {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {8, 6, 7, 5, 3};

        // Display all the elements in numbers
        System.out.println("The contents of numbers array (length is "
                + numbers.length + ") :");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        // can't put in another number
        // this will fail:  numbers[5] = 9;
        // make array bigger
        numbers = enlargeArray(numbers);

        // Display all the elements in numbers
        System.out.println("\nThe contents of numbers array (length is " + numbers.length + ") :");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        // NOW, we can put in another number
        numbers[5] = 9;

        // Display all the elements in numbers
        System.out.println("The contents of numbers array (length is " + numbers.length + ") :");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

    }

    /**
     * the enlargeArray method returns a copy of "array" that is larger than the
     * array passed
     *
     * @param array array to be increased
     * @return reference to a larger array with values copied
     */
    public static int[] enlargeArray(int[] array) {
        // create a bigger array
        int[] newArray = new int[array.length * 2];

        // copy array to the new bigger array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // return the bigger array
        return newArray;
    }
}
