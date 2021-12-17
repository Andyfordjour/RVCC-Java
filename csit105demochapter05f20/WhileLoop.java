package csit105demochapter05f20;

/**
 * This program demonstrates the while loop.
 *
 * @author Tony Gaddis
 */

public class WhileLoop {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 1;

        while (number <= 3) {
            System.out.println("Hello #" + number);
            number++;
        }

        System.out.println("That's all!");
    }
}
