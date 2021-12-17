package csit105demochapter07part2f20;

/**
 * This program demonstrates how a reference to an array can be returned from a
 * method.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */

public class ReturnArray {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] values;

        // Let values reference the array returned
        // from the getArray method.
        values = getArray();

        // Pass the array to the showArray method.
        showArray(values);
    }

    /**
     * The getArray method returns a reference to an array of doubles.
     *
     * @return reference to array of double
     */
    public static double[] getArray() {
        double[] array = {1.2, 2.3, 4.5, 6.7, 8.9};
        return array;
    }

    /**
     * The showArray method accepts an array as an argument displays its
     * contents.
     *
     * @param array reference to array to display
     */
    public static void showArray(double[] array) {
        // Display the array elements.
        for (double value : array) {
            System.out.printf("%5.1f ", value);
        }
        System.out.println();
    }
}
