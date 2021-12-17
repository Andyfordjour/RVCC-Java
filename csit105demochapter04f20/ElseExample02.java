package csit105demochapter04f20;

/**
 * This program is a Demo of the if statement using else Date Modified:
 * 9/25/2013 - added else
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class ElseExample02 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean coldOutside = true;

        if (coldOutside) {
            System.out.println("Wear a coat");
        } else {
            System.out.println("Wear shorts");
        }

        System.out.println("\nHave a nice day!");
    }
}
