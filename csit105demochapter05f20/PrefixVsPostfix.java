package csit105demochapter05f20;

/**
 * This program demonstrates the ++ and -- operators in prefix mode.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class PrefixVsPostfix {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        int copyNumber;

        number = 4;  // number starts out with 4
        copyNumber = 0;  // copyNumber starts out 0

        System.out.printf("Starting with number = %d copyNumber = %d\n",
                number, copyNumber);

        copyNumber = number++;

        System.out.printf("After postfix, number = %d copyNumber = %d\n",
                number, copyNumber);

        number = 4;  // let's reset to 4 and try the other way
        copyNumber = 0;  //

        System.out.printf("\nStarting with number = %d copyNumber = %d\n",
                number, copyNumber);

        copyNumber = ++number;

        System.out.printf("After prefix, number = %d copyNumber = %d\n",
                number, copyNumber);

    }
}
