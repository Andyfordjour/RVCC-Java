package csit105demochapter08f20;

import java.util.Scanner;

/**
 * This program demonstrates .split method
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class Friends {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String friendListEntered;
        String[] tokens;

        // get a String to tokenize.
        System.out.print("Enter your friends separated by commas: ");
        friendListEntered = input.nextLine();

        // Get the tokens from the string.
        tokens = friendListEntered.split(",");

        System.out.println("\nYou entered: "+tokens.length);
        // Display each token.
        for (int i = 0; i < tokens.length; i++) {
            System.out.println("\t" + tokens[i].trim());
        }

        System.out.println("\nYour first friend listed is: " + tokens[0]);
    }

}
