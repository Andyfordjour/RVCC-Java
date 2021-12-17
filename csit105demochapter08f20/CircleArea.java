package csit105demochapter08f20;

import java.util.Scanner;

/**
 * This program demonstrates the Character class's toUpperCase method.
 *
 * @author Tony Gaddis (et al)
 */
public class CircleArea {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius, // To hold a radius
                area;      // To hold an area
        String inputLine; // To hold a line of input
        char choice;      // To hold the user's choice

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Process the data for one or more circles.
        do {
            // Get the circle's radius.
            System.out.print("Enter the circle's radius: ");
            radius = keyboard.nextDouble();

            // Calculate and display the area.
            area = Math.PI * radius * radius;
            System.out.println("The area is "
                    + String.format("%.2f",area));

            // Repeat this?
            System.out.print("Do you want to do this "
                    + "again? (Y or N) ");
            keyboard.nextLine(); // Consume the remaining newline.
            inputLine = keyboard.nextLine();
            choice = inputLine.charAt(0); // Get the first char.

        } while (Character.toUpperCase(choice) == 'Y');
    }
}
