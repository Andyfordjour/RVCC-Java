package csit105demochapter04f20;

/**
 * This program demonstrates not ! Date Modified: 9/25/2013 - added else
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class NotExample01 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean coldOutside = false;

        if (!coldOutside) {
            System.out.println("Wear shorts");
        } else {
            System.out.println("Wear a coat");
        }

        System.out.println("\nHave a nice day!");
    }
}
