package csit105demochapter03f20;

/**
 * This program demonstrates the Rectangle class's setLength, setWidth,
 * getLength, and getWidth methods.
 *
 * @author Tony Gaddis
 */
public class LengthWidthDemo {

    /**
     * The main method is the program's starting point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Rectangle object.
        Rectangle box = new Rectangle();

        // Call the object's setLength method, passing 10.0
        // as an argument.
        box.setLength(10.0);

        // Call the object's setWidth method, passing 20.0
        // as an argument.
        box.setWidth(20.0);

        // Display the object's length and width.
        System.out.println("The box's length is "
                + box.getLength());
        System.out.println("The box's width is "
                + box.getWidth());
    }
}
