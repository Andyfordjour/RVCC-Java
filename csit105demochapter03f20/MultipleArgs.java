package csit105demochapter03f20;

/**
 * This program demonstrates how to pass multiple arguments to a method.
 *
 * @author Tony Gaddis
 */
import java.util.Scanner;  // Needed for the Scanner class

public class MultipleArgs {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double boxLength, // To hold the box's length
                boxWidth;  // To hold the box's width

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Create a Rectangle object.
        Rectangle box = new Rectangle();

        // Get the box's length.
        System.out.print("What is the box's length? ");
        boxLength = keyboard.nextDouble();

        // Get the box's width.
        System.out.print("What is the box's width? ");
        boxWidth = keyboard.nextDouble();

        // Pass boxLength and boxWidth to the set method.
        box.setDimensions(boxLength, boxWidth);

        // Display the box's length, width, and area.
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}
