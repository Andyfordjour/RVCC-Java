package csit105demochapter04f20;

/**
 * This program is a Demo of the if statement using a block Date Modified:
 * 9/27/2008 - changed to be consistent with slides
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class IfExample02 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean coldOutside = true;

        if (coldOutside) {
            System.out.println("Wear a coat");
            System.out.println("Wear hat");
            System.out.println("Wear gloves");
        }

        System.out.println("\nHave a nice day!");
    }
}
