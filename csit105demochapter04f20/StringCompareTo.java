package csit105demochapter04f20;

import java.util.Scanner;  // Needed for the Scanner class

/**
 * This program compares two String objects using the compareTo method.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class StringCompareTo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fruit1, fruit2;  // To hold two names

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get a fruit.
        System.out.print("Enter a fruit: ");
        fruit1 = keyboard.nextLine();

        // Get another fruit.
        System.out.print("Enter another fruit: ");
        fruit2 = keyboard.nextLine();

        // Compare the fruits.
        if (fruit1.compareTo(fruit2) < 0) {
            System.out.println(fruit1 + " is less than " + fruit2);
        } else if (fruit1.compareTo(fruit2) == 0) {
            System.out.println(fruit1 + " is equal to " + fruit2);
        } else if (fruit1.compareTo(fruit2) > 0) {
            System.out.println(fruit1 + " is greater than " + fruit2);
        }
    }
}
