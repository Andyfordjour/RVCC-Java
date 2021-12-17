package csit105demochapter05f20;

/**
 * This program demonstrates the for loop.
 *
 * @author Tony Gaddis
 */

public class Squares {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number; // Loop control variable

        System.out.printf("%-6s %-14s\n", "Number", "Number Squared");
        System.out.printf("%-6s %-14s\n", "------", "--------------");

        for (number = 1; number <= 10; number++) {
            System.out.printf("%6d %14d\n", number, number * number);
        }
    }
}
