package csit105demochapter03f20;

/**
 * This program creates three instances of the Rectangle class.
 *
 * @author Tony Gaddis
 */
import java.util.Scanner;

public class RoomAreas2 {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double length, width;
        double totalArea;    // The total area
        Rectangle kitchen, bedroom, den; // declare rectangles

        Scanner input = new Scanner(System.in);

        // Get the dimensions of the kitchen.
        System.out.print("What is the kitchen's length? ");
        length = input.nextDouble(); // get length

        System.out.print("What is the kitchen's width? ");
        width = input.nextDouble(); // get width

        // Create Kitchen object.
        kitchen = new Rectangle(length, width);

        // Get the dimensions of the bedroom.
        System.out.print("What is the bedroom's length? ");
        length = input.nextDouble(); // get length

        System.out.print("What is the bedroom's width? ");
        width = input.nextDouble(); // get width

        // Create bedroom Rectangle object.
        bedroom = new Rectangle(length, width);

        // Get the dimensions of the den.
        System.out.print("What is the den's length? ");
        length = input.nextDouble(); // get length

        System.out.print("What is the den's width? ");
        width = input.nextDouble(); // get width

        // Create den Rectangle object.
        den = new Rectangle(length, width);

        // Calculate the total area of the rooms.
        totalArea = kitchen.getArea() + bedroom.getArea()
                + den.getArea();

        // Display the total area of the rooms.
        System.out.printf("\nThe total area of the rooms is %,.2f\n", totalArea);
    }
}
