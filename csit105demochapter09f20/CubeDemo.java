package csit105demochapter09f20;

import java.util.Scanner;

/**
 * This program demonstrates passing arguments to a superclass constructor.
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class CubeDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edgeLength; // To hold edge length
        Cube myCube;       // to hold a cube

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // cube has length, width, height all same
        // Get the edge length of a cube from the user.
        System.out.println("A cube has length, width, height all same");
        System.out.print("\nEnter edge length: ");
        edgeLength = keyboard.nextDouble();

        // Create a cube object and pass the dimensions
        // to the constructor.
        myCube = new Cube(edgeLength);

        // Display the properties of the cube.
        System.out.println("\nYour Cube: " + myCube);
        System.out.println("Here are the properties of the cube:\n");
        System.out.printf("Length: %,.2f\n", myCube.getLength());
        System.out.printf("Width: %,.2f\n", myCube.getWidth());
        System.out.printf("Height: %,.2f\n", myCube.getHeight());
        System.out.printf("\nBase Area: %,.4f\n", myCube.getArea());
        System.out.printf("Surface Area: %,.4f\n", myCube.getSurfaceArea());
        System.out.printf("Volume: %,.4f\n", myCube.getVolume());
    }
}
