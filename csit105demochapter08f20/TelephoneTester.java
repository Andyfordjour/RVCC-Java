package csit105demochapter08f20;

/**
 * This program demonstrates the Telephone class's static format method.
 *
 * @author Tony Gaddis (et al)
 */

public class TelephoneTester {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String phoneNumber = "9085261200";
        System.out.println(Telephone.format(phoneNumber));
    }
}
