package csit105demochapter07part2f20;

/**
 * This program demonstrates passing individual array elements as arguments to a
 * method.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
import java.util.Random;

public class PassElements {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        // declare and allocate an array
        int[] numbers = new int[8];

        // assign random values to elements in array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + randomNumbers.nextInt(10000);
        }

        // Pass each element to the ShowValue method.
        for (int i = 0; i < numbers.length; i++) {
            showValue(numbers[i]);
        }
        System.out.println();
    }

    /**
     * The showValue method displays its argument.
     *
     * @param n an int to display
     */
    public static void showValue(int n) {
        System.out.printf("%,5d ", n);
    }
}
