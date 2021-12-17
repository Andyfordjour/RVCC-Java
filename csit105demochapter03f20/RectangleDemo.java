package csit105demochapter03f20;

/**
 * This program demonstrates the Rectangle class's setLength, setWidth,
 * getLength, getWidth, and getArea methods.
 *
 * @author Tony Gaddis
 */
public class RectangleDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a 10 x 20 Rectangle object.
        Rectangle box = new Rectangle(10.0, 20.0);

        // Display the length.
        System.out.println("The box's length is "
                + box.getLength());

        // Display the width.
        System.out.println("The box's width is "
                + box.getWidth());

        // Display the area.
        System.out.println("The box's area is "
                + box.getArea());
    }
}
