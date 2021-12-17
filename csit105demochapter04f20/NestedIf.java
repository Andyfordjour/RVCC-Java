package csit105demochapter04f20;

/**
 * This program is a Demo of nested if statement Modified 9/25/2013
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class NestedIf {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean coldOutside = true;
        boolean snowing = false;

        if (coldOutside) {
            if (snowing) {
                System.out.println("Wear a parka");
            } else {
                System.out.println("Wear a jacket");
            }
        } else {
            System.out.println("Wear shorts");
        }

        System.out.println("\nHave a nice day!");
    }
}
