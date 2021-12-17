package csit105demochapter05f20;

/**
 * This program produces the same results as the while loop but uses a for loop.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class ForLoop {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;

        for (number = 1; number <= 3; number++) {
            System.out.println("Hello #" + number);
        }

        System.out.println("That's all!");
    }
}
