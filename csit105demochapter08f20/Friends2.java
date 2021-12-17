package csit105demochapter08f20;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This demonstrates the StringTokenizer
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class Friends2 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String friendListEntered;
        StringTokenizer strTokenizer;

        // get a String to tokenize.
        System.out.print("Enter your friends separated by commas: ");
        friendListEntered = input.nextLine();

        strTokenizer = new StringTokenizer(friendListEntered, ",");

        System.out.println("\nYou entered: ");
        while (strTokenizer.hasMoreTokens()) {
            System.out.println("\t" + strTokenizer.nextToken().trim());
        }

    }

}
