package csit105demochapter03f20;

/**
 * This program creates three instances of the Rectangle class.
 *
 * @author Tony Gaddis
 */
import java.util.Scanner;

public class RoomAreas {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalArea;    // The total area

        // Create three Rectangle objects.
        Rectangle kitchen = new Rectangle(10.0, 14.0);
        Rectangle bedroom = new Rectangle(15.0, 12.0);
        Rectangle den = new Rectangle(20.0, 30.0);

        // Calculate the total area of the rooms.
        totalArea = kitchen.getArea() + bedroom.getArea()
                + den.getArea();

        // Display the total area of the rooms.
        System.out.printf("\nThe total area of the rooms is %,.2f\n", totalArea);

    }
}
