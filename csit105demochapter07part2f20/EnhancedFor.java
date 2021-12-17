package csit105demochapter07part2f20;

/**
 * This program demonstrates the enhanced for to display a Filled array
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class EnhancedFor {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {8, 6, 7, 5, 3, 0, 9};

        for (int val : numbers) {
            System.out.printf("The next value is %d\n", val);
        }

    }
}
